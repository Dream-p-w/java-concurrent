package wyp.javaconcurrent.strategypattern;

/**
 * @author : miles wang
 * @date : 2019/9/24  10:01 AM
 * 策略模式的执行类
 */
public class TaxCalculationMain {
    public static void main(String[] args) {
        // 如果我们调整税率，就需要改变重写的   calcTax方法，我们抽出一个专门计算税率的接口
//        TaxCalculation taxCalculation = new TaxCalculation(20000, 5000){
//            @Override
//            protected double calcTax() {
//             return    getSalary()*0.01+getBonus()*0.03;
//            }
//        };
//        double v = taxCalculation.calculate();
//        System.out.println(v);

  // ---------------------------->如果我们更换税率计算方法，那么只需要替换不同的接口实现类
//        TaxCalculation taxCalculation = new TaxCalculation(20000, 5000);
//        SimpleCalculate simpleCalculate = new SimpleCalculate();
//        taxCalculation.setCalculationStrategy(simpleCalculate);
//        double calculate = taxCalculation.calculate();
//        System.out.println(calculate);


        //-------->下面我们使用java8实现
        TaxCalculation taxCalculation = new TaxCalculation(20000, 5000);
        //使用 java8实现函数式接口
        taxCalculation.setCalculationStrategy((s,b)->{
            return s*0.02+b*0.04;
        });
        System.out.println(taxCalculation.calculate());


    }


}
