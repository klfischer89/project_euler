import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemFour {

    public static void solve(){

        int lim1 = 999;
        int lim2 = 999;
        int resMult = 0;

        String resStr = "";
        String revStr = "";

        List<Integer> resList = new ArrayList<>();

        for (int i = 100; i <= lim1; i++) {
            for (int j = 100; j <= lim2; j++) {
                resMult = i * j;
                resStr = String.valueOf(resMult);
                revStr = new StringBuilder(resStr).reverse().toString();
                // System.out.println(resStr);
                // System.out.println(revStr);
                // System.out.println(resMult);
                if (resStr.equals(revStr)) {
                    resList.add(Integer.valueOf(revStr));
                }
            }
        }
        System.out.println(Collections.max(resList));

    }

}
