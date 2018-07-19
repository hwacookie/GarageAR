package de.coregames.licensing;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

public class LicenseFactory {
	private static HashMap<UUID, License> licenses = new HashMap<>();

	public static License getLicenseByID(UUID aLicenseID) {
		return licenses.get(aLicenseID);
	}

	public static License createLicense(String aEmail, int aNumberOfDays) {
		License license = new License();
		license.licenseID = new UUID(new Random().nextInt(), new Random().nextInt());
		license.eMail = aEmail;
		LocalDate localDate = LocalDateTime.now().plusDays(aNumberOfDays).toLocalDate();
		Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.of("GMT")));
		license.validUntil = Date.from(instant);
		licenses.put(license.licenseID, license);
		return license;
	}
}
