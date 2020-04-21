import {Component, OnInit} from '@angular/core';
import {Product} from "../models/product";
import {ProductService} from "../services/product-service.service";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[];

  readonly itemsPerPage;
  p: number;
  total: number;

  constructor(private productService: ProductService) {
    this.itemsPerPage = 5;
    this.p = 1;
    this.getProducts(0);
  }

  ngOnInit(): void {
  }

  pageChanged(event) {
    this.p = event;
    this.getProducts(this.p);
  }

  async getProducts(pageNumber) {
    this.productService.findByPage(pageNumber - 1, this.itemsPerPage).subscribe(data => {
      this.products = data["content"];
      this.total = data["totalElements"];
    });
  }

}
