import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);
        int c =scanner.nextInt();

    int y = numero(c);
    System.out.println(y);

    }

public static float lato(float b , float h ){
        return (b+h)*2;
    }

    public static int numero(int c){
        if (c % 2 == 0){
            return 0;
        }
        else return 1;
    }



}