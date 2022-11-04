public class vowelOrNot {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char character = 'b';
        for(char temp : vowels) {
            if(temp == character) {
                System.out.println(String.format("%s is a vowel.", character));
                return;
            }
        }
        System.out.println(String.format("%s is a consonant.", character));
    }
}