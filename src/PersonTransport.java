/**
 * Пассажирский транспорт
 */
public interface PersonTransport extends Transport {

    /**
     * Доставить человека до пункта назначения
     */
    void takeTo(Person person, Position destination);
}