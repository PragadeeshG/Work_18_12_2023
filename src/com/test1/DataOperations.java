package com.test1;

public class DataOperations {
	private long operationCode;
	private String modularData;
	private String dataReqion;
	private String operationTeam;
	private String contact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataOperations() {

	}

	public DataOperations(long operationCode, String modularData, String dataReqion, String operationTeam,
			String contact, String creationDate, String modifiedDate, String entityState) {
		super();
		this.operationCode = operationCode;
		this.modularData = modularData;
		this.dataReqion = dataReqion;
		this.operationTeam = operationTeam;
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

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
	}

	public String getDataReqion() {
		return dataReqion;
	}

	public void setDataReqion(String dataReqion) {
		this.dataReqion = dataReqion;
	}

	public String getOperationTeam() {
		return operationTeam;
	}

	public void setOperationTeam(String operationTeam) {
		this.operationTeam = operationTeam;
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
