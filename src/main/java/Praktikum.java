public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        String name = "а а";
        Account accountCorrect3 = new Account(name);
        System.out.println(accountCorrect3.checkNameToEmboss());

        name = "Аладщкда Ааывсывацк";
        Account accountCorrect19 = new Account(name);
        System.out.println(accountCorrect19.checkNameToEmboss());

        name = "вз";
        Account accountIncorrect2 = new Account(name);
        System.out.println(accountIncorrect2.checkNameToEmboss());

        name = "Аладщкдай Ааывсывацк";
        Account accountIncorrect20 = new Account(name);
        System.out.println(accountIncorrect20.checkNameToEmboss());

        name = "аааа";
        Account accountWithoutSpace = new Account(name);
        System.out.println(accountWithoutSpace.checkNameToEmboss());

        name = "а  а";
        Account accountWith2Space = new Account(name);
        System.out.println(accountWith2Space.checkNameToEmboss());

        name = " аа";
        Account accountWithStartSpace = new Account(name);
        System.out.println(accountWithStartSpace.checkNameToEmboss());

        name = "аа ";
        Account accountWithEndSpace = new Account(name);
        System.out.println(accountWithEndSpace.checkNameToEmboss());
    }

}