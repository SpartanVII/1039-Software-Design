package Clases.TE8;


public class YouTubeFollower implements Playable, Observer {

    private String followerName;
    public YouTubeFollower(YouTubeChannel channel, String followerName) {
        this.followerName = followerName;
        channel.registerObserver(this);
    }

    @Override
    public void update(String status) {
        if (status.equals("on")) {
            System.out.print("Update! The channel is on now ");
            play();
        }

        else if(status.equals("down")){
            System.out.println("Update! The channel is down again");
        }
    }

    @Override
    public void play() {
        System.out.println("and " + followerName + " is watching the channel");
    }

}
