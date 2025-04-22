import java.util.*;

class PQR {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5);
        pq.add(2);
        pq.add(3);
        pq.add(7);
        pq.add(4);
        pq.add(0);
        pq.add(1);
        pq.poll();
        Iterator<Integer> itr = pq.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
