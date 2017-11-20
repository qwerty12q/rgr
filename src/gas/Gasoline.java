package gas;
import java.util.Scanner;

public class Gasoline {
	private double fuel,result;
	//создаем экземпляр класса Scanner
	Scanner input = new Scanner(System.in);
	
	public double Distance(double distance){
		//System.out.println("Введите расстояние в км.");
		//сохраняет в поле distance введенное значение из консоли
		//distance = input.nextDouble();
		//метод возвращает значение поля distance
		return distance;
}
		
	
	
	public double Consumption(double consumption){
		//System.out.println("Введите расход топлива на 100 км.");
		//сохраняет в поле consumption введенное значение из консоли
		//consumption = input.nextDouble();
		//метод возвращает значение поля consumption
		return consumption;
}
	
	public double Price(double price){
		//System.out.println("Введите цену за 1 литр топлива");
		//сохраняет в поле price введенное значение из консоли
		//price = input.nextDouble();
		//метод возвращает значение поля price
		return price;
}
	public double Fuel(double consumption,double distance){
		//считаем кол-во необходимого топлива
		fuel = consumption/100*distance;
		//метод возвращает значение поля fuel
		return fuel;
	}
	
	public double Result(double fuel,double price){
		//Math.round() - округление значения переменной до 2-х знаков после запятой
		result = Math.round(fuel) * Math.round(price);
		//метод возвращает значение поля result
		System.out.println("Понадобится "+fuel+" литров топлива на сумму "+result+" рублей");
		return result;
	}
}
