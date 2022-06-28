package discord;

import java.util.HashSet;

public class Role {
    private String roleName;
    private final HashSet<Server.Ability> abilities;

    public Role(String roleName, HashSet<Server.Ability> abilities) {
        this.roleName = roleName;
        this.abilities = abilities;
    }

    public HashSet<Server.Ability> getAbilities() {
        return abilities;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
