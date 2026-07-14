/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class li {
    int field_b;
    int field_d;
    static char[] field_c;
    int field_h;
    int field_g;
    static int[][] field_e;
    int field_a;
    int field_f;
    private static String field_z;

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        field_e = null;
        if (param0 < 66) {
            li.a(78);
            field_c = null;
            return;
        }
        field_c = null;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "li.E(";
        field_c = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
