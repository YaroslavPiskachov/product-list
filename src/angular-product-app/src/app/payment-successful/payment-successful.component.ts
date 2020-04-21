import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-payment-successful',
  templateUrl: './payment-successful.component.html',
  styleUrls: ['./payment-successful.component.css']
})
export class PaymentSuccessfulComponent implements OnInit {

  productTitle: String;

  constructor(private route : ActivatedRoute) {
    this.route.params.subscribe((params)=> {
      console.log(JSON.stringify(params.productTitle));
      this.productTitle = params['productTitle'];
    });
  }

  ngOnInit(): void {
  }

}
