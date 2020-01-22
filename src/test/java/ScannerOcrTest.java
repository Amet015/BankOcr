import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class ScannerOcrTest {


    @Test
    public void Scanner_ReadNumbers_123456789() {
        ScannerOcr scannerOcr = new ScannerOcr();
        scannerOcr.scanDocument("Account.txt");

        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|";
        String line3 = "  ||_  _|  | _||_|  ||_| _|";
        assertEquals(line1,scannerOcr.getLine1());
        assertEquals(line2,scannerOcr.getLine2());
        assertEquals(line3,scannerOcr.getLine3());
    }

    @Test
    public void Scanner_getNumbers_123456789() {
        ScannerOcr scannerOcr = new ScannerOcr();
        scannerOcr.scanDocument("Account.txt");

        String actual = scannerOcr.getNumbers();
        String expected = "123456789";

        assertEquals(expected, actual);
    }

    @Test
    public void Scanner_getNumbers_7777777() {
        ScannerOcr scannerOcr = new ScannerOcr();
        scannerOcr.scanDocument("numberseven.txt");

        String actual = scannerOcr.getNumbers();
        String expected = "777777777";

        assertEquals(expected, actual);
    }
    @Test
    public void Scanner_getNumbers_123p5678p() {
        ScannerOcr scannerOcr = new ScannerOcr();
        scannerOcr.scanDocument("AccountError.txt");

        String actual = scannerOcr.getNumbers();
        String expected = "123?5678?";

        assertEquals(expected, actual);
    }
}