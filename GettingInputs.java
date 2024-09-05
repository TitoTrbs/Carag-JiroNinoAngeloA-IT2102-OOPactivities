import java.util.Scanner;

class GettingInputs{
    public static void main(String args[]){
        //inputs
        System.out.print("Enter the year: ");
        Scanner inputYear = new Scanner(System.in);
        int year = inputYear.nextInt();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the genre: ");
        String genre = input.nextLine();
        System.out.print("Enter the album: ");
        String album = input.nextLine();
        System.out.print("Enter the song title: ");
        String title = input.nextLine();
        System.out.print("Enter the artist: ");
        String artist = input.nextLine();

        
        inputYear.close();
        input.close();

        System.out.println("---------------------");
        System.out.println("SONG DETAILS");
        System.out.println("---------------------");
        System.out.println("Year released: "+ year);
        System.out.println("Genre "+ genre);
        System.out.println("Album: "+ album);
        System.out.println("Title: "+ title);
        System.out.println("Artist: "+ artist);


    }
}