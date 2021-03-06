package com.sanshy.dhanawanshi.SingleItems;

public class SingleListItem {

    String Id;
    String Name;
    String FatherName;
    String Cast;
    String Location;
    String PhotoURL;

    public SingleListItem(String id, String name, String fatherName, String cast, String location, String photoURL) {
        Id = id;
        Name = name;
        FatherName = fatherName;
        Cast = cast;
        Location = location;
        PhotoURL = photoURL;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getCast() {
        return Cast;
    }

    public void setCast(String cast) {
        Cast = cast;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getPhotoURL() {
        return PhotoURL;
    }

    public void setPhotoURL(String photoURL) {
        PhotoURL = photoURL;
    }
}
