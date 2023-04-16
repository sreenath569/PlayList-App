public class Main {
    public static void main(String[] args) {

        Album prateekKuhad = new Album("Prateek Kuhad", "Prateek Kuhad");
        prateekKuhad.addSongToAlbum(new Song("Kho Gaye Hum Kahan", "Prateek Kuhad", "3:33"));
        prateekKuhad.addSongToAlbum(new Song("Dil Beparvah", "Prateek Kuhad", "3:43"));
        prateekKuhad.addSongToAlbum(new Song("Tere Hi Hum", "Prateek Kuhad", "2:57"));
        prateekKuhad.addSongToAlbum(new Song("Just A Word", "Prateek Kuhad", "3:00"));
        prateekKuhad.addSongToAlbum(new Song("Full Time Lover", "Prateek Kuhad", "1:35"));
        prateekKuhad.addSongToAlbum(new Song("for your time", "Prateek Kuhad", "3:06"));


        Album ritviz = new Album("Ritviz", "Ritviz");
        ritviz.addSongToAlbum(new Song("Roshni", "Ritviz", "2:52"));
        ritviz.addSongToAlbum(new Song("Turn Up", "Ritviz", "2:49"));
        ritviz.addSongToAlbum(new Song("Aavegi", "Ritviz", "2:53"));


        PlayList myPlayList = new PlayList("myplaylist");
        System.out.println(myPlayList.addSongFromAlbumToPlaylist(prateekKuhad,"Kho Gaye Hum Kahan"));
        System.out.println(myPlayList.addSongFromAlbumToPlaylist(prateekKuhad,"Tere Hi Hum"));
        System.out.println(myPlayList.addSongFromAlbumToPlaylist(prateekKuhad,"Full Time Lover"));
        System.out.println(myPlayList.addSongFromAlbumToPlaylist(ritviz,"Turn Up"));
        System.out.println(myPlayList.addSongFromAlbumToPlaylist(ritviz,"Aavegi"));
        System.out.println(myPlayList.addSongFromAlbumToPlaylist(ritviz,1));


        System.out.println(myPlayList.playCurrentSong());
        System.out.println(myPlayList.playCurrentSong());
        System.out.println(myPlayList.playNextSong());
        System.out.println(myPlayList.playNextSong());
        System.out.println(myPlayList.playNextSong());
        System.out.println(myPlayList.playNextSong());
        System.out.println(myPlayList.playNextSong());
        System.out.println(myPlayList.playNextSong());
        System.out.println(myPlayList.playCurrentSong());
        System.out.println(myPlayList.playPreviousSong());
        System.out.println(myPlayList.playPreviousSong());

    }
}