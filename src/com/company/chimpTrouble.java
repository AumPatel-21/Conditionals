
package com.company;

public class chimpTrouble {




    public static boolean chimpProblem(boolean asmile, boolean bsmile) {

        if (asmile == true && bsmile == true) {
            return true;
        }  if (asmile == false && bsmile == false) {
            return true;
        }  if ((asmile == false && bsmile == true) || (asmile == true && bsmile == false)) {
            return false;
        }
        return false;
    }

    public static boolean pickUpPhone(boolean isAsleep, boolean isMom, boolean isMorning) {
            if (isAsleep == true) {
                return false;
            }
            if(isMorning == true && isMom != true){
                return true;
            }
            else return true;
        }
        public static String setAlarm(int day, boolean onVacation){
            if (onVacation == true) {
                if (day == 0 || day == 6)
                    return "off";
                else
                    return "10:00";
            }
            if(day >= 1 || day <= 5)
                return "7:00";



                return "10:00";
        }

    public static void main(String[] args) {

        System.out.println("are we in trouble?  " + chimpProblem(true, true));

        System.out.println("Pick up the phone? " + pickUpPhone(true, false, true));

        System.out.println(setAlarm(2, true));

    }
}

