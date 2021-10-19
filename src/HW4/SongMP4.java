package HW4;

public class SongMP4 extends Song{
    public SongMP4(String name, String artist) {
        super(name, artist);
    }

    public String platform="MP4";

    @Override
    public void play() {
        System.out.println("Escuchando..." + getName() + " BY " + getArtist() + " ON " + platform);
    }
}
