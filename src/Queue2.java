import java.util.Stack;

public class Queue2<T> {
    //using stacks
    Stack<T> stack1=new Stack<T>();
    Stack<T> stack2=new Stack<>();
    void enqueue(T data){
       while(!stack1.isEmpty()){
       stack2.push(stack1.pop());
        }
        stack1.push(data);
        System.out.println(data);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

    }
    T dequeue(){
        if(stack1.isEmpty()){
            System.out.println("queue is empty cannot dequeue");
            return null;
        }
        return stack1.pop();

    }
//    void display(){
//        if(stack1.isEmpty()){
//            System.out.println("queue is empty cannot display");
//            return;
//        }
//        while(!stack1.isEmpty()){
//            System.out.println(stack1.pop());
//        }
    }

