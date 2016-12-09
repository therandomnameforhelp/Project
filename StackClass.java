


import java.util.Scanner;
import java.util.Arrays;


public class StackClass {
   private static final int capacity = 10;
   int arrayStack[] = new int[capacity];
   int top = -1;
   
   public void push(int pushedInteger) {
      if (top < capacity - 1) {
      top++;
      arrayStack[top] = pushedInteger;
      System.out.println(pushedInteger + " is pushed to Stack");
      peekStack();
      }
   }
   
   public void isFull() {
      if (top < capacity - 1) {
      ;
      } 
      else {
      System.out.println("Stack Full");
      }
   }

   public void pop() {
      if (top >= 0) {
      top--;
      System.out.println( " Popped from stack");
      peekStack();
      } 
   }

   public void isEmpty() {
      if (top>= 0){ ;
      }
      else {
      System.out.println("Stack Empty");
      }
   }
 
   public void peekStack() {
      System.out.println("Stack : ");
      for (int i = 0; i <= top; i++) {
      System.out.print(arrayStack[i] + " " );
      }
   }     
}
