package springDSWarnLog;

public class CsvData implements Comparable<CsvData> {
	private String oldId;
	private String oldFileName;
	private String newId;
	private String newFileName;
	private String order;

	public CsvData() {
		this("", "", "", "", "");
	}

	public CsvData(String oldId, String oldFileName, String newId, String newFileName, String order) {
		this.oldId = oldId;
		this.oldFileName = oldFileName;
		this.newId = newId;
		this.newFileName = newFileName;
		this.order = order;
	}

	public int compareTo(CsvData csvData) {
		if (this.order == null) {
			return -1;
		}
		if (csvData.order == null) {
			return 1;
		}
		return this.order.compareTo(csvData.getOrder());
	}

	public String getOldId() {
		return oldId;
	}

	public void setOldId(String oldId) {
		this.oldId = oldId;
	}

	public String getOldFileName() {
		return oldFileName;
	}

	public void setOldFileName(String oldFileName) {
		this.oldFileName = oldFileName;
	}

	public String getNewId() {
		return newId;
	}

	public void setNewId(String newId) {
		this.newId = newId;
	}

	public String getNewFileName() {
		return newFileName;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}
