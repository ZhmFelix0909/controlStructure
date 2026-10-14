public class controlStructures2 {
    public static void main(String[] args) {
        int temp = 22;
        if (temp > 30)
            System.out.println("Hot");
        else if (temp > 20)
            System.out.println("Warm");
        else if (temp > 10) {
            System.out.println("Cool");
        }else{
            System.out.println("Cold");

        }
    }
}
/*if the temp is 22, the answer will be Warm, if it's 35, the answer will be Hot.
if we put >10, then if it gives us the number is bigger than 10 the answer will always be cool*/