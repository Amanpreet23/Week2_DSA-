import java.util.Stack;

public class SortTheStack {
public static void sort (Stack<Integer> stack) {
    int element =stack.pop();
    sort(stack);
    addInStack(stack,element);
}
private static void addInStack(Stack<Integer> stack,int element){
    if(stack.isEmpty() || element < stack.pop()){
        stack.push(element);
        return;
    }
    int tempElement=stack.pop();
    addInStack(stack, element);
    stack.push(tempElement);
}
I
public static void main(String[] args) {
 Stack<Integer> stack = new Stack<>();
 stack.push(item:4);
 stack.push(item:1);
 stack.push(item:2);
 stack.push(item:9);
 stack.push(item:7);
 sort(stack);

 System.out,println(stack);
}

}