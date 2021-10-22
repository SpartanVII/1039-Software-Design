package HW4;

public class SongMP4 extends SongDecorator{
    public SongMP4(SongComponent songComponent) {
        super(songComponent);
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
