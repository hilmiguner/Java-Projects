public class primeNumber {
    public static void main(String[] args) {
        int number = 2;
        if(number < 2) {
            System.out.println(String.format("%s is not a prime number becasue %s smaller than 2.", number, number));
            return;
        }
        for(int i = 2 ; i < number ; i++) {
            if (number % i == 0) {
                System.out.println(String.format("%s is not a prime number because %s can divide %s", number, i, number));
                return;
            }
        }
        System.out.println(String.format("%s is a prime number.", number));
    }
    
}