package day19;

public class DisplayInStack {
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
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println(arr[top]+"->deleted");
        top--;
        arr[top]=0;
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

    boolean search(int data)
    {
        if(top==-1)
        {
            return false;
        }
        for(int i=0;i<=top;i++)
        {
            if(arr[i]==data)
            {
                return true;
            }
        }
        return false;
    }

    void display()
    {
        if(top==-1)
        {
            System.out.println("No values in stack");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            if(i==0)
                System.out.print(arr[i]);
            else
               System.out.print(arr[i]+" -> ");
        }
    }
    public static void main(String[] args)
    {
        DisplayInStack ob = new DisplayInStack();
        ob.push(90);
        ob.push(910);
        ob.push(190);
        ob.push(210);
        ob.push(908);
        ob.push(400);
       ob.display();
    }
}
