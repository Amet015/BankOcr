public class DecodeNumber {
    private final String oneNumber = "     |  |";
    private final String twoNumber = " _  _||_ ";
    private final String threeNumber = " _  _| _|";
    private final String fourNumber = "   |_|  |";
    private final String fiveNumber = " _ |_  _|";
    private final String sixNumber = " _ |_ |_|";
    private final String sevenNumber = " _   |  |";
    private final String eightNumber = " _ |_||_|";
    private final String nineNumber = " _ |_| _|";
    private final String zeroNumber = " _ | ||_|";

    public String convertToNumber(String numbers) {

        switch (numbers){
            case oneNumber:
                return "1";
            case threeNumber:
                return "3";
            case twoNumber:
                return "2";
            case fourNumber:
                return "4";
            case fiveNumber:
                return "5";
            case sixNumber:
                return "6";
            case sevenNumber:
                return "7";
            case eightNumber:
                return "8";
            case nineNumber:
                return "9";
            case zeroNumber:
                return "0";
            default:
                return "?";
        }
    }
}
