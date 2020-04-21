import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductPaymentFormComponent } from './product-payment-form.component';

describe('ProductPaymentFormComponent', () => {
  let component: ProductPaymentFormComponent;
  let fixture: ComponentFixture<ProductPaymentFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductPaymentFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductPaymentFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
