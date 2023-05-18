package HackerRank;

public class TimeConversion {

    public static void main(String[] args) {
        String time1 = "12:15:45PM";
        String time2 = "11:00:30PM";
        String time3 = "12:45:15AM";
        String time4 = "04:15:30AM";

        System.out.println(timeConversion(time1));
        System.out.println(timeConversion(time2));
        System.out.println(timeConversion(time3));
        System.out.println(timeConversion(time4));
    }

    public static String timeConversion(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        //If it's 12:00PM return 12:00
        //If any other PM return everything plus 12:00 i.e. 1:00PM = 13:00
        //If AM and it's 12:00AM return 0:00
        //If any other AM return everything as is without AM.
        if (sb.charAt(8) == 'P') {
            if (sb.charAt(0) == '1' && sb.charAt(1) == '2') {
                sb.delete(sb.length()-2, sb.length());
                return sb.toString();
            }
            char hour1 = (char) (sb.charAt(0) + 1);
            sb.setCharAt(0, hour1);
            char hour = (char) (sb.charAt(1) + 2);
            sb.setCharAt(1, hour);
            sb.delete(sb.length()-2, sb.length());
            return sb.toString();
        } else if (sb.charAt(0) == '1' && sb.charAt(1) == '2' && sb.charAt(8) == 'A'){
            sb.setCharAt(0, '0');
            sb.setCharAt(1,'0');
            sb.delete(sb.length()-2, sb.length());
            return sb.toString();
        } else {
            sb.delete(sb.length()-2, sb.length());
            return sb.toString();
        }
    }
    
}
