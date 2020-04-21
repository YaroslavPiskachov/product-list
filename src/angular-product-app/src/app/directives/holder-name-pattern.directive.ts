import { Directive } from '@angular/core';
import {AbstractControl, NG_VALIDATORS, Validator, ValidatorFn} from "@angular/forms";

@Directive({
  selector: '[appHolderNamePattern]',
  providers: [{ provide: NG_VALIDATORS, useExisting: HolderNamePatternDirective, multi: true }]
})
export class HolderNamePatternDirective implements Validator {

  constructor() { }

  validate(control: AbstractControl): { [key: string]: any } | null {
    return this.holderNamePatternValidator()(control);
  }

  holderNamePatternValidator(): ValidatorFn {
    return (control: AbstractControl): { [key: string]: any } => {
      let value = control.value;
      if (!value) {
        return null;
      }
      const regex = new RegExp('^((?:[A-Za-z]+ ?){1,3})$');
      const valid = regex.test(value) && value.length > 4 && value.length < 35;
      return valid ? null : { invalidHolderName: true };
    };
  }

}
