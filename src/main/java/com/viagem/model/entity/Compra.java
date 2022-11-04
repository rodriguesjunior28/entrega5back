package com.viagem.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Convert;

import com.viagem.model.entity.Compra;
import com.viagem.model.enums.StatusCompra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="compra")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Compra {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	
	private Integer mes;
	
	@Column
	private Integer ano;
	
	@JoinColumn(name = "id_usuario")
	@ManyToOne
	private Usuario usuario;
	
	@Column
	private String descricao;
	
	@Column
	private BigDecimal valor;
	
	@Column(name = "data_cadastro")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate dataCadastro;
	
	
	@Column(name = "stats")
	@Enumerated(value = EnumType.STRING)
	private StatusCompra status;
		
}
