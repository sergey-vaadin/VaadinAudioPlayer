package com.vaadin.addon.audio.shared;

public class SharedEffectProperty {

	public enum PropertyName {
		// Filter Effect props
		FilterType,
		Q,
		Frequency,
		Gain
	}
	
	private PropertyName property;
	private String value;
	
	public SharedEffectProperty() {
		
	}
	
	public SharedEffectProperty(PropertyName property, String value) {
		this.property = property;
		this.value = value;
	}
	
	public PropertyName getProperty() {
		return property;
	}
	
	public void setProperty(PropertyName property) {
		this.property = property;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
