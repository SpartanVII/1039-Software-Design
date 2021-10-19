package HW4;

public class SongViniyl extends Song{
    public SongViniyl(String name, String artist) {
        super(name, artist);
    }

    public String platform="vinyl";
    @Override
    public void play() {
        System.out.println("Escuchando..." + getName() + " BY " + getArtist() + " ON " + platform);
    }
}
