public class  LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double newX;

    public LinearEquation(double x1,double y1,double x2,double y2, double newX)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String getCoord1(){return String.format("(%f,%f)",x1,y1);}
    public String getCoord2(){return String.format("(%f,%f)",x2,y2);}
    public String slope()
    {
        double y = y2-y1;
        if (y%1 == 0){y = (int)Math.round(y);}
        double x = x2-x1;
        if (x%1 == 0){x = (int)Math.round(x);}
        double s = y/x;
        if (s%1 != 0)
        {
            return String.format("%.2f/%.2f",y,x);
        }
        return String.format("%f",s);
    }
    public double s()
    {
        double y = y2-y1;
        double x = x2-x1;
        double s = y/x;
        return s;
    }
    public String yIntercept()
    {
        double y = y2-y1;
        double x = x2-x1;
        double s = y/x;
        double mx = s*x2;
        double b  = y-mx;
        return String.format(("%.2f"),b);
    }
    public double yInt()
    {
        double y = y2-y1;
        double x = x2-x1;
        double s = y/x;
        double mx = s*x2;
        double b  = y-mx;
        return b;
    }
    public String slopeIntForm()
    {
        return String.format(("y = %sx + %s"),slope(),yIntercept());
    }
    public String getDistance()
    {
        double x = x2-x1;
        x = Math.pow(x,2);
        double y = y2-y1;
        y = Math.pow(y,2);
        double d = Math.sqrt(x+y);
        return String.format("%.2f",d);
    }

    public String solveY()
    {
        double newY = (s()*newX)+yInt();
        return String.format("Solved coordinate point is (%f,%f)",newX,newY);

    }
    public void customx(double newX){this.newX = newX;}

    public String toString()
    {
        return String.format("First Coordinate: %s\nSecond Coordinate: %s\nSlope of Line: %s\nY-Intercept: %s\nSlope Intercept Form: %s\n",getCoord1(),getCoord2(),slope(),yIntercept(),slopeIntForm());
    }


}
