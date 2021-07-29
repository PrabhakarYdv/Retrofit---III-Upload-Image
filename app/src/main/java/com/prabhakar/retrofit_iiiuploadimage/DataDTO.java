package com.prabhakar.retrofit_iiiuploadimage;

import java.util.List;
import java.io.Serializable;

public class DataDTO implements Serializable {
	private String id;
	private String title;
	private Object description;
	private int datetime;
	private String type;
	private boolean animated;
	private int width;
	private int height;
	private int size;
	private int views;
	private int bandwidth;
	private Object vote;
	private boolean favorite;
	private Object nsfw;
	private Object section;
	private Object accountUrl;
	private int accountId;
	private boolean isAd;
	private boolean inMostViral;
	private boolean hasSound;
	private List<Object> tags;
	private int adType;
	private String adUrl;
	private String edited;
	private boolean inGallery;
	private String deletehash;
	private String name;
	private String link;

	public String getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public Object getDescription(){
		return description;
	}

	public int getDatetime(){
		return datetime;
	}

	public String getType(){
		return type;
	}

	public boolean isAnimated(){
		return animated;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public int getSize(){
		return size;
	}

	public int getViews(){
		return views;
	}

	public int getBandwidth(){
		return bandwidth;
	}

	public Object getVote(){
		return vote;
	}

	public boolean isFavorite(){
		return favorite;
	}

	public Object getNsfw(){
		return nsfw;
	}

	public Object getSection(){
		return section;
	}

	public Object getAccountUrl(){
		return accountUrl;
	}

	public int getAccountId(){
		return accountId;
	}

	public boolean isIsAd(){
		return isAd;
	}

	public boolean isInMostViral(){
		return inMostViral;
	}

	public boolean isHasSound(){
		return hasSound;
	}

	public List<Object> getTags(){
		return tags;
	}

	public int getAdType(){
		return adType;
	}

	public String getAdUrl(){
		return adUrl;
	}

	public String getEdited(){
		return edited;
	}

	public boolean isInGallery(){
		return inGallery;
	}

	public String getDeletehash(){
		return deletehash;
	}

	public String getName(){
		return name;
	}

	public String getLink(){
		return link;
	}
}