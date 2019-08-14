

// hoc ve string buider
public class Ex12StringBuider {
    public static void main(String[] args) {

        StringBuilder example = new StringBuilder();

        example.append("nguyen");
        example.append("Tuan");
        example.append("Anh");

       // System.out.println("Name of legend = " + name);

       // example.delete(0,2);

        //example.insert(0 , "Xin chào ");
        String name = example.replace(0,6, "NGUYEN ").toString();
        System.out.println(name);
    }
}
