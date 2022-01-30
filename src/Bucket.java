import java.util.ArrayList;
import java.util.List;

public class Bucket {
    protected List<Good> bucketList;

    public Bucket () {
        bucketList = new ArrayList<>();
    }

    public void bucketAdd (Good good) {
        bucketList.add(good);
    }

    public String bucketPrint () {
        if (bucketList.size() == 0) {
            return "Ваша корзина пуста";
        } else {
            System.out.println("Товары в корзине");
            System.out.printf("%1$-15s %1$-15s %2$-6.1f %3$%-5d %4$-6d" , name, price, rating, id);
            for (int i = 0; i < bucketList.size(); i++) {
                System.out.println(i + " " + bucketList.get(i).goodToString());
            }
        }
    }
}
