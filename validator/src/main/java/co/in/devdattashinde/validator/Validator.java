package co.in.devdattashinde.validator;

public class Validator {
    public static final String MOBILE = "^[0-9]{8}$";
    public static final String EMAIL = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    public static boolean isValidMobile(String mobileNo){
        return mobileNo.matches(MOBILE);
    }

    public static boolean isValidEmail(String email){
        return email.matches(EMAIL);
    }
}
