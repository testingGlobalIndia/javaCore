package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private LinkedList<Song> playlist;
    private SongList songList;


    public Album(LinkedList<Song> playlist,ArrayList<Song> album) {
        this.playlist = playlist;
        songList = new SongList(album);
    }

    public void addSongToAlbum(Song song){
        songList.addSong(song);
    }

    public void addSongToPlaylist(Song song){
        if(findSong(song) >= 0){
            playlist.add(song);
        }else{
            System.out.println("Add "+song.getTitle()+" in album first");
        }
    }

    public void searchSong(String songName){

        if(songList.findSong(songName)){
            System.out.println("Song found");
        }else{
            System.out.println("");
        }
    }

    private int findSong(Song song){
        return songList.album.indexOf(song);
    }

    class SongList{
        private ArrayList<Song> album;

        public SongList(ArrayList<Song> album) {
            this.album = album;
        }

        public void addSong(Song song){
            album.add(song);
        }

        public boolean findSong(String songName){
            for(Song song: this.album){
                if(song.getTitle().equalsIgnoreCase(songName)){
                    return true;
                }
            }
            return false;
        }

    }

}
