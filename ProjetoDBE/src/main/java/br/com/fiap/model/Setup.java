package br.com.fiap.model;

public class Setup {
	private String name;
	private String email;
	private String date;
	private String password5;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPassword5() {
		return password5;
	}

	public void setPassword5(String password5) {
		this.password5 = password5;
	}

	@Override
	public String toString() {
		return "Setup [name=" + name + ", email=" + email + ", date=" + date + ", password5=" + password5 + "]";
	}

	
}
