//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue2<Integer> queue = new Queue2<>();
    queue.enqueue(12);
       queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);
        System.out.println("de_queueing");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("displaying front");
        queue.front();


    }}