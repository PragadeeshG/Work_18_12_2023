package com.test1;

public class MetadataOperations {
	private long operationCode;
	private long systemCode;
	private long metadataCode;
	private String xReference;
	private String jsonData;
	private String metadataName;
	private String workflowId;
	private String remarks;
	private String description;
	private long availability;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MetadataOperations() {

	}

	public MetadataOperations(long operationCode, long systemCode, long metadataCode, String xReference,
			String jsonData, String metadataName, String workflowId, String remarks, String description,
			long availability, boolean isActive, String creationDate, String modifiedDate, String entityState) {
		super();
		this.operationCode = operationCode;
		this.systemCode = systemCode;
		this.metadataCode = metadataCode;
		this.xReference = xReference;
		this.jsonData = jsonData;
		this.metadataName = metadataName;
		this.workflowId = workflowId;
		this.remarks = remarks;
		this.description = description;
		this.availability = availability;
		this.isActive = isActive;
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

	public long getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(long systemCode) {
		this.systemCode = systemCode;
	}

	public long getMetadataCode() {
		return metadataCode;
	}

	public void setMetadataCode(long metadataCode) {
		this.metadataCode = metadataCode;
	}

	public String getxReference() {
		return xReference;
	}

	public void setxReference(String xReference) {
		this.xReference = xReference;
	}

	public String getJsonData() {
		return jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}

	public String getMetadataName() {
		return metadataName;
	}

	public void setMetadataName(String metadataName) {
		this.metadataName = metadataName;
	}

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getAvailability() {
		return availability;
	}

	public void setAvailability(long availability) {
		this.availability = availability;
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
