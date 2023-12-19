package com.test1;

public class NonAdminOperations {
	private long operationCode;
	private String operationRegion;
	private String operationLevel;
	private String remarks;
	private String contact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public NonAdminOperations() {

	}

	public NonAdminOperations(long operationCode, String operationRegion, String operationLevel, String remarks,
			String contact, String creationDate, String modifiedDate, String entityState) {
		super();
		this.operationCode = operationCode;
		this.operationRegion = operationRegion;
		this.operationLevel = operationLevel;
		this.remarks = remarks;
		this.contact = contact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getOperationCode() {
		return operationCode;
	}

	public void setOperationCode(long operationCode) {
		this.operationCode = operationCode;
	}

	public String getOperationRegion() {
		return operationRegion;
	}

	public void setOperationRegion(String operationRegion) {
		this.operationRegion = operationRegion;
	}

	public String getOperationLevel() {
		return operationLevel;
	}

	public void setOperationLevel(String operationLevel) {
		this.operationLevel = operationLevel;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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
