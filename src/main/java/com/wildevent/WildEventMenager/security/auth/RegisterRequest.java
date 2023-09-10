package com.wildevent.WildEventMenager.security.auth;

import com.wildevent.WildEventMenager.location.model.Location;
import com.wildevent.WildEventMenager.role.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private String phone;
    private Set<Role> role;
}
