public interface Transport extends Positioned {
    /**
     * Довезти человека до пункта назначения. Можно высадить на
     * близлежащей к пункту точке назначения
     *
     * @param person человек
     * @param destination пункт назначения
     */
    void takeTo(Person person, Position destination);
}