package algorithm.com;

import java.util.Arrays;

public class BubbleShort {

    int getArray(int[] array) { // returning the length of array
        return array.length;
    }

    public void bubbleShort(int[] array) { // sorting the array
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < getArray(array) - 1; i++) { // take i and loop through total elements
                if (array[i] > array[i + 1]) { //9 > 6??
                    temp = array[i]; // assigning array[0] = 9 into temp
                    array[i] = array[i + 1]; // assigning the array[1] = 6 into array[0] so array[0] became 6
                    array[i + 1] = temp; // now array[1] assigning temp = 9 so array[1] became 9 {6,9,....} swapping done
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] sampleArray = {9, 6, 5, 8, 2, 4, 7};
        BubbleShort b1 = new BubbleShort();
        b1.bubbleShort(sampleArray);
    }
}
