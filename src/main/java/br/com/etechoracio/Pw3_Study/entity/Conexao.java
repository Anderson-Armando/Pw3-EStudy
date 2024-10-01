package br.com.etechoracio.Pw3_Study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table (name = "TBL_CONEXAO")
public class Conexao {
    @Id
    @Column (name = "ID_CONEXAO")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_conexao;

    @Column (name = "DT_CRIACAO")
    private LocalDateTime dt_criacao;

    @ManyToOne
    @JoinColumn (name = "ID_MONITOR")
    private Monitor id_monitor;
}
