package gas;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GasolineTest {
	//создаем объект gas
	Gasoline gas = new Gasoline();

	@Test
	public void testConsumption() {
		//передаем в метод Consumption аргумент,затем сохраняем результат в поле s
		double s = gas.Consumption(15);
		//сравниваем значение 15 с результатом метода Consumption
		Assert.assertNotEquals(s, 16.0, 0);
		//System.out.println("Значение поля s="+s + " не равно " + 16.0);
	}
	
	@Test
	public void testDistance(){
		//передаем в метод Distance аргумент,затем сохраняем результат в поле w
		double w = gas.Distance(100);
		//проверка значение на Null
		assertNotNull(w);
		//System.out.println("Значение поля w="+w+" не является " + "Null");
	}
	
	@Test
	public void testPrice(){
		//передаем в метод Price аргумент,затем сохраняем результат в поле w
		double p = gas.Price(36.33);
		//проверяем,что аргументы не одинаковы
		assertNotSame(p,36.33);
		System.out.println("Значение поля p="+p+" и значение 36.33 ссылаются на разные объекты");
	}
	

	@Test
	public void testResult() {
		//передаем в метод Result два аргумента,затем сохраняем результат в поле res
		double res = gas.Result(50,36);
		//сравниваем значение 1800 с результатом метода Result
		assertEquals(1800.0, res, 0);
		//System.out.println("Значение поля "+res+" равно 1800");
	}
}
