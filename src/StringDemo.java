public class StringDemo {
    public static void main (String[] args)
    {
        String name = " POLAND";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.isEmpty());
        char[] Var = {'I', 'N','D','I','A'};
        for (char ch : Var) {
            System.out.print(ch);
        }

        System.out.println(name.equals("POLAND"));
        System.out.println(name.trim());
        System.out.println(name.indexOf('L'));
        System.out.println(name.lastIndexOf('D'));
        System.out.println(name.charAt(5));
        System.out.println(name.substring(5));
        System.out.println(name.equalsIgnoreCase("POLAND"));

    }
}
