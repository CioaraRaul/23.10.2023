public class exercitii {
    public static void main(String[] args) {
        int gasit = 0;
        String[] s1 = {"java", "test", "university"};
        String[] s2 = {"car", "university", "plane"};

        for (int i = 0; i < s1.length; i++) {
//           System.out.println(s1[i]);
            for (int j = 0; j < s2.length; j++) {
                if (s1[i] == s2[j]) {
                    gasit = 1;
                    System.out.println(s1[i]);
                }
            }
        }
        if (gasit == 0) {
            System.out.println("Nu s-au gasit cuvinte ");
        }
    }

}
//    public static String compareFunction(String a, String b){
//        System.out.println(a);
//        System.out.println(b);
//        return "compare";
//    }


// Gasiti elementele comune din 2 siruri
// a = {"java", "test", "university"}
// b = {"car", "university", "plane"}
// result = university

//    public static int numerePrime(int nr){
////        int[] arr =
//        return 0;
//    }