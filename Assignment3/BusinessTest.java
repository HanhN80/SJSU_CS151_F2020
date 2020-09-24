
public class BusinessTest {

	public static void main(String[] args) {	
		
			Address[] address = new Address[10];
			address[0] = new Address (1902, "Morning Star ", "Morgan Hill", "95037", "CA");
			address[1] = new Address (1111, "Evening Star ", "Morgan Hill", "95037", "CA");
			address[2] = new Address (1000, "Maclaughlin ", "San Jose", "95032", "CA");
			address[3] = new Address (1002, "Mckee ", "San Jose", "95033", "CA");
			address[4] = new Address (1055, "Tennant ", "San Martin", "95044", "CA");
			address[5] = new Address (1002, "Rose ", "Santa Clara", "95033", "CA");
			address[6] = new Address (1045, "Peet ", "Santa Clara", "95035", "CA");
			address[7] = new Address (1234, "Main ", "Santa Clara", "95035", "CA");
			address[8] = new Address (1555, "Blue ", "San Jose", "95035", "CA");
			address[9] = new Address (1545, "Lemon ", "San Jose", "95037", "CA");
	     
	       FullTimeSalaried[] fulltimeSalaried = new FullTimeSalaried[2];
	       fulltimeSalaried[0] = new FullTimeSalaried("Kevin", "Do", 45, "112-34-5617", address[1], 105, "BS Degree", true, 4, 120000);
	       fulltimeSalaried[1] = new FullTimeSalaried("Roz", "Lee", 40, "102-74-3371", address[2], 106, "BS Degree", true, 5, 140000);
	       System.out.println("");
	       System.out.println("FullTime Salaried Employee Information: ");
	       System.out.println("           ********          ");
	       
	       for (FullTimeSalaried x : fulltimeSalaried) {
				x.display();
				x.introduce(true);
				x.computePay();
				System.out.println();
			
			}
	       
    
	       FullTimeHourly[] fulltimeHourly = new FullTimeHourly[2];
	       fulltimeHourly [0] = new FullTimeHourly ("Ryan", "Le", 28, "111-22-2111", address[3], 107, "BS Degree", true, 120000,40, 1.5);
	       fulltimeHourly [1] = new FullTimeHourly ("George", "Wallace", 36, "111-99-2155", address[4], 108, "BS Degree", true, 90000,47, 1.5);
	       System.out.println("");
	       System.out.println("FullTime Hourly Employee Information: ");
	       System.out.println("           ********          ");
	       
	       for (FullTimeHourly x : fulltimeHourly) {
				x.display();
				x.introduce(true);
				x.computePay();
				System.out.println();
				
			}

	       PartTimeHourly[] parttimeHourly = new PartTimeHourly[2];
	       parttimeHourly [0] = new PartTimeHourly ("John", "Smith", 28, "111-22-2333", address[5], 102, "BS Degree", true, 20.0, 30);
	       parttimeHourly [1] = new PartTimeHourly ("David", "Chung", 43, "111-22-1312", address[6], 103, "MS Degree", true, 45.0,35);
	      
	       System.out.println("");
	       System.out.println("PartTime Hourly Employee Information: ");
	       System.out.println("           ********          ");
	       
	       for (PartTimeHourly x : parttimeHourly) {
				x.display();
				x.introduce(true);
				x.computePay();
				System.out.println();
			
			}
      
	       Contractor[] contractor = new Contractor[2];
	       contractor[0] = new Contractor ("YangLing", "Huang", 35, "111-11-1112", address[7], 104, "BS Degree", true, 45.0,37);
	       contractor[1] = new Contractor ("Anping", "Oal", 10, "123-22-2111", address[8], 105, "BS Degree", true, 25.0,25);
	       System.out.println("");
	       System.out.println("Contractor Employee Information: ");
	       System.out.println("           ********          ");
	       
			for (Contractor x : contractor) {
				x.display();
				x.introduce(true);
				x.computePay();	
				System.out.println();
			}
	       
			  Executive[] executive = new Executive[2];
		      
		       executive[0] = new Executive("Kevin", "Do", 45, "112-34-5617", address[9], 105, "BS Degree", true, 120000, 30000);
		       executive[1] = new Executive("Roz", "Lee", 40, "102-74-3371", address[10], 106, "BS Degree", true, 140000, 10000);
		       System.out.println("Executive Information: ");
		       System.out.println("           ********          ");
		       executive[0].getfirstname();
		       for (Executive x : executive) {
					x.display();
					x.introduce(true);
					x.computePay();
					System.out.println();
				
				}
		       	       
	       Customer[] customer = new Customer[2];
	       customer[0] = new Customer("Timothy", "Briggs", 52, "101-23-7689", address[11], 201, "Paid", 3000);
	       customer[1] = new Customer("Fred", "Nguyen", 46, "123-28-7779", address[12], 206, "NotPay", 95);
	       
	       System.out.println("");
	       System.out.println("Customer's Information: ");
	       System.out.println("           ********          ");
	       for (Customer x : customer) {
				x.introduce();
				x.makepayment();					
				if (x.getPayPreference()=="NotPay") {
					System.out.println("Customer need to Pay ");
				}
				else
					System.out.println("Customer already Paid ");
				 System.out.println("----------------------------------------");
			}
	       System.out.println();
	       

		
	}

}
