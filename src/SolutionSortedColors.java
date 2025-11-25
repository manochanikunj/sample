public class SolutionSortedColors {

    public static int[] sortColors (int[] colors) {

        // start pointers, i and j, from beginning and end of the array
        int i = 0, j = colors.length-1;
        // while i < j, keep doing
        while (i < j) {
            // if element at i is 0, move i forward
            if (colors[i]==0) {
                i++;
                continue;
            } else if (colors[i]==2) {
                // if element at i is 2, swap elements at i and j and move j backward
                int temp = colors[i];
                colors[i] = colors[j];
                colors[j] = temp;
                j--;
                continue;
            } else if (colors[j]==0) {
                // if element at j is 0, swap elements at i and j and move i forward
                int temp = colors[i];
                colors[i] = colors[j];
                colors[j] = temp;
                i++;
                continue;
            } else if (colors[i]==1) {
                // element at i is 1. get another pointer starting from i and traverse until you find a zero and then swap with it and move i forward
                int k = i;
                while (k <= j) {
                    if (colors[k] == 0) {
                        int temp = colors[i];
                        colors[i] = colors[k];
                        colors[k] = temp;
                        break;
                    }
                    k++;
                }
                i++;
            }
        }
        return colors;
    }
}
