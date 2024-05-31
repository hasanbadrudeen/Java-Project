package org.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import jakarta.xml.bind.DatatypeConverter;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		SignatureAlgorithm algo = SignatureAlgorithm.RS256;
//		
		final String SECRET_KEY  = "SECRETKEY123";
//
//		byte[] secretBytes = DatatypeConverter.parseBase64Binary(SECRET_KEY);
//		Key key = new SecretKeySpec(SECRET_KEY, algo.getJcaName());
//		
//		long currentMilliSec = System.currentTimeMillis() ;
//		Date currentDate = new Date();
		
		

//		JwtBuilder builder = Jwts.builder().setId("123").setIssuedAt(currentDate).signWith(key,algo);
//		
//		
//		Date expiryDate = new Date(currentMilliSec +6000);
//		builder.setExpiration(expiryDate);
		
		
		
	}
	private String generateToken(String loginUser) {
		String sessionId = UUID.randomUUID().toString();
		Date currentDate = new Date();
		Date expiryDate = new Date(System.currentTimeMillis()+(5*6000));
		Key key = new SecretKeySpec(SECRET_KEY.getBytes(),SignatureAlgorithm.HS256.getJcaName());
		
		JwtBuilder builder = Jwts.builder()
				.id(sessionId)
				.subject(loginUser)
				.claim("name", loginUser)
				.claim("email","dummymail@gmail.com")
                .issuedAt(currentDate)
                .expiration(expiryDate)
                .signWith(key);
		String token = builder.compact();
		return token;
	}
	
	

}
