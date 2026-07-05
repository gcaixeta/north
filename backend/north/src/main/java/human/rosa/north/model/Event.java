package human.rosa.north.model;

import com.github.f4b6a3.uuid.UuidCreator;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "event")
public class Event extends BaseEntity{

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private Instant timestamp;

    @PrePersist
    public void prePersist() {
        if(timestamp == null) {
            timestamp = Instant.now();
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
