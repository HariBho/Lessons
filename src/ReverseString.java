import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = reader.nextLine().toCharArray();
        {
            StringBuilder revString = new StringBuilder();

            for (int i = letters.length - 1; i>=0; i--) {
                revString.append(letters[i]);
            }
            System.out.println("Reversed word: " + revString);
        }
    }
}
