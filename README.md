# Задание 8. Работа с ассоциативными массивами
* Создать класс "User", содержащий две переменных: 
```
private String name;
private Integer age;
```

* Добавить в класс геттеры и сеттеры, присваивающие и возвращающие значения этих переменных

* Добавить в класс метод: public String toString(), который возвращает строку вида: "Вася, возраст 25 лет", где "Вася" - значение переменной name, а 25 - значение переменной age.

* Создать конструктор класса, принимающий на вход два значения и инициализирующий ими эти переменные в методе main главного класса:

* Создать новую мапу HashMap<Integer, List<User>>(), которая будет в качестве ключа хранить возраст, а в качестве значения - список пользователей;

* Циклически запросить у оператора ввести данные 5-ти пользователей и записать объекты, созданные при вводе, в HashMap. Причем, если ключ (возраст) в мапе уже существует, то добавлять объект очередного пользователя в список, лежащий в значении по ключу. Если ключ в мапе еще не существует, то создавать новый список, записывать туда юзера и класть этот список в мапу по этому ключу.

* Запросить у пользователя ввести требуемый возраст и, если такой ключ есть в мапе, вывести на консоль пользователей из списка, полученного по ключу из мапы, отсортированных по имени.

```
Пример 1:
Вывод: Введите имя пользователя 1
Ввод: Александр
Вывод: Введите возраст пользователя 1
Ввод: 25
Вывод: Введите имя пользователя 2
Ввод: Александр2003
Вывод: Введите возраст пользователя 2
Ввод: 20
Вывод: Введите имя пользователя 3
Ввод: Михаил
Вывод: Введите возраст пользователя 3
Ввод: 25
Вывод: Введите имя пользователя 4
Ввод: Евгений
Вывод: Введите возраст пользователя 4
Ввод: 50
Вывод: Введите имя пользователя 5
Ввод: Мария
Вывод: Введите возраст пользователя 5
Ввод: 25

Вывод: Введите требуемый возраст
Ввод: 25
Вывод: Александр, возраст 25 лет
Вывод: Мария, возраст 25 лет
Вывод: Михаил, возраст 25 лет
```

```
Пример 2:
....

Вывод: Введите требуемый возраст
Ввод: 5
Вывод: Пользователь с возрастом '5' не найден
```
