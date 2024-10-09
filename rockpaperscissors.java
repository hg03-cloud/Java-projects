import java.util.*;


public class rockpaper {

    
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
Random r=new Random();
String arr[]={"rock","paper","scissors"};

int comp_score=0,your_score=0;
for(int i=1;i<=5;i++){
    String kuch=s.nextLine();
    int j=r.nextInt(arr.length);
    String name=arr[j];
    System.out.println(name);
    if(kuch.equals(name)){
        System.out.println("computer score:"+comp_score +" your score:"+your_score);
    }else if(kuch.equals("scissors")&& name.equals("paper") || (kuch.equals("rock")&& name.equals("scissors") )|| (kuch.equals("paper") && name.equals("rock") )){System.out.println("computer score:"+(comp_score) +" your score:"+(your_score+=1));}
    else if((kuch.equals("scissors") && name.equals("rock") )|| (kuch.equals("paper") && name.equals("scissors") )||(kuch.equals("rock") && name.equals("paper"))){System.out.println("computer score:"+(comp_score+=1) +" your score:"+(your_score));}






}if(comp_score>your_score){
    System.out.println("Loser! cummon you lost here as well");
}else{System.out.println("Hurray! you win");}




}
}
