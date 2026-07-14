/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo extends rqa {
    static llb field_p;
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(144, 88));
    }

    wo(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, kka param4) {
        if (!param3) {
            return;
        }
        ew.field_p.a(param2, param0, !param1 ? true : false, param4, -47, 1000000);
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 >= -80) {
            field_o = false;
        }
    }

    static {
    }
}
