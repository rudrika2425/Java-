import java.util.Scanner;

public class p2 {
    public static void main(String[] args)
    {   
        int n=2;
        boolean isAnArray=false;
        int [] marks={1,2,3,4,5,6};
        for (int element:marks);{
            if (n==element){
                isAnArray=true;
                break;
            }
        }
        if (isAnArray){
            System.out.println("hence the number found hurray!!");
        }
        else{
            System.out.println("no,bad luck");
        }
    }
    
}
