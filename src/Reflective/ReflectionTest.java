package Reflective;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
//        System.out.println(int[].class.getName());
//        try {
//            System.out.println(Class.forName(int[].class.getName()));
//        }
//        catch (ClassNotFoundException e) {
//            System.out.println("error");
//        }
//
        String name;
        if(args.length > 0){
            name = args[0];
        }else{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Class Name (e.g. java.util.Date)");
            name = in.next();
        }
        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length() > 0){
                System.out.println(" ");
            }
            System.out.println("class" + name);

            if(supercl != null && supercl != Object.class){
                System.out.println("extends" + supercl.getName());
            }

            System.out.println("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.exit(0);
    }

    //prints all constructors of a class
    public static void printConstructors(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();

        for(Constructor c : constructors){
            String name = c.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length() > 0){
                System.out.println(name + "(");
            }
            Class[] paramTypes = c.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++){
                if(j > 0){
                    System.out.println(paramTypes[j].getName());
                }
                System.out.println(");");
            }
        }

    }

    //prints all methods of a class
    public static void printMethods(Class cl){
        Method[] methods = cl.getDeclaredMethods();

        for(Method m : methods){
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.println("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length() > 0){
                System.out.println(modifiers + " ");
            }
            System.out.println(retType.getName() + " " + name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++){
                if(j > 0){
                    System.out.println(", ");
                }
                System.out.println(");");
            }
        }
    }


    //prints all fileds of a class
    public static void printFields(Class cl){
        Field[] fileds = cl.getDeclaredFields();
        for(Field f : fileds){
            Class type = f.getType();
            String name = f.getName();
            System.out.println("    ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length() > 0){
                System.out.println(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
