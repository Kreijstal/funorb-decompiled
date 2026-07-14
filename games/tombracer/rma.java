/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rma {
    static jea field_b;
    static String field_a;

    final static void a(boolean param0, String param1, String param2, byte param3) {
        rsa.field_u = param2;
        if (param3 < 66) {
            return;
        }
        jo.field_E = param1;
        vn.a(108, gja.field_bb, param0);
    }

    final static String a(int param0) {
        int var1 = 9 / ((param0 - 74) / 41);
        return qla.a(true, "\\\\contentfs\\mgcontent_v4\\WIP\\tombracer\\src\\freelevels\\banner.trlev");
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 13902) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
