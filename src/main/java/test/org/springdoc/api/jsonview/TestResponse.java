package test.org.springdoc.api.jsonview;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema
@JsonInclude(Include.NON_NULL)
@JsonView(View.Default.class)
public class TestResponse {

	@Schema(name = "status")
	@JsonView(View.Test.class)
	private boolean status;

	@Schema(name = "createdTime")
	private String createdTime;

	public TestResponse(boolean status, String createdTime) {
		this.status = status;
		this.createdTime = createdTime;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
}