package SixPrinciple.OpenClosePrinciple;

/**
 * Created by yanbowen on 1/4/2017.
 */
public class offNovelBook extends NovelBook {
    offNovelBook(String _name, int _price, String _author) {
        super(_name, _price, _author);
    }

    @Override
    public int getPrice() {
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if (selfPrice > 4000) {
            offPrice = selfPrice * 90 / 100;
        } else {
            offPrice = selfPrice * 80 / 100;
        }
        return offPrice;
    }
}
