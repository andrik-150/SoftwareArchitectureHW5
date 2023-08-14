package HW_Les_5;

// Исполняющая программа (Паттерн Data Mapper)
public class Programm {
    public static void main(String[] args) {
        User user1 = new User("Dima", "zerg2023@mail.ru");
        User user2 = new User("Alena", "foxbox@yandex.ru");

        UserMapper userMapper = new UserMapper();
        userMapper.save(user1); // Сохранение пользователя 1 в базе данных
        userMapper.save(user2); // Сохранение пользователя 2 в базе данных

        User foundUser1 = userMapper.findByUsername("Dima"); // Поиск пользователя по имени
        System.out.println("Found user: " + foundUser1.getUsername() + ", " + foundUser1.getEmail());

        User foundUser2 = userMapper.findByUsername("Xena");
        System.out.println("Found user: " + (foundUser2 != null ? foundUser2.getUsername() : "null"));

        user1.setEmail("newzerg2023@mail.ru"); // Изменение email пользователя 1
        userMapper.update(user1); // Обновление пользователя 1 в базе данных
        userMapper.delete(user2); // Удаление пользователя 2 из базы данных
    }
}