public class Main {

    public static void main(String[] args) {
	// write your code here
        double d1x = 5d;
        double d1y = 2d;
        double d1z = -5d;
        double d2x = 4d;
        double d2y = 9d;
        double d2z = 2d;
        double d3x = -3d;
        double d3y = 2d;
        double d3z = 6d;

        double droneOneTwo = Math.sqrt(Math.pow(d1x-d2x,2) + Math.pow(d1y-d2y,2) + Math.pow(d1z-d2z,2));
        double droneOneThree = Math.sqrt(Math.pow(d1x-d3x,2) + Math.pow(d1y-d3y,2) + Math.pow(d1z-d3z,2));
        double droneTwoThree = Math.sqrt(Math.pow(d2x-d3x,2) + Math.pow(d2y-d3y,2) + Math.pow(d2z-d3z,2));

        double big = Math.max(droneOneTwo,Math.max(droneOneThree,droneTwoThree));
        double small = Math.min(droneOneTwo,Math.min(droneOneThree,droneTwoThree));

        System.out.println(big);
        System.out.println(small);



        //Integer.parseInt(anystring);  will evaulate any string to an int or whatever
        //or you can use IntegertoString(_);
    }
}
