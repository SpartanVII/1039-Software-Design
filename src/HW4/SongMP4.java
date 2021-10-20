package HW4;

public class SongMP4 extends Song{
    public SongMP4(String name, String artist) {
        super(name, artist);
    }

    public String platform="MP4";

    public String getPlatform() {
        return platform;
    }

    @Override
    public void play() {
        System.out.println("Escuchando..." + getName() + " BY " + getArtist() + " ON " + getPlatform());
    }
}
