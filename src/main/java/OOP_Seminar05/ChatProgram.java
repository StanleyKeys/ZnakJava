package OOP_Seminar05;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ChatProgram {
    public static PostPigeon pp = new PostPigeon();

    public static void main(String[] args) {
        int count = 0;

        User u1 = createUser();
        User u3 = createUser();

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

    public static User createUser() {                  // метод создания пользователей :)
        User u = UserBuilder
                .getInstance()
                .setName()
                .getChatRoom(pp)
                .build();
        pp.appendClient(u);
        return u;
    }

}

class User {
    String name;
    public Chat chatroom;
    public static String exitMsg;

    public void sendMsg() {
        System.out.print(">>> : ");
        Scanner scan = new Scanner(System.in);
        String msg = scan.nextLine();
        exitMsg = msg;
        chatroom.sendMessage(msg, this);
    }
}

class UserBuilder {                                     // генератор пользователей.
    private static UserBuilder instance;
    User obj;
    String[] nameList = new String[]{"Ivan", "Mariya", "Yuliya", "Stanislav", "Sergey", "Anna", "Tatyana", "Olga", "Petr"};   //список случайных имен

    public int getRandom() {                                       // генератор чисел.
        Random random = new Random();
        return random.nextInt(nameList.length - 1);
    }

    public static UserBuilder getInstance() {
        if (instance == null) {
            instance = new UserBuilder();
        }
        instance.obj = new User();
        return instance;
    }

    public UserBuilder setName() {                      // создание имени пользователя через генератор имен и список
        int r = getRandom();
        obj.name = nameList[r];
        return this;
    }

    public UserBuilder getChatRoom(Chat chatRoom) {
        obj.chatroom = chatRoom;
        return this;
    }

    public User build() {                                   // создание пользователя.
        return obj;
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

