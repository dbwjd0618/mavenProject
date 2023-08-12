package hello.maven.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserInfo {
	private String id;
	private String password;
	private String name;
	private String address;
	private String memo;
}
