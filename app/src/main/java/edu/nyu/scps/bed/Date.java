package edu.nyu.scps.bed;

public class Date {
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    private static final int[] a = {
            0,	//dummy
            31,	//January
            29,	//February: can't distinguish between leap and non-leap
            31,	//March
            30,	//April
            31,	//May
            30,	//June
            31,	//July
            31,	//August
            30,	//September
            31,	//October
            30,	//November
            31	//December
    };

    //The three fields inside each Date object.

    private int year;
    private int month;   //in the range 1 to 12 inclusive
    private int day;     //in the range 1 to number of days in month inclusive

    //This method is the constructor for class Date.
    //It creates a new object of this class.

    public Date(int month, int day, int year) {
        this.year = year;	//two variables with the same name
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    //Return the length of the month that this Date belongs to.

    public int length() {
        return a[month];
    }

    // Move this Date object one day Back.

    public void prev() {
        if (day > 1) {
            int i = --day;
            return;

        } else {
            //day is a[] of previous month
            //decrease month
            if (month > 1){
                --month;
            } else {
                //decrease year
                   --year;
                month = 12;
            }
            day = a[month];
            return;

        }


        //Roll back an unsuccessful attempt at a change.
        //Don't leave this Date object in a half-changed state.

    }

    //Move this Date object count.
    //The parameter must be non-negative, but we're not bothering to check for errors.

    public void prev(int count) {
        for (int i = 0; i < count; ++i) {
            prev();
        }
    }



    //Return a String in the format 12/31/2015 showing the content of this Date object.

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    //Return the number of months in a year.

    public static int monthsInYear() {
        return a.length - 1;
    }

}