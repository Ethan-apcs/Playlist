/*
 * @author Ethan, Ollie, Nathan
 * @version 1/11/23
 */

import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    
    private ArrayList<Song> playlist = new ArrayList<Song>();
    
  
     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      public void getPlaylist(){
        for(Song x:playlist){
            if(x.isLiked()){
              System.out.print("❤️ ");}else{System.out.print("- ");
            }
            System.out.println("\"" + x.getTitle() + "\" by " + x.getArtist() + " (" + x.getDuration() + ")");
          }
        }
      public void addSong(Song song){
        playlist.add(song);
      }
      public void LikeSong(){
        ArrayList<Song> likedsongs = new ArrayList<>();
        //confused about this 
      }
      public void removeSong(int i){ 
       playlist.remove(i);

        }

        public void likeSong(int i){
          if(i>=0 && i<playlist.size()){
          Song song = playlist.get(i);
          song.like();
          } else {
            System.out.println("No song with that index!");
          }
        }

        public void getLikedSongs(){
          for(Song x:playlist){
              if(x.isLiked()){
                System.out.println("❤️ \"" + x.getTitle() + "\" by " + x.getArtist() + " (" + x.getDuration() + ")");
              }
            }
          }

          public String getTotal(){
            int count = 0;
            for(Song x:playlist){
                String wordNum = x.getDuration();
                int min = Integer.parseInt(wordNum.substring(0,1));
                int sec = Integer.parseInt(wordNum.substring(2));
                count = count + sec + min*60; 
              }
            String finalMin = Integer.toString(count/60);
            String finalSec;
            int sec = count%60;
            if(sec<10){
              finalSec  = "0" + Integer.toString(sec);}else{finalSec = Integer.toString(sec);
              }
            String finalTime = finalMin + ":" + finalSec;
            return finalTime;
          }

          public void removeLiked(){
            for(int i=0;i<playlist.size();i++){
              if(playlist.get(i).isLiked()){
                playlist.remove(i);i--;
              }
            }
          }
        }
