/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ck {
    static ja field_t;
    static String field_x;
    static String field_w;
    static int field_o;
    static m field_r;
    static boolean field_u;
    int[] field_p;
    static String field_s;
    static volatile int field_q;
    static ek field_z;
    static boolean field_y;
    static boolean field_v;

    final static boolean a(byte param0, String param1) {
        CharSequence var3 = null;
        if (param0 != -38) {
            ob.d(118);
            if (!(jn.field_g)) {
                return false;
            }
            if ((ib.field_b ^ -1) != -3) {
                return false;
            }
            if (bk.field_U == null) {
                return false;
            }
            var3 = (CharSequence) (Object) param1;
            if (!(bk.field_U.equals((Object) (Object) ui.a(1, var3)))) {
                return false;
            }
            return true;
        }
        if (!(jn.field_g)) {
            return false;
        }
        if ((ib.field_b ^ -1) != -3) {
            return false;
        }
        if (bk.field_U == null) {
            return false;
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        if (!(bk.field_U.equals((Object) (Object) ui.a(1, var4)))) {
            return false;
        }
        return true;
    }

    public static void d(int param0) {
        if (param0 != 18601) {
          ob.d(118);
          field_w = null;
          field_z = null;
          field_t = null;
          field_r = null;
          field_s = null;
          field_x = null;
          return;
        } else {
          field_w = null;
          field_z = null;
          field_t = null;
          field_r = null;
          field_s = null;
          field_x = null;
          return;
        }
    }

    private ob() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new ja();
        field_u = false;
        field_w = "E";
        field_q = 0;
        field_s = "<%1> was destroyed";
        field_o = 0;
        field_x = "BOSS ";
        field_v = false;
    }
}
