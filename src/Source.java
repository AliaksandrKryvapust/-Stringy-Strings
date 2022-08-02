public class Source {
    public static void main(String[] args) {
        int size =6;
        System.out.println(stringy(size).equals("101010"));
    }
    public static String stringy(int size) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i%2==0)
                result.append('1');
            else result.append('0');
        }
        return String.valueOf(result);
    }
}
