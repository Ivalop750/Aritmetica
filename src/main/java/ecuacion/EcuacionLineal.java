package ecuacion;

/**
 * Created by al341854 on 7/02/17.
 */
public class EcuacionLineal {
    private double a; // ax + b = 0
    private double b;

    public EcuacionLineal(double a, double b) {
        this.a=a;
        this.b=b;
    }

    public SolucionUnica ResolverEcuacionLineal() {
        SolucionUnica s= new SolucionUnica((-b)/a);
        return s;

    }


}
