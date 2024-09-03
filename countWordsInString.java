import java.util.StringTokenizer;

public class countWordsInString {
     public static void main(String[] args) {
 
        String inputString = "Arise! Awake! and stop not until the goal is reached.";
        System.out.println("The input string is : \n" + inputString + "\n");
        System.out.println("Count words using split() method: " + countWordsUsingSplit(inputString));
        System.out.println("Count words using StringTokenizer class: " + countWordsUsingStringTokenizer(inputString));
        System.out.println("Count words using custom method: " + countWords(inputString));
    }
 
    // method to count words using the split() method
    public static int countWordsUsingSplit(String inputString) {
 
        String[] stringArray = inputString.split("\\s+"); // splitting the string using space/spaces
 
        return stringArray.length; // returning the length of the array i.e number of words in the string
    }
 
    // method to count words using the StringTokenizer class
    public static int countWordsUsingStringTokenizer(String inputString) {
 
        if (!inputString.isEmpty()) {
            StringTokenizer stringTokenizer = new StringTokenizer(inputString); // create StringTokenizer using the
                                                                                // inputString
 
            return stringTokenizer.countTokens(); // returning the number of tokens i.e. number of words
        }
        return 0;
    }
 
    // custom method to count the words from the string
    public static int countWords(String inputString) {
 
        int wordCount = 0;
        int endOfString = inputString.length() - 1;
 
        String str = inputString.trim(); // making sure that string should not have any spaces at the starting and
                                            // ending
        for (int i = 0; i < inputString.length(); i++) {
 
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
 
                wordCount++;
 
            } else if (str.charAt(i) == ' ' && str.charAt(i++) == ' ') { // if there is more than one space in between
                                                                            // string
 
                i++;
 
            } else if (i == endOfString) { // matching the first missing word
 
                wordCount++;
            }
        }
        return wordCount;
 
    }
 
}
