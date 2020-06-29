package global;

public class Empresa {
	String nomeEmpresa;
	Integer idEmpresa;
	String cnpjEmpresa;

	public Empresa() {
		
		this.nomeEmpresa = nomeEmpresa;
		this.idEmpresa = idEmpresa;
		this.cnpjEmpresa = cnpjEmpresa;
	
	}
	
	//setters:	
	public void setnomeEmpresa(String ne) {
		nomeEmpresa = ne;
	}
	public void setidEmpresa (Integer ie) {
		idEmpresa = ie;
	}	
	public void cnpjEmpresa (String ce) {
		cnpjEmpresa = ce;
	}
	
	//getters:	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	
	public Integer getIdEmpresa() {
		return idEmpresa;		
	}
	
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}
	//metodos:
	void trocarNomeEmpresa(String novoNomeEmpresa) {
		nomeEmpresa = novoNomeEmpresa;
		System.out.println(" NOME da empresa alterado com sucesso!!! ");
		System.out.println(" NOME: " +nomeEmpresa+" CNPJ: " +cnpjEmpresa);
		
	}
	
	void trocarCnpjEmpresa(String novoCnpjEmpresa) {
		cnpjEmpresa = novoCnpjEmpresa;
		System.out.println(" CNPJ da empresa alterado com sucesso!!! ");
		System.out.println(" NOME: " +nomeEmpresa+ " CNPJ: " +cnpjEmpresa);		
	}
	
	
	
	
	
	
	
	
	

	
}
