package JavaString;

/*
java中的字符串并不是字符型数组 char []
而是类似于char * 指针
不可以对java String 做修改
* */


public class JavaString {
    public static void main(String[] args) {
        String greeting = "hello";
        //此时没有修改字符串常量 hello
        //而是重新指向了内存中字符串常量 hel
        greeting = greeting.substring(0,3);
        System.out.println(greeting);

        //由于是指向内存，所以不能用==判断两个字符串是否相等，需要使用equals函数进行判断
        if(greeting == "hel"){
            System.out.println("greeting的值等于hel");
        }
        if("hel".equals(greeting)){
            System.out.println("greeting的值等于hel............");
        }

        // 构建字符串 StringBuilder 字符串构建器
        StringBuilder builder = new StringBuilder();
        char singleChar = 'K';
        String str = "obe";
        builder.append(singleChar).append(str);
        System.out.println(builder.toString());

    }
}
