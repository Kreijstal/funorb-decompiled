/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dw {
    boolean field_k;
    byte field_s;
    boolean field_b;
    int field_q;
    static String[] field_u;
    boolean field_l;
    byte field_c;
    byte field_o;
    byte field_i;
    static String field_j;
    boolean field_p;
    boolean field_f;
    boolean field_n;
    boolean field_g;
    int field_d;
    byte field_h;
    int field_t;
    short field_m;
    byte field_a;
    byte field_r;
    boolean field_e;

    public static void a(byte param0) {
        field_j = null;
        if (param0 != 101) {
            return;
        }
        field_u = null;
    }

    final static void b(byte param0) {
        if (gda.field_c == 10) {
          et.a(true);
          gda.field_c = 11;
          if (param0 <= -5) {
            rca.field_l = true;
            return;
          } else {
            dw.a((byte) -100);
            rca.field_l = true;
            return;
          }
        } else {
          int discarded$3 = -1;
          if (!dg.b()) {
            et.a(true);
            gda.field_c = 11;
            if (param0 > -5) {
              dw.a((byte) -100);
              rca.field_l = true;
              return;
            } else {
              rca.field_l = true;
              return;
            }
          } else {
            if (param0 <= -5) {
              rca.field_l = true;
              return;
            } else {
              dw.a((byte) -100);
              rca.field_l = true;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[]{"1st", "2nd", "3rd", "4th"};
        field_j = "Game End Imminent";
    }
}
