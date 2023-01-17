package net.javaguides.employeeservice.feignclient;

import net.javaguides.employeeservice.dto.OrganizationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ORGANIZATION-SERVICE", url = "http://localhost:8083/api/organizations")
public interface OrganizationClient {

    @GetMapping("/{organization-code}")
    OrganizationDto getOrganizationByCode(@PathVariable("organization-code") String organizationCode);
}
