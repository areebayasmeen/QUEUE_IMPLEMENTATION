public class Queue {
    //using array
    int size=10;
    int[] array=new int[size];
    int SizeOfQueue=0;
int back=0;
int front=0;
void enqueue(int data){
    if(SizeOfQueue==size){
        System.out.println("queue full cannot add elements");
        return;
    }
    array[back]=data;
    back++;
    SizeOfQueue++;
}
  int dequeue(){
    if(front==back){
        System.out.println("queue empty cannot dequeue");
        return -1;
    }
    int item =array[front];
    front++;
    return item;
  }
  void front(){
      if(front==back){
          System.out.println("queue empty ");
          return;
      }
      System.out.println(array[front]);
  }
    void display(){
        if(front==back){
            System.out.println("queue empty ");
            return;
        }
        int f=front;
        for(int i=f;i<=back-1;i++)
        {  System.out.println(array[f]);
        f++;
        }
    }
}
