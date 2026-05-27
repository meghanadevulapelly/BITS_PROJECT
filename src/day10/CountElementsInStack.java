package day10;

public class CountElementsInStack {

    int arr[] = new int[5];
    int top = -1;

    void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
            return;
        }

        ++top;
        arr[top] = data;
        System.out.println(arr[top] + " -> inserted");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return;
        }

        System.out.println(arr[top] + " -> deleted");
        arr[top] = 0;   
        top--;
    }

    void peek() {
        if (top == -1) {
            System.out.println("No values in stack");
            return;
        }

        System.out.println(arr[top] + " -> is peek element");
    }

    boolean search(int data) {
        if (top == -1) {
            return false;
        }

        for (int i = 0; i <= top; i++) {
            if (arr[i] == data) {
                return true;
            }
        }

        return false;
    }

    void count() {
        if (top == -1) {
            System.out.println("No values in stack");
            return;
        }

        int c = top + 1;

        System.out.println("Number of elements in stack: " + c);
    }

    public static void main(String[] args) {

        CountElementsInStack ob = new CountElementsInStack();

        ob.push(90);
        ob.push(910);
        ob.push(190);
        ob.push(210);
        ob.push(908);
        ob.push(400);

        ob.count();
    }
}