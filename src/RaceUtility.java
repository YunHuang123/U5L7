public class RaceUtility {

    public static double milesToKm(double miles)
    {
        miles = miles * 1.609344;
        return miles;
    }

    public static double kmToMiles(double km)
    {
        km = km / 1.609344;
        return km;
    }

    public static String makeProper(String str)
    {
        String words[] = str.split("\\s");
        String capitalizeWord = "";
        for(String w:words)
        {
            String first = w.substring(0,1);
            String s = w.substring(1);
            s = s.toLowerCase();
            capitalizeWord += first.toUpperCase() + s + " ";
        }
        return capitalizeWord;
    }
}
