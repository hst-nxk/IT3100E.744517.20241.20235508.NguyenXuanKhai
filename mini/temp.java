public class temp {
    public static void main(String[] args){
        // String v1 = new String("10");
        // String v2 = new String("10");
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1.equals(v2));
        System.out.println(v1==v2);
    }
}
