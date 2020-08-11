
public class RestaurantApp {

	public static void main(String[] args) {
		Bill bill=new Bill(15.80,.06);
		pay(bill);
		TippableBill tipBill=new TippableBill(8.50,.06,2);
		pay(tipBill);
		double res=whatsMyChange(bill,10);
		if(res==0) {
			System.out.printf("Difference=$%.2f",res);
		}else {
			System.out.printf("%s%.2f","Difference=$",res);
		}
		

	}
	private static void pay(Bill bill) {
		double total=bill.calcTotal();
		System.out.println("Total=$"+total);
	}
	private static double whatsMyChange(Bill b,double value) {
		double val=value-b.calcTotal();
	
		if(b.calcTotal()>value) {
			 System.out.println("Not enough money");
			 return val;
		}else {
			return val;
			
		}
	}
	

}
