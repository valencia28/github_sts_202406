package db_jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@Configuration
@EnableEncryptableProperties
public class JasyptDBConfig {	
	@Autowired
	Environment environment;
	
	@Bean("jasyptEncryptor")	 // 메서드 실행 후 이 이름의 bean을 리턴함
	public StringEncryptor stringEncryptor() {
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setPoolSize(1);
		config.setPassword(environment.getProperty("jasypt.password"));
		
		StandardPBEStringEncryptor jasypt = new StandardPBEStringEncryptor();
		jasypt.setConfig(config);
		
		return jasypt;

	}

}
