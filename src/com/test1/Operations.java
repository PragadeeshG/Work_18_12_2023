package com.test1;

public class Operations {
	private long operationCode;
	private String operationName;
	private String operationDesc;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public Operations() {

	}

	public Operations(long operationCode, String operationName, String operationDesc, String remarks,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.operationCode = operationCode;
		this.operationName = operationName;
		this.operationDesc = operationDesc;
		this.remarks = remarks;
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

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getOperationDesc() {
		return operationDesc;
	}

	public void setOperationDesc(String operationDesc) {
		this.operationDesc = operationDesc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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