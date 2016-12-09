

public class QueueClass {
   private static final int capacity = 10;
   int arrayStack[] = new int[capacity];
   int top = -1;
   int rear = 0;

   public void push(int pushedElement) {
      if (top < capacity - 1) {
      top++;
      arrayStack[top] = pushedElement;
      System.out.println(pushedElement+ " is pushed to Queue");
      peekQue();
      } 
   }

   public void isFull() {
      if (top < capacity - 1) {;
      }
      else {
      System.out.println("Queue Full");
      }
   }
      
   public void pop(int poppedElement) {
      if (top >= rear) {
      rear++;
      System.out.println( poppedElement + " popped from Queue");
      peekQue();
      }
   }
   
   public void isEmpty() {
      if (top >= rear) {;
      }
      else {
      System.out.println("Queue Empty");
      }
   }

   public void peekQue() {
      if (top >= rear) {
      System.out.println("Queue: ");
      for (int i = rear; i <= top; i++) {
      System.out.print(arrayStack[i] + " ");
      }
      }
      
   }

}

