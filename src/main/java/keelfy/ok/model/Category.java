package keelfy.ok.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keelfy
 */
@Entity
@Table
@Data
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String unlocalizedName;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Post> posts = new ArrayList<>();

}
