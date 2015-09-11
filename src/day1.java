import hsa.*;
public class day1 {

   
    public static void main(String[] args) {
        Console c = new Console();
        
        c.print("Hello from console");
        int age;
        
        c.print("\nHow odl are are you? ");
        
        age=c.readInt();
        age++;
        c.print("\nYou will be "+age);
    }
    
}
