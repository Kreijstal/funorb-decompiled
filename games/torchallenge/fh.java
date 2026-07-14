/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static boolean field_g;
    static int field_b;
    static lj field_f;
    static int field_d;
    static ka[][] field_a;
    static int field_e;
    static int field_c;
    static int[] field_h;

    final static void a(int param0, int param1, int param2) {
        if (param1 != 7284) {
            return;
        }
        rb.field_b = 1;
        lj.field_e = param2;
        m.field_h = param0;
    }

    public static void a(byte param0) {
        if (param0 > -23) {
          field_g = false;
          field_h = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_h = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ka[2][32];
        field_h = new int[2];
        field_d = 0;
    }
}
