package day10;

public class ImplementationOfStackWithPush {
    int arr[] = new int[5];
    int top=-1;
    void push(int data)
    {
        if(top==arr.length-1)
        {
            System.out.println("Stack overlow");
            return;
        }
        ++top;
        arr[top]=data;
        System.out.println(arr[top]+"->inserted");
    }
    public static void main(String[] args)
    {
        ImplementationOfStackWithPush ob = new ImplementationOfStackWithPush();
        ob.push(90);
        ob.push(910);
        ob.push(190);
        ob.push(210);
        ob.push(908);
        ob.push(400);
    }
}
