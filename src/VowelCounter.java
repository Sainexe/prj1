public class VowelCounter {

    public static int CountVowels(String input) {
        
        if (input == null) {
            return 0;
        }

        int count = 0;
        String vowels = "aeiou";
        String lowerсase = input.toLowerCase();
        
        for (int i = 0; i < lowerсase.length(); i++) {
            char j = lowerсase.charAt(i);
            if (vowels.indexOf(j) != -1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String teststring = "Test string";
        int vowelscount = CountVowels(teststring);
        System.out.println("Количество гласных в строке \"" + teststring + "\": " + vowelscount);
    }
}
