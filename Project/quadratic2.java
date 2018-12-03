import javax.swing.JOptionPane;
public class quadratic2
{ public static void main(){
    int a =Integer.parseInt(JOptionPane.showInputDialog("Please enter value for 'a'"));
    int b =Integer.parseInt(JOptionPane.showInputDialog("Please enter value for 'b'"));
    int c =Integer.parseInt(JOptionPane.showInputDialog("Please enter value for 'c'"));
    
    int bsquared=b*b;
    System.out.println("b^2 is "+bsquared);
    int fourac=4*a*c;
    System.out.println("4*a*c is" + fourac);
   
     if  (bsquared-4*a*c<0){ 
        System.out.println("Sorry, your discriminant is negative. We cannot process imaginary roots right now");
        
    }
    else {
        double math=Math.sqrt(bsquared-fourac);
      
        double root1=-b+math;
       
        double root2=-b-math;
        
        
        double divison=root1/2*a;
        double divison2=root2/2*a;
        System.out.println("The answer is "+ divison);
        System.out.println("The answer is " + divison2);
    }  

}
}

