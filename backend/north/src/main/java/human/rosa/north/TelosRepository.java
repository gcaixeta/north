package human.rosa.north;

import human.rosa.north.model.Telos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TelosRepository extends JpaRepository<Telos, UUID> {
}
