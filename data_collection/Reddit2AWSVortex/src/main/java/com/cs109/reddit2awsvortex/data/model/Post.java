package com.cs109.reddit2awsvortex.data.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Post entity representing data collected from Reddit posts JSON via 
 * REST API. Class is annotated with DynamoDB Mapper flags for persistence to
 * AWS DynamoDB.
 * @author Dario
 */
@DynamoDBTable(tableName="post") 
public class Post {
    
    @DynamoDBHashKey(attributeName="id")
    private String id;
    private String title;
    private String subreddit_title;
    private String subreddit_id;
    private Boolean self_post;
    private Integer num_comments;
    private Integer score;
    private String text_content;
    private Integer gilded;
    private Float published_date;
    private Boolean edited;
    private Boolean mature;
    private String user_id;
    private String url;
    private String permalink;
    
    public Post(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubreddit_title() {
        return subreddit_title;
    }

    public void setSubreddit_title(String subreddit_title) {
        this.subreddit_title = subreddit_title;
    }

    public String getSubreddit_id() {
        return subreddit_id;
    }

    public void setSubreddit_id(String subreddit_id) {
        this.subreddit_id = subreddit_id;
    }

    public Boolean getSelf_post() {
        return self_post;
    }

    public void setSelf_post(Boolean self_post) {
        this.self_post = self_post;
    }

    public Integer getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(Integer num_comments) {
        this.num_comments = num_comments;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getText_content() {
        return text_content;
    }

    public void setText_content(String text_content) {
        this.text_content = text_content;
    }

    public Integer getGilded() {
        return gilded;
    }

    public void setGilded(Integer gilded) {
        this.gilded = gilded;
    }

    public Float getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Float published_date) {
        this.published_date = published_date;
    }

    public Boolean getEdited() {
        return edited;
    }

    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public Boolean getMature() {
        return mature;
    }

    public void setMature(Boolean mature) {
        this.mature = mature;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String toCSV() {
        return id + ", title=" + title + ", subreddit_title=" + subreddit_title + ", subreddit_id=" + subreddit_id + ", self_post=" + self_post + ", num_comments=" + num_comments + ", score=" + score + ", text_content=" + text_content + ", gilded=" + gilded + ", published_date=" + published_date + ", edited=" + edited + ", mature=" + mature + ", user_id=" + user_id + ", url=" + url + ", permalink=" + permalink + '}';
    }  

    @Override
    public String toString() {
        return "Post{" + "id=" + id + ", title=" + title + ", subreddit_title=" + subreddit_title + ", subreddit_id=" + subreddit_id + ", self_post=" + self_post + ", num_comments=" + num_comments + ", score=" + score + ", text_content=" + text_content + ", gilded=" + gilded + ", published_date=" + published_date + ", edited=" + edited + ", mature=" + mature + ", user_id=" + user_id + ", url=" + url + ", permalink=" + permalink + '}';
    }
}