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
        try {
            jo.field_E = param1;
            vn.a(108, gja.field_bb, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rma.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static String a() {
        int var1 = -3;
        return qla.a(true, "\\\\contentfs\\mgcontent_v4\\WIP\\tombracer\\src\\freelevels\\banner.trlev");
    }

    public static void b() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
