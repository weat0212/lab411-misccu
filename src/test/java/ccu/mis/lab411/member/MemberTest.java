package ccu.mis.lab411.member;

import org.junit.jupiter.api.BeforeEach;

class MemberTest {

    private final Member member;

    MemberTest(Member member) {
        this.member = member;
    }

    @BeforeEach
    void setUp() {
        System.out.println(member.toString());
    }
}