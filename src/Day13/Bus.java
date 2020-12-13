package Day13;

public class Bus {
    int index;
    int id;

    public Bus(int id, int index) {
        this.id = id;
        this.index = index;
    }
    public int getID() {
        return id;
    }
   public boolean servicesNow(long time) {
        return time % id == 0;
   }

    public int getIndex() {
        return index;
    }
}
