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

//        int minLength = 3;
//        int maxLength = 19;
//        if (name == null || name.isEmpty()) {
//            return false;
//            String trimmedName = name.trim();
//            if (trimmedName.isEmpty()) {
//                return false; // строка состояла только из пробелов
//            }
//            int spaceCount = 0;
//            for (int i = 0; i < trimmedName.length(); i++) {
//                if (trimmedName.charAt(i) == ' ') {
//                    spaceCount++;
//                }
//            }
//            return spaceCount == 1 && !trimmedName.startsWith(" ") && !trimmedName.endsWith(" ");
//            if (name.length() >= minLength && name.length() <= maxLength) {
//                System.out.println("Длина строки находится в заданном диапазоне.");
//                return true;
//            } else {
//                System.out.println("Длина строки не соответствует заданным требованиям.");
//                return false;
//            }
//        }

    }

}