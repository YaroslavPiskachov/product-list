import {NgModule} from '@angular/core'
import {ProductPaymentFormComponent} from "./product-payment-form.component";
import {PaymentSuccessfulComponent} from "../payment-successful/payment-successful.component";
import {BrowserModule} from "@angular/platform-browser";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {ProductPaymentFormRoutingModule} from "./product-payment-form-routing.module";
import {DirectivesModule} from "../directives.module";

@NgModule({
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    ProductPaymentFormRoutingModule,
    DirectivesModule
  ],
  declarations: [
    ProductPaymentFormComponent,
    PaymentSuccessfulComponent,
  ]
})
export class ProductPaymentFormModule {
}
