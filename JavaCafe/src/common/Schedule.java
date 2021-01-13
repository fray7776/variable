package common;

public class Schedule {
	private String title;
	private String startData;
	private String endData;
	private String url;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStartData() {
		return startData;
	}
	public void setStartData(String startData) {
		this.startData = startData;
	}
	public String getEndData() {
		return endData;
	}
	public void setEndData(String endData) {
		this.endData = endData;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Schedule [title=" + title + ", startData=" + startData + ", endData=" + endData + ", url=" + url + "]";
	}
	
	
}
