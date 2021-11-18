/* Class: CSE 1322L
Section: WJ1
Term: Fall 2021
Instructor: Leul Endashaw
Name: Lauren Bailey
Lab#: 9
*/
import java.util.Scanner;
public class Lab9 {
    public static int recursive_multiply(int x, int y) {
        if (y == 0) {
            return 0;
        } else if (y == 1) {
            return x;
        } else {
            return x + recursive_multiply(x, y - 1);
        }
    }
    public static int recursive_div(int x, int y){
        if(y == 0) {
            return -1;
        }
        else if(x<y) {
            return 0;
        }
        else {
            return 1 + recursive_div(x-y,y);
        }
    }
    public static int recursive_mod(int x, int y){
        if(x == 0 || y == 0){
           return -1;
        }
        else if(x<y){
            return 1;
        }
        else if(x == y){
            return 0;
        }
        else{
            return recursive_mod(x-y,y);
        }
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int choice;
        int x, y;
        while(true){
            System.out.println("Choose from the following:");
            System.out.println("0. Quit");
            System.out.println("1. Multiply 2 numbers");
            System.out.println("2. Div 2 numbers");
            System.out.println("3. Mod 3 numbers");
            choice = scan.nextInt();

            if(1<=choice && choice <=3){
                System.out.println("Enter first number");
                x = scan.nextInt();
                System.out.println("Enter second number");
                y = scan.nextInt();
                switch (choice){
                    case 1: System.out.println("Answer: " + recursive_multiply(x,y));
                            break;
                    case 2: System.out.println("Answer: " + recursive_div(x,y));
                            break;
                    case 3: System.out.println("Answer: " + recursive_mod(x,y));
                            break;
                }
            }
            else if(choice == 0){
                break;
            }
        }
    }
}
