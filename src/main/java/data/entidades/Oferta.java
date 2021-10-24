package data.entidades;

public class Oferta {
    private final String topic;
    private final String season;

    public Oferta(String topic, String season) {
        this.topic = topic;
        this.season = season;
    }

    public String getTopic() {
        return topic;
    }

    public String getSeason() {
        return season;
    }
}
