import java.util.Scanner; import java.lang.Math; 

public class GuessNumber { 

public static void main(String[] args) 
{ 
Game g=new Game(); g.guess(); System.out.println(g.getCount()); } } 

class Game{ 
private int a; 
private int count=0; 
Scanner SC=new Scanner(System.in); 

public Game(){ 
a=(int)(Math.random()*100); 
} 
public void guess()
{
 for(int i=0; i<=100; i++) { 
System.out.println("Enter a number between 0 to 100");
 int b=SC.nextInt(); 
if(b>a)
{ System.out.println("try lesser number than current"); count++; }
else{ if(b<a) { 
System.out.println("Enter a greater number"); count++; 
}else
{ break; } } } } 

public int getCount(){ return count; } } 
