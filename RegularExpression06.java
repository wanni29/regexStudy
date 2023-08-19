public class RegularExpression06 {


    public static void main(String[] args) {
        String password = "Abc123!@#";
        boolean isValid = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%!]).{8,}$");
        

        if(isValid) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
    
}
