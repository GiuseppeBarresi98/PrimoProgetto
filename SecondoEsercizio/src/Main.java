import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String m = scanner.nextLine();
        String n = scanner.nextLine();
        System.out.println(s + m + n);
        System.out.println(n + m + s);
        scanner.close();
    }


}