package com.Notas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Notas.domain.Episode;

@Service
public class EpisodeService {

	private final List<Episode> episodes = new ArrayList<>();
	
	public List<Episode> getAllEpisodes(){
		return episodes;
	}
	
	public Episode getEpisodeById(Long id) {
		return episodes.stream().
				filter(episode -> episode.getId().equals(id))
				.findFirst()
				.orElseThrow(() -> new RuntimeException());
	}
	
	public Episode create (Episode episode) {
		episodes.add(episode);
		return episode;
	}
	
	
	//Hay que ver lo de los tags
	public Episode create (String title, int season, int ep, String imageURL, String videoURL, String descripcion) {
		Episode episode = new Episode();
		episode.setId(null);
		episode.setTitle(title);
		episode.setDescription(descripcion);
		episode.setSeason(season);
		episode.setEpisode(ep);
		episode.setImageURL(imageURL);
		episode.setYtURL(videoURL);
		
		episodes.add(episode);
		
		return episode;
		
	}
	
	
	public void remove (Long id) {
		episodes.removeIf(episode -> episode.getId().equals(id));
	}
}
