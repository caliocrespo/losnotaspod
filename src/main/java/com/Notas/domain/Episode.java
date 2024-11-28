package com.Notas.domain;
import java.util.ArrayList;
import java.util.List;


public class Episode {
	private Long id;
	private String title;
	private int season;
	private int episode;
	private String description;
	private List<String> tags;
	private String imageURL;
	private String ytURL;
	private List<Comment> comments;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public int getSeason() {
		return season;
	}
	public int getEpisode() {
		return episode;
	}
	public String getDescription() {
		return description;
	}
	public List<String> getTags() {
		return tags;
	}
	public String getImageURL() {
		return imageURL;
	}
	public String getYtURL() {
		return ytURL;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	public void setEpisode(int episode) {
		this.episode = episode;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public void setYtURL(String ytURL) {
		this.ytURL = ytURL;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	//Adding methods
	
	public void addTag(String tag) {
		if(this.tags == null) {
			tags = new ArrayList<>();
		}
		
		this.tags.add(tag);
	}
}
