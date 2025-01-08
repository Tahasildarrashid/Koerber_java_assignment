public class q3 {
    public static int[] copyOf(int[] array) {
        int n = array.length;
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = copyOf(original);

        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
