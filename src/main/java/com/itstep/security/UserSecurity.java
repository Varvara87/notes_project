package com.itstep.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.itstep.model.User;

import lombok.Data;

@Data
public class UserSecurity implements UserDetails {
public UserSecurity(User user) {
		super();
		this.user = user;
	}

private User user;

@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	String role=user.getRole();
	SimpleGrantedAuthority authority=new SimpleGrantedAuthority(role);
	List<SimpleGrantedAuthority> authorities = new ArrayList<>();
	authorities.add(authority);
	return authorities;
}

@Override
public String getPassword() {
	// TODO Auto-generated method stub
	return user.getPassword();
}

@Override
public String getUsername() {
	
	return user.getUsername();
}

@Override
public boolean isAccountNonExpired() {
	
	return true;
}

@Override
public boolean isAccountNonLocked() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public boolean isCredentialsNonExpired() {
	// TODO Auto-generated method stub
	return true;
}

@Override
public boolean isEnabled() {

	return true;
}
}

