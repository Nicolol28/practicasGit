package OO2.PracticaWeb.Nicolas.services.implementation;

import OO2.PracticaWeb.Nicolas.services.IClienteService;
import OO2.PracticaWeb.Nicolas.repositories.IClienteRepository;
import OO2.PracticaWeb.Nicolas.entitys.Cliente;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("clienteService")
public class ClienteService implements IClienteService{

	@Autowired
	@Qualifier("clienteRepository")
	private IClienteRepository clienteRepository;

	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<Cliente> getAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente insertOrUpdate(Cliente cliente) {
		Cliente clienteNew = clienteRepository.save(cliente);
		return clienteNew;
	}
	
}
