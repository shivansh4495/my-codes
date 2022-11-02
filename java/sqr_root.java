public class sqr_root{
    public static double sqrt(double x) 
    {
        double low = 0;
        double high = x;
        double mid = 0;
        double eps = 0.000000000000001;
        while (high - low > eps) 
        {
            mid = (low + high) / 2;
            if (mid * mid > x)
           {
                high = mid;
            }
             else 
           {
                low = mid;
            }
        }
        return mid;
    }
    public static void main(String[] args) 
    {
        double z = 4;
        double y = sqrt(z);
        System.out.println(y);
    }
}