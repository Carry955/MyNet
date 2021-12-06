package com.carry.mynet;

public class MemberResult {
    public int status;
    public String msg;
    public MemberEntity data;


    public class MemberEntity{
        public int member;
        public String uname;
        public String password;
        public String email;
        public int sex;
        public String mobile;
        public long regtime;
        public long lastlogin;
        public String image;
        public String memberAddresses;
    }
}
