package OO2.PracticaWeb.Nicolas.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import OO2.PracticaWeb.Nicolas.entitys.Cliente;


@Repository("clienteRepository")
public interface IClienteRepository extends JpaRepository<Cliente, Serializable> {
	public abstract Cliente findById(int id);

	public abstract Cliente findByEmail(String email);
}
