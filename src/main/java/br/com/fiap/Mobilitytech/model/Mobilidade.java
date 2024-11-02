package br.com.fiap.Mobilitytech.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table (name = "tb_mobilidade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Mobilidade {


    @Id

    @GeneratedValue(

            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_MOBILIDADES"
    )
    @SequenceGenerator(

            name = "SEQ_MOBILIDADES",
            allocationSize = 1
    )

    private Long  mobilidadeId;
    private String partida;
    private String destino;
    private String  status;

    @Column( name =
            "release_date")
    public LocalDate releaseDate;
}
