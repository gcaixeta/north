package human.rosa.north.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "event")
@Getter
@Setter
@NoArgsConstructor
public class Event extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "telos_id")
    private Telos telos;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private Instant occurredAt;

    @PrePersist
    public void prePersist() {
        if(occurredAt == null) {
            occurredAt = Instant.now();
        }
    }
}
