package Day13;

public class Main {

    public static void main(String[] args) {
	    part1();
    }
    public static void part1() {
        var arrivalTime = 1002578;
        int currentTime = arrivalTime;

        Bus[] buses = new Bus[9];
        buses[0] = new Bus(19, 0);
        buses[1] = new Bus(37, 13);
        buses[2] = new Bus(751, 19);
        buses[3] = new Bus(29, 21);
        buses[4] = new Bus(13, 32);
        buses[5] = new Bus(23, 42);
        buses[6] = new Bus(431, 50);
        buses[7] = new Bus(41, 60);
        buses[8] = new Bus(17, 67);

        Bus earliestBus = null;
        for(; earliestBus == null; currentTime++) {
            for(Bus b : buses) if(b.servicesNow(currentTime)) {
                earliestBus = b;
            }
        }
        currentTime--;

        StringBuffer sb = new StringBuffer();
        sb.append("The earliest bus to arrive is bus ");
        sb.append(earliestBus.getID());
        sb.append(", arriving at ");
        sb.append(currentTime);
        sb.append(", resulting in a waiting time of ");
        sb.append(currentTime - arrivalTime);
        sb.append(" Minutes. The product of bus ID and waiting time is ");
        sb.append((currentTime-arrivalTime)*earliestBus.getID());
        sb.append(".");
        System.out.println(sb.toString());
    }

}
