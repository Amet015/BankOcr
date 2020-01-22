import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerOcr {

    private String line1;
    private String line2;
    private String line3;
    private String numbers;

    public ScannerOcr()
    {
        line1 = "";
        line2 = "";
        line3 = "";
        numbers = "";
    }
    public void scanDocument(String account) {
        File file = new File(account);

        ArrayList<String> arrayLine = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                arrayLine.add(scanner.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        line1 = arrayLine.get(0);
        line2 = arrayLine.get(1);
        line3 = arrayLine.get(2);
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getLine3() {
        return line3;
    }

    public String getNumbers() {
        String numbersAccount;
        int indexStart = 0;
        int indexEnd = 3;
        int lenthtLine = line1.length();
        DecodeNumber decodeNumber = new DecodeNumber();
        while (indexEnd <= lenthtLine) {
            numbersAccount = line1.substring(indexStart, indexEnd) + line2.substring(indexStart, indexEnd) + line3
                    .substring(indexStart, indexEnd);
            numbers += decodeNumber.convertToNumber(numbersAccount);
            indexStart = indexEnd;
            indexEnd = indexEnd + 3;
        }
        return numbers;
    }
}
