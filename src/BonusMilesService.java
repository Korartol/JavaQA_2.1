public class BonusMilesService {
    public int calculate(int price) {
        int amount = 20;
        int mile = price / amount;
        return mile;
    }
}
