package TransportAll;

/*В классе Наземный добавляются поля:
        -Количество колёс
        - Расход топлива(л/100км)*/

public abstract class LandTransport extends Transport {
    int wheelsLight;
    int wheelsHeavy;
    int consumptionLight;
    int consumptionHeavy;
}
