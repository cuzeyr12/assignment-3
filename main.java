

public class main {
    static void main() {

        int[] numbers = {10, 20, 30, 40, 50};

        int[] result = reverse.reverseArray(numbers);

        System.out.print("Reversed array: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}