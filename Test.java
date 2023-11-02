import src.RegularExpression;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        RegularExpression check = new RegularExpression();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean isValid = check.checkDomain(str);
        System.out.println(isValid);
    }
}
