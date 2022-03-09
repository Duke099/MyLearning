package com.company;

//Q: Find Smallest character greater than a target.
public class A31_SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'a', 'd', 'f', 'h'};
        char target = 'h';
        char ans = letters(letters, target);
        System.out.println(ans);

    }
    static char letters(char[] letters, char target) {

        if (target == letters[letters.length - 1]) {
            return letters[0];
        }

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) /2;
            if (target <  letters[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length]  ;
    }
}
