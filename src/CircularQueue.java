public class CircularQueue {
    int front=-1;
    int rear=0;
    int[] array =new int[5];

    void enqueue(int data){
        if(rear==front)
        {
            System.out.println("queue full");
            return;
        }
        if(front==-1){
          front=0  ;
        }

        array[rear]=data;
        System.out.println(array[rear]);
       rear= (rear+1)% array.length;
    }
    int deque(){
        if(front==-1){
            System.out.println("queue empty");
            return -1;
        }
        int item=array[front];
        array[front]=0;
        front=(front+1)%array.length;
        return item;
    }

}
