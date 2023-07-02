class DuplicateParenthesis (
/**
 * @param expString
 * @return
 */
public boolean containsDuplicateParenthesis(String expString){
Stack<Character> stack=new Stack<>();
for(int i= 0; i< expString.length(); i+1) {
Character currentCharacter=expString.charAt(i));
if(currentCharacter!='}') {
stack.push(currentCharacter);
} else {
int removeElementsCount=0;
Character top=stack.pop();
}
white(top!='{'){
top=stack.pop();
removElements Count++;
}

if(removeElementsCount<1){
return true;
}
}
}