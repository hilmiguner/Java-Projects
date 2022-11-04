public class strings {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";

        int msjLen = mesaj.length();
        System.out.println("Length of '" + mesaj + "' is " + msjLen);

        System.out.println("-----------------------------------------------------------");

        System.out.println("5. element of '" + mesaj + "' is " + mesaj.charAt(4));

        System.out.println("-----------------------------------------------------------");

        String newMsg = mesaj.concat(" Yaşasın!");
        System.out.println("Concated new message -> " + newMsg);

        System.out.println("-----------------------------------------------------------");

        String temp = "B";
        System.out.println("Does '" + mesaj + "' start with '" + temp + "' -> " + mesaj.startsWith(temp));

        temp = "b";
        System.out.println("Does '" + mesaj + "' start with '" + temp + "' -> " + mesaj.startsWith(temp));

        temp = "a";
        System.out.println("Does '" + mesaj + "' start with '" + temp + "' -> " + mesaj.startsWith(temp));

        temp = ".";
        System.out.println("Does '" + mesaj + "' end with '" + temp + "' -> " + mesaj.endsWith(temp));

        temp = "l";
        System.out.println("Does '" + mesaj + "' end with '" + temp + "' -> " + mesaj.endsWith(temp));

        System.out.println("-----------------------------------------------------------");

        char[] characters = new char[5];

        //.getChars(firstIndex, lastIndex, charArr, charArrBeginIndex);
        mesaj.getChars(0, 5, characters, 0);
        System.out.println(characters);

        System.out.println("-----------------------------------------------------------");

        newMsg = mesaj.replace(' ', '-');
        System.out.println("New message which replaced -> " + newMsg);

        System.out.println("-----------------------------------------------------------");

        String substring = mesaj.substring(2);
        System.out.println("Substring from 2 -> " + substring);

        substring = mesaj.substring(2, 4); //Includes 2, doesn't include 4.
        System.out.println("Substring from 2 to 4 -> " + substring);

        System.out.println("-----------------------------------------------------------");

        String[] words = mesaj.split(" ");
        for(String word : words) {
            System.out.println(word);
        }

        System.out.println("-----------------------------------------------------------");

        String lowercasedMsg = mesaj.toLowerCase();
        String uppercasedMsg = mesaj.toUpperCase();

        System.out.println(lowercasedMsg);
        System.out.println(uppercasedMsg);

        System.out.println("-----------------------------------------------------------");

        mesaj = "    Bugün hava çok güzel.     ";
        newMsg = mesaj.trim();
        System.out.println("'" + mesaj + "' to '" + newMsg + "'");
    }
}
