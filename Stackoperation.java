//Create a class called Stack that implements the stack data structure. The class should have methods to push, pop, and peek elements, as well as to check if the stack is empty.
import java.util.*;
class Stackoperation{
  public static void main(String args[]){
    Stack<Integer> hm=new Stack<Integer>();
    pushelement(hm,20);
    pushelement(hm,30);
    pushelement(hm,42);
    popelement(hm);
  int topElement = hm.peek();
  System.out.println("Top element: " + topElement);
    try{
      popelement(hm);
    }
    catch(EmptyStackException e){
      System.out.println(e);
    }
  }
  static void pushelement(Stack hm,int x){
    hm.push(new Integer(x));
    System.out.println("push: "+x);
    System.out.println("stack: "+hm);
  }
  static void popelement(Stack hm){
    Integer x=(Integer)hm.pop();
    System.out.println(x);
    System.out.println("stack: "+hm);
    
}
}