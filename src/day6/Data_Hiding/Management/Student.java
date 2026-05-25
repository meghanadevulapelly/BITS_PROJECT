package day6.Data_Hiding.Management;

public class Student {
    public String name="meghana";
    private String subject="Java";
    protected double amount = 50000;
    String department="CSE";

    public void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Subject: "+subject);
        System.out.println("Amount: "+amount);
        System.out.println("Department: "+department);   
    }
}
