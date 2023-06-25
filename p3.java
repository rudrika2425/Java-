public class p3 {
    public static void main(String[] args)
    {
        int [] arr={20,18,19,17,18,19};
        int sum=0;
        for(int element:arr)
        {
            sum+=element;
        }
        int average=(sum/arr.length);
        System.out.println("Average is:"+average);

    }
    
}
