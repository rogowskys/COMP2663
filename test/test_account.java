import java.util.ArrayList;
import posPackage.*;

public class test_account {

    public static void main(String[] args) {
        ArrayList<account> customerList = new ArrayList<>();

        customerList.add(new account("Homer Simpson", "742 Evergreen Terrace", "867-5309", customerList.size()));
        customerList.add(new account("Bill Gates", "1 Microsoft Way", "555-1234", customerList.size()));
        customerList.add(new account("Big Customer", "Small House", "No phone", customerList.size()));

        System.out.println("Customer Account List:\n");
        System.out.println("Account No.\tCustomer Name\tPhone Number\tAccount Balance");
        for (int i = 0; i < 3; i++){
            System.out.println(customerList.get(i));
        }


    }
}
