package c.sevice;

import c.mobel.MemberDTO;

public abstract class MemberManagerAbstract {
	public abstract boolean addMember(MemberDTO Member);
	public abstract boolean removeMember(String name, String phone);
	public abstract boolean updateMember(MemberDTO Member);	
	public void printLog(String data) {
		System.out.println("Data="+data);
	}
}
