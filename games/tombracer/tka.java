/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tka extends vpa {
    private hja[] field_o;
    static volatile int field_n;
    static nh field_p;
    static jea field_q;

    tka(hja[] param0) {
        try {
            ((tka) this).field_e = mj.field_J;
            ((tka) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tka.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void c() {
        field_p = null;
        field_q = null;
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 46) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            L2: {
              if (ou.field_e == null) {
                break L2;
              } else {
                if (lm.field_r == null) {
                  break L2;
                } else {
                  return;
                }
              }
            }
            lm.field_r = new int[256];
            ou.field_e = new int[256];
            var1_int = 0;
            L3: while (true) {
              if (256 <= var1_int) {
                break L0;
              } else {
                var2 = (double)var1_int / 255.0 * 6.283185307179586;
                ou.field_e[var1_int] = (int)(Math.sin(var2) * 4096.0);
                lm.field_r[var1_int] = (int)(4096.0 * Math.cos(var2));
                var1_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "tka.A(" + param0 + 41);
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hja var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              bea.f(param1 - -param0.field_i, param3 - -param0.field_n, param0.field_m, param0.field_p, 10197915);
              if (param4) {
                if (((rj) (Object) param0).field_w) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 0;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param4) {
                if (param0.b((byte) -34)) {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_12_0 = stackOut_7_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_12_0;
              var8 = 0;
              if (var6_int == 0) {
                stackOut_14_0 = 16777215;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_13_0 = 2394342;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_15_0;
              if (var7 == 0) {
                break L4;
              } else {
                var8 = var8 | 2;
                break L4;
              }
            }
            L5: {
              if (var6_int == 0) {
                break L5;
              } else {
                var8 = var8 | 1;
                break L5;
              }
            }
            var10 = ((tka) this).field_o[var8];
            var11 = param0.field_i + param1 - -((-var10.field_a + param0.field_m) / 2);
            var12 = (param0.field_p + -var10.field_b) / 2 + (param0.field_n + param3);
            var13 = param1 + (param0.field_i + param0.field_m / 2);
            var10.b(var11, var12);
            ((tka) this).field_e.a(((tka) this).d(-4, param0), var13, param3, var9, -1);
            if (param2 == 16777215) {
              break L0;
            } else {
              tka.b((byte) 56);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6;
            stackOut_22_1 = new StringBuilder().append("tka.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
    }
}
