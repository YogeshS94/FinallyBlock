public class MyFinallyBlock {
    public static void main(String[] a){
        
        try{
            int i = 10/0;
        } catch(Exception ex){
            System.out.println("1st catch Block");
        } finally {
            System.out.println("1st finally block");
        }
        
        try{
            int i = 10/10;
        } catch(Exception ex){
            System.out.println("2nd catch Block");
        } finally {
            System.out.println("finally block");
        }
    }
}