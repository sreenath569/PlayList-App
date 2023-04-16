public class Song {

    private String songTitle;
    private String songArtist;
    private String songDuration;

    public Song(String songTitle, String songArtist, String songDuration){
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songDuration = songDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public String getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(String songDuration) {
        this.songDuration = songDuration;
    }


    @Override
    public String toString() {
        return "Song{" +
                "songTitle='" + songTitle + '\'' +
                ", songArtist='" + songArtist + '\'' +
                ", songDuration='" + songDuration + '\'' +
                '}';
    }
}
