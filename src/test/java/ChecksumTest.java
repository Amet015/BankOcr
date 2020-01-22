import org.junit.Test;

import static org.junit.Assert.*;

public class ChecksumTest {

    @Test
    public void Checksum_GetCheckSum_0(){
        Checksum checksum = new Checksum();
        String account = "345882865";
        String Expected = "345882865";
        String actual = checksum.isValidAccount(account);
        assertEquals(actual, Expected);
    }

    @Test
    public void Checksum_GetCheckSum_3458ss65_ILL(){
        Checksum checksum = new Checksum();
        String account = "34588??65";
        String Expected = "34588??65   ILL";
        String actual = checksum.isValidAccount(account);
        assertEquals(actual, Expected);
    }

    @Test
    public void Checksum_GetCheckSum_34580065_ILL(){
        Checksum checksum = new Checksum();
        String account = "345880065";
        String Expected = "345880065   ERR";
        String actual = checksum.isValidAccount(account);
        assertEquals(actual, Expected);
    }

}