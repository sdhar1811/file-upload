package com.fileupload.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class File {
	String fileName="";
	String size="";
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
	Date dateModified;
	
	public File(String fileName,String size, Date dateModified) {
		this.fileName = fileName;
		this.size = size;
		this.dateModified = dateModified;				
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	
	public String toString() {
		return "File Name:"+this.fileName+" File Size:"+this.size+" Date Modified:"+this.dateModified;
	}
	
	

}
