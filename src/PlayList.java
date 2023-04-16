import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
public class PlayList {

    private String playlistTitle;
    private List<Song> playlistSongs;
    private ListIterator<Song> songListIterator;
    private Boolean isNext = false;

    public PlayList(String playlistTitle){
        this.playlistTitle = playlistTitle;
        this.playlistSongs = new ArrayList<>();
    }



    public String addSongFromAlbumToPlaylist(Album album, String songTitle){
        Optional<Song> optionalSongInAlbum = album.findSongInAlbum(songTitle);
        Optional<Song> optionalSongInPlaylist = findSongInPlaylist(songTitle);
        if(optionalSongInPlaylist.isPresent()){
            return "Song Already exist in the Playlist";
        }
        if(optionalSongInAlbum.isEmpty()){
            return "Song does not exist in Album";
        }
        playlistSongs.add(optionalSongInAlbum.get());
        this.songListIterator = playlistSongs.listIterator();
        return "Song Added successfully to the Playlist";
    }


    public String addSongFromAlbumToPlaylist(Album album, int trackNo){

        Optional<Song> optionalSongInAlbum = album.findSongInAlbum(trackNo);
        if(optionalSongInAlbum.isEmpty()){
            return "Song does not exist in Album";
        }

        Optional<Song> optionalSongInPlaylist = findSongInPlaylist(optionalSongInAlbum.get().getSongTitle());
        if(optionalSongInPlaylist.isPresent()){
            return "Song Already exist in the Playlist";
        }

        playlistSongs.add(optionalSongInAlbum.get());
        this.songListIterator = playlistSongs.listIterator();
        return "Song Added successfully to the Playlist";
    }


    public String playCurrentSong(){
        if(isNext){
            isNext = false;
            return "Current song play: "+songListIterator.previous();
        }

        isNext = true;
        return "Current song play: "+songListIterator.next();

    }

    public String playNextSong(){
        if(!isNext){
            songListIterator.next();
            isNext = true;
        }
        if(songListIterator.hasNext()){
            isNext = true;
            return "Next song play: "+songListIterator.next();
        }
        return "You have reached the end of Playlist";
    }

    public String playPreviousSong(){
        if(isNext){
            songListIterator.previous();
            isNext = false;
        }
        if(songListIterator.hasPrevious()){
            isNext = false;
            return "Previous song play: "+songListIterator.previous();
        }
        return "You have reached the start of Playlist";
    }

    //check whether song exist already in the playlist
//    public Boolean isSongAlreadyExistInPlaylist(Song thatSong){
//        for(Song thisSong : playlistSongs){
//            if(thisSong.getSongTitle().equals(thatSong.getSongTitle())){
//                return true;
//            }
//        }
//        return false;
//    }

    //check whether song exist already in the playlist
    public Optional<Song> findSongInPlaylist(String songTitle){
        for(Song song : playlistSongs){
            if(song.getSongTitle().equals(songTitle)){
                return Optional.of(song);
            }
        }
        return Optional.empty();
    }

}
