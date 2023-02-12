// Дополните объявление класса Contact
public abstract class Contact {
    // Класс должен содержать одно поля - имя пользователя name
    static String name;

    public String getName() {
        return name;
    }

    public Contact(String name) {
    }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
    public abstract void sendMessage();
    public abstract void print();
}