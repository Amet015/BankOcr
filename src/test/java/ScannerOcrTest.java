import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ScannerOcrTest {


    @Test
    public void Scanner_ReadNumbers_123456789() {
        ScannerOcr scannerOcr = new ScannerOcr();
        scannerOcr.scanDocument("Account.txt");
        ArrayList<String> expectedLines = new ArrayList<>();
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|";
        String line3 = "  ||_  _|  | _||_|  ||_| _|";
        expectedLines.add(line1);
        expectedLines.add(line2);
        expectedLines.add(line3);
        ArrayList<String> actuaLines = scannerOcr.getArrayLines();
        assertEquals(expectedLines, actuaLines);
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