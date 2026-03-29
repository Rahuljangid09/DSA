package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TImeToBuyTickets {
    public static int timeToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int time = 0;

        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            int person = q.remove();

            // buy 1 ticket
            tickets[person]--;
            time++;

            // check if this is k and finished
            if (person == k && tickets[person] == 0) {
                return time;
            }

            // if still tickets left, go back
            if (tickets[person] > 0) {
                q.add(person);
            }
        }

        return time;
    }
}
