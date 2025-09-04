package lab4;

import java.util.Arrays;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.List;





public class dayType {

    String Sun = "Sunday";
    String Mon = "Monday";
    String Tue = "Tuesday";
    String Wed = "Wednesday";
    String Thurs = "Thursday";
    String Fri = "Friday";
    String Satur = "Saturday";

    String today ;

    public String WeekDays[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    //static String Mystr = ("Monday Tuesday Wednesday Thursday Friday Saturday Sunday" +"hasan");


    public dayType(String today){
        this.today = today;
    }

    public void setDay (String day){
        this.today =day ;
    }

    public String getDay(){
        return today ;
    }

    public void printToday(){
        System.out.println("Today is : "+today);
    }

   // public void nextDay() {
        //System.out.println("The next day is : "+(WeekDays[WeekDays.indexOf(today)]));
        public void  nextDay() {
            String nextDay = new String();
            int index = 0;
            while (!WeekDays[index].equals(today)) {
                index++;
            }
            if (index == 6) {
                nextDay = "Monday";

            } else {
                nextDay = WeekDays[index + 1];
            }


        System.out.println("The next day is :"+nextDay);

        }

        public void previousDay(){
        int index=0;
        String PrevDay=new String();
        while (!WeekDays[index].equals(today)){
            index++;
        }
        if (index==0){
            PrevDay="Sunday";

        }
        else
        {PrevDay=WeekDays[index-1];
        }


            System.out.println("The previous day is :"+ PrevDay);


    }
        public void addDay(int num){
        int index=0;
        String addDay=new String();
        while (!WeekDays[index].equals(today)){
            index++;
        }
        if (index+(num%7)>=(WeekDays.length)){
            int num2=num%7;
            num2=num2-((WeekDays.length)-index);
            index=0;
            addDay=WeekDays[index+num2];

        }
        else {
            addDay = WeekDays[index + (num % 7)];
        }
            System.out.printf("after add "+num+ " days, The day will be :"+addDay);
    }




    public static void main(String[] args) {
        String WeekDays[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("The WeekDays are : " );
        for (int i=0; i<WeekDays.length ;i++){

            System.out.println(WeekDays[i]);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the today's day,according the above list : ");
        String inputday = input.nextLine();

        dayType thisDay =new dayType(inputday);
        thisDay.printToday();
        thisDay.nextDay();
        thisDay.previousDay();
        System.out.println("enter the number to find day");
        int nowday = input.nextInt();
        thisDay.addDay(nowday);
        System.out.println();

        //System.out.println(Mystr.indexOf("hasan"));

    }

}

