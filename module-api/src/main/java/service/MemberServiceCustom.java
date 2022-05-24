package service;

@Service
public class MemberServiceCustom {

    private MemberRepository memberRepository;

    public MemberServiceCustom(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // public Long signup (Member member) {
    //     return memberRepository.save(member).getId();
    // }
}

