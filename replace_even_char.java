import java.util.Arrays;

public class replace_even_char {
    public static void main(String[] args) {
        String string = String.join(" ", args);
        String[] split = string.split("");
        System.out.println(Arrays.toString(split));

        for (int i=0; i < split.length; i++) {
            if (i % 2 == 0) {
                if (i + 2 < split.length)
                    split[i] = split[i+2];
                else 
                    split[i] = "1";
            }
        }
        String str = Arrays.toString(split);
        System.out.println(str.toString());
    }
}
