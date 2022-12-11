/**
 * Пассажирский транспорт
 */
public interface PersonTransport extends Transport {

    /**
     * Доставить человека до пункта назначения
     */
    public void takeTo(Person person, Position destination);
}