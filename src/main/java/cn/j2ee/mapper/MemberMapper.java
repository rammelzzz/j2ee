package cn.j2ee.mapper;

import cn.j2ee.entity.Member;

import java.util.List;

/**
 * Created by rammel on 2017/12/4.
 */
public interface MemberMapper {

    /**
     * 添加一名成员
     */
    public void addMember(Member member);

    /**
     * 列出所有的成成员
     * @return
     */
    public List<Member> memberList();
}
