class People{
    private String name;

    void setName(String name)
    {
        this.name = name;
    }

    void PeoplePrint()
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

    void PeoplePrint()
    {
        System.out.println("---학생---");
        super.PeoplePrint();
        System.out.println("학번: " + this.id);
    }
}

class Professor extends People{

    private int office;

    void setOffice(int no)
    {
        this.office = no;
    }

    void PeoplePrint()
    {
        System.out.println("---교수---");
        super.PeoplePrint();
        System.out.println("사무실: " + this.office);
    }
}

public class StudentTest{

    public static void main(String[] args){

        Student std = new Student();
        Professor prof = new Professor();

        std.setName("kim");
        std.setId(12345);

        prof.setName("Park");
        prof.setOffice(365);

        std.PeoplePrint();
        prof.PeoplePrint();
    }
}