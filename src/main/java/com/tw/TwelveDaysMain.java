package com.tw;
class TwelveDays{
    public String verse(int day){
        String retString="";
        retString="On the ";
        switch (day) {
            case 1:
                retString+="first";
                break;
            case 2:
                retString+="second";
                break;
            case 3:
                retString+="third";
                break;
            case 4:
                retString+="fourth";
                break;
            case 5:
                retString+="fifth";
                break;
            case 6:
                retString+="sixth";
                break;
            case 7:
                retString+="seventh";
                break;
            case 8:
                retString+="eighth";
                break;
            case 9:
                retString+="ninth";
                break;
            case 10:
                retString+="tenth";
                break;
            case 11:
                retString+="eleventh";
                break;
            case 12:
                retString+="twelfth";
                break;
        }

        retString+=" day of Christmas my true love gave to me:";

        switch (day) {
            case 12:
                retString+="Twelve drummers drumming, ";
            case 11:
                retString+="Eleven pipers piping, ";
            case 10:
                retString+="Ten lords a leaping, ";
            case 9:
                retString+="Nine ladies dancing, ";
            case 8:
                retString+="Eight maids a milking, ";
            case 7:
                retString+="Seven swans a swimming, ";
            case 6:
                retString+="Six geese a laying, ";
            case 5:
                retString+="Five golden rings, ";
            case 4:
                retString+="Four calling birds, ";
            case 3:
                retString+="Three French hens, ";
            case 2:
                retString+="Two turtle doves, and ";
            default:
                retString+="A partridge in a pear tree. ";
        }

        retString+="\n\n";
        return retString;
    }

    public String verses(int startVerse,int endVerse){
        String retString="";
        for(int day=startVerse;day<=endVerse;day++){
            retString += verse(day);
        }
        return retString;
    }

    public String sing(){
        String retString="";
        for (int day = 1; day <= 12; day++) {
            retString+=verse(day);

        }
        return retString;
    }

}
public class TwelveDaysMain {
    public static void main(String[] args) {
        TwelveDays twelveDays = new TwelveDays();
        String sing = twelveDays.sing();
        System.out.println(sing);
    }
}

