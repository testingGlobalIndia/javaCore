package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Song> albums = new ArrayList<>();
    private static LinkedList<Song> playList = new LinkedList<>();
    private static ListIterator<Song> songListIterator;
    private static boolean isForwardGoing = true;
    private static Song song;
    public static void main(String[] args) {

        Song song1 = new Song("Hello","2.45");
        Song song2 = new Song("Hi","5.64");
        Song song3 = new Song("Yaado ki barat","5");
        Song song4 = new Song("Khilte hei gul yanha","4.5");

        Album album = new Album(playList,albums);
        album.addSongToAlbum(song1);
        album.addSongToPlaylist(song1);

        album.addSongToAlbum(song2);
        album.addSongToPlaylist(song2);

        album.addSongToAlbum(song3);
        album.addSongToPlaylist(song3);

        album.addSongToAlbum(song4);
        album.addSongToPlaylist(song4);

        songListIterator  = playList.listIterator();
        song = songListIterator.next();

        System.out.println("Now playing "+song.getTitle()+ " duration "+song.getDuration());
        boolean quit =false;
        int choice = 0;
        printMenu();

        while (!quit){
            System.out.println("Enter your choice");
            choice  = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0: printMenu();
                break;
                case 1: if(!isForwardGoing){
                    if(songListIterator.hasNext()) {
                        songListIterator.next();
                    }
                    isForwardGoing = true;
                }
                    if(songListIterator.hasNext()){
                        song = songListIterator.next();
                    System.out.println("Now playing song "+song.getTitle() +
                            " -> duration "+song.getDuration());
                }else{
                    System.out.println("End of song is reached");
                    isForwardGoing =false;
                }
                break;
                case 2: if(isForwardGoing){
                    if(songListIterator.hasPrevious()) {
                        songListIterator.previous();
                    }
                    isForwardGoing = false;
                }
                    if(songListIterator.hasPrevious()){
                        song = songListIterator.previous();
                    System.out.println("Now playing song "+song.getTitle() +
                            " -> duration "+song.getDuration());
                }else{
                    System.out.println("Start of song is reached");
                    isForwardGoing = true;
                }
                break;
                case 3: if(isForwardGoing) {
                    if (songListIterator.hasPrevious()) {
                        song = songListIterator.previous();
                        System.out.println("Now playing song " + song.getTitle() +
                                " -> duration " + song.getDuration());
                        isForwardGoing = false;
                    } else {
                        System.out.println("You are at the start song");
                        isForwardGoing =true;
                    }
                }

                    if(!isForwardGoing) {
                        if (songListIterator.hasNext()) {
                            song = songListIterator.next();
                            System.out.println("Now playing song " + song.getTitle() +
                                    " -> duration " + song.getDuration());
                            isForwardGoing =true;
                        } else {
                            System.out.println("You are at the last of list");
                            isForwardGoing =false;
                        }
                    }
                break;
                case 4: quit =true;
                break;
                case 5: findSong(album);
                break;

            }
        }
    }

    private static void printMenu(){
        System.out.println("Choose any option" +
                "\n 0 - Print menu" +
                "\n 1 - Skip forward to next song" +
                "\n 2 - Skip backward to prev song" +
                "\n 3 - Replay current song" +
                "\n 4 - Quit" +
                "\n 5 - Find your favourite song");
    }

    private static void findSong(Album album){
        System.out.println("Enter the song you want to search");
        String songName = scanner.nextLine();
        album.searchSong(songName);
    }


}
