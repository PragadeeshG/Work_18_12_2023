package com.test1;

public class AdminOperations {
	private long operationCode;
	private String routineOperation;
	private String dailyRemarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AdminOperations() {

	}

	public AdminOperations(long operationCode, String routineOperation, String dailyRemarks, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.operationCode = operationCode;
		this.routineOperation = routineOperation;
		this.dailyRemarks = dailyRemarks;
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

	public String getRoutineOperation() {
		return routineOperation;
	}

	public void setRoutineOperation(String routineOperation) {
		this.routineOperation = routineOperation;
	}

	public String getDailyRemarks() {
		return dailyRemarks;
	}

	public void setDailyRemarks(String dailyRemarks) {
		this.dailyRemarks = dailyRemarks;
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
