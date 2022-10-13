package datastructures;

/**
 * A stack is a data structure that follows a LIFO format: last in first out - the most recently added element
 * is always the next one to be removed.
 *
 * you can think of it like a stack of plates, or like the puzzle game towers of hanoi.
 */
public class Stack<T>{
    Node<T> head;
    public Stack (){

    }

    /**
     * add a new item to the top of my stack.
     * @param data the data that is stored at the top of the stack, will be a part of the node object.
     */
    public void push(T data){
        if(head == null){
            head = new Node<T>(data);
        }else{
            Node<T> newNode = new Node<>(data);
            newNode.next=head;
            head = newNode;
        }
    }

    /**
     * remove the top item from the stack and return it.
     * @return the data of the top node of the stack.
     */
    public T pop(){
//        if the head is null, attempting to get the next node of null will cause an exception. so, we check for that
//        edge case here.
        if(head == null){
            return null;
        }
        Node<T> old = head;
        head = head.next;
        return old.data;
    }

    /**
     * @return the top item of the stack without removing it.
     */
    public T peek(){
        if(head == null){
            return null;
        }
        return head.data;
    }

}
