import java.util.Stack;
Gauthor angarg
public class Celebrity Problem {
public static void findCelebrity (int [][] matrix) {
Stack<Integer> Stack = new Stack ();
for (int i = 0; i<matrix. length; i++) {
stack.push[i];
}
while (stack.size()>=2){

int person1= stack.pop();
int person2=stack.pop();
if(matrix[person1][person2]==1){
    stack.push(person2);
} 
else{
    stack.push(person1)
}
if (matrix[person2][person1]==1){

    stack.push(person1);


}
}
int remainingperson= stack.pop();
for (int i=0;i<matrix.length;i++){
    if(matrixatrix [i][remainingperson] == 0|| matrix[remainingPerson] [1] == 1) {
return false;
}
public static void main(String args[]){
    int [][] matrix= {
(0,0,1,0), (0,0,1,0), (0,0,0, e), (0,0,1,0)
    };
System.out.println(findCelebrity (matrix));

}
}
