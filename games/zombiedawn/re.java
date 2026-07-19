/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    int field_d;
    int field_a;
    static int field_e;
    int field_b;
    int field_f;
    static String field_c;
    static rb field_g;

    final static void a(byte param0) {
        if (cn.field_b != null) {
          fa.a((byte) -46, cn.field_b);
          cn.field_b.a(vh.field_a, (byte) 115);
          if (param0 == -71) {
            cn.field_b = null;
            if (null != rn.field_b) {
              rn.field_b.b(true);
              cj.field_d.requestFocus();
              return;
            } else {
              cj.field_d.requestFocus();
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            re.a((byte) -8);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_e = 0;
        field_c = "Close";
    }
}
