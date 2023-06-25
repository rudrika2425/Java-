public class Stirngs_concept {
    public static void main(String[] args)
    {
        //String input =new String;

        String name="Harry";
        System.out.println(name);
        //methods of string:
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());        
        System.out.println(name.substring(2));      
        System.out.println(name.substring(1,3));      
        System.out.println(name.replace('r','p'));   
        System.out.println(name.startsWith("Ha"));   
        System.out.println(name.endsWith("ry"));   
        System.out.println(name.charAt(2));   
        System.out.println(name.indexOf("a"));   
        System.out.println(name.indexOf("r",2));   
        System.out.println(name.lastIndexOf("r",2));   
        System.out.println(name.equals("Harry"));   
        System.out.println(name.equalsIgnoreCase("harry"));   


    }
    
}
