/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nu extends rqa {
    static int field_p;
    static String field_o;
    static int field_q;

    nu(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(166, 124));
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -10515) {
            field_o = null;
        }
    }

    final static boolean e(byte param0) {
        if (param0 != 114) {
            return false;
        }
        if (null == ola.field_p) {
            return false;
        }
        if (!ola.field_p.a(false)) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 2048;
        field_o = "Add action (Add to custom variable)";
        field_q = 234;
    }
}
