public class Methods {

    int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int z;
        // Method invocation using Object creation
        Methods obj = new Methods();
        z = obj.logic(a, b);
        System.out.println("sum of " +a+ " and " +b+ " is: "+z);
       
    }
}