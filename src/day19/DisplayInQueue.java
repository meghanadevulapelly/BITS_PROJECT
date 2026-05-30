package day19;

public class DisplayInQueue {
    int front=-1;
    int rear=-1;
    int arr[]=new int[5];
    void enqueue(int data){
        if(rear==arr.length-1){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }
            rear++;
            arr[rear]=data;
            System.out.println(arr[rear]+" -> inserted");
        }

        void dequeue(){
            if(front==-1 || front>rear){
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(arr[front]+" -> removed");
            front++;
        }

        void peek(){
            if(front==-1 || front>rear){
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(arr[front]+" -> peeked");
        }

        void display(){
            if(front==-1 || front>rear){
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Elements in the queue are :");
            for(int i=front;i<=rear;i++){
                if(arr[i]==arr[rear])
                System.out.print(arr[i]);
                else
                System.out.print(arr[i]+" -> ");

            }
            
        }
        public static void main(String[] args) {
            DisplayInQueue q=new DisplayInQueue();
            q.enqueue(70);
            q.enqueue(785);
            q.enqueue(455);
            q.dequeue();
            q.peek();
            q.display();
        }
}
