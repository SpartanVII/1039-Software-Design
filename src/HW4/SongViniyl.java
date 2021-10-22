package HW4;

public class SongViniyl extends SongDecorator{

    public SongViniyl(SongComponent songComponent){super(songComponent);}

    public String platform="vinyl";

    public String getPlatform() {
        return platform;
    }

    @Override
    public void play() {
        System.out.println("Escuchando..." + getName() + " BY " + getArtist() + " ON " + getPlatform());
    }
}
