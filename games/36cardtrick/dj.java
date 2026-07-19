/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    int field_g;
    static nc field_f;
    int field_b;
    static int field_a;
    int field_c;
    static String field_e;
    int field_d;

    final static int c(int param0) {
        if (param0 != 0) {
            return -27;
        }
        return qd.field_a;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 <= 48) {
            field_f = (nc) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static ek b(int param0) {
        if (null != t.field_j) {
          if (param0 != 31959) {
            field_f = (nc) null;
            return t.field_j;
          } else {
            return t.field_j;
          }
        } else {
          t.field_j = new ek(me.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, me.field_c.field_s, -1, 2147483647, true);
          if (param0 == 31959) {
            return t.field_j;
          } else {
            field_f = (nc) null;
            return t.field_j;
          }
        }
    }

    static {
        field_f = new nc();
    }
}
