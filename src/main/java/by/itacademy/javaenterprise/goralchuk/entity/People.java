package by.itacademy.javaenterprise.goralchuk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "people")
public class People implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "people_id")
    private Long id;
    @Column(name = "people_name")
    private String name;
    @Column(name = "people_surname")
    private String surname;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @Override
    public String toString() {
        return "\n People{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", surname='" + surname + "'" +
                ", pet=" + pet.getAnimalName() + "/" + pet.getId() +
                '}';
    }
}
