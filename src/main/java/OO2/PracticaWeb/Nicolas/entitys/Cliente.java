package OO2.PracticaWeb.Nicolas.entitys;

import jakarta.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
public class Cliente {
	
	 private String email;
	
	private String contrasena;
	
	
	public Cliente(String email, String contrasena) {
		super();
		this.email = email;
		this.contrasena = contrasena;
		
	}

	

}
