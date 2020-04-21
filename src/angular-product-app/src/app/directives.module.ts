import { NgModule } from '@angular/core';
import {HolderNamePatternDirective} from "./directives/holder-name-pattern.directive";
import {DigitsOnlyDirective} from "./directives/digits-only.directive";

@NgModule({
  imports: [],
  declarations: [HolderNamePatternDirective, DigitsOnlyDirective],
  exports: [HolderNamePatternDirective, DigitsOnlyDirective]
})
export class DirectivesModule { }
