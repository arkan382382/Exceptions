/**
 * Created by arkan on 28.06.2017.
 */
public class ExceptionTest {
    public static void main(String[] arc){
        int[] tab = new int[3];
        try{
            tab[2] = 22;

            tab[4] = 55;
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Target:" + e);
        }
        finally {
            System.out.println("remove all unnecessary data");
        }
        System.out.println("test");
        Matrix temporaryValue = new Matrix(1);
        System.out.println(temporaryValue.showSomething());

        Matrix temporaryValue2 = new Matrix(500);
        try {
            System.out.print(temporaryValue2.showSomething());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Catched: " + e);
        }
        finally {
            System.out.println("Nie wyswietliło wyniku ;(");
        }

    }
}
class Matrix{
    private int[] x = new int[3];
    private int[] result = new int[2];
    public Matrix(int x){
        this.x[0] = x;
        this.x[1] = x+10;
        this.x[2] = x+20;
    }

    public int showSomething() throws IndexOutOfBoundsException{
        result[0] = this.x[0] + this.x[1] + this.x[2];
        if(result[0] > 100) {
            throw new IndexOutOfBoundsException();
        }
        return result[0];
    }
}
