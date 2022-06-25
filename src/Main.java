public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 100;
        int miles = service.calculate(price);
        System.out.println("Вы получили " + miles + " бонусных миль!");
    }
}

/* Версия 1.0
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли
        int price = 1230;
        int amount = 20;

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        int mile = price / amount;

        System.out.println("Вы получили " + mile + " бонусных миль!");

    }
}
*/