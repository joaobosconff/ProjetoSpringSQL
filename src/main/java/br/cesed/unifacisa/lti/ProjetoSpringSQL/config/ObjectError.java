package br.cesed.unifacisa.lti.ProjetoSpringSQL.config;

public class ObjectError {
	
	private final String message;
	private final String field;
	private final Object parameter;
	
	public ObjectError(String message, String field, Object parameter) {
		this.message = message;
		this.field = field;
		this.parameter = parameter;
	}

}
