package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;
class PaymentMethod{
	void makePayment() {
		System.out.println("Processing payment");
	}
}
class CreditCard extends PaymentMethod{
	void swipCard() {
		System.out.println("Swiping credit card");
	}
}
class Paypal extends PaymentMethod{
	void loginToPayoal() {
		System.out.println("logging into paypal");
	}
}
public class InstanceofDemo2 {
	public static void main(String[] args) {
		PaymentMethod payment=new PaymentMethod();
		payment=new CreditCard();
		if(payment instanceof CreditCard) {
			CreditCard cc=(CreditCard)payment;
			cc.swipCard();
		}
		else if(payment instanceof Paypal) {
			Paypal pp=(Paypal)payment;
			pp.loginToPayoal();
		}
		
	}

}
