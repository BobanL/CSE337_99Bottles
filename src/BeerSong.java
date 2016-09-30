/**
 * Created by Boban on 9/30/2016.
 */
public class BeerSong {
    public static void main(String[] args){
        //This will call the Ninety_Nine_Bottles_of_Beer
        Ninety_Nine_Bottles_of_Beer();
    }

    public static void Ninety_Nine_Bottles_of_Beer(){
        //This will have a loop of the song 99 bottles of beer. It will loop from 99 to 0. 0 bottles will display no more bottles of beer.
        for(int i = 99; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
            System.out.print("Take one down, pass it around, ");
            if (i > 2) {
                System.out.print( (i - 1) + " bottles of beer on the wall." + "\n");
            } else if(i == 2){
                System.out.print((i-1) + " bottle of beer on the wall." + "\n");
            }else{
                System.out.print(" no more bottles of beer on the wall");
            }
        }
    }
}
