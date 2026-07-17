/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends gb implements n {
    private eb field_J;
    static ok field_K;
    private eb field_G;
    static String field_H;
    private eb field_F;
    static String field_I;

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 > -106) {
            return;
        }
        int var5 = param0 + ((cg) this).field_w;
        int var6 = ((cg) this).field_u - -param3;
        int discarded$0 = qk.field_e.a(gb.field_A, 20 + var5, 20 + var6, -40 + ((cg) this).field_p, ((cg) this).field_n + -50, 16777215, -1, 1, 0, qk.field_e.field_s);
        super.a(param0, -125, param2, param3);
    }

    final static void f() {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            ob.b();
            me.field_m = new int[260];
            hb.field_l = 11;
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (me.field_m.length <= var5) {
                    break L0;
                  } else {
                    me.field_m[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                me.field_m[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "cg.D(" + -75 + 41);
        }
    }

    public static void a() {
        field_H = null;
        field_K = null;
        field_I = null;
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var6_int = 36 / ((param4 - -5) / 57);
              if (((cg) this).field_G != param0) {
                if (((cg) this).field_F == param0) {
                  oe.a(-47);
                  break L1;
                } else {
                  if (((cg) this).field_J == param0) {
                    bm.a(-126);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                ld.a(1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("cg.I(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param3 != 98) {
                if (param3 != 99) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = ((cg) this).a(param1, (byte) 100);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ((cg) this).a(48, param1);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("cg.K(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_10_0 != 0;
    }

    public cg() {
        super(0, 0, 476, 225, (cj) null);
        ((cg) this).field_F = new eb(td.field_j, (sc) null);
        ((cg) this).field_G = new eb(sl.field_f, (sc) null);
        ((cg) this).field_J = new eb(aj.field_c, (sc) null);
        ic var1 = new ic();
        ((cg) this).field_F.field_l = (cj) (Object) var1;
        ((cg) this).field_G.field_l = (cj) (Object) var1;
        ((cg) this).field_J.field_l = (cj) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        ((cg) this).field_G.a(-var2 + (((cg) this).field_n - 48), (byte) 48, var4, ((cg) this).field_p - var3 >> 1, 30);
        ((cg) this).field_J.a(((cg) this).field_n + -48 - var2, (byte) 51, var4, var4 + (-var3 + ((cg) this).field_p >> 1) + var2, 30);
        ((cg) this).field_F.a(-(2 * var2) + -78 + ((cg) this).field_n, (byte) 111, var3, ((cg) this).field_p + -var3 >> 1, 30);
        ((cg) this).field_G.field_r = (sc) this;
        ((cg) this).field_F.field_r = (sc) this;
        ((cg) this).field_J.field_r = (sc) this;
        ((cg) this).field_F.field_x = sj.field_d;
        ((cg) this).field_J.field_x = qf.field_b;
        ((cg) this).b((byte) 95, (gl) (Object) ((cg) this).field_G);
        ((cg) this).b((byte) 95, (gl) (Object) ((cg) this).field_F);
        ((cg) this).b((byte) 95, (gl) (Object) ((cg) this).field_J);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "    Covering Terrain";
    }
}
