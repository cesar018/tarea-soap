package pe.edu.upeu.soap.ws.dao;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pe.edu.upeu.soap.ws.entity.Cliente;

@WebService
public interface ClienteDao {
	@WebMethod
	public ArrayList<Cliente> readCliente(String fechaini,String fechafin,int idcliente);
}
