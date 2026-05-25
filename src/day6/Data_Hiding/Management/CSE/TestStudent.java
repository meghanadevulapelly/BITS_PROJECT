package day6.Data_Hiding.Management.CSE;

import day6.Data_Hiding.Management.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name="student2";


        std1.displayDetails();
        System.out.println(std1.name);
    }
    
}

