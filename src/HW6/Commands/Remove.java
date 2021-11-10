package HW6.Commands;

import HW6.BeeBot;
import HW6.Command;

public class Remove implements Command {
    private BeeBot beeBot;

    public Remove(BeeBot beeBot) {
        this.beeBot = beeBot;
    }

    @Override
    public void execute() {
        beeBot.borrar();
    }
}

