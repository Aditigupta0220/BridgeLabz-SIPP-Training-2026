import java.util.*;

class Solution {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String currentstate = "00000";
        int state[] = new int[5];
        int max = 0;

        HashMap<String, Integer> map = new HashMap<>();
        map.put(currentstate, -1);

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a')
                state[0] = (state[0] + 1) % 2;

            if (s.charAt(i) == 'e')
                state[1] = (state[1] + 1) % 2;

            if (s.charAt(i) == 'i')
                state[2] = (state[2] + 1) % 2;

            if (s.charAt(i) == 'o')
                state[3] = (state[3] + 1) % 2;

            if (s.charAt(i) == 'u')
                state[4] = (state[4] + 1) % 2;

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < state.length; j++) {
                sb.append(state[j]);
            }

            currentstate = sb.toString();

            if (map.containsKey(currentstate)) {
                max = Math.max(max, i - map.get(currentstate));
            } else {
                map.put(currentstate, i);
            }
        }

        System.out.println(max);
    }
}