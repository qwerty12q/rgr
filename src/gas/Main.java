package gas;

public class Main {

	public static void main(String[] args) {
		//создаем экземпляр(объект) класса Gasoline
		Gasoline gas = new Gasoline();
		//вызываем методы Distance,Consumption,Price,Result объекта gas
		gas.Price(36.38);
		gas.Fuel(13,150);
		gas.Result(gas.Fuel(13, 150),33.38);
		
	}

}
