package statics;

public enum TeacherLevel {
    GS_TS ( "GS - TS"),
    PGS_TS ("PGS - TS"),
    GIẢNG_VIÊN_CHÍNH ( "Giảng viên chính"),
    THẠC_SỸ("Thạc sỹ") ;

    public String name;
    TeacherLevel(String name) {
        this.name = name;
    }
}
