package com.mtopgul.springmongodbdoc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.beans.ConstructorProperties;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 14:41
 */
@Document
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor(onConstructor_ = @ConstructorProperties({"firstName", "lastName"}))
public class UserModel {
    @Id
    private String id;

    @NonNull
    @Field(name = "first_name")
    private String firstName;

    @NonNull
    @Field(name = "last_name")
    private String lastName;

    @Field
    private String email;

    @Field
    private double price;
}
