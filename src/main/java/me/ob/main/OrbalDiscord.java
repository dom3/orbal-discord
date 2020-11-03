package me.ob.main;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class OrbalDiscord {
    public static void main(String[] args) {
        String token = "";
        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();


    }
}
