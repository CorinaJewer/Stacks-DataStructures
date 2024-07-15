public class Main {
    
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stack Array");
        System.out.println("-----------");

        StackArrays stackArray = new StackArrays(4);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);

        System.out.println(stackArray.toString());
    
        System.out.println("The stack array is full: " + stackArray.isFull());
        stackArray.pop();
        stackArray.peek();
        stackArray.pop();
        stackArray.pop();
        System.out.println("Stack: " + stackArray.toString());
        System.out.println("The stack array is empty: " + stackArray.isEmpty());
        stackArray.deleteStack();
        System.out.println("The stack array is empty: " + stackArray.isEmpty());
        System.out.println("Stack: " + stackArray.toString());
        System.out.println();  
           
        System.out.println("Linked List Stack");
        System.out.println("-----------------");

        StackLinkedList stackLinkedList = new StackLinkedList();

        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);

        stackLinkedList.printStackLinkedList();

        stackLinkedList.pop();
        stackLinkedList.pop();

        stackLinkedList.peek();

        stackLinkedList.printStackLinkedList();

        stackLinkedList.deleteStackLinkedList();

        stackLinkedList.printStackLinkedList();

        System.out.println();
    }
}
