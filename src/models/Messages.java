package models;

public class Messages implements MessagesInterface {

    public static final String WELCOME_MESSAGE = "Hello and Welcome  in Bubble Shooter, can you please choose the direction where do you want shoot.";
    public static final String BUBBLE_IS_SET = "Thanks you for playing, you can continue";

    public  String PLAYER_SET(String name) {
        return "Thank you for setting the name, now " + name + " to play give the Direction";
    }
}
