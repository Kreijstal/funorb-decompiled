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
        ((mo) this).field_P.a(25, -var2 + ((mo) this).field_t >> 1, ((mo) this).field_s + -5 >> 1, (byte) -119, param0);
        ((mo) this).field_Q.a(30, 140 + (-var2 + ((mo) this).field_t >> 1) + 10, (20 + (((mo) this).field_s + -30) >> 1) + 2, (byte) -119, 100);
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (((mo) this).field_P.a(-11011).b((byte) -31) == ae.field_c) {
              L1: {
                df.a(((mo) this).field_P.i(5390), (byte) 103, ((mo) this).field_P.a((byte) -125), ((mo) this).field_P.i((byte) -117));
                if (param2 < -22) {
                  break L1;
                } else {
                  mo.d(true);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("mo.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((mo) this).field_Q.field_J = ((mo) this).field_P.a(-11011).b((byte) -31) == ae.field_c ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "mo.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
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
