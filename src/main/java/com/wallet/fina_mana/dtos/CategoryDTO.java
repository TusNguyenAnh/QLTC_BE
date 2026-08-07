package com.wallet.fina_mana.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTO {
    @NotBlank(message = "Category's name cannot empty")
    @JsonProperty("name")
    private String name;

    @NotBlank(message = "Category's icon cannot empty")
    @JsonProperty("icon")
    private String icon;

    @JsonProperty("parent_id")
    private String parentId;
}
