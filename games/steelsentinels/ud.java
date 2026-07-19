/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends ck {
    int field_B;
    static long field_v;
    int field_p;
    int field_s;
    int field_o;
    boolean field_r;
    int[][] field_x;
    int field_t;
    static ef field_A;
    static int field_D;
    int field_u;
    String[][] field_z;
    static boolean field_q;
    static String field_w;
    static int field_y;
    static int field_C;

    final static void a(boolean param0) {
        if (!param0) {
            field_C = -27;
            bj.a(-128, wl.d((byte) -21));
            return;
        }
        bj.a(-128, wl.d((byte) -21));
    }

    final static boolean e(int param0) {
        int var1 = 0;
        var1 = -125 % ((-54 - param0) / 33);
        if (null != rb.field_h) {
          if (jd.field_sb != rn.field_v) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    ud() {
    }

    public static void d(int param0) {
        boolean discarded$0 = false;
        if (param0 != 20000000) {
            discarded$0 = ud.e(-26);
            field_A = null;
            field_w = null;
            return;
        }
        field_A = null;
        field_w = null;
    }

    static {
        field_v = 20000000L;
        field_A = new ef();
    }
}
