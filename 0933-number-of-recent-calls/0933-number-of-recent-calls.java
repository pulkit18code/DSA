import java.util.ArrayDeque;
import java.util.Deque;

class RecentCounter {

    private Deque<Integer> deque;

    public RecentCounter() {
        deque = new ArrayDeque<>();
    }

    public int ping(int t) {
        
        deque.addLast(t);

        
        while (!deque.isEmpty() && deque.peekFirst() < t - 3000) {
            deque.removeFirst();
        }

        
        return deque.size();
    }
}