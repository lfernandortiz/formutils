package com.luisfernandoortiz.commons;

/**
 * @author Luis Fernando Ortiz Vera | @lfernandortiz
 *         <p>
 *         La clase <code>StringUtil</code> contiene metodos
 *         <code>static</code> para manipular cadenas que generalmente
 *         son campos de formularios, los cuales requieren ser validados
 *         antes de ser persistidos en una base de datos. Tambien
 *         contiene metodos para validar cadenas.
 *         </p>
 */
public class StringUtil {
	
	
	
	/**
	 * El metodo <tt>validateEmail </tt> retorna true si la direccion de correo 
	 * electronico es una direccion valida. Este metodo usa expresiones regulares
	 * (regex) para hacer el analisis.
	 * 
	 * http://docs.oracle.com/javase/tutorial/essential/regex/intro.html
	 * 
	 * @param mail
	 * @return
	 */
	public static boolean validateEmail(String mail){
		
		if (!mail
				.matches("\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")) {
			return false;
		} else {
			return true;
		}		
		
	}
	
}
