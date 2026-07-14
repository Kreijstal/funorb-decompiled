/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends ag implements en {
    static mh field_R;
    static String field_O;
    private na field_P;
    static String field_N;
    private d field_Q;

    public static void d(boolean param0) {
        field_R = null;
        field_N = null;
        if (param0) {
            mo.d(false);
            field_O = null;
            return;
        }
        field_O = null;
    }

    mo(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (ub) null);
        ((mo) this).field_P = new na((ub) (Object) new r(10000536), ii.field_j, 0, 0, 140, 25);
        ((mo) this).field_P.a(new an(), (byte) -12);
        ((mo) this).field_Q = new d(ri.field_L, (uh) this);
        ((mo) this).field_H = new oc[]{(oc) (Object) ((mo) this).field_P, (oc) (Object) ((mo) this).field_Q};
        ((mo) this).field_Q.field_l = (ub) (Object) new hi();
        ((mo) this).e(1);
    }

    final void a(int param0) {
        int var2 = 250;
        ((mo) this).field_P.a(25, -var2 + ((mo) this).field_t >> 1393192865, ((mo) this).field_s + -5 >> -1619767807, (byte) -119, param0);
        ((mo) this).field_Q.a(30, 140 + (-var2 + ((mo) this).field_t >> 9730241) + 10, (20 + (((mo) this).field_s + -30) >> 1451464225) + 2, (byte) -119, 100);
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        if (((mo) this).field_P.a(-11011).b((byte) -31) != ae.field_c) {
          return;
        } else {
          L0: {
            df.a(((mo) this).field_P.i(5390), (byte) 103, ((mo) this).field_P.a((byte) -125), ((mo) this).field_P.i((byte) -117));
            if (param2 < -22) {
              break L0;
            } else {
              mo.d(true);
              break L0;
            }
          }
          return;
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((mo) this).field_Q.field_J = ((mo) this).field_P.a(-11011).b((byte) -31) == ae.field_c ? true : false;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        og.field_Yb.c(jm.field_i, 4 + (((mo) this).field_o + param1), 4 + param0 + (((mo) this).field_w - -og.field_Yb.field_F), 16777215, -1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Single-player game";
        field_N = "You've beaten the game!";
    }
}
