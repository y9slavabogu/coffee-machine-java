package machine;

public interface Ingredients {
    class ForEspresso {
        static int water = 250;
        static int coffeeBeans = 16;
        static int money = 4;
    }

    class ForLatte {
        static int water = 350;
        static int milk = 75;
        static int coffeeBeans = 20;
        static int money = 7;
    }

    class ForCappuccino {
        static int water = 200;
        static int milk = 100;
        static int coffeeBeans = 12;
        static int money = 6;
    }
}
