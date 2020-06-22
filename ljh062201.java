class Student{
}
public class ljh062201{
    public static void main(String[] args){

        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = std1;

        System.out.println(std1.equals(std2));
        System.out.println(std1.equals(std3));
        System.out.println(std2.equals(std3));
        System.out.println(std1.toString());
        System.out.println(std2.toString());
        System.out.println(std3.toString());
        System.out.println(std1.getClass());
        System.out.println(std2.getClass());
        System.out.println(std3.getClass());
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
        System.out.println(std3.hashCode());
    }
}