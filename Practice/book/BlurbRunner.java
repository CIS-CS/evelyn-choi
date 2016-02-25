import java.util.Scanner;
public class BlurbRunner
{
   public static void main (String[] args)
   {
       Scanner sc = new Scanner(System.in);
       
       String genre = new String();
       int charNo = 0;
       BlurbGenerator blurb = new BlurbGenerator();
       System.out.println("Welcome to the Blurb Generator! Type 'quit' at any time to exit.");
        
       while (genre.equals("quit") != true){
           //clears the blurb factors
           blurb.setGenre("");
           blurb.setCharacterNum(0);
           blurb.blurbClear();
           
           // adding genre
           System.out.println("What genre is your book?");
           System.out.println("Valid genres include adventure, fantasy, scifi, horror, and cpmedy.");
           genre = sc.nextLine(); // need to be able to verify nextLine is String
           // add break for quit
           blurb.setGenre(genre);
           blurb.addGenreToBlurb();
           
           // adding number of protagonists
           System.out.println("How many protagonists are there?");
           charNo = sc.nextInt(); // need to be able to verify nextInt is int
           sc.nextLine(); //clearing
           blurb.setCharacterNum(charNo);
           
           blurb.setGoal();
          
           // display blurb
           System.out.println(blurb.getBlurb());
           System.out.println("*********************");
       }
        
   }
}
