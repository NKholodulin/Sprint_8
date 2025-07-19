public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        // Проверка длины
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }
        // Проверка наличия только одного пробела
        int spaceCount = 0;
        for (char c : name.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        if (spaceCount != 1) {
            return false;
        }
        // Проверка, что пробел не в начале и не в конце
        if (name.startsWith(" ") || name.endsWith(" ")) {
            return false;
        }
        return true;
    }
}