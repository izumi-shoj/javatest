//import java.util.Random;

public class Jikorenn {
	public static void main (String[] args) {
        greet();
        int result = sum(10,15);
        System.out.println(result);
        System.out.println(calculateCircleArea(5));
        System.out.println(checkEvenOdd(2));
        System.out.println(repeat("テスト",5));
        
    }
    
    public static void greet() {
        System.out.println("問題1:greetメソッド -文章表示-");
        System.out.println("こんにちは！Javaのプログラミングの世界へようこそ！");
    }
    
    public static int sum(int a , int b) {
        System.out.println("問題2:sumメソッド -2つの引数の合計-");
        return a + b;
    }
    
    public static double calculateCircleArea (double a) {
        System.out.println("問題3:calculateCircleAreaメソッド -円の計算-");
        double ans = a * a * 3.14;
        return ans;
    }
    
    public static String checkEvenOdd (int a) {
        System.out.println("問題4:checkEvenOddメソッド -偶数奇数判定-");
        if (a % 2 == 0) {
            return "偶数:even";
        }
        else {
            return "奇数:odd";
        }
    }
    public static String repeat(String str, int count) {
        System.out.println("問題5:repeatメソッド");
        String result = "";
        for (int i = 0; i < count; i++) {
            result += str;
        }
        return result;
    }
    
    public static void Product() {
    	
    }
    
    
    
//    public static int findMax(int a, int b, int c) {
//        System.out.println("問題6:findMaxメソッド");
//    }
    

}
