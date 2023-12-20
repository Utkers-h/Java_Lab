import java.util.Queue;
import java.util.PriorityQueue;
public class Priority_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        q.add(21);
        q.add(2);
        q.add(1);
        q.add(98);
        q.add(9);

        System.out.println("head:" + q.peek());
        // System.out.println(q);
        // for(int n : q){
            //     System.out.println(n);
            // }
            q.remove(1);
            System.out.println("head:" + q.peek());

        System.out.println(q.poll());
        System.out.println(q);

        
    }


}
