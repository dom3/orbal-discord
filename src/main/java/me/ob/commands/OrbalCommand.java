package me.ob.commands;

import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.permission.Permissions;
import org.javacord.api.entity.user.User;

public abstract class OrbalCommand {
    public abstract String name();
    public abstract String description();
    public abstract String[] aliases();
    public abstract Permissions permission();

    public abstract void run(Message message);
}
