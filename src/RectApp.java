package app;


public class RectApp{
    public static void main(String[] args){
        Rectangle test1 = new Rectangle(1,2,4,4); //points (1,2), (5,2), (1,6), (5,6)

        Rectangle test2 = new Rectangle(2,3,4,4); //points (2,3), (6,3), (2,7), (6,7)
        Rectangle test3 = new Rectangle(5,6,4,4); // points (5,6), (9,6), (5,10), (9,10)

        Rectangle test4 = new Rectangle(5,2,4,4);

        Rectangle test5 = new Rectangle(2,3,1,1);

        System.out.println(test1.intersects(test2));
        System.out.println(test1.contains(test2));
        System.out.println(test1.isAdjacent(test2));

        System.out.println(test1.isAdjacent(test3));
        System.out.println(test1.isAdjacent(test4));
        System.out.println(test1.contains(test5));

        System.out.println(test1.isSquare());
    }
}
