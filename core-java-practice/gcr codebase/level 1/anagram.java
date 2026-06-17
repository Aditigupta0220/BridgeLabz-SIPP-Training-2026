import java.util.*;

class Solution {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.print("false");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int count = 0;

        for (int i = 0; i < t.length(); i++) {

            if (!map.containsKey(t.charAt(i))) {
                System.out.print("false");
                return;
            }

            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);

            if (map.get(t.charAt(i)) < 0) {
                System.out.print("false");
                return;
            }

            if (map.get(t.charAt(i)) == 0) {
                count++;
            }
        }

        if (count == map.size()) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}