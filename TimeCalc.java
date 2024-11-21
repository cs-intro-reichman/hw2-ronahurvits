public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0].substring(0, 2));
        int min = Integer.parseInt(args[0].substring(3));
        int minToAdd = Integer.parseInt(args[1]);
        int totMin = (hours*60) + min + minToAdd;
        int totHours = totMin / 60;
        int newHours = totHours%24;
        int newMin = totMin - (totHours*60);
        String strNewHours = String.valueOf(newHours);
        String strNewMin = String.valueOf(newMin);
        if (newHours < 10) strNewHours = "0" + newHours;
        if (newMin < 10) strNewMin = "0" + newMin;
        System.out.println(strNewHours+":"+strNewMin);
        } 
    }
