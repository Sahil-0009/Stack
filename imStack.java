// public class imStack {

//    private ListNode top;
//    private int length;

//    private class ListNode {
//       int data;
//       ListNode next;

//       public ListNode(int data) {
//          this.data = data;
//       }
//    }

//    public imStack() {
//       top = null;
//       length = 0;
//    }

//    public int length() {

//       return length;
//    }

//    public boolean isEmpty() {
//       return top == null;
//    }

//    public void push(int data) {
//       ListNode newNode = new ListNode(data);
//       if (top == null) {
//          top = newNode;
//       } else {
//          newNode.next = top;
//          top = newNode;
//       }
//       length++;
//    }

//    public int pop() {
//       if (isEmpty()) {
//          throw new RuntimeException("Stack is empty");
//       }
//       int data = top.data;
//       top = top.next;
//       length--;
//       return data;

//    }

//    public int peek() {
//       if (isEmpty()) {
//          throw new RuntimeException("Stack is empty");
//       }
//       return top.data;
//    }

//    public static void main(String[] args) {
//       imStack stack = new imStack();
//       stack.push(1);
//       stack.push(2);
//       stack.push(3);
//       stack.push(4);

//       stack.pop();
//       stack.peek();
//       System.out.println(stack.peek());
//       System.out.println(stack.pop());

//    }

// }
// // using array 

public class imStack {

   private int top;
   private int[] arr;

   public imStack(int capacity) {
      top = -1;
      arr = new int[capacity];
   }

   public imStack() {
      this(10);
   }

   public int size() {
      return top + 1;
   }

   public boolean isEmpty() {
      return top < 0;
   }

   public boolean isFull() {
      return arr.length == size();
   }

   public void push(int data) {
      if (isFull()) {
         throw new RuntimeException("Stack is full !!!");
      }
      top++;
      arr[top] = data;
   }

   public int pop() {
      if (isEmpty()) {
         throw new RuntimeException("Stack is empty !!!");
      }
      int result = arr[top];
      top--;
      return result;
   }

   public int peek() {
      if (isEmpty()) {
         throw new RuntimeException("Stack is empty !!!");
      }
      return arr[top];
   }

   public static void main(String[] args) {
      imStack stack = new imStack(3);
      stack.push(10);
      stack.push(15);
      stack.push(20);

      System.out.println(stack.peek());
      stack.pop();
      System.out.println(stack.peek());
      stack.pop();
      System.out.println(stack.peek());
      stack.pop();
      stack.pop();
   }
}