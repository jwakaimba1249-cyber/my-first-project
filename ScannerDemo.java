import java.util.Scanner; 
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Enter your GPA:");
        double gpa = scanner.nextDouble();  

        System.out.println("Are you a student? (true/false):");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("===YOUR INFORMATION===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Is Student: " + isStudent);

        scanner.close();
}
}
    

