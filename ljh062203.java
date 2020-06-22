class Car{
    private String name;
    private int air;

    void setName(String name)
    {
        this.name = name;
    }

    void setAir(int air)
    {
        this.air = air;
    }

    void Sound()
    {
        System.out.println("�̸�: " + this.name);
        System.out.println("��ⷮ: " + this.air + "kg");
        if(name.equals("Ʈ��"))
        {
            System.out.println("����");
        }
        else
        {
            System.out.println("����");
        }
    }   
}

class Truck extends Car{

    private int carrying;
    private int weight;

    void setCarry(int carry)
    {
        this.carrying = carry;
    }

    void setWeight(int weight)
    {
        this.weight = weight;
    }

    void Sound()
    {
        System.out.println("---Ʈ��---");
        super.Sound();
        System.out.println("���緮: " + this.carrying + "kg");
        System.out.println("���Ʊ�: " + this.weight + "kg");
    }
}

class SportCar extends Car{
    
    private int speed;
    private int drive;

    void setSpeed(int speed)
    {
        this.speed = speed;
    }

    void setDrive(int drive)
    {
        this.drive = drive;
    }

    void Sound()
    {
        System.out.println("---������ī---");
        super.Sound();
        System.out.println("�ִ�ӵ�: " + this.speed + "km");
        System.out.println("����̺�: " + this.drive + "km");
    }
}

public class ljh062203{
    public static void main(String[] args){

        Truck tru = new Truck();
        SportCar sport = new SportCar();

        tru.setName("Ʈ��");
        tru.setAir(900);
        tru.setCarry(5656);
        tru.setWeight(100);

        sport.setName("������ī");
        sport.setAir(700);
        sport.setSpeed(232);
        sport.setDrive(60);

        tru.Sound();
        sport.Sound();
    }
}