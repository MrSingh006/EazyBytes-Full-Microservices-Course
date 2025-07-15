package com.eazybytes.accounts.dto;

/*Records are special classes introduced in java-17. Records act as data carriers only,
means anyone can read the data inside this record but no one can change it. We can also
achieve it by making only getter methods and constructor final*/

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

//Make sure these field values and data types should be same as defined
// inside application.yml file

@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String, String> contactDetails,
                                     List<String> onCallSupport) {

}
