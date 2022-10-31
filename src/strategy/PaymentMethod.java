package strategy;

public class PaymentMethod {
	private String selectedPaymentMethod;
	public void setSelectedPaymentMethod(String s) {
        this.selectedPaymentMethod = s;
    }
	
	public void pay() {
        switch (selectedPaymentMethod) {
            case "COD" : payWithCOD(); break;
            case "Bkash" : payWithBkash(); break;
        }
    }
	
	 private void payWithCOD() {
	        System.out.println("Pay with COD is successful");
	    }
	    private void payWithBkash() {
	        System.out.println("Pay with Bkash is successful");
	    }
}
