public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
    }

    public boolean isFull(){
        if (topOfStack == arr.length - 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        } else {
            return false;
        }
    }

    // Implement Push method

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full, cannot add value");
        } else {
            arr[topOfStack + 1] = value;  // Place the value in next available spot in stack
            topOfStack++;
            System.out.println("The value of " + value + " was sucessfully added to the top of the stack.");
        }
    }

    // Implement Pop method

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
        } else {
            int value = arr[topOfStack];
            topOfStack--;
            System.out.println("The value of " + value + " was sucessfulled removed from the top of the stack.");
        }
    }

    // Implement Peek method

    public void peek(){
        if (isEmpty()){
            System.out.println("Stack is empty.");
        } else {
            int value = arr[topOfStack];
            System.out.println("The value at the top of the stack is " + value + ".");
        }
    }

    // Implement Delete Stack

    public void deleteStack(){
        arr = null;  // stackArray object no longer points to arr which will become eligible for garabage collection
        topOfStack = -1;
        System.out.println("Stack Array has been deleted.");
    }

    @Override
    public String toString() {
    if (isEmpty()) {
        return "[]";
    }
    String result = "[";
    for (int i = 0; i <= topOfStack; i++) {
        result += arr[i]; 
        if (i < topOfStack) {
            result += ", "; 
        }
    }
    result += "]"; 
    return result; 
    }
}
