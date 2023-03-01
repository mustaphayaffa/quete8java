public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return this.altitude;
    }

    public boolean isFlying() {
        return this.flying;
    }

    public void setAltitude(int meters) {
        this.altitude = getAltitude() + meters;
    }
    

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        this.flying = true;
        System.out.println("Eye Cherry takes off in the sky.");
    }

    @Override
    public void ascend(int meters){
        
        if (this.flying == true) {
            this.setAltitude(meters);
        }
        System.out.println("Eye Cherry flies upward, altitude :" +getAltitude());
    }
    
    @Override
    public void glide(){
        System.out.println("It glides into the air.");
    }
    
    @Override
    public void descend(int meters){
        meters = -meters;
        if (this.flying == true){
            this.setAltitude(meters);
        }
        System.out.println("Eye Cherry flies downward, altitude :" +getAltitude());
    }
    
    @Override
    public void land(){
        if (this.getAltitude() > 1){
            System.out.println("Eye Cherry is too high, it can't lands.");
        } else {
            System.out.println("Eye Cherry lands on the ground.");
        }  
    }
}
