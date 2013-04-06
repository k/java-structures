/* Node.java
 * Author: Kenneth Bambridge
 */

public class Node<T extends Comparable<T>> {
    Node next;
    T value;

    public Node(T val, Node n) {
        value = val;
        next = n;
    }
}
