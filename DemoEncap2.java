package day2;
//Demo of setters/getters (encapsulation)
//Encapsulation
public class DemoEncap2 {
    public static void main(String[] args) {
        Sport sport=new Sport();
        sport.setTitle("Cricket");
        sport.setPlayers(11);
        sport.setIndoor(false);
        System.out.println("Name of sport: "+sport.getTitle());
        System.out.println("No. of players: "+sport.getPlayers());
        System.out.println("Is indoor? "+sport.isIndoor());
    }
}
class Sport{
    private String title;
    private int players;
    private boolean indoor;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPlayers() {
        return players;
    }
    public void setPlayers(int players) {
        this.players = players;
    }
    public boolean isIndoor() {
        return indoor;
    }
    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }
}