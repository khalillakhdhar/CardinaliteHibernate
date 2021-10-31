package com.correction.model.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
public class Post extends AuditModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
long id;
@NotNull
@Size(max = 100)
@Column(unique = true)
private String title;
@Column(nullable = false,length = 250)
private String description;
@NonNull
@Lob
private String content;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
@Override
public String toString() {
	return "Post [id=" + id + ", title=" + title + ", description=" + description + ", content=" + content + "]";
}




}
