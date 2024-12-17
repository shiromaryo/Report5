public class Report5 {
    public static void main(String[] args) {
        String str = "壱百満";
        
        try {
            int value = Integer.parseInt(str);
            System.out.println("Value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatExceptionが発生しました: " + e.getMessage());
        }
    }
}
