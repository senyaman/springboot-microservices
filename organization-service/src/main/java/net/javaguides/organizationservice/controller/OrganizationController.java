package net.javaguides.organizationservice.controller;

import lombok.AllArgsConstructor;
import net.javaguides.organizationservice.dto.OrganizationDto;
import net.javaguides.organizationservice.service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organizations")
@AllArgsConstructor
public class OrganizationController {

    private OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto) {
        OrganizationDto saveOrganization = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(saveOrganization, HttpStatus.CREATED);
    }
    @GetMapping("/{organization-code}")
    public ResponseEntity<OrganizationDto> getOrganizationByCode(@PathVariable("organization-code") String organizationCode) {
        return ResponseEntity.ok(organizationService.getOrganizationByCode(organizationCode));
    }

}
