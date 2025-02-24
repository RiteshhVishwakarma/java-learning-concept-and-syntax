
public class StringMethods {
    public static void main(String[] args) {


//        String str = "Hello"; // creating string
//        System.out.println(str);
//
//        System.out.println(str.concat(" ritesh")); // concating is adding two strings
//
//        System.out.println(str.toLowerCase()); // All Charecter will be in Lowercase like hello
//
//        System.out.println(str.toUpperCase()); // All Charector will be in Uppercase like HELLO
//
//        str = " Vishwakarma ";
//        System.out.println(str.trim()); // remove left and right unnecessary spaces
//
//        str = "nice";
//        char[] arr = str.toCharArray();  // convert string to array like [ "n","i", "c", "e"]
//        System.out.println(arr);
//
//        char charecter = str.charAt(2); // to find index of string
//        System.out.println(charecter);


        // Reversing a String

        String rev = "", str = "HelloWorld";
        char ch;

        System.out.println("Original: "+str);
        for (int i = str.length() - 1; i>=0; i--){
            ch = str.charAt(i);
            rev = rev + ch;
        }
        System.out.println("Reverse: "+rev);

    }
}
