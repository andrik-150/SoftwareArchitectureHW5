package HW_Les_5;

import java.util.ArrayList;
import java.util.List;

// Класс Data Mapper
public class UserMapper {
    private List<User> users;

    public UserMapper() {
        this.users = new ArrayList<>();
    }

    // Метод для сохранения пользователя в базе данных
    public void save(User user) {
        users.add(user);
        System.out.println("User " + user.getUsername() + " saved to the database");
    }

    // Метод для обновления пользователя в базе данных
    public void update(User user) {
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername())) {
                u.setEmail(user.getEmail());
                System.out.println("User " + user.getUsername() + " updated in the database");
                return;
            }
        }
        System.out.println("User " + user.getUsername() + " not found in the database");
    }

    // Метод для удаления пользователя из базы данных
    public void delete(User user) {
        if (users.remove(user)) {
            System.out.println("User " + user.getUsername() + " deleted from the database");
        } else {
            System.out.println("User " + user.getUsername() + " not found in the database");
        }
    }

    // Метод для поиска пользователя по имени
    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}