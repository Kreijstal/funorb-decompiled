/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ksa extends ci {
    static String field_n;
    private int field_m;
    static int field_p;
    private int field_q;
    private int field_o;

    public ksa() {
        super(1, false);
        ((ksa) this).field_q = 2048;
        ((ksa) this).field_m = 1024;
        ((ksa) this).field_o = 3072;
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != -19514) {
            ksa.c(80);
        }
    }

    final static void a(boolean param0, kia param1) {
        try {
            kh.a(param0, param1, qla.field_f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ksa.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int[] c(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
            int[][] discarded$0 = ((ksa) this).b(79, -115);
        }
        int[] var7 = ((ksa) this).field_i.a((byte) 64, param1);
        int[] var3 = var7;
        if (((ksa) this).field_i.field_d) {
            var4 = ((ksa) this).c(0, -10, param1);
            for (var5 = 0; var5 < ns.field_g; var5++) {
                var7[var5] = (((ksa) this).field_q * var4[var5] >> 12) + ((ksa) this).field_m;
            }
        }
        return var3;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 == var4_int) {
                ((ksa) this).field_m = param1.d(param0 ^ 18);
                break L1;
              } else {
                if (var4_int != 1) {
                  if (var4_int == 2) {
                    L2: {
                      stackOut_8_0 = this;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (param1.h(255) != 1) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L2;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L2;
                      }
                    }
                    ((ksa) this).field_g = stackIn_11_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((ksa) this).field_o = param1.d(param0 ^ 20);
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == 107) {
                break L3;
              } else {
                field_n = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ksa.A(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
    }

    final void b(byte param0) {
        if (param0 != 116) {
            ((ksa) this).field_m = 0;
        }
        ((ksa) this).field_q = -((ksa) this).field_m + ((ksa) this).field_o;
    }

    final int[][] b(int param0, int param1) {
        int[][] var30 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        int[][] var31 = ((ksa) this).field_h.a(param0, (byte) -46);
        int[][] var26 = var31;
        int[][] var21 = var26;
        int[][] var16 = var21;
        int[][] var14 = var16;
        int[][] var3 = var14;
        if (!(!((ksa) this).field_h.field_f)) {
            var30 = ((ksa) this).a(param0, 0, -1);
            var32 = var30[0];
            var33 = var30[1];
            var34 = var30[2];
            var8 = var31[0];
            var9 = var31[1];
            var10 = var31[2];
            for (var11 = 0; ns.field_g > var11; var11++) {
                var8[var11] = ((ksa) this).field_m + (var32[var11] * ((ksa) this).field_q >> 12);
                var9[var11] = (((ksa) this).field_q * var33[var11] >> 12) + ((ksa) this).field_m;
                var10[var11] = (((ksa) this).field_q * var34[var11] >> 12) + ((ksa) this).field_m;
            }
        }
        if (param1 != -1) {
            Object var13 = null;
            ksa.a(true, (kia) null);
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Software";
        field_p = 0;
    }
}
