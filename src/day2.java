import TerminalIO.*;

public class day2 {

    
    public static void main(String[] args) {
    
        KeyboardReader r = new KeyboardReader();
        int age;
        age = r.readInt("How old are you? ");
        age++;
        System.out.println("Next year you will be "+age);
    }
    
}
