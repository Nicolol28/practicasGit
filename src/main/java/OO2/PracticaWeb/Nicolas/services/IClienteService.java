package OO2.PracticaWeb.Nicolas.services;

import java.util.List;

import OO2.PracticaWeb.Nicolas.entitys.Cliente;

public interface IClienteService {
	public List<Cliente> getAll();

	public Cliente findById(int id);

	public Cliente findByEmail(String email);

	public Cliente insertOrUpdate(Cliente cliente);
}
