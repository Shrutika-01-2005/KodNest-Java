
public class StringMethods {

    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('e'));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.substring(4));
        System.out.println(str.substring(0, 4));
        System.out.println(str.replace('e', 'E'));
        System.out.println(str.replace("Technologies", "Technologies"));
        System.out.println(str.replace("KodNest", "KodNest"));
        System.out.println(str.replace("Technologies", "Technologies"));
        System.out.println(str.contains("Technologies"));
        System.out.println(str.contains("KodNest"));
        System.out.println(str.contains("Technologies"));
        System.out.println(str.startsWith("KodNest"));
        System.out.println(str.endsWith("Technologies"));
        System.out.println(str.startsWith("KodNest"));
        System.out.println(str.endsWith("Technologies"));
        System.out.println(str.isEmpty());
        System.out.println(str.trim());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equals("KodNest Technologies"));
        System.out.println(str.equalsIgnoreCase("KodNest Technologies"));
        System.out.println(str.compareTo("KodNest Technologies"));
        System.out.println(str.compareToIgnoreCase("KodNest Technologies"));
        System.out.println(str.concat(" KodNest Technologies"));

    }
}
