import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ProductListComponent} from './product-list/product-list.component';
import {HttpClientModule} from "@angular/common/http";
import {ProductComponent} from './product/product.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {ProductPaymentFormModule} from "./product-payment-form/product-payment-form.module";

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductComponent,
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    ProductPaymentFormModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
