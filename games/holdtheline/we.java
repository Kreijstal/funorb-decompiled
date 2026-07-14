/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends hl {
    int field_m;
    int field_i;
    static float field_n;
    int field_u;
    int[] field_k;
    int field_q;
    int field_s;
    static String field_t;
    static int field_j;
    static hj field_o;
    int field_r;
    static go field_p;
    static int field_l;

    final void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
        ((we) this).field_m = param5;
        ((we) this).field_u = param0;
        ((we) this).field_i = param1;
        ((we) this).field_k = param2;
        ((we) this).field_s = param7;
        if (param4 != -1) {
          return;
        } else {
          ((we) this).field_q = param3;
          ((we) this).field_r = param6;
          return;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_p = null;
        field_t = null;
        if (param0 < 22) {
            field_l = -106;
        }
    }

    final static lc a(byte param0, String param1) {
        if (fj.field_o.a(250)) {
          if (!param1.equals((Object) (Object) fj.field_o.b((byte) 66))) {
            fj.field_o = qn.a(param1, -7079);
            if (param0 != -85) {
              field_l = 85;
              return fj.field_o;
            } else {
              return fj.field_o;
            }
          } else {
            if (param0 != -85) {
              field_l = 85;
              return fj.field_o;
            } else {
              return fj.field_o;
            }
          }
        } else {
          if (param0 != -85) {
            field_l = 85;
            return fj.field_o;
          } else {
            return fj.field_o;
          }
        }
    }

    we() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 260.0f / (float)(-1.0 + Math.exp(10.0));
        field_l = 250;
        field_t = "Connection lost - attempting to reconnect";
    }
}
