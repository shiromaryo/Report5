public class Report5 {
    public static void main(String[] args) {
        String str = null; // 条件1: nullを代入

        try {
            System.out.println(str.length()); // 条件2: NullPointerExceptionが発生する
        } catch (NullPointerException e) { // 条件2: 例外を捕捉
            System.out.println("NullPointerExceptionが発生しました。"); // 条件2: 発生したことを出力
            System.out.println("エラーメッセージ: " + e.getMessage()); // 条件3: getMessage()でメッセージ出力
        }
    }
}
