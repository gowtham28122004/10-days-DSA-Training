import java.util.Scanner;

public class StrAnaSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] str1 = s.next().toCharArray();
        char[] str2 = s.next().toCharArray();

        if (isAnagram(str1, str2)) {
            int[] freq = frequency(str1);
            sort(freq);
        } else {
            System.out.println("Not Anagram");
        }
    }

    public static boolean isAnagram(char[] str1, char[] str2) {
        if (str1.length != str2.length) return false;
        int[] arr1 = frequency(str1);
        int[] arr2 = frequency(str2);
        for (int i = 0; i < 52; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static int[] frequency(char[] str) {
        int[] freq = new int[52];
        for (char s : str) {
            if (s >= 'a' && s <= 'z') freq[s - 'a' + 26]++;
            else if (s >= 'A' && s <= 'Z') freq[s - 'A']++;
        }
        return freq;
    }

    public static void sort(int[] freq) {
        for (int i = 0; i < 26; i++) {
            char upper = (char) ('A' + i);
            char lower = (char) ('a' + i);

            for (int u = 0; u < freq[i]; u++) {
                System.out.print(upper);
            }

            for (int l = 0; l < freq[i + 26]; l++) {
                System.out.print(lower);
            }
        }
    }
}
