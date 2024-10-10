
public class TenantTest {
    public static void main(String[] args) {
        Tenant t1 = new Tenant();
	Tenant t2 = new Tenant("Bilal Duffar", "Saeedabad", "03011231214", "2638649R", "Available");
        
        //Test the Null Constructor
        System.out.println(t1);
        
        //Test the Full argument Constructor
	System.out.println(t2);
        
        //Test the set method(Name)
        t1.setName("Usama Mehmood");
        System.out.println(t1.toString());
        
        //Test the set method(Address)
        t1.setAddress("New Karachi");
        System.out.println(t1.toString());
        
        //Test the set medhod(PhoneNumber)
        t1.setPhoneNumber("03123123321");
        System.out.println(t1.toString());
        
        //Test the set medhod(PpsNumber)
        t1.setPpsNumber("2539475L");
        System.out.println(t1.toString());
        
        //Test the set medhod(LandlordStatus)
        t1.setTenantStatus("Available");
        System.out.println(t1.toString());
        
        //test the get method(Name)
	System.out.println(t1.getName());
        
        //test the get method(Address)
	System.out.println(t1.getAddress());
        
        //test the get method(PhoneNumber)
	System.out.println(t1.getPhoneNumber());
        
        //test the get method(PpsNumber)
	System.out.println(t1.getPpsNumber());
        
        //test the get method(TenantStatus)
	System.out.println(t1.getTenantStatus());
    }
}
