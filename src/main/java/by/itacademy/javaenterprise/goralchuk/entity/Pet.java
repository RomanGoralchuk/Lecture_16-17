package by.itacademy.javaenterprise.goralchuk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pet")
public class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private Long id;
    @Column(name = "pet_name")
    private String animalName;
    @Column(name = "pet_type")
    private PetType petType;
    @Column(name = "pet_birthday")
    private Date birthday;
    @OneToOne(mappedBy = "pet", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private People master;

    @Override
    public String toString() {
        return "\n Pet{" +
                "id=" + id +
                ", animalName='" + animalName + "'" +
                ", petType=" + petType +
                ", birthday=" + birthday +
                ", master='" + master.getName() + "'" +
                '}';
    }
}
