package lab2.ex2;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Product {

	private String productId;

	private String name;

	private String description;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
