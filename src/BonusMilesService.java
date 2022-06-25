public class BonusMilesService {
    public int calculate(int price) {
//        int amount;
        int mile = price > 1000 ? price / 20 : 0;

//        if (price > 1000) {
//            amount = 20;
//            mile = price / amount;
//        } else {
//            mile = 0;
//        }

        return mile;
    }
}
