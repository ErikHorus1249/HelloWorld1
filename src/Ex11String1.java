public class Ex11String1 {
    public static void main(String[] args) {
            String name = "EriK";
            String firstName = "Erik";



            for(int i = 0; i < name.length(); i++){
                System.out.println(name.charAt(i));
            }
            System.out.println(firstName.equals(name));
            System.out.println(firstName.equalsIgnoreCase(name));
            System.out.println(firstName == name);

            String emptyString = "";
            String nullString = null;
            /* trước khi thao tác vs đtg phải kt có phải null hay ko ?*/

    }
}
