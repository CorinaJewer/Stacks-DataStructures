import java.util.LinkedList;

public class StackLinkedList{

    private LinkedList <Integer> linkedList;

    public StackLinkedList(){  //Doesn't need a size
        this.linkedList = new LinkedList<>();
    }  

    // Implement Push Method

    public void push(int value){
        linkedList.push(value);  //Add element at top of stack(begin of list) to accomodate LIFO
        System.out.println("The value of " + value + " was sucessfully added to the top of the stack.");
    }

    // Implement Pop Method

    public void pop (){
        if (linkedList.isEmpty()){
            System.out.println("Stack is empty.");
        }
        int value = linkedList.getFirst();
        linkedList.pop();  // Remove element at top of stack(begin of list) to accomodate LIFO
        System.out.println("The value of " + value + " was sucessfully removed from the top of the stack.");
    }

    // Implement Peek Method

    public void peek(){
        if(linkedList.isEmpty()){
            System.out.println("Stack is empty.");
        }
        int value = linkedList.peek(); // Retrieve element at top of stack (begin of list) to accomodate LIFO
        System.out.println("The value at the top of the stack is " + value + ".");

    }    

    // Implement Delete Method

    public void deleteStackLinkedList(){
        linkedList.clear();  
        System.out.println("The Stack Linked List has been deleted.");
    }

    public void printStackLinkedList() {
        System.out.println("Stack: " + linkedList);
    }    
}