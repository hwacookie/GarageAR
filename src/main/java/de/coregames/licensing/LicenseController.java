package de.coregames.licensing;

import java.util.UUID;

import org.jooby.mvc.GET;
import org.jooby.mvc.POST;
import org.jooby.mvc.Path;
import org.jooby.mvc.Produces;

public class LicenseController {
	@Produces("application/json")
	@Path("/getLicense")
	@GET

	public License validUntil(String aLicenseIDString) {
		UUID uuid = UUID.fromString(aLicenseIDString);
		License license = LicenseFactory.getLicenseByID(uuid);
		if (license != null) {
			return license;
		} else {
			throw new org.jooby.Err(400, "License not found");
		}
	}

	@Path("/registerLicense")
	@POST
	public License registerLicense(String aEmailAddress) {
		License license = LicenseFactory.createLicense(aEmailAddress, 30);
		if (license != null) {
			return license;
		} else {
			throw new org.jooby.Err(400, "License could not be created");
		}
	}
}
