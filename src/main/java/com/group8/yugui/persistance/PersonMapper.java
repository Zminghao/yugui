package com.group8.yugui.persistance;

import com.group8.yugui.domain.Person;

import java.util.List;

public interface PersonMapper {

    Person getPerson(int mrechandiseID);

    List<Person> getPersonList();
//
//    String getPrice(int mrechandiseID);
//
//    String getPicture(int mrechandiseID);
//
//    String getDetail(int mrechandiseID);

}
