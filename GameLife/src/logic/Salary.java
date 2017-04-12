package logic;

public class Salary {
    
    
    Spin spinner = new Spin();   
public void returnSalary(Player input){
       int answer = spinner.spinner();
      
      
      if ( answer ==1){
          input.setSalary(20000);
          System.out.println("Your new salary is"+input.getSalary());
      }    
    
      else if( answer ==2){
         input.setSalary(30000); 
         System.out.println("Your new salary is"+input.getSalary());
        }
      
      else if ( answer ==3){
            input.setSalary(40000);
            System.out.println("Your new salary is"+input.getSalary());
        }
      
       else if ( answer ==4){
            input.setSalary(50000);
            System.out.println("Your new salary is"+input.getSalary());
        }
       else if ( answer ==5){
             input.setSalary(60000);
             System.out.println("Your new salary is"+input.getSalary());
        }
      
       else if ( answer ==6){
          input.setSalary(70000);
          System.out.println("Your new salary is"+input.getSalary());
      }    
    
      else if( answer ==7){
         input.setSalary(80000); 
         System.out.println("Your new salary is"+input.getSalary());
        }
      
      else if ( answer ==8){
            input.setSalary(90000);
            System.out.println("Your new salary is"+input.getSalary());
        }
      
       else if ( answer ==9){
            input.setSalary(100000);
            System.out.println("Your new salary is"+input.getSalary());
        }
       else if ( answer ==10){
             input.setSalary(110000);
             System.out.println("Your new salary is"+input.getSalary());
        }
}

}

