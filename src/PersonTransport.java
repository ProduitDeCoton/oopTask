/**
 * Пассажирский транспорт
 */
public interface PersonTransport extends Transport {

    /**
     * Доставить человека к точке назначения
     */
    public void takeTo(Person person, Position destination);
}