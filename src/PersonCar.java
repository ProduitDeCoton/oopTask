/**
 * Легковой автомобиль
 */
public class PersonCar implements Transport {
    private Position position;

    /**
     * Текущее местоположение
     */
    public Position getPosition() {
        return position;
    }
    /**
     * Установить текущее местоположение
     *
     * @param position
     */
    public void setPosition(Position position) {

    }
    /**
     * Довезти человека до пункта назначения. Необязательно
     * довозить человека прямо к пункту, можно высадить в
     * удобной для транспорта точке, близлежащей к пункту
     * назначения.
     *
     * @param person      человек
     * @param destination пункт назначения
     */
    public void takeTo(Person person, Position destination) {

    }
}