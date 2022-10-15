
import java.io.*;

public class PlayingHandCricket

{

    public static void main(String args[])throws IOException
    
    {
        
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        
        String n; 
        int a; 
        int i; 
        int b; 
        double r; 
        int cheat; 
        int score1; 
        int score2; 
        int c; 
        int choice; 
        int infinity=1; 
        
        

        while(infinity>0)
        {
            
            n=" ";
            a=0;
            i=0;
            b=0;
            r=0;
            cheat=0;
            score1=0;
            score2=0;
            c=0;
            choice=0;
            infinity=1;
            
            System.out.println("=======================");
            System.out.println("| WELCOME TO THE GAME |");
            System.out.println("=======================");
            System.out.println("");
            System.out.print("Enter Your N: ");
            n=br.readLine();
            
                for(c=0;c<=2;c++)
                {
                    System.out.println("====================================");
                }
                
                System.out.println("Hello "+n+",");
                System.out.println(".");
                System.out.println("WELCOME TO THE CRICKET-MANIA");
                System.out.println(".");
                System.out.println("Instructions:");
                System.out.println(".");
                System.out.println("This Game Is Similar To The Hand-Cricket Game Played By Kids.");
                System.out.println(".");
                System.out.println("There Is No Limit On The Number Of Balls.");
                System.out.println(".");
                System.out.println("You Will First Bat. Enter Any Number From 1 To 10.");
                System.out.println(".");
                System.out.println("Enter The Numbers Carefully Without Making Any Mistake.");
                System.out.println(".");
                System.out.println("If The Number Entered By The Computer Is Same As The Number Entered By You,");
                System.out.println("You Will Be Declared As Out.");
                System.out.println(".");
                System.out.println("Your Final Score Will Be The Sum Of The Numbers You Entered Before Getting Out.");
                System.out.println(".");
                System.out.println("After Getting Out, You Will Have To Bowl.");
                System.out.println(".");
                System.out.println("Try To Enter A Number Similar To The Number Entered By The Computer.");
                System.out.println(".");
                System.out.println("If The Sum Of Numbers Entered By The Computer Becomes More Than Your Score, It Will Win.");
                System.out.println(".");
                System.out.println("But If You Enter A Number Same As The Number Entered By The Computer, You Can Win!");
                System.out.println(".");
                
                for(c=0;c<=2;c++)
                {
                    System.out.println("====================================");
                }
                
                System.out.println("YOU ARE BATTING:");
                
                for(c=0;c<=2;c++) { System.out.println("===================================="); } for(i=1;i>0;i++)
                {
                    System.out.println("");
                    System.out.print("Enter Your Number: ");
                    b=Integer.parseInt(br.readLine());
                    r=((Math.random())*10);
                    r=r+1;
                    a=(int)(r);
                    System.out.println("");
                    System.out.println("Computer's Number: "+a);
                    System.out.println("");
                    System.out.println("**********");
                    System.out.println("");

                    if(b==a)
                    {
                        System.out.println(" ");
                        System.out.println("HOWZATTT!!!!!!");
                        System.out.println(" ");
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println("YOUR FINAL SCORE = "+score1);
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println(" ");
                        break;
                    }
                    
                    else if(b>0&&b<=10) { score1=score1+b; } else if(b>10||b<=0)
                    {
                        for(c=0;c<=2;c++)
                        {
                            System.out.println("====================================");
                        }
                        System.out.println("You have either tried to cheat or entered a wrong input. Game Over!");
                        cheat++;
                        break;
                    }

                    System.out.println("Your Curent Score Is "+score1);
                    System.out.println("");
                    System.out.println("**********");
                }
                
                for(c=0;c<=2;c++) { if(cheat>0)
                    {
                        break;
                    }
                    System.out.println("====================================");
                }
                
                for(c=0;c<1;c++) { if(cheat>0)
                    {
                        break;
                    }
                    System.out.println("YOU ARE BOWLING:");
                }
                
                for(c=0;c<=2;c++) { if(cheat>0)
                    {
                        break;
                    }   
                    System.out.println("====================================");
                }
                
                for(i=1;i>0;i++)
                {
                    if(cheat>0)
                    {
                        break;
                    }
                    
                    System.out.println("");
                    System.out.print("Enter Your Number: ");
                    b=Integer.parseInt(br.readLine());
                    r=((Math.random())*10);
                    r=r+1;
                    a=(int)(r);
                    System.out.println("");
                    System.out.println("Computer's Number: "+a);
                    System.out.println("");
                    System.out.println("**********");
                    System.out.println("");
                    
                    if(a==b)
                    {
                        System.out.println(" ");
                        System.out.println("COMPUTER IS OUTT!!!!");
                        System.out.println(" ");
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println(" ");
                        break;
                    }
                    
                    else if(b>0&&b<=10) { score2=score2+a; } else if(b>10||b<=0)
                    {
                        for(c=0;c<=2;c++) { System.out.println("===================================="); } System.out.println("You have either tried to cheat or entered a wrong input. Game Over!"); cheat++; break; } if(score2>score1)
                    {
                        System.out.println(" ");
                        System.out.println("THE COMPUTER HAS SCORED MORE THAN YOUU!!!");
                        System.out.println(" ");
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println(" ");
                        break;
                    }
                    
                    System.out.println("Computer's Curent Score Is "+score2);
                    System.out.println("");
                    System.out.println("**********");
                }
                
                for(c=0;c<=2;c++) { if(cheat>0)
                    {
                        break;
                    }
                    
                    System.out.println("====================================");
                }
                
                for(i=0;i<1;i++) { if(cheat>0)
                    {
                        break;
                    }
                    
                    System.out.println(" ");
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println("YOUR FINAL SCORE = "+score1);
                    System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println(" ");

                    if((score1)>(score2))
                    {
                        System.out.println("Congratulations "+n+"!! You Have Defeated The Almighty, Computer!!");
                    }
                    
                    else if((score1)<(score2))
                    {
                        System.out.println("Sory "+n+", But The Computer Has Defeated You..!");
                    }
                    
                    else
                    {
                        System.out.println("It's a Tie..! :(");
                    }
                    
                }
                
                for(c=0;c<=2;c++)
                {
                    System.out.println("====================================");
                }
            
            System.out.println("");
            System.out.println("Enter 1 To Play This Game Again.");
            System.out.println("");
            System.out.println("Enter 0 Or Any Other Number To Quit.");
            choice=Integer.parseInt(br.readLine());
            System.out.println("");
            
            if(choice==1)
            {
                System.out.print('\f');
            }
            
            else
            {
                System.out.print('\f');
                System.out.println("Good Bye!");
                break;
            }
            
        }
    }
}

