package practice;

// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Example 1:
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:
// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step

// Constraints:
// 1 <= n <= 45

public class Main {

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
//        if (n >= 0 && n <= 2) return n;
//        return climbStairs(n - 1) + climbStairs(n - 2);

        if (n <= 1) {
            return 1;
        }
        int p1 = 1;
        int p2 = 2;
        for (int i = 3; i <= n; i++) {
            int p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
        }

        return p2;
    }


}
