
public class StringBuilderSS {

    public static void main (String[] args)
    {
        String Text = "Hi I am learning JAVA";
        String[] S = Text.split("");
        /*System.out.println(Text);

        StringBuilder s = new StringBuilder();
        for (int i =0; i<Text.length(); i++)
        {
            s.append(Text(i));


    }*/
        StringBuilder sb = new StringBuilder();
        for (String word : S){
            StringBuilder stringBuilder = new StringBuilder(word);
            sb.append(new StringBuilder(word).reverse() + "");

        }

        System.out.println();
}

}
