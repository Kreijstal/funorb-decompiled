/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sba extends ci {
    static String field_o;
    static String field_n;
    static String field_m;

    public static void c(int param0) {
        if (param0 != -14063) {
            return;
        }
        field_n = null;
        field_m = null;
        field_o = null;
    }

    final int[][] b(int param0, int param1) {
        int[][] var19 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        int[][] var20 = ((sba) this).field_h.a(param0, (byte) -104);
        int[][] var15 = var20;
        int[][] var13 = var15;
        int[][] var3 = var13;
        if (param1 != -1) {
            return null;
        }
        if (!(!((sba) this).field_h.field_f)) {
            var19 = ((sba) this).a(param0, 0, -1);
            var21 = var19[0];
            var22 = var19[1];
            var23 = var19[2];
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            for (var11 = 0; var11 < ns.field_g; var11++) {
                var8[var11] = -var21[var11] + 4096;
                var9[var11] = -var22[var11] + 4096;
                var10[var11] = 4096 - var23[var11];
            }
        }
        return var13;
    }

    final static hja d(byte param0) {
        hja var1 = new hja(ika.field_a, kba.field_s, ak.field_p[0], pg.field_C[0], mq.field_b[0], iga.field_m[0], ck.field_c[0], mga.field_g);
        loa.a((byte) 127);
        return var1;
    }

    public sba() {
        super(1, false);
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                break L1;
              } else {
                L2: {
                  stackOut_1_0 = this;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (param1.h(255) != 1) {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    break L2;
                  } else {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L2;
                  }
                }
                ((sba) this).field_g = stackIn_4_1 != 0;
                break L1;
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
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("sba.A(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    final int[] c(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
            field_m = null;
        }
        int[] var7 = ((sba) this).field_i.a((byte) 63, param1);
        int[] var3 = var7;
        if (((sba) this).field_i.field_d) {
            var4 = ((sba) this).c(0, -106, param1);
            for (var5 = 0; ns.field_g > var5; var5++) {
                var7[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Reload game";
        field_o = "Named after their discoverer, these hotheads are incandescent with rage - as well as blazing masses of flame.";
        field_m = "You appear to be telling someone your password - please don't!";
    }
}
