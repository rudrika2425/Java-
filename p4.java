public class p4 {
    public static void main(String[] args)
    {
        //int [][]a=new int [2][3];
        //
        int a[][]={{1,3,4},{2,4,3}};    
        int b[][]={{1,3,4},{2,4,3}}; 
        int [][]c =new int [2][3];
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                c[i][j]=a[i][j]+b[i][j];      
                System.out.print(c[i][j]+" ");    
            }    
            System.out.println();//new line    
            }    
     

    }
    
}
