package cgg.thymeleafproj.thyme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import cgg.thymeleafproj.thyme.dao.UserDao;
import cgg.thymeleafproj.thyme.entities.User;

@SpringBootApplication
public class ThymeApplication implements CommandLineRunner {
	@Autowired
	public UserDao u1;

	public static void main(String[] args) {
		SpringApplication.run(ThymeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("table created" + u1.createTable());
	}

	public void createUser() throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter user id");
		int int1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("enter user name");
		String line = bufferedReader.readLine();
		System.out.println("enter user city");
		String line2 = bufferedReader.readLine();
		System.out.println("enter user age");
		int int2 = Integer.parseInt(bufferedReader.readLine());

		User u2 = new User();
		u2.setUserid(int1);
		u2.setUserName(line);
		u2.setCity(line2);
		u2.setAge(int2);

		int user = u1.createUser(u2);

	}

}
