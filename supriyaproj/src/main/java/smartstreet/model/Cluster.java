package smartstreet.model;

import java.util.Date;
/**
 * Cluster Model class
 * @author priyankasinghal
 *
 */
public class Cluster {
	private int id;
	private String clusterName ;
	private String clusterDesc ;
	private int clusterStatus  ;
	private String clusterLatitude ;
	private String clusterLongitude ;
	private String clusterAddress ;
	private String clusterCity ;
	private String clusterState ;
	private String clusterCountry ;
	private String clusterZip ;
	private String installedBy ;
	private Date installationDate  ;
	private String lastMaintainedBy ;
	private Date lastMaintainedDate ;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public String getClusterDesc() {
		return clusterDesc;
	}
	public void setClusterDesc(String clusterDesc) {
		this.clusterDesc = clusterDesc;
	}
	public int getClusterStatus() {
		return clusterStatus;
	}
	public void setClusterStatus(int clusterStatus) {
		this.clusterStatus = clusterStatus;
	}
	public String getClusterLatitude() {
		return clusterLatitude;
	}
	public void setClusterLatitude(String clusterLatitude) {
		this.clusterLatitude = clusterLatitude;
	}
	public String getClusterLongitude() {
		return clusterLongitude;
	}
	public void setClusterLongitude(String clusterLongitude) {
		this.clusterLongitude = clusterLongitude;
	}
	public String getClusterAddress() {
		return clusterAddress;
	}
	public void setClusterAddress(String clusterAddress) {
		this.clusterAddress = clusterAddress;
	}
	public String getClusterCity() {
		return clusterCity;
	}
	public void setClusterCity(String clusterCity) {
		this.clusterCity = clusterCity;
	}
	public String getClusterState() {
		return clusterState;
	}
	public void setClusterState(String clusterState) {
		this.clusterState = clusterState;
	}
	public String getClusterCountry() {
		return clusterCountry;
	}
	public void setClusterCountry(String clusterCountry) {
		this.clusterCountry = clusterCountry;
	}
	public String getClusterZip() {
		return clusterZip;
	}
	public void setClusterZip(String clusterZip) {
		this.clusterZip = clusterZip;
	}
	public String getInstalledBy() {
		return installedBy;
	}
	public void setInstalledBy(String installedBy) {
		this.installedBy = installedBy;
	}
	public Date getInstallationDate() {
		return installationDate;
	}
	public void setInstallationDate(Date installationDate) {
		this.installationDate = installationDate;
	}
	public String getLastMaintainedBy() {
		return lastMaintainedBy;
	}
	public void setLastMaintainedBy(String lastMaintainedBy) {
		this.lastMaintainedBy = lastMaintainedBy;
	}
	public Date getLastMaintainedDate() {
		return lastMaintainedDate;
	}
	public void setLastMaintainedDate(Date lastMaintainedDate) {
		this.lastMaintainedDate = lastMaintainedDate;
	}
	
	
}
