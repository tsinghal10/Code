import java.io.*;
class Calculator
{
    public static void main(String args[])throws IOException
    {
        String z="1";
        double ans[]=new double[100];
        int n=0;
        outer:do
        {
            System.out.print("\t\t\t\t\tWelcome to Arithmetic Calculator\n");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("----------------------------------------------------------------------\n");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("\nEnter the choice:");
            int a=0;
            try
            {
                a=Integer.parseInt(br.readLine());
                if(a<1 || a>4)
                {
                    System.out.println("Invalid input\n");
                    System.out.println("---------------------------------------------------------------\n");                   
                    continue;
                }
            }
            catch(Exception e)
            {
                System.out.println("\nWrong value entered.");
                System.out.println("------------------------------------------------------------------\n");
                continue;
            }
            System.out.println("\nEnter the number of operands:");
            int b=0; 
            try
            {
                b=Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {
                 System.out.println("\nWrong value entered.");
                 System.out.print("-----------------------------------------------------------------\n");
                 continue;
            }
            double k[]=new double[b];
            int l,i;
            for(i=0; i<b; i++)
            {
                System.out.println((i+1)+ "th Operand:");
                try                
                {
                    k[i]=Double.parseDouble(br.readLine());
                }
                catch(Exception e)
                {
                    System.out.println("\nWrong value entered.");
                    System.out.println("-------------------------------------------------------------\n");
                    continue outer;
                }
            }
            double sum=0, sub=k[0], mul=1, div=k[0];            
            switch(a)
            {
                case 1: for(l=0; l<b; l++)
                        {
                            sum +=k[l];
                        }
                        System.out.println("Sum of entered numbers: "+sum+"\n");
                        break;
                case 2: for(l=1; l<b; l++)
                        {                        
                            sub -=k[l];
                        }
                        System.out.println("Subtraction of entered numbers: "+sub+"\n");
                        break;
                case 3: for(l=0; l<b; l++)
                        {                        
                            mul *=k[l];
                        }
                        System.out.println("Multiplication of entered numbers: "+mul+"\n");
                        break;
                case 4: for(l=1; l<b; l++)
                        {                        
                            div /=k[l];
                        }
                        System.out.println("Division of entered numbers: "+div+"\n");
                        break;
            }
            if(a==1)
            {
                ans[n]=sum;
            }
            else if(a==2)
            {
                ans[n]=sub;
            }
            else if(a==3)
            {
                ans[n]=mul;
            }
            else
            {
                ans[n]=div;
            }
            System.out.println("Enter 'sa' to see the previous answers else enter any other key.");
            String s="";
            s=br.readLine();
            if(s.equalsIgnoreCase("sa"))
            {
                for(i=0; i<=n; i++)
                {
                    System.out.println("\t\t"+ans[i]);
                }
            }
            n++;
            System.out.println("\nPress 1 if you want to continue else enter any other key to exit.");
            z=br.readLine();                
        }
        while(z.equals("1"));
        System.out.println("\nThank you for visiting.");
        System.exit(0);
    }
}