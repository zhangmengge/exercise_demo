public class ComparableCircle extends Cricle implements Compare{

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o){
        if (this == o){
            return 0;
        }

        if(o instanceof ComparableCircle){
        ComparableCircle c = (ComparableCircle)o;
          //方法一：
//            if (this.getRadius()>c.getRadius()){
//                return  1;
//            }else if(this.getRadius()<c.getRadius()){
//                return -1;
//            }else{return 0;}
//
            //方法二
            return this.getRadius().compareTo(c.getRadius());
        }

        else{
            throw  new RuntimeException("传入的数据类型不匹配");
        }


    }
}
