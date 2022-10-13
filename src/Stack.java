//Stack data structure is last in first out.
// You can push items onto the top of the stack as well as pop items off the top of the stack.

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public Boolean isFull(){
        return top == capacity -1;
    }
    public Boolean isEmpty(){
        return top == -1;
    }

    public void push(int x){
        if (isFull()){
            System.out.println("stack has overflowed");

        }
        //put x on top of the stack at position zero
        arr[++top]= x;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("stack is empty");

        }
        //removes element at top of the stack and returns to rest
        return arr[top--];
    }

    public void printStack(){
        for (int i = 0; i <= top; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();

        stack.pop();
        stack.printStack();
    }
}
