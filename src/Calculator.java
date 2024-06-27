public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        
        try{
           return x/y;
    
        }
        catch(ArithmeticException e)// tratamento de excecao
        {
            System.out.println(e);
             return 0;
        }
       
  
    }
}
