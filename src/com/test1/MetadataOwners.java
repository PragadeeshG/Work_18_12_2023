package com.test1;

public class MetadataOwners {
	private long metadataId;
	private String ownerPSID;
	private String ownerName;
	private String ownerEmail;
	private Integer actionOrder;
	private String actionRole;
	private String dlName;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MetadataOwners() {

	}

	public MetadataOwners(long metadataId, String ownerPSID, String ownerName, String ownerEmail, Integer actionOrder,
			String actionRole, String dlName, boolean isActive, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.metadataId = metadataId;
		this.ownerPSID = ownerPSID;
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
		this.actionOrder = actionOrder;
		this.actionRole = actionRole;
		this.dlName = dlName;
		this.isActive = isActive;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getMetadataId() {
		return metadataId;
	}

	public void setMetadataId(long metadataId) {
		this.metadataId = metadataId;
	}

	public String getOwnerPSID() {
		return ownerPSID;
	}

	public void setOwnerPSID(String ownerPSID) {
		this.ownerPSID = ownerPSID;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public Integer getActionOrder() {
		return actionOrder;
	}

	public void setActionOrder(Integer actionOrder) {
		this.actionOrder = actionOrder;
	}

	public String getActionRole() {
		return actionRole;
	}

	public void setActionRole(String actionRole) {
		this.actionRole = actionRole;
	}

	public String getDlName() {
		return dlName;
	}

	public void setDlName(String dlName) {
		this.dlName = dlName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
