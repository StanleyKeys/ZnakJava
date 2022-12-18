package OOP_Seminar05;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class chatProgram {

    public static void main(String[] args) {
        int count = 0;
        PostPigeon pp = new PostPigeon();
        User u1 = new User("Ivan", pp);
        User u2 = new User("Петр", pp);
        User u3 = new User("Анна", pp);
        pp.appendClient(u1);
        pp.appendClient(u2);
        pp.appendClient(u3);
        while (count < 9) {
            u1.sendMsg();
            if (Objects.equals(User.exitMsg, "exit")) {
                break;
            }
            u3.sendMsg();
            if (Objects.equals(User.exitMsg, "exit")) {
                break;
            }
            count++;
        }
    }

}

class User {
    String name;
    private final Chat chatroom;
    public static String exitMsg;
    public User (String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    public void sendMsg() {
        System.out.print(">>> : ");
        Scanner scan = new Scanner(System.in);
        String msg = scan.nextLine();
        exitMsg = msg;
        chatroom.sendMessage(msg, this);
    }
}
interface Chat {
    void sendMessage(String msg, User user);
    void appendClient(User user);
}

class PostPigeon implements Chat {
    int id;
    ArrayList<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User user) {
        System.out.format("\n%s : %s\n", user.name, msg);
    }

    @Override
    public void appendClient(User user) {
        System.out.format("\nПользователь %s вошел в чат\n", user.name);
    }
}

