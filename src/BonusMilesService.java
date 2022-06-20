public class BonusMilesService {
    public int calculate(int price) {
        int mileFactor = 20;
        int miles = price / mileFactor;
        return miles;
    }
}
