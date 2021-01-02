package web.lab.model;

public class BoardVO {
	private int bbsno;
	private String userid;
	private String password;
	private String subject;
	private String content;
	private java.sql.Date writedate;
	private int masterid;
	private int readcount;
	private int replynumber;
	private int replystep;
	
	public int getBbsno() {
		return bbsno;
	}
	public void setBbsno(int bbsno) {
		this.bbsno = bbsno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public java.sql.Date getWritedate() {
		return writedate;
	}
	public void setWritedate(java.sql.Date writedate) {
		this.writedate = writedate;
	}
	public int getMasterid() {
		return masterid;
	}
	public void setMasterid(int masterid) {
		this.masterid = masterid;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public int getReplynumber() {
		return replynumber;
	}
	public void setReplynumber(int replynumber) {
		this.replynumber = replynumber;
	}
	public int getReplystep() {
		return replystep;
	}
	public void setReplystep(int replystep) {
		this.replystep = replystep;
	}
}
