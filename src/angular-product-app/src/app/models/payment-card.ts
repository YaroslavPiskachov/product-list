export class PaymentCard {
  holderName: String;
  cardNumber: String;
  expirationMonth: number;
  expirationYear: number;
  cvv: String;


  constructor(holderName: String, cardNumber: String, expirationMonth: number, expirationYear: number, cvv: String) {
    this.holderName = holderName;
    this.cardNumber = cardNumber;
    this.expirationMonth = expirationMonth;
    this.expirationYear = expirationYear;
    this.cvv = cvv;
  }
}
