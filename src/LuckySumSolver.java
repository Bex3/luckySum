/**
 * Created by bearden-tellez on 9/21/16.
 */
public class LuckySumSolver {
    public int luckySum(int a, int b, int c) {
        if (a == 13){
            return 0;
        } else if (b == 13){
            return a;
        } else if (c == 13) {
            return (a+b);
        }
            return a + b + c;
        }
}
