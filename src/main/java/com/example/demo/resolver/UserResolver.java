package com.example.demo.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.type.User;

@Component
public class UserResolver implements GraphQLQueryResolver {

	public User userById(String userId) {
		return new User();
	}
}
