package day19;

public class ImplementationOfStackWithPeak {
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
    void peak()
    {
        if(top==-1)
        {
            System.out.println("No values in stack");
            return;
        }
        System.out.println(arr[top]+"->is peak element");
    }
    public static void main(String[] args)
    {
        ImplementationOfStackWithPeak ob = new ImplementationOfStackWithPeak();
        ob.push(90);
        ob.push(910);
        ob.push(190);
        ob.push(210);
        ob.push(908);
        ob.push(400);
        ob.peak();
        
    }
}
