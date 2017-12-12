import java.util.List;

/**
 * Created by jeevan on 30/07/16.
 */

class Container {
    public int length;
    public int breadth;
    public int height;
}

class Item {
    public int width;
    public int length;
    public int breadth;
}
public class ContainerTest {
    public static void main(String args[]) {
        Container c = new Container();
        c.length = 15;
        c.breadth = 30;
        c.height = 30;

        Item i = new Item();
        i.length = 5;
        i.breadth = 30;
        c.height = 30;

        int a = 10 * 10 + 10 * 10 + 10 * 10;
        System.out.println(Math.sqrt(a));
        System.out.println(Math.sqrt(5 * 5 + 5 * 5 + 5 * 5));

    }


    public Boolean containerFit(Container c, List<Item> items) {
        int maxLength;
        int maxWidth;
        int maxHeight;

        for(Item item : items) {
//            if(item.length < maxLength)
        }

        return true;
    }
}
