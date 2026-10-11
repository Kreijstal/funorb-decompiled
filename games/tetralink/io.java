/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static db field_d;
    int field_f;
    int field_j;
    int field_e;
    static wf field_c;
    int field_b;
    static StringBuilder field_h;
    static int field_i;
    static int[] field_g;
    static int field_a;

    final static void a(int param0) {
        if (cm.field_n) {
          return;
        }
        if (lc.field_e == null) {
          lc.field_e = pl.a(4, (byte) -74);
        }
        if (lc.field_e.field_s) {
          hj.field_a = hj.field_a | lc.field_e.field_t;
          lc.field_e = null;
          cm.field_n = true;
        }
        if (param0 != 4) {
          field_g = (int[]) null;
        }
        if (cm.field_n) {
          ni.d((byte) 116);
          hj.b((byte) -119);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_h = null;
        field_c = null;
        field_d = null;
        field_g = null;
    }

    static {
        field_d = new db(11, 0, 1, 2);
        field_h = new StringBuilder(80);
    }
}
