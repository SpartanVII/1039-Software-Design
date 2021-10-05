package HW3;

public class EuropeKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new EuropeChefKnife();
        } else if (type.equals("steak")) {
            return new EuropeSteakKnife();
        } else return null;
    }
}
