public class StringOps {
    public static String reverse(String input){
        int length = input.length();

        char[] output = new char[length];

        for (int i =0; i < length; i++){
            output[i] =input.charAt(length - i - 1);
        }

        return new String(output);
    }
}
