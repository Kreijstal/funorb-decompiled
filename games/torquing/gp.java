/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends tk implements wg {
    static k field_L;
    private sk field_N;
    static String field_Q;
    static String field_M;
    static String field_P;
    static int field_K;
    private int field_O;

    public final sk a(int param0) {
        if (param0 != -10116) {
            field_K = -4;
            return this.field_N;
        }
        return this.field_N;
    }

    gp(String param0, ca param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, gm param1, int param2, int param3) {
        try {
            super.a(-73, param1, param2, param3);
            this.field_O = -this.field_w + n.field_t + -param3;
            int var5_int = -91 % ((param0 - -28) / 43);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "gp.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String b(int param0) {
        if (this.field_s) {
          if (this.field_n != null) {
            bm.a(k.field_e, (byte) 113, -this.field_O + (this.field_p + n.field_t));
            if (param0 != 0) {
              return (String) null;
            } else {
              return this.field_n;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void l(int param0) {
        int var2 = 0;
        super.l(100);
        var2 = -94 / ((-17 - param0) / 63);
        if (null != this.field_N) {
          this.field_N.a(true);
          return;
        } else {
          return;
        }
    }

    final void a(sk param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_N = param0;
              if (param1 > 74) {
                break L1;
              } else {
                gp.j((byte) 91);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("gp.F(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void k(byte param0) {
        field_L = null;
        field_M = null;
        field_P = null;
        if (param0 <= 113) {
            field_K = -13;
            field_Q = null;
            return;
        }
        field_Q = null;
    }

    final static void j(byte param0) {
        dc.field_a.h(6);
        if (param0 != -34) {
          L0: {
            field_P = (String) null;
            if (d.field_r == null) {
              d.field_r = new sp(dc.field_a, bi.field_u);
              break L0;
            } else {
              break L0;
            }
          }
          dc.field_a.a(d.field_r, (byte) 112);
          return;
        } else {
          L1: {
            if (d.field_r == null) {
              d.field_r = new sp(dc.field_a, bi.field_u);
              break L1;
            } else {
              break L1;
            }
          }
          dc.field_a.a(d.field_r, (byte) 112);
          return;
        }
    }

    static {
        field_L = new k(8, 0, 4, 1);
        field_Q = "to return to the normal view.";
        field_M = "Next";
        field_P = "Exit fullscreen mode";
    }
}
