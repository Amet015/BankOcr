import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerOcr {


    private String numbers;
    ArrayList<String> arrayLine;

    public ScannerOcr()
    {
        numbers = "";
        arrayLine = new ArrayList<>();

    }
    public void scanDocument(String account) {
        File file = new File(account);


        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                arrayLine.add(scanner.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String> getArrayLines() {
        return arrayLine;
    }

    public String getNumbers() {
        String numbersAccount = "";
        int indexEnd = 0;
        int lenghtLine = 0;
        final int LINES = arrayLine.size();
        DecodeNumber decodeNumber = new DecodeNumber();
        for (int i = 0; i <LINES ; i++) {
            lenghtLine += arrayLine.get(i).length();
        }
        lenghtLine = (lenghtLine / LINES) - LINES;
        for (int indexStart = 0; indexStart <= lenghtLine ; indexStart+=3) {
            indexEnd = indexStart + 3;
            for (int index = 0; index < arrayLine.size() ; index++) {
                numbersAccount += arrayLine.get(index).substring(indexStart,indexEnd);
            }
            numbers += decodeNumber.convertToNumber(numbersAccount);
            numbersAccount = "";
        }

        return numbers;
    }
}
