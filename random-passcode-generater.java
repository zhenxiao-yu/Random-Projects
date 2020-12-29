import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        int PWLength = 20;
        System.out.println("Your Random Password is: ");
        System.out.println(generatePswd(PWLength));
    }

    static char[] generatePswd(int length) {
        System.out.println("Your Password:");
        String Characters_Cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Characters = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String Symbols = "!@#$%^&*_=+-/€.?<>)";

        String passSymbols = Characters_Cap + Characters + nums + Symbols;
        Random rnd = new Random();

        char[] passWord = new char[length];
        for (int i = 0; i < length; i++) {
            passWord[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));

        }
        return passWord;
    }
}
