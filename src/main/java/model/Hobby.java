package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "HOBBIES")
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HOBBY_ID")
    private int id;

    @Column(name = "HOBBY_NAME")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "hobbies")
    private Set<User> users = new HashSet<>();

    @Override
    public String toString() {
        return "Hobby{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
