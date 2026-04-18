package kr.ac.hansung.cse.exception;

/**
 * 카테고리 이름이 중복될 때 발생하는 예외.
 * RuntimeException 상속 → @Transactional 자동 롤백, 필수 예외 처리 없이 사용 가능
 */

public class DuplicateCategoryException extends RuntimeException {

    public DuplicateCategoryException(String name) {
        super("이미 존재하는 카테고리입니다: " + name);
    }
}