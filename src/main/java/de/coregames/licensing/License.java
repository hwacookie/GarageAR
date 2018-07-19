package de.coregames.licensing;

import java.util.Date;
import java.util.UUID;

public class License {

	public UUID lice nseID;
	public String eMail;
	public Date validUntil;

	public License(UUID licenseID, String eMail, Date validUntil) {
		super();
		this.licenseID = licenseID;
		this.eMail = eMail;
		this.validUntil = validUntil;
	}

	public License() {
	}

}
