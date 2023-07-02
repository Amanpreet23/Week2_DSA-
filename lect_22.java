import java.util.Deque;
import java.util.LinkedList;
public class MaximumInEachWindow {
public static void printMaximum (int[] arr, int k) {
Deque<Integer> deque = new Linked List<>();
int currentIndex = 0;
for (currentIndex = 0; currentIndex<k; currentIndex++) {
    while (!deque.isEmpty() && arr [currentIndex] = arr[deque.peekLast()]) {
deque.removeLast();
}
deque. addLast (current Index);
}
for(; currentIndex < arr.length; currentIndex++) {
System.out.println(arr[deque. peek()]);
while (!deque.isEmpty() && deque. peek() <= currentIndex - k) {
deque.removeFirst();
}
while (!deque.isEmpty() && arr[currentIndex] >= arr[deque. peekLast()]) {
deque. removeLast();
}
}

public static void main(String[] args) {
    
    int[] arr = {7, 6, 8, 5, 8, 3, 2, 10);
printMaximum(arr, k: 3);
}
