package me.ob.commands;

import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.permission.Permissions;

public class HelpCommand extends OrbalCommand{
    @Override
    public String name() {
        return null;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String[] aliases() {
        return new String[0];
    }

    @Override
    public Permissions permission() {
        return ;
    }

    @Override
    public void run(Message message) {

    }
}
