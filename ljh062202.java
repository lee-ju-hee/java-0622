class People{
    private String name;

    void setName(String name)
    {
        this.name = name;
    }

    void peoplePrint()
    {
        System.out.println("이름: " + this.name);
    }
}

class Student extends People{

    private int id;

    void setId(int id)
    {
        this.id = id;
    }

    void peoplePrint1()
    {
        System.out.println("---학생---");
        super.peoplePrint();
        System.out.println("학번: " + this.id);
    }
}

public class ljh062202{

    public static void main(String[] args){

        Student std = new Student();

        std.setName("kim");
        std.setId(12345);

        People p[] = new People[2];
        p[1] = new People();
        p[1].setName("lee");

        p[0] = std;
        p[0].peoplePrint1();
        p[1].peoplePrint();
    }
}