import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue <String> queue= new LinkedList<String>();
        queue.offer("ROMIT");
        queue.add("RKPATEL1");
        queue.add("RKPATEL2");
        queue.remove();
        queue.remove();
        System.out.println(queue);
    }
}