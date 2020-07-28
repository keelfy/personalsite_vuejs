package keelfy.ok.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author keelfy
 */
@Entity
@Table
@Data
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String unlocalizedName;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
