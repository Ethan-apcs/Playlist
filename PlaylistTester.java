public class PlaylistTester {
    public static void main(String[] args){

        System.out.println();
        System.out.println("Initializing playlist...");

        System.out.println();
        System.out.println("Adding songs to the playlist...");

        System.out.println();
        Playlist hype = new Playlist();

        Song one = new Song("Hollywood", "RAC", "3:17");
        hype.addSong(one);
        System.out.println("Added \"Hollywood\" by RAC (3:17)");

        Song two = new Song("Creepin", "Metro Boomin", "3:41");
        hype.addSong(two);
        System.out.println("Added \"Creepin'(with the Weeknd and 21 Savage)\" by Metro Boomin (3:41)");

        Song three = new Song("Biking", "Frank Ocean", "4:38");
        hype.addSong(three);
        System.out.println("Added \"Biking\" by Frank Ocean (4:38)");

        Song four = new Song("Empire State of mind", "JAY-Z", "4:36");
        hype.addSong(four);
        System.out.println("Added \"Empire State of Mind\" by JAY-Z (4:36)");

        Song five = new Song("No One", "Alicia Keys", "4:14");
        hype.addSong(five);
        System.out.println("Added \"No One\" by Alicia Keys (4:14)");

        System.out.println();
        System.out.println("Printing playlist...");

        System.out.println();
        hype.getPlaylist();

        System.out.println();
        System.out.println("Liking \"No One\" and \"Hollywood\"...");

        hype.likeSong(1);

        hype.likeSong(4);

        System.out.println();
        System.out.println("Printing playlist...");

        System.out.println();
        hype.getPlaylist();

        System.out.println();
        System.out.println("Printing total playlist duration...");
   
        System.out.println();
        System.out.println(hype.getTotal());

        System.out.println("Removing \"Biking'\" from the playlist...");
        hype.removeSong(2);

        System.out.println();
        System.out.println("Printing playlist...");

        System.out.println();
        hype.getPlaylist();

        System.out.println();
        System.out.println("Printing only the liked songs...");

        System.out.println();
        hype.getLikedSongs();

        System.out.println();
        System.out.println("Removing liked songs...");
        hype.removeLiked();

        System.out.println();
        System.out.println("Printing playlist...");

        System.out.println();
        hype.getPlaylist();
    }
}
