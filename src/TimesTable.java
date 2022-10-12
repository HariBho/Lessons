import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print ("What times table would you like? : ");
//Asks for user input of which Times table is required
        int timesTable = reader.nextInt();
        int N = timesTable;
        for (int i = 0; i <=12; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
