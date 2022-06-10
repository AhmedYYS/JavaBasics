package com.sparta.ay.NestedClasses;

public class Spartan {

//    public static class SpartanComparator implements Comparator<Spartan>  {
//        @Override
//        public int compare(Spartan o) {
//            return this.getName().compareTo(o.getName());
//        }
//    }


    private String name = "Ahmed";
    private String course = "Java";

    public Spartan(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Spartan {" +
                "name = '" + name + '\'' +
                ", course = '" + course + '\'' +
                '}';
    }
}
