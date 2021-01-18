package inputvalidation;

public class SalesID {
    public static void main(String[] args) {
        System.out.println(checkFormat("GB45623B"));
    }

    public static Boolean checkFormat(String id) {
        if(id.length() != 8) {
            // if string length is not 8
            return false;
        } else if(!Character.isLetter(id.charAt(0)) || !Character.isLetter(id.charAt(1))) {
            // if first or second characters are not letters
            return false;
        } else if(!id.split("")[7].equals("B") && !id.split("")[7].equals("N")) {
            // if seventh character is not b or n
            return false;
        }

        for (int i = 0; i < 5; i++) {
            // if characters 3-7 are not numbers
            if (!Character.isDigit(id.charAt(i + 2))) {
                return false;
            }
        }

        return true;
    }
}
