/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rl extends wb {
    static String field_s;
    static String field_v;
    int field_z;
    int field_r;
    int field_p;
    int field_u;
    static String field_q;
    int field_x;
    static long field_t;
    static int field_y;
    static String field_o;
    int field_w;

    final static void e(boolean param0) {
        ji.field_e.field_l = 0;
        ji.field_e.field_b = 0;
        if (!param0) {
            field_s = null;
        }
    }

    final static void b(byte param0) {
        if (param0 != 29) {
            field_q = null;
        }
    }

    final static km d(boolean param0) {
        if (!param0) {
            field_y = 78;
            return lg.field_a.field_Lb;
        }
        return lg.field_a.field_Lb;
    }

    public static void d(int param0) {
        field_v = null;
        if (param0 != 0) {
          rl.d(87);
          field_o = null;
          field_q = null;
          field_s = null;
          return;
        } else {
          field_o = null;
          field_q = null;
          field_s = null;
          return;
        }
    }

    rl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Won";
        field_v = "Only show private chat from my friends and opponents";
        field_q = "If you are not, please change your password to something more obscure!";
        field_t = 0L;
        field_o = "Drawn";
    }
}
