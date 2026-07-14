/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends br {
    int field_k;
    int field_f;
    static String field_o;
    int field_n;
    int field_l;
    static bo field_h;
    static ja[] field_g;
    wi field_i;
    static String field_p;
    int field_j;
    static String field_m;

    final static String a(CharSequence[] param0, int param1) {
        if (param1 <= 2) {
          field_h = null;
          return eq.a(param0, 0, 4, param0.length);
        } else {
          return eq.a(param0, 0, 4, param0.length);
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        field_h = null;
        field_p = null;
        if (param0 != 0) {
          field_m = null;
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final static void a(byte param0, ld param1) {
        if (param1 == null) {
          return;
        } else {
          L0: {
            mj.field_Ib = param1;
            rp.field_l.field_Cb.e(-30986);
            rp.field_l.a((byte) 50, (cj) (Object) mj.field_Ib);
            ee.field_b = true;
            if (param0 == 4) {
              break L0;
            } else {
              wi.a(-50);
              break L0;
            }
          }
          return;
        }
    }

    wi(int param0, int param1, int param2, int param3, int param4) {
        ((wi) this).field_f = param2;
        ((wi) this).field_j = param3;
        ((wi) this).field_n = param4;
        ((wi) this).field_l = param0;
        ((wi) this).field_k = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Time elapsed: <%0>";
        field_p = "Mastery of technology is not far away.";
        field_m = "Quake";
        field_h = new bo("");
    }
}
