package day19;

public class Enqueue {
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
        public static void main(String[] args) {
            Enqueue q=new Enqueue();
            q.enqueue(70);
        }
    }

