public class friendNumber {
    public static void main(String[] args) {
        int num1 = 1184; // or 220
        int num2 = 1210; // or 284

        int total1 = 0;
        int total2 = 0;

        for(int i = 1 ; i < num1 ; i++) {
            if(num1 % i == 0) {
                total1 = total1 + i;
            }
        }
        for(int i = 1 ; i < num2 ; i++) {
            if(num2 % i == 0) {
                total2 = total2 + i;
            }
        }
        if(total1 == num2 && total2 == num1) {
            System.out.println(String.format("%s and %s are friend numbers because total1 is %s and total2 is %s", num1, num2, total1, total2));
        }
        else {
            System.out.println(String.format("%s and %s are not friend numbers because total1 is %s and total2 is %s", num1, num2, total1, total2));
        }
    }
}