public class Tram implements Transport{
    private Position position;
    /**
     * Текущее местоположение
     */
    @Override
    public Position getPosition() {
        return position;
    }

    /**
     * Установить текущее местоположение
     */
    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * Довезти человека до пункта назначения. Можно высадить на
     * близлежащей к пункту точке назначения
     *
     * @param person человек
     * @param destination пункт назначения
     */
    public void takeTo(Person person, Position destination) {

    }
}