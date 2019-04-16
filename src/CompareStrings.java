public class CompareStrings {
    public static void main(String[] args) {
        //true
        boolean a = new String ("abc").equals("abc");
        //false
        boolean b = new String("abc") == "abc";
        //false
        boolean c = new String("abc") == new String("abc");
        //true
        boolean d = "abc" == "abc";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
