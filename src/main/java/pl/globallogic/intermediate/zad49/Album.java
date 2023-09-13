package pl.globallogic.intermediate.zad49;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private final SongList songs;

    public Album(String name, String artist) {
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = this.songs.findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private static class SongList {
        private final ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (!songs.contains(song)) {
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }
}