package FinalVariable;

public class Constants {

    //final 用来修饰常量，一般全部用大写来表示
    //static 表示该变量是一个静态（类）属性
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters:" +
                paperWidth * CM_PER_INCH + "by" + paperHeight*CM_PER_INCH);
    }
}
