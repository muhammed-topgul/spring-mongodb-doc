package com.mtopgul.springmongodbdoc.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 14:41
 */
@Document
@Setter
@Getter
public class UserModel {
    @Id
    private String id;
    @Field(name = "first_name")
    private String firstName;
    @Field(name = "last_name")
    private String lastName;
    @Field
    private String email;
}
