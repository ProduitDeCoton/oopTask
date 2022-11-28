/**
 * Пассажирский транспорт
 */
public interface PersonTransport extends Transport {

    /**
     * Доставить человека к точке назначения
     */
    public void takeTo(Person passenger, Position destination);
}