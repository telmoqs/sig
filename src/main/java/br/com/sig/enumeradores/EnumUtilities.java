package br.com.sig.enumeradores;

import java.lang.reflect.Field;

public class EnumUtilities {
	public static void setEnumName(Enum<?> enumerador, String val) {
		try {
			Field campoName = Enum.class.getDeclaredField("name");
			campoName.setAccessible(true);
			campoName.set(enumerador, val);
			campoName.setAccessible(false);
		} catch (Exception e) {
			throw new RuntimeException(
					"Houve algum erro durante a criação do enum " + enumerador + " com valor = " + val);
		}
	}
}
