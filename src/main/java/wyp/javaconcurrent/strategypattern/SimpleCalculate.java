package wyp.javaconcurrent.strategypattern;

/**
 * @author : miles wang
 * @date : 2019/9/24  10:14 AM
 */
public class SimpleCalculate implements CalculationStrategy {
    @Override
    public double calcu(double salary, double bouns) {
        return salary*0.07+bouns*0.1;
    }
}
