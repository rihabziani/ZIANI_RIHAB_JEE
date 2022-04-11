package ma.enset.patientsmvcziani.sec.repositories;

import ma.enset.patientsmvcziani.sec.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleName(String roleName);
}
