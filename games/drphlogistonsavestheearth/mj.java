/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mj extends l {
    static volatile int field_u;
    static he[] field_w;
    static nh field_v;
    static String field_t;

    mj(int param0) {
        this(uh.field_i, param0);
    }

    final static String a(byte param0, byte[] param1) {
        int var2 = -41 % ((param0 - -59) / 35);
        return p.a(param1.length, (byte) 79, param1, 0);
    }

    mj(rf param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_x, -1, 2147483647, false);
    }

    public static void c(int param0) {
        field_t = null;
        field_v = null;
        field_w = null;
        if (param0 != 2147483647) {
            Object var2 = null;
            String discarded$0 = mj.a((byte) 69, (byte[]) null);
        }
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        L0: {
          if (param0) {
            aj.a(param2.field_w, param4 - -param2.field_o, param2.field_m + param3, param2.field_k, 60);
            break L0;
          } else {
            break L0;
          }
        }
        super.a(param0, 127, param2, param3, param4);
        if (param1 < 94) {
          mj.c(-42);
          return;
        } else {
          return;
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 114) {
            return true;
        }
        return !ib.field_f.a(false) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = -1;
        field_t = "Easy";
    }
}
