/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends ma implements mj {
    static int field_Q;
    static String field_N;
    static String field_O;
    static String field_K;
    private fb field_U;
    private fb field_M;
    private fb field_R;
    static tk field_P;
    static ek field_L;
    static String field_S;
    static String field_T;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param2 > -80) {
          ((ii) this).field_M = null;
          var5 = param3 + ((ii) this).field_u;
          var6 = ((ii) this).field_r - -param0;
          int discarded$2 = rb.field_b.a(pe.field_e, 20 + var5, 20 + var6, ((ii) this).field_y + -40, ((ii) this).field_C - 50, 16777215, -1, 1, 0, rb.field_b.field_C);
          super.a(param0, param1, -90, param3);
          return;
        } else {
          var5 = param3 + ((ii) this).field_u;
          var6 = ((ii) this).field_r - -param0;
          int discarded$3 = rb.field_b.a(pe.field_e, 20 + var5, 20 + var6, ((ii) this).field_y + -40, ((ii) this).field_C - 50, 16777215, -1, 1, 0, rb.field_b.field_C);
          super.a(param0, param1, -90, param3);
          return;
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_12_0 = false;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 == 98) {
                stackOut_6_0 = ((ii) this).a(param3, param2 ^ -27965);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                L1: {
                  if (param2 == -1) {
                    break L1;
                  } else {
                    var6 = null;
                    ((ii) this).a((fb) null, -72, -53, -40, -75);
                    break L1;
                  }
                }
                if (99 == param1) {
                  stackOut_12_0 = ((ii) this).a(param3, (byte) -73);
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("ii.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    public static void a() {
        field_P = null;
        field_T = null;
        field_K = null;
        field_N = null;
        field_S = null;
        field_L = null;
        field_O = null;
    }

    public ii() {
        super(0, 0, 476, 225, (jm) null);
        ((ii) this).field_R = new fb(fd.field_o, (rg) null);
        ((ii) this).field_M = new fb(vf.field_c, (rg) null);
        ((ii) this).field_U = new fb(jd.field_g, (rg) null);
        sf var1 = new sf();
        ((ii) this).field_R.field_n = (jm) (Object) var1;
        ((ii) this).field_M.field_n = (jm) (Object) var1;
        ((ii) this).field_U.field_n = (jm) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        ((ii) this).field_M.a(-var2 + -48 + ((ii) this).field_C, 34, 30, var4, ((ii) this).field_y - var3 >> 1);
        ((ii) this).field_U.a(-var2 + ((ii) this).field_C + -48, 34, 30, var4, (-var3 + ((ii) this).field_y >> 1) + (var4 + var2));
        ((ii) this).field_R.a(((ii) this).field_C - (78 - -(2 * var2)), 34, 30, var3, ((ii) this).field_y + -var3 >> 1);
        ((ii) this).field_M.field_p = (rg) this;
        ((ii) this).field_R.field_p = (rg) this;
        ((ii) this).field_R.field_j = sl.field_d;
        ((ii) this).field_U.field_p = (rg) this;
        ((ii) this).field_U.field_j = qd.field_I;
        ((ii) this).b((mf) (Object) ((ii) this).field_M, 95);
        ((ii) this).b((mf) (Object) ((ii) this).field_R, 95);
        ((ii) this).b((mf) (Object) ((ii) this).field_U, 95);
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            if (param4 == -24221) {
              if (((ii) this).field_M != param0) {
                if (((ii) this).field_R == param0) {
                  dc.c((byte) 126);
                  return;
                } else {
                  if (param0 != ((ii) this).field_U) {
                    break L0;
                  } else {
                    int discarded$2 = 1;
                    jg.b();
                    return;
                  }
                }
              } else {
                mf.e(param4 ^ -24297);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ii.DA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Service unavailable";
        field_N = "Advertising websites";
        field_K = "Off";
        field_P = new tk();
        field_S = "<%0> has joined your game.";
        field_T = "Logging in...";
    }
}
