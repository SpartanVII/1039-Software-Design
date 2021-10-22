package HW4;

public abstract class SongDecorator implements SongComponent {

    private SongComponent songComponent;

    public SongDecorator(SongComponent songComponent) {
        this.songComponent = songComponent;
    }

    @Override
    public void play(){}

    @Override
    public String getName(){return  songComponent.getName();}

    public String getArtist(){return  songComponent.getName();}


}
