/**
 * File for a Song class to be used in the Playlist Project
 * @author Ethan, Ollie, Nathan
 * @version 1/11/23
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private double duration;
    private boolean liked = false;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String myTitle, String myArtist, double myDuration){
        title = myTitle;
        artist = myArtist;
        duration = myDuration;
    }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

      public String getTitle(){
        return title;
      }
      //returns the title of the song

      public String getArtist(){
        return artist;
      }
      //returns the artist of the song

      public double getDuration(){
        return duration;
      }
      //returns the duration of the song

      public boolean isLiked(){
        return liked;
      }
      //returns the status

      public void like(){
        liked = true;
      }

      public void unLike(){
        liked = false;
      }
      //setter method to make status liked or not

      public String toString(){
        return "Title" + "by " + artist + "" + "(duration)" + liked;
      }
      //to String
}
