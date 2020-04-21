import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient, HttpParams} from "@angular/common/http";
import {Product} from "../models/product";
import {PaymentCard} from "../models/payment-card";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private readonly productUrl: string;

  constructor(private http: HttpClient) {
    this.productUrl = environment.apiBaseUrl + '/product';
  }

  public findAll(pageNumber, itemsPerPage): Observable<Product[]> {
    let params = new HttpParams();
    params = params.append('page', pageNumber);
    params = params.append('size', itemsPerPage);
    console.log("params -- " + params);
    return this.http.get<Product[]>(this.productUrl, {params: params});
  }

  public buyProduct(productId: String, paymentCard: PaymentCard): Observable<Product> {
    return this.http.post<Product>(this.productUrl + "/buy/" + productId, paymentCard);
  }
}
