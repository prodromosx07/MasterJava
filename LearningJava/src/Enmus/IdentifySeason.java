package Enmus;

public class IdentifySeason {
    public static void whichSeasonUsingEnum(Month month){
        switch (month){
            case DECEMBER, JANUARY, FEBRUARY:
                System.out.println(month + " is in the winter season");
                break;

            case MARCH, APRIL, MAY:
                System.out.println(month + " is in the spring season");
                break;


            case JUNE, JULY, AUGUST:
                System.out.println(month + " is in the summer season");
                break;

            case SEPTEMBER, OCTOBER, NOVEMBER:
                System.out.println(month + " is in the fall season");
                break;

            default:
                System.out.println(month + " is an invalid month.");
        }
    }

    public static void whichSeason(int month){
        switch (month){
            case 1:
                System.out.println("January is in the winter season");
                break;

            case 2:
                System.out.println("February is in the winter season");
                break;

            case 3:
                System.out.println("March is in the spring season");
                break;

            case 4:
                System.out.println("April is in the spring season");
                break;

            case 5:
                System.out.println("May is in the spring season");

            case 6:
                System.out.println("June is in the summer season");
                break;

            case 7:
                System.out.println("July is in the summer season");
                break;

            case 8:
                System.out.println("August is in the summer season");
                break;

            case 9:
                System.out.println("September is in the fall season");
                break;

            case 10:
                System.out.println("October is in the fall season");
                break;

            case 11:
                System.out.println("November is in the fall season");
                break;

            case 12:
                System.out.println("December is in the winter season");
                break;

            default:
                System.out.println("%d is an invalid month.");
        }
    }
}
