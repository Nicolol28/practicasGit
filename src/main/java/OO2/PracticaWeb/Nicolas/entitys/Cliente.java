package OO2.PracticaWeb.Nicolas.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;

@Entity
@NoArgsConstructor
@Getter
@Setter

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String email;
	
	
	private String contrasena;
	
	
	public Cliente(String email, String contrasena) {
		super();
		this.email = email;
		this.contrasena = contrasena;
		
	}

	

}
