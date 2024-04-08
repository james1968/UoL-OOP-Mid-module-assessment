import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Top t = new Top();
        System.out.println( "Class built." );

        System.out.println("Test 2");
        t.push("b");
        t.push("a");
        t.push("c");
        t.push("abba");
        t.push("zzz");
        System.out.println(t.getTopThree());

        System.out.println("Test 3");
        t.reset();
        t.push("Jules");
        t.push("Jim");
        System.out.println(t.getTopThree());

        System.out.println("Test 4");
        for (char ch = 'I'; ch <= 'Z'; ++ch) {
            t.push("" + ch);
        }
        System.out.println(t.getTopThree());

        System.out.println("Test 5");
        t.reset();
        t.push("Bules");
        t.push("Tim");
        t.push("Bules");
        t.push("Tim");
        System.out.println(t.getTopThree());

        System.out.println("Test 6");
        t.reset();
        t.push("John");
        System.out.println(t.getTopThree());

        System.out.println("Test 7");
        t.reset();
        for (int i = 0; i <= 100; ++i) {
            t.push("JulesAndTim");
        }
        System.out.println(t.getTopThree());

        System.out.println("Test 8");
        t.reset();
        t.push("a");
        t.push("A");
        t.push("AB");
        t.push("ABC");
        t.push("ABCD");
        System.out.println(t.getTopThree());

        System.out.println("Test 9");
        t.reset();
        t.push("a");
        t.push("AB");
        t.push("AB");
        t.push("A");
        t.push("ABC");
        t.push("ABC");
        t.push("B");
        t.push("C");
        t.push("A");
        t.push("a");
        System.out.println(t.getTopThree());

        System.out.println("Test 9.1");
        t.reset();
        t.push("X");
        t.push("x");
        t.push("Z");
        t.push("w");
        t.push("C");
        t.push("D");
        t.push("E");
        t.push("F");
        t.push("B");
        t.push("C");
        t.push("AB");
        t.push("C");
        t.push("A");
        System.out.println(t.getTopThree());

        System.out.println("Test 9.2");
        t.reset();
        t.push("x");
        t.push("x");
        t.push("z");
        t.push("f");
        t.push("C");
        t.push("A");
        System.out.println(t.getTopThree());

        System.out.println("Test 10");
        t.reset();
        t.push("x");
        t.push("x");
        t.push("Z");
        t.push("f");
        t.push("c");
        t.push("abba");
        System.out.println(t.getTopThree());

        System.out.println("Test 11");
        t.push("A");
        t.push("B");
        t.push("C");
        System.out.println(t.getTopThree());

        System.out.println("Test 12");
        t.reset();
        char[] data = new char[100];
        Arrays.fill(data, 'a');
        String str = new String(data);
        t.push(str);
        System.out.println(t.getTopThree());
    }
}