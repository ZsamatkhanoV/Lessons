package TransportAll;

/*В классе Транспорт есть поля:
        - Мощность(в лошадиных силах)
        - Максимальная скорость(км/ч)
        - Масса (кг)
        - Марка( например: Audi, BMW , Boeing, Airbus, Scania , МАЗ и т.д. )
В конечных классах (Легковой, Грузовой, Военный, Гражданский)
разработать метод описание который будет возвращать составленную строку с описанием всех характеристик объекта.
В строку включить ещё один параметр мощность в киловаттах (кВ) .
Расчёт мощности в киловаттах производится в отдельном методе: 1 л.с = 0.74 кВ*/

public abstract class Transport {
    double power;
    double watt = 0.74;
    double kWatt;
    int maxSpeed;
    int weight;
    String logo;
}



