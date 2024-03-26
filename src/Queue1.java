import java.util.LinkedList;

public class Queue1<T> {
//using linked list
    LinkedList<T> linkedList=new LinkedList<T>();
    int SizeOFqueue=0;
    void enqueue(T data){
        linkedList.add(data);
        SizeOFqueue++;
    }
T dequeue(){
        if(SizeOFqueue==0){
            System.out.println("queue empty cannot dequeue");
            return null;
        }
    return linkedList.removeFirst();
}
void display(){
    if(SizeOFqueue==0){
        System.out.println("queue empty cannot display");
        return ;
    }
        for(T items:linkedList){
            System.out.println(items);
        }}
    void front(){
        if(SizeOFqueue==0){
            System.out.println("queue empty cannot display");
            return ;
        }
        System.out.println(linkedList.getFirst());
}

}
