package Game;

public class NotRegistredException extends RuntimeException {
    public NotRegistredException (String playerName) {
        super("Игрок с именем" + playerName + "не найден");
    }
}
