import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {

  //creating pluralize function
  public static String pluralize (String word, int num){
    
    if(num >=2){
      return word + "s";
    }
    return word;
  }

   // function flipNHeads that accepts an integer n
  // flip coins until n heads flipped in a row
  // using Math.random() for flipping
  // number < .5 = tail
  // numbers >= .5 = head
  // print out heads or tails on one line for each flip
  // print it took flips flips to flip N heads in a row

  // creating flipNHeads function
  public static String flipNHeads (int n){
    int flips = 0;
    int heads = 0;
  

    while (flips < n) {
      double currentFlip = Math.random();
      flips++;
      if (currentFlip <= 0.5){
        System.out.println("tails");
      }else{
        heads++;
        System.out.println("heads");
      }
      
    
    }
    return "It took " + flips + " flip " + heads + " in a row";
  } 

  // write a method clock-java's build-in LocalDateTime ==that constatly print out current time to the console second by second. 

  //creating clock function
  public static void Clock (){
    int prevsec = 0;
    while (true) {
      LocalDateTime now = LocalDateTime.now();
    
    int second = now.getSecond();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    
    if( prevsec != second){
      System.out.println(time);
    prevsec = second;
    }
  }
    
  }
  
  //println pluralize
  //println flipNHeads
  //println Clock
  public static void main(String[] args) {
   
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
     
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    System.out.println(flipNHeads(6));
    Clock();
  }

}
 

  
  
    


