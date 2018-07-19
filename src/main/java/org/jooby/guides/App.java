package org.jooby.guides;

import org.jooby.Jooby;

import de.coregames.licensing.License;
import de.coregames.licensing.LicenseController;
import de.coregames.licensing.LicenseFactory;

/**
 * @author Hauke Walden
 */
public final class App extends Jooby {

	public App() {
		License createLicense = LicenseFactory.createLicense("Hauke.Walden@googlemail.com", 120);
		System.out.println(createLicense.licenseID);
		use(LicenseController.class);
		// use(new ApiTool().swagger("/swagger").raml("/raml"));
	}

	public static void main(final String[] args) {
		run(App::new, args);
	}

}
