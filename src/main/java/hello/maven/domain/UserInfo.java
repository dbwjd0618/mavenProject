package hello.maven.domain;

import lombok.Data;

@Data
public class UserInfo {
	private String id;
	private String password;
	private String name;
	private String address;
	private String memo;
}
