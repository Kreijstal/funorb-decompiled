/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aj {
    int field_a;
    int field_h;
    int field_f;
    int field_b;
    static char field_e;
    int field_c;
    int field_i;
    static int field_d;
    static String field_g;

    final static String b(int param0) {
        if (param0 != -30519) {
            fd var2 = (fd) null;
            aj.a((kd) null, 30, 86, (java.awt.Component) null, false, (fd) null);
            if (!(qg.field_r != null)) {
                return "";
            }
            return qg.field_r;
        }
        if (!(qg.field_r != null)) {
            return "";
        }
        return qg.field_r;
    }

    final static void a(kd param0, int param1, int param2, java.awt.Component param3, boolean param4, fd param5) {
        try {
            s.a(param2, param5, 1024, param2, param0, param3, param4, -87);
            if (param1 != -25127) {
                field_d = -102;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "aj.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 >= -15) {
            aj.b(52);
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        field_d = 0;
        field_g = "Vengeance Expansion";
    }
}
