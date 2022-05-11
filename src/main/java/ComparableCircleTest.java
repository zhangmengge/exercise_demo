public class ComparableCircleTest {

    public static void main(String[] args){
        ComparableCircle c1 = new ComparableCircle(2.1);
        ComparableCircle c2 = new ComparableCircle(3.0);
        int compareReault = c1.compareTo(c2);
        if (compareReault>0){
            System.out.println("c1对象大");
        }else if (compareReault<0){
            System.out.println("c2对象大");
        }else {
            System.out.println("c1与c2一样大");
        }
        }
    }

