package kr.ac.hansung.cse.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * 카테고리 등록 폼 DTO (@Valid로 검증)
 */

@Getter
@Setter
public class CategoryForm {

    // 공백/빈값 차단, DB 컬럼 길이 50자 맞춤
    @NotBlank(message = "카테고리 이름을 입력하세요")
    @Size(max = 50, message = "카테고리 이름은 50자 이내로 입력하세요")
    private String name;
}