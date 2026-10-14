public class controlStructures3 {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            default:
                System.out.println("Other");
        }
    }
}
/*if I don't change it, it will print Tue Wed, the break helps to stop and doesn't run other codes.
if we don't have them, the code will still run and print other things.*/
