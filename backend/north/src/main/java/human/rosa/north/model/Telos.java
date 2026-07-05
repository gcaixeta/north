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
