/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends fd implements ta {
    static int field_E;
    private tg field_I;
    static String field_D;
    static String field_F;
    private tg field_G;
    private tg field_H;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param1 + ((jl) this).field_l;
        int var6 = ((jl) this).field_u + param2;
        int discarded$0 = dj.field_h.a(ka.field_n, 20 + var5, 20 + var6, -40 + ((jl) this).field_g, ((jl) this).field_m - 50, 16777215, -1, 1, 0, dj.field_h.field_H);
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0, int param1, String param2, int param3, byte param4, String param5) {
        int var7 = 0;
        hg var8 = gk.field_g;
        hg var6 = var8;
        var8.g(param3, 8);
        var8.field_l = var8.field_l + 1;
        try {
            var7 = var8.field_l;
            var8.a(param1, -69);
            if (param1 == 2) {
                var8.a(param2, (byte) -102);
            }
            if (param5 != null) {
                int discarded$1 = en.a(true, param5, (jc) (Object) var8);
            } else {
                var8.a((byte) -78, param0);
            }
            var8.b(var8.field_l + -var7, -1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "jl.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + 39 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = ql.field_m.a("", 100, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("jl.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + true + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
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
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 12085) {
                break L1;
              } else {
                field_E = -62;
                break L1;
              }
            }
            if (((jl) this).field_H != param1) {
              if (((jl) this).field_G == param1) {
                va.a(false);
                return;
              } else {
                if (((jl) this).field_I != param1) {
                  break L0;
                } else {
                  jk.a(param0 ^ -18303);
                  return;
                }
              }
            } else {
              pj.a(256);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("jl.L(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 13)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 == 98) {
                stackOut_6_0 = ((jl) this).b(2, param0);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param2 != 99) {
                  var5_int = -63 % ((-75 - param3) / 36);
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((jl) this).a(-16234, param0);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("jl.AA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_12_0 != 0;
    }

    public jl() {
        super(0, 0, 476, 225, (ol) null);
        ((jl) this).field_G = new tg(bj.field_g, (cd) null);
        ((jl) this).field_H = new tg(ql.field_o, (cd) null);
        ((jl) this).field_I = new tg(dd.field_e, (cd) null);
        hf var1 = new hf();
        ((jl) this).field_G.field_w = (ol) (Object) var1;
        ((jl) this).field_H.field_w = (ol) (Object) var1;
        ((jl) this).field_I.field_w = (ol) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        ((jl) this).field_H.a(30, true, ((jl) this).field_m + -48 - var2, -var3 + ((jl) this).field_g >> 1, var4);
        ((jl) this).field_I.a(30, true, -var2 + ((jl) this).field_m + -48, var2 + var4 + (((jl) this).field_g - var3 >> 1), var4);
        ((jl) this).field_G.a(30, true, ((jl) this).field_m + -78 + -(2 * var2), ((jl) this).field_g - var3 >> 1, var3);
        ((jl) this).field_H.field_o = (cd) this;
        ((jl) this).field_G.field_o = (cd) this;
        ((jl) this).field_I.field_o = (cd) this;
        ((jl) this).field_G.field_h = mh.field_j;
        ((jl) this).field_I.field_h = fn.field_f;
        ((jl) this).a((fi) (Object) ((jl) this).field_H, (byte) -78);
        ((jl) this).a((fi) (Object) ((jl) this).field_G, (byte) -78);
        ((jl) this).a((fi) (Object) ((jl) this).field_I, (byte) -78);
    }

    final static boolean a(int param0) {
        return ab.field_J;
    }

    public static void f(int param0) {
        field_D = null;
        field_F = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Unable to add friend - system busy";
        field_D = "Back";
    }
}
