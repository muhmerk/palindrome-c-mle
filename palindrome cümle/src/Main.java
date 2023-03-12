import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("kelime giriniz");
            String word = scanner.nextLine();
            String boslukKaldirilmisCumle = word.replaceAll(" ", "");
            System.out.println("Boşluk kaldırılmış cümle: " + boslukKaldirilmisCumle);

            if(isPalindrome(boslukKaldirilmisCumle)){
                System.out.println("kelime palindrome dur");
            }
            else {
                System.out.println("kelime palindrome değildir");
            }
        }
    }
    public static boolean isPalindrome(String boslukKaldirilmisCumle){
        int lenght = boslukKaldirilmisCumle.length();
        for (int i=0 ; i < boslukKaldirilmisCumle.length()-1 ; i++){
            if(boslukKaldirilmisCumle.charAt(i) != boslukKaldirilmisCumle.charAt(boslukKaldirilmisCumle.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}