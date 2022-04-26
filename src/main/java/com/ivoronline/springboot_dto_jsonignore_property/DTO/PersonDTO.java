package com.ivoronline.springboot_dto_jsonignore_property.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PersonDTO {

  //PROPERTIES
              public String  name;
              public Integer age;
  @JsonIgnore public String comment;

}
