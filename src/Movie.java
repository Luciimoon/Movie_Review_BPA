import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Movie {
    /**
     * Movie review
     *
     * @param args
     * @author Mitch
     */


    public static void main(String[] args) {
        int MovieNum = 1; // number of movies reviewing
        int MovieNumForText = 1; //number of movie we are reviewing

        double mr1 = 0, mr2 = 0, mr3 = 0; // mr = movie revier website
        double fg1 = 0, fg2 = 0; //fg = focus group
        double MovieCrit;
        double AverageWebRev, AverageFocusRev, AverageCritRev, overall; // AverageWebRev = average websiter review, AverageFocusRev = average focus group review, AverageCritRev = average movie critic review

        Scanner s = new Scanner(System.in); //scanner to get input
        try { //check for wrong input
            System.out.println("how many movies are you rating");
            MovieNum = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
            System.exit(0);
        }
        while (MovieNum > 0) {
            System.out.println("Now entering reviews for movie " + MovieNumForText);
            System.out.println("Please enter ratings from the movie review");
            try { //check for wrong input
                mr1 = s.nextInt();
                mr2 = s.nextInt();
                mr3 = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("invalid input");
                System.exit(0);
            }
            System.out.println("ratings form focus group");
            try { //check for wrong input
                fg1 = s.nextDouble();
                fg2 = s.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("invalid input");
                System.exit(0);
            }

            MovieCrit = Math.floor((Math.random() * 100)); //create random num for moviecritic

            AverageWebRev = ((((mr1 + mr2 + mr3) / 3))); //averages all websiter movie review
            AverageFocusRev = ((((fg1 + fg2) / 2))); //average all focus group reviews
            AverageCritRev = (((MovieCrit))); //averages movie crit reviews

            overall = (AverageWebRev * .2) + (AverageFocusRev * .3) + (AverageCritRev * .5); //makes all the different reviews worth their percentage weight

            System.out.println("ratings for movie");
            System.out.println("average Website rating:" + (new DecimalFormat("#.##").format(AverageWebRev))); //truncates Web reviews to two decimals
            System.out.println("average focus group rating:" + (AverageFocusRev));
            System.out.println("average movie critic rating:" + (MovieCrit));
            System.out.println("overall movie rating " + (new DecimalFormat("#.##").format(overall))); //truncates overall review to two decimals
            System.out.println();

            if (MovieNum > 0) { //makes it repeat based on number of movies reviewing
                MovieNum--;
                MovieNumForText++;
            }
        }
    }
}


