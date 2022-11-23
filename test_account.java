import java.util.ArrayList;

public class test_account {

    public static void main(String[] args) {
        account first = new account("Homer Simpson", "742 Evergreen Terrace", "867-5309");
        account second = new account("Bill Gates", "1 Microsoft Way", "555-1234");
        account third = new account("Big Customer", "Small House", "No phone");

        ArrayList<account> customerList = new ArrayList<>();

        customerList.add(first);
        customerList.add(second);
        customerList.add(third);

        System.out.println("Customer Account List:\n");
        System.out.println("Name\t\tAddress");




    }
}
