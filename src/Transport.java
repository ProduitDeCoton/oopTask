/**
 * Транспорт.
 */
public interface Transport extends Positioned {
    void takeTo(Person person, Position destination);
}