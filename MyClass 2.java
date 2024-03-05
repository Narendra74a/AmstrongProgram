public class MyClass {
    public static void main(String args[]) {
       
       ams();
     
    }
    
    static void ams(){
        
        int n=371,sum=0,c;
        int rem;
        
        c=n;
        
        while(n!=0){
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        
        if(sum==c){
            System.out.print("ams num");
        }
        else{
            System.out.print("not");
        }
    }
}