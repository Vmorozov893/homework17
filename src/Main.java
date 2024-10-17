import java.util.*;


public class Main {

    private static final List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {

        task1();
        separator();
        task2();
        separator();
        task3();
        separator();
        task4();

    }

    public static void task1() {
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        Collections.sort(numbers);

        int prevNum = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static void task3() {
        Set<String> words = new HashSet<>(strings);
        System.out.println(words);
    }

    public static void task4() {
        Set<String> words = new HashSet<>(strings);
        int k;
        for (String wrd : words) {
            k = 0;
            for (String str : strings) {
                if (wrd.equals(str)) {
                    k++;
                }
            }
            System.out.println(k);
        }
    }

    public static void separator() {
        System.out.println("==============");
    }
}