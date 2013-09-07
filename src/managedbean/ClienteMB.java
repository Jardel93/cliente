package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cliente.Cliente;

@ManagedBean
@SessionScoped
public class ClienteMB {
	
	private Cliente cliente = new Cliente();
		
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void salvar(){
		this.clientes.add(cliente);
		this.cliente = new Cliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}
