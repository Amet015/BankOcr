//import com.sun.xml.internal.fastinfoset.util.CharArray;

public class Checksum {

    public String isValidAccount(String account) {

        String result = account;
        final String ERROR = "   ERR";
        final String ILL = "   ILL";
        char [] arrayAccount = account.toCharArray();
        int checksum = 0;
        int lengthArray = arrayAccount.length;
        try {
            for (int i = 0 ; i < arrayAccount.length ; i++) {
                checksum += (lengthArray)  * Integer.valueOf(String.valueOf(arrayAccount[i]));
                lengthArray--;
            }
            if(checksum % 11 != 0){
                result += ERROR;
            }
        } catch (NumberFormatException e) {
            return result + ILL;
        }
        return result;
    }
}
