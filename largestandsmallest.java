/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BHARATH sharan
 */
public class largestandsmallest {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] a   ={11,10,4,6,8,22};
        int min,max,i=0,j=0;
        min=a[0];
        max=a[0];
        while(i<6)
        {
            
            if(min<a[i])
            {
               i++;
            }
           else
            {
                 min=a[i];
                 i++;
            }
          
        
    }
       System.out.println("The MINIMUM number is "+min);
        
        while(j<6)
        {
            
            if(max>a[j])
            {
                          j++;
            }
            else
            {
                       max=a[j];
                       j++;
            }
                      
                      
          
        
    }
    System.out.println("The MAXIMUM number is "+max);
        
       
    

}

}
