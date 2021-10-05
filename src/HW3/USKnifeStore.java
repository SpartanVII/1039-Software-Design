package HW3;

public class USKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new ChefKnife();
        } else if (type.equals("steak")) {
            return new SteakKnife();
        } else return null;
    }
}
