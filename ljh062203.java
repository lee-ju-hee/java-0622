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
        System.out.println("ÀÌ¸§: " + this.name);
        System.out.println("¹è±â·®: " + this.air + "kg");
        if(name.equals("Æ®·°"))
        {
            System.out.println("»§»§");
        }
        else
        {
            System.out.println("½¹½¹");
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
        System.out.println("---Æ®·°---");
        super.Sound();
        System.out.println("ÀûÀç·®: " + this.carrying + "kg");
        System.out.println("Áü½Æ±â: " + this.weight + "kg");
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
        System.out.println("---½ºÆ÷Ã÷Ä«---");
        super.Sound();
        System.out.println("ÃÖ´ë¼Óµµ: " + this.speed + "km");
        System.out.println("µå¶óÀÌºê: " + this.drive + "km");
    }
}

public class ljh062203{
    public static void main(String[] args){

        Truck tru = new Truck();
        SportCar sport = new SportCar();

        tru.setName("Æ®·°");
        tru.setAir(900);
        tru.setCarry(5656);
        tru.setWeight(100);

        sport.setName("½ºÆ÷Ã÷Ä«");
        sport.setAir(700);
        sport.setSpeed(232);
        sport.setDrive(60);

        tru.Sound();
        sport.Sound();
    }
}