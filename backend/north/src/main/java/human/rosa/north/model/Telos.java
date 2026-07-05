package human.rosa.north.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "telos")
@NoArgsConstructor
@Getter
@Setter
public class Telos extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TimeHorizon timeHorizon;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Priority priority;
}
