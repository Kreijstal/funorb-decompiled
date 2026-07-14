/*
 * Decompiled by CFR-JS 0.4.0.
 */
class db extends vf {
    static nf[] field_w;
    static ji field_v;
    static String field_u;
    static int[] field_x;

    db(int param0) {
        this(gm.field_cb, param0);
    }

    db(ok param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_C, -1, 2147483647, false);
    }

    public static void a(byte param0) {
        field_w = null;
        if (param0 < 68) {
            return;
        }
        field_v = null;
        field_x = null;
        field_u = null;
    }

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        if (!param2) {
          if (param0 >= -97) {
            db.a((byte) -16);
            super.a((byte) -113, param1, param2, param3, param4);
            return;
          } else {
            super.a((byte) -113, param1, param2, param3, param4);
            return;
          }
        } else {
          ea.a(true, param4 - -param3.field_m, param1 + param3.field_q, param3.field_z, param3.field_F);
          if (param0 < -97) {
            super.a((byte) -113, param1, param2, param3, param4);
            return;
          } else {
            db.a((byte) -16);
            super.a((byte) -113, param1, param2, param3, param4);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Wing pod lost";
        field_x = new int[8192];
    }
}
