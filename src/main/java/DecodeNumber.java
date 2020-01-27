import java.util.HashMap;
import java.util.Map;

public class DecodeNumber {
    private final String ONE = "     |  |";
    private final String TWO = " _  _||_ ";
    private final String THREE = " _  _| _|";
    private final String FOUR = "   |_|  |";
    private final String FIVE = " _ |_  _|";
    private final String SIX = " _ |_ |_|";
    private final String SEVEN = " _   |  |";
    private final String EIGHT = " _ |_||_|";
    private final String NINE = " _ |_| _|";
    private final String ZERO = " _ | ||_|";
    private final String QUESTION_MARK = "?";
    private Map map;

    public DecodeNumber(){
        map = new HashMap<>();
        map.put(ONE, "1");
        map.put(TWO, "2");
        map.put(THREE, "3");
        map.put(FOUR, "4");
        map.put(FIVE, "5");
        map.put(SIX, "6");
        map.put(SEVEN, "7");
        map.put(EIGHT, "8");
        map.put(NINE, "9");
        map.put(ZERO, "0");
    }
    
    public String convertToNumber(String numbers) {
        return  map.getOrDefault(numbers,QUESTION_MARK).toString();
    }
}
