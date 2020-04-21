import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {PaymentSuccessfulComponent} from "../payment-successful/payment-successful.component";
import {ProductPaymentFormComponent} from "./product-payment-form.component";


const routes: Routes = [
  {
    path: '',
    component: ProductPaymentFormComponent,
  },
  {
    path: 'success',
    component: PaymentSuccessfulComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductPaymentFormRoutingModule {
}
