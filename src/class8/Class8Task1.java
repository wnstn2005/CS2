package class8;

public class Class8Task1 {
    public static void main(String[] args) {
        //a:b:c::d -> a#b#c#d로 바꾸시오.
        //
        //Hint: split, join

        String alpha = "a:b::c::d";
        String stralpha = String.join("#",alpha.split(":"));

        System.out.println(stralpha);
    }

}
