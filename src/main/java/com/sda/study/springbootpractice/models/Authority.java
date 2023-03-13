import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author Priit Enno
 * @ Date 13.03.2023
 */


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Authority extends Auditable<String> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
