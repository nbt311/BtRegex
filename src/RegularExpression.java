package src;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static final String PHONE_NUMBER_REGEX = "^(0|\\+84)((3[2-9])|(9[6-8])|(86))([0-9]{7})$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String PASSWORD_REGEX = "^((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]))+.{6,32}$";
    private static final String DOMAIN_REGEX = "^(http|https)://w{3}\\.[a-z0-9]+\\.(com|gov|vn)$";
    public boolean checkPhoneNumber(String regex){
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean checkEmail(String regex){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean checkPassword(String regex){
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean checkDomain(String regex){
        Pattern pattern = Pattern.compile(DOMAIN_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
