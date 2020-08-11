
public class RestaurantApp {

	public static void main(String[] args) {
		Bill bill=new Bill(15.80,.06);
		pay(bill);
		TippableBill tipBill=new TippableBill(8.50,.06,2);
		pay(tipBill);
		double res=whatsMyChange(bill,20);
		if(res==0) {
			System.out.println("Not enough money");
		}else {
			System.out.println("Difference="+res);
		}
		

	}
	private static void pay(Bill bill) {
		double total=bill.calcTotal();
		System.out.println("Total="+total+"$");
	}
	private static double whatsMyChange(Bill b,double value) {
		double val=0;
	
		if(b.calcTotal()>value) {
			 val=0.0;
		}else {
			val=value-b.calcTotal();
		}return val;
	}
	

}
