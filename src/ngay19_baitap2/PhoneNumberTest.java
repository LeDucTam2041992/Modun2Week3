package ngay19_baitap2;

import java.util.regex.Pattern;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;

    public static final String[] validClass = {"(84)-(0978489648)","(84)-(1234567890)"};

    public static final String[] invalidClass = {"(a8)-(22222222)", "(84)-(2888899999562)"};

    public static void main(String[] args) {
        String PHONE_NUMBER = "^\\([\\d]{2}\\)-\\([\\d]{9,11}\\)$";
        phoneNumber = new PhoneNumber();
        for (String account : validClass) {
            boolean isvalid = phoneNumber.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidClass) {
            boolean isvalid = phoneNumber.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }

        System.out.println(Pattern.matches(PHONE_NUMBER,validClass[0]));
        System.out.println(Pattern.compile(PHONE_NUMBER).matcher(validClass[1]).matches());
    }
}
