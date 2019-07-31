package com.example.voizfonica;
        import lombok.Data;
        import org.springframework.data.annotation.Id;
        import org.springframework.data.mongodb.core.mapping.Document;

        import javax.validation.constraints.NotNull;
        import javax.validation.constraints.Pattern;
        import javax.validation.constraints.Size;



@Data

@Document
public class Edit {

@Id
private String id;
    @NotNull
    @Size(min=2,message="Atleast 2 characters")@Pattern(regexp = "[A-Za-z]*",message="Enter a valid name")
    private String full_name;
    @NotNull
    @Size(min=2,message="Atleast 2 characters")
    private String email;
    @NotNull
    @Size(min=10,message="Atleast 10 characters")
    private String phone;
    @NotNull
    @Size(min=2,message="Atleast 2 characters")
    private String postal;
    @NotNull
    @Size(min=2,message="Atleast 2 characters")
    private String address;

    private String city;
    private String state;






}
