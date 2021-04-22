package com.everis.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Proyecto LOGBACK
 * 
 * @author Alexei Viadero
 *
 */
public class App {

	/** LOGGER */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		LOGGER.info("Inicio ARRAY");

		/** Array 2D */
		int[][] matriz = new int[100][100];

		/** Iteraciones bucle */
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				LOGGER.debug("Fila: {}", i);
				LOGGER.debug("Columna: {}", j);

			}

		}
		LOGGER.info("Final ARRAY");
	}
}
