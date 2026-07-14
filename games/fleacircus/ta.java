/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta extends pa {
    static String field_s;
    static int field_y;
    int field_q;
    int field_w;
    static dd[] field_z;
    static int field_u;
    int field_t;
    int field_v;
    int field_x;
    int field_r;

    public static void c(byte param0) {
        int var1 = -122 % ((-53 - param0) / 38);
        field_z = null;
        field_s = null;
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -2843) {
          field_y = -101;
          return ud.a(param3, 3, param2 + 7558, 1, 1, param4, param1, 1, param0);
        } else {
          return ud.a(param3, 3, param2 + 7558, 1, 1, param4, param1, 1, param0);
        }
    }

    final static String f(int param0) {
        if (param0 != -15040) {
            return null;
        }
        return ae.field_a.h(param0 + 15040);
    }

    final static void a(boolean param0, int param1) {
        uc.field_c.a(param0, 10518);
        if (param1 <= 43) {
            dd[] discarded$0 = ta.a(19, 19, 119, 12, 2);
        }
    }

    ta() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "<%0>Balloons & Landing Pad:<%1> Each balloon caries a single flea up to a landing pad.";
        field_u = 0;
    }
}
