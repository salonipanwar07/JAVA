package Assignment_04;

public class Pattern01_hollow_inverted_half_pyramid {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 5 || j == 1 || i == j) {
                    System.out.print(i+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
    
    

