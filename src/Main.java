import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int count=0;
        char c;
        System.out.println("COUNT NUMBER OF CHAR IN GIVEN STRING.");
        System.out.print("Enter your string: ");
        str = scanner.nextLine();
        System.out.print("Enter char you want to count: ");
        c = scanner.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (Character.compare(c, str.charAt(i)) == 0) {
                count ++;
            }
        }
        System.out.println("The number of " + "'" + c + "'" + " in the string " + "'" + str + "' is " + count );
    }
}
