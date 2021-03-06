package com.cse546.covid19tracker.newsAPIResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewsContent {
	@SerializedName("author")
	@Expose
	private String author;
	
	/**
	 * @param author
	 * @param title
	 * @param description
	 * @param url
	 * @param urlToImage
	 * @param content
	 */
	public NewsContent(String author, String title, String description, String url, String urlToImage, String content) {
		super();
		this.author = author;
		this.title = title;
		this.description = description;
		this.url = url;
		this.urlToImage = urlToImage;
		this.content = content;
	}

	@Override
	public String toString() {
		return "NewsContent [author=" + author + ", title=" + title + ", description=" + description + ", url=" + url
				+ ", urlToImage=" + urlToImage + ", content=" + content + "]";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlToImage() {
		return urlToImage;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@SerializedName("title")
	@Expose
	private String title;
	
	@SerializedName("description")
	@Expose
	private String description;
	
	@SerializedName("url")
	@Expose
	private String url;
	
	@SerializedName("urlToImage")
	@Expose
	private String urlToImage;
	
	@SerializedName("content")
	@Expose
	private String content;
}
