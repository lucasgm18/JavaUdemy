public class exe27 {

    public static void main(String[] args){

       String original = "abcde FGHIJ ABC abc DEFG    ";
       String s0 = original.toLowerCase();
       String s1 = original.toUpperCase();
       String s2 = original.trim();
       String s3 = original.substring(2);
       String s4 = original.substring(2, 9);
       String s5 = original.replace('a', 'x');
       String s6 = original.replace("abc", "xy");
       int i = original.indexOf("bc");
       int j = original.lastIndexOf("bc");

       System.out.println("Original: -" + original + "-");
       System.out.println("toLowerCase: -" + s0 + "-");
       System.out.println("toUpperCase: -" + s1 + "-");
       System.out.println("trim: -" + s2 + "-");
       System.out.println("substring(2): -" + s3 + "-");
       System.out.println("substring(2, 9): -" + s4 + "-");
       System.out.println("replace('a', 'x'): -" + s5 + "-");
       System.out.println("replace('abc', 'xy'): -" + s6 + "-");
       System.out.println("Index of 'bc': " + i);
       System.out.println("Last index of 'bc': " + j);
       
    }

}
