import src.RegularExpression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegularExpression checkValue = new RegularExpression();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("----Menu----\n" +
                    "1. Kiem tra so dien thoai Viettel\n" +
                    "2. Kiem tra dinh dang email\n" +
                    "3. Kiem tra PassWord\n" +
                    "4. Kiem tra dinh dang IPv4\n" +
                    "5. Kiem tra dinh dang Domain\n" +
                    "0. Exist");
            String chose = scanner.nextLine();
            switch (chose) {
                case "1":
                    System.out.println("Nhap so dien thoai: ");
                    String phoneNumber = scanner.nextLine();
                    boolean isPhoneNumberOfViettel = checkValue.checkPhoneNumber(phoneNumber);
                    if (isPhoneNumberOfViettel){
                        System.out.println("So dien thoai cua ban la so cua Viettel");
                    }else {
                        System.out.println("Day khong phai so Viettel!");
                    }
                    break;
                case "2":
                    System.out.println("Nhap email");
                    String email = scanner.nextLine();
                    boolean isEmail = checkValue.checkEmail(email);
                    if (isEmail){
                        System.out.println("Email cua ban hop le");
                    }else {
                        System.out.println("Email cua ban khong hop le!");
                    }
                    break;
                case "3":
                    System.out.println("Nhap password");
                    String password = scanner.nextLine();
                    boolean isPassword = checkValue.checkPassword(password);
                    if (isPassword){
                        System.out.println("Password cua ban hop le");
                    }else {
                        System.out.println("Password cua ban khong hop le!");
                    }
                    break;

                case "0":
                    return;
            }
        }

    }
}
