package by.itacademy.javaenterprise.goralchuk.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "pet")
public class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private Long id;
    private String name;
    private PetType type;
    @Temporal(TemporalType.DATE)
    private Date birthday;
/*    @OneToOne(mappedBy = "pet", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id")
    private People master;*/

    public Pet(String animalName, PetType petType, Date birthday) {
        this.name = animalName;
        this.type = petType;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\n Pet{" +
                "id=" + id +
                ", PetName='" + name + "'" +
                ", PetType=" + type.getCode() +
                ", PetBirthday=" + birthday +
               /* ", master='" + master.getName() + "'" +*/
                '}';
    }
}
