package pe.edu.upeu.soap.ws.publico;
import javax.xml.ws.Endpoint;

import pe.edu.upeu.soap.ws.daoImp.ClienteDaoImp;


public class ClientePublic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:3030/soap/cliente", new ClienteDaoImp());
		System.out.println("Ejecutando......!");
	}
}
