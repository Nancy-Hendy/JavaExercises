public class CustomerApplication {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ahmed",'I');
        customer1.changeDetails("Farahat");

        Customer customer2 = new Customer("Nancy", 'A');
        customer2.changeDetails("Hendy", 'H');
        customer2.getAccountNumber();





        System.out.println("Name is " + customer1.getName());
        System.out.println("Acc Number is " + customer1.getAccountNumber());
        System.out.println("Is status hold? " + customer1.isHeld());
        System.out.println("Status is " + customer1.getStatus());


        System.out.println("Name is " + customer2.getName());
        System.out.println("Acc Number is " + customer2.getAccountNumber());
        System.out.println("Is status hold? " + customer2.isHeld());
        System.out.println("Status is " + customer2.getStatus());

        Customer.setLastAccNum(2000);
        Customer customer3 = new Customer("N", 'A');
        Customer customer4 = new Customer("Z", 'I');


        System.out.println("Acc Number is " + customer3.getAccountNumber());
        System.out.println("Acc Number is " + customer4.getAccountNumber());
    }
}
