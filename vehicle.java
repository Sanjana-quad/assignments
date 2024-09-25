public class vehicle {
    private String regnumber;
    private String model;
    public vehicle(String regnumber, String model) {
        this.regnumber = regnumber;
        this.model = model;
    }

    public String getRegnumber() {
        return regnumber;
    }
//    public void setRegnumber(String regnumber) {
//        this.regnumber = regnumber;
//    }
    public String getModel() {
        return model;
    }
    public double parkfee(int hours){
        return 0;
    }
    public void display(){
    }
}

class car extends vehicle {
    private int numDoors;
    public car(String regnumber, String model, int numDoors) {
        super(regnumber, model);
        this.numDoors = numDoors;
    }
    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public double parkfee(int hours) {
        return hours * 2.5;
    }
    @Override
    public void display() {
        System.out.println(getRegnumber() + " " + getModel() + " " + getNumDoors());
    }
}

class motor extends vehicle {
    private String Enginetype;
    public motor(String regnumber, String model, String Enginetype) {
        super(regnumber, model);
        this.Enginetype = Enginetype;
    }
    public String getEnginetype() {
        return Enginetype;
    }
    @Override
    public double parkfee(int hours) {
        return hours * 1.5;
    }
@Override
    public void display() {
        System.out.println(getRegnumber() + " " + getModel() + " " + getEnginetype());
    }
}

class parkinglotsys{
    public static void main(String[] args) {
        vehicle car = new car("kl07","toyota",4);
        vehicle motor =  new motor("k07","honda","xyz");
        int parkinghours = 3;
        car.parkfee(parkinghours);
        motor.parkfee(parkinghours);
        car.display();
        motor.display();
    }
}

