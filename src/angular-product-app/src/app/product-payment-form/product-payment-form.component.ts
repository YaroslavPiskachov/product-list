import {Component, OnInit} from '@angular/core';
import {ProductService} from "../services/product-service.service";
import {PaymentCard} from "../models/payment-card";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-product-payment-form',
  templateUrl: './product-payment-form.component.html',
  styleUrls: ['./product-payment-form.component.css']
})
export class ProductPaymentFormComponent implements OnInit {

  private productId: String;

  readonly currentMonth: number;
  readonly currentYear: number;

  isDateExpired = false;

  paymentCard = new PaymentCard("", "", 0, 0, "");

  constructor(private productService: ProductService,
              private route: ActivatedRoute,
              private router: Router) {
    this.route.params.subscribe((params) => {
      this.productId = params['id'];
    });

    let date = new Date();
    this.currentYear = date.getFullYear();
    this.currentMonth = date.getMonth() + 1;
  }

  ngOnInit(): void {
  }

  onSubmit() {
    this.productService.buyProduct(this.productId, this.paymentCard).subscribe(data => {
        this.router.navigate(['success', {productTitle: data.title}]);
      },
      error => {
        window.alert("Error occurred during payment process!");
      });
  }

  onCardNumberChange(val) {
    let cardNumber = val.split(' ').join('');
    if (cardNumber.length > 0) {
      cardNumber = cardNumber.match(new RegExp('.{1,4}', 'g')).join(' ');
    }
    this.paymentCard.cardNumber = cardNumber;
  }

  setIsDateExpired() {
    this.isDateExpired = this.paymentCard.expirationMonth < 1 || this.paymentCard.expirationMonth > 12
      || this.paymentCard.expirationYear < this.currentYear
      || (this.paymentCard.expirationMonth < this.currentMonth + 1 && this.paymentCard.expirationYear == this.currentYear)
  }
}
