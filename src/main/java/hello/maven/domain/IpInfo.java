package hello.maven.domain;

import lombok.Data;

@Data
public class IpInfo {
	private int seq;
	private String ip;
	private String regexpIp;
	private String ynAllow;
}
