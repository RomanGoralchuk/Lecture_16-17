package by.itacademy.javaenterprise.goralchuk.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "people")
public class People implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "people_id")
    private Long id;
    private String name;
    private String surname;
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @Override
    public String toString() {
        return "\n People{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", surname='" + surname + "'" +
                ", pet=" + pet.getName() + "/" + pet.getId() +
                '}';
    }
}
