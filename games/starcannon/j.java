/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static s field_d;
    static int[] field_b;
    static hl[] field_c;
    static vc field_a;
    static int field_e;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != -3) {
          j.b(-90);
        }
    }

    final static String b(int param0) {
        if (rk.field_d < 2) {
          return pf.field_c;
        }
        if (null != kl.field_b) {
          if (!kl.field_b.b((byte) 125)) {
            return lb.field_L;
          }
          return b.field_e;
        }
        if (!bf.field_y.b((byte) 110)) {
          return n.field_f;
        }
        if (!bf.field_y.a("commonui", -9883)) {
          return ae.field_a + " - " + bf.field_y.a("commonui", (byte) 98) + "%";
        }
        if (!fk.field_k.b((byte) 106)) {
          return s.field_g;
        }
        if (!fk.field_k.a("commonui", -9883)) {
          return sj.field_D + " - " + fk.field_k.a("commonui", (byte) 116) + "%";
        }
        if (!li.field_b.b((byte) 105)) {
          return q.field_i;
        }
        if (param0 > -125) {
          j.b(69);
        }
        if (!li.field_b.a(29741)) {
          return gj.field_b + " - " + li.field_b.a((byte) 116) + "%";
        }
        return ba.field_a;
    }

    static {
        field_d = new s(3);
        field_b = new int[4];
    }
}
