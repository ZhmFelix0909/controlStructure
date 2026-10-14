public class controlStructure4 {
    public static void main(String[] args) {
        int age = 17;
        boolean hasLicence = true;
        if (age >= 16 && hasLicence) {
            System.out.println("Can drive");
        } else if (age >= 16) {
            System.out.println("Get a licence first");
        } else {
            System.out.println("Too young");
        }
    }
}
/*it will print Can drive, if change the age to 15 it will print Too young.*/
