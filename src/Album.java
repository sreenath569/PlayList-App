import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Album {

    private String albumTitle;
    private String albumArtist;
    private List<Song> albumSongs;

    public Album(String albumTitle, String albumArtist, List<Song> albumSongs) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        this.albumSongs = albumSongs;
    }

    public Album(String albumTitle, String albumArtist) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        this.albumSongs = new ArrayList<>();
    }

    public String addSongToAlbum(Song song){

        Optional<Song> optionalSong = findSongInAlbum(song.getSongTitle());
        if(optionalSong.isPresent()){
            return "Song Already exist in the Album";
        }
        albumSongs.add(song);
        return "Song Added successfuly to the Album";
    }


    //check whether song already exist in Album
//    public Boolean isSongAlreadyExistInAlbum(Song thatSong){
//        for(Song thisSong : albumSongs){
//            if(thisSong.getSongTitle().equals(thatSong.getSongTitle()) &&
//                    thisSong.getSongArtist().equals(thatSong.getSongArtist())
//            ){
//                return true;
//            }
//        }
//        return false;
//    }

    //check whether song already exist in Album
    public Optional<Song> findSongInAlbum(String songTitle){
        for(Song song : albumSongs){
            if(song.getSongTitle().equals(songTitle)){
                return Optional.of(song);
            }
        }
        return Optional.empty();
    }

    public Optional<Song> findSongInAlbum(int trackNo){
        if(trackNo>=1 && trackNo<=albumSongs.size()){
            return Optional.of(albumSongs.get(trackNo-1));
        }
        return Optional.empty();
    }

    public Optional<Song> findSongInAlbum(String songTitle, String songArtist){
        for(Song song : albumSongs){
            if(song.getSongTitle().equals(songTitle) && song.getSongArtist().equals(songArtist)){
                return Optional.of(song);
            }
        }
        return Optional.empty();
    }


}
