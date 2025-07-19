public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        String name = "а а";
        Account accountCorrect3 = new Account(name);
        boolean canEmboss = accountCorrect3.checkNameToEmboss();
        System.out.println("Можно ли использовать имя для печати: " + canEmboss);

        name = "Аладщкда Ааывсывацк";
        Account accountCorrect19 = new Account(name);
        canEmboss = accountCorrect19.checkNameToEmboss();
        System.out.println("Можно ли использовать имя для печати: " + canEmboss);

        name = "вз";
        Account accountIncorrect2 = new Account(name);
        canEmboss = accountIncorrect2.checkNameToEmboss();
        System.out.println("Можно ли использовать имя для печати: " + canEmboss);

        name = "Аладщкдай Ааывсывацк";
        Account accountIncorrect20 = new Account(name);
        canEmboss = accountIncorrect20.checkNameToEmboss();
        System.out.println("Можно ли использовать имя для печати: " + canEmboss);

        name = "аааа";
        Account accountWithoutSpace = new Account(name);
        canEmboss = accountWithoutSpace.checkNameToEmboss();
        System.out.println("Можно ли использовать имя для печати: " + canEmboss);

        name = "а  а";
        Account accountWith2Space = new Account(name);
        canEmboss = accountWith2Space.checkNameToEmboss();
        System.out.println("Можно ли использовать имя для печати: " + canEmboss);

        name = " аа";
        Account accountWithStartSpace = new Account(name);
        canEmboss = accountWithStartSpace.checkNameToEmboss();
        System.out.println("Можно ли использовать имя для печати: " + canEmboss);

        name = "аа ";
        Account accountWithEndSpace = new Account(name);
        canEmboss = accountWithEndSpace.checkNameToEmboss();
        System.out.println("Можно ли использовать имя для печати: " + canEmboss);
    }

}