import java.util.Scanner;
import java.util.ArrayList;

class Song {
    String songName;
    String artist;
    String genre;
    String duration;
}

class Playlist {
    ArrayList<Song> songs = new ArrayList<>();

    void addSong(Song song){
        songs.add(song);
    }
}

public class PasswordManager {
    public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

    Playlist playlist1 = new Playlist();
    Playlist playlist2 = new Playlist();
    Playlist playlist3 = new Playlist();

    System.out.println("====== MUSIC PLAYLIST MANAGER ======");
    
    System.out.println("1. Add a song\n"
                 + "2. Remove a song\n"
                 + "3. View playlist\n"
                 + "4. Search for a song\n"
                 + "5. Play a song\n"
                 + "6. View statistics\n"
                 + "7. Exit");

    System.out.println("What's your vibe for today :)");
    int choice = input.nextInt();
    input.nextLine();

    switch(choice)
    {
       
        case 1: System.out.println("Song name:");
                String songname = input.nextLine();
                System.out.println("Artist:");
                String artist = input.nextLine();
                System.out.println("Genre:");
                String genre = input.nextLine();
                System.out.println("Duration:");
                String duration = input.nextLine();
                
                Song song = new Song();

                song.songName = songname;
                song.artist = artist;
                song.genre = genre;
                song.duration = duration;

                System.out.println("Which playlist do you want to save this in?");
                System.out.println("1. Playlist #1");
                System.out.println("2. Playlist #2");
                System.out.println("3. Playlist #3");

                int playlistChoice = input.nextInt();

                if (playlistChoice == 1) {
                    playlist1.addSong(song);
                    System.out.println("Song added to Playlist #1!");
                }
                else if (playlistChoice == 2) {
                    playlist2.addSong(song);
                    System.out.println("Song added to Playlist #2!");
                }
                else if (playlistChoice == 3) {
                    playlist3.addSong(song);
                    System.out.println("Song added to Playlist #3!");
                }
                else {
                    System.out.println("Invalid playlist choice.");
                }

                break;   
            
       }
     
    }
    }
}