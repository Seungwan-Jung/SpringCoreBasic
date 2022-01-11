package hello.core.member;

public class MemberApp {

    public static void main(String[] args) { //psvm
        MemberService memberService = new MemberServiceImple();
        Member member = new Member(1L, "memberA", Grade.VIP); //long이라 1L, 1넣으면 컴파일오류
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());//soutv
    }
}
