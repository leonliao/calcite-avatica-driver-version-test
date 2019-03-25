package org.apache.calcite.avatica.test;

import org.apache.calcite.avatica.DriverVersion;
import org.apache.calcite.avatica.remote.Driver;

/**
 * This class demonstrates the native memory leak caused by DriverVersion.load,
 * which has not closed the opened InputStream.
 * 
 *
 */
public class DriverVersionTest {

	public static void main(String[] args) throws Exception {
		while (true) {
			DriverVersion version = DriverVersion.load(Driver.class, "org-apache-kylin-jdbc.properties",
					"Kylin JDBC Driver", "unknown version", "Kylin", "unknown version");
			System.out.println(version);
			Thread.sleep(100l);
		}

	}

}
