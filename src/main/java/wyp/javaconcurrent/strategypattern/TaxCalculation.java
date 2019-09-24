package wyp.javaconcurrent.strategypattern;

import lombok.Data;

/**
 * @author : miles wang
 * @date : 2019/9/24  9:58 AM
 * 税务计算器
 */
@Data
public class TaxCalculation {

    private  final double  salary;

    private  final double   bonus;

    // 引入策略
    private  CalculationStrategy calculationStrategy;

    public TaxCalculation(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    protected    double calcTax(){
        return this.calculationStrategy.calcu(salary,bonus);
    }

    public  double calculate(){
        return  this.calcTax();
    }
}
