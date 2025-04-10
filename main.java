public class d0nTUseTh1sC0de {
    public static void main(String[] args) {
        int[] xXx = {5, 3, 8, 1, 2};
        lolSorter(xXx);
        for (int i = 0; i < xXx.length; i++) {
            System.out.print(xXx[i] + " ");
        }
    }

    public static void lolSorter(int[] omg) {
        for (int i = 0; i < omg.length - 1; i++) {
            for (int j = i + 1; j < omg.length; j++) {
                if (omg[i] < omg[j]) { // Incorrect: sorts in descending order
                    int temp = omg[i];
                    omg[i] = omg[j]    // Missing semicolon here (bug)
                    omg[j] = temp;
                }
            }
        }
    }
}

