/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends ne {
    int field_l;
    static cn field_j;
    static wm field_o;
    int field_p;
    static String field_n;
    static String[] field_i;
    int field_k;
    static String field_m;

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        if (param0.equals((Object) (Object) "B")) {
            return Byte.TYPE;
        }
        if (param0.equals((Object) (Object) "I")) {
            return Integer.TYPE;
        }
        if (param0.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (param0.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (param0.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "D"))) {
            return Double.TYPE;
        }
        if (param1 > -110) {
            field_m = null;
            if (!(!param0.equals((Object) (Object) "C"))) {
                return Character.TYPE;
            }
            return Class.forName(param0);
        }
        if (!(!param0.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param0);
    }

    final static void a(int param0, int param1, boolean param2, ac param3, int param4) {
        wa.a(param3.field_A, -1, param4, gd.field_E, param0, param1);
        wa.a(param3.field_k, -1, param4, jj.field_b, 40 + param0, param1);
        wa.a(param3.field_y, -1, param4, tb.field_c, param0, 18 + param1);
        wa.a(param3.field_r, -1, param4, kd.field_f, param0 + 40, 18 + param1);
        if (param2) {
            al.a((byte) -85);
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_j = null;
        field_o = null;
        field_i = null;
        field_m = null;
        if (param0 != 17) {
            field_m = null;
        }
    }

    private al() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new wm(49);
        field_n = "Your party has been defeated";
        field_i = new String[]{"Thievery", "Reduced chance of waking dragon"};
        field_m = "Raider dodges.";
    }
}
