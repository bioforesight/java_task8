import java.util.*;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        HashMap<Integer, List<User>> users = new HashMap<>();
        for (int i = 0; i < count; ++i) {
            System.out.println("Введите имя пользователя " + (i + 1));
            String name = scanner.nextLine();
            System.out.println("Введите возраст пользователя " + (i + 1));
            Integer age = scanner.nextInt();
            scanner.nextLine();

            User user = new User(name, age);
            if (users.containsKey(age)) {
                users.get(age).add(user);
            } else {
                List<User> user_list = new ArrayList<>();
                user_list.add(user);
                users.put(age, user_list);
            }
        }

        System.out.println("Введите требуемый возраст");
        Integer age = scanner.nextInt();
        scanner.nextLine();
        if (users.containsKey(age)) {
            List<User> out_users = users.get(age);
            Collections.sort(out_users, Comparator.comparing(User::getName));
            for (User i : out_users)
                System.out.println(i.toString());
        } else {
            System.out.printf("Пользователь с возрастом '%d' не найден", age);
        }

        scanner.close();
    }
}