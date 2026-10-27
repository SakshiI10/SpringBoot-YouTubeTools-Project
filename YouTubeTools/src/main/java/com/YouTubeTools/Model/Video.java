package com.YouTubeTools.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
	
//	id: Unique identifier of the video
    private String id;
//	channelTitle: Name of the YouTube channel	
    private String channelTitle;
//	title: Title of the video	
    private String title;
//	tags: Collection of tags associated with the video
    private List<String> tags;
}