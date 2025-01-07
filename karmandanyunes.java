import java.util.*;

public class karmandanyunes {
    public static void main(String[] args) 
  {
    Scanner inscanner=new Scanner(System.in);
    String[]name=new String[3];
    String[]semat=new String[3];
    Double[]date=new Double[3];
    
    System.out.println("Enter your details");
    for (int i=0;i<3 ;i++) 
  {
    System.out.println("ENTER NAME");
    name[i]=inscanner.nextLine();
    System.out.println(" ENTER SEMAT");
    semat[i]=inscanner.nextLine();
    System.out.println(" ENTER VORODY ");
    date[i]=inscanner.nextDouble();
    inscanner.nextLine();
  }
  
    for (int i=0;i<3 ;i++ ) 
    {
        
        
       if (name[i].equals("negarestani"))  
       {
           System.out.println(" negarestani details ");
           System.out.println( " name:  "+name[i]+ "semat:  "+semat[i]+" vorody:  "+date[i]);
       }
       
       if (date[i]== 1384)
    {
        System.out.println("vorody 1384");
         System.out.println( " name:  "+name[i]+ "semat:  "+semat[i]+" vorody:  "+date[i]);
        
    }
     if (semat[i].equals("IT"))  
       {
           System.out.println("IT details ");
           System.out.println( " name:  "+name[i]+ "semat:  "+semat[i]+" vorody:  "+date[i]);
       }
    
     if (semat[i].equals("modir"))  
       {
           System.out.println("modir details ");
           System.out.println( " name:  "+name[i]+ "semat:  "+semat[i]+" vorody:  "+date[i]);
       }
    
    
    
    
    }
    

    
    
    
    
    
    
      
    
  }
}
