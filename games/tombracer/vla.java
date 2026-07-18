/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vla extends ci {
    static String field_m;
    private int field_n;

    final void b(byte param0) {
        if (param0 != 116) {
            ((vla) this).field_n = -128;
        }
        tka.b((byte) 48);
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var23 = null;
        int[][] var27 = null;
        int[][] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[][] var34 = null;
        L0: {
          var17 = TombRacer.field_G ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            ((vla) this).b((byte) -123);
            break L0;
          }
        }
        L1: {
          var31 = ((vla) this).field_h.a(param0, (byte) 115);
          var27 = var31;
          var23 = var27;
          var19 = var23;
          var18 = var19;
          var3 = var18;
          if (((vla) this).field_h.field_f) {
            var32 = ((vla) this).c(1, param1 + -21, param0);
            var33 = ((vla) this).c(2, -45, param0);
            var6 = var31[0];
            var7 = var31[1];
            var8 = var31[2];
            var9 = 0;
            L2: while (true) {
              if (var9 >= ns.field_g) {
                break L1;
              } else {
                var10 = 255 & 255 * var32[var9] >> 12;
                var11 = ((vla) this).field_n * var33[var9] >> 12;
                var12 = lm.field_r[var10] * var11 >> 12;
                var13 = ou.field_e[var10] * var11 >> 12;
                var14 = (var12 >> 12) + var9 & una.field_b;
                var15 = hba.field_b & (var13 >> 12) + param0;
                var34 = ((vla) this).a(var15, 0, -1);
                var6[var9] = var34[0][var14];
                var7[var9] = var34[1][var14];
                var8[var9] = var34[2][var14];
                var9++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var18;
    }

    public vla() {
        super(3, false);
        ((vla) this).field_n = 32768;
    }

    final int[] c(int param0, int param1) {
        int[] var26 = null;
        int[] var27 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var28 = null;
        int var14 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
            Object var15 = null;
            ((vla) this).a((byte) 85, (uia) null, -36);
        }
        int[] var16 = ((vla) this).field_i.a((byte) -128, param1);
        int[] var3 = var16;
        if (((vla) this).field_i.field_d) {
            var26 = ((vla) this).c(1, param0 + -85, param1);
            var27 = ((vla) this).c(2, -119, param1);
            for (var6 = 0; var6 < ns.field_g; var6++) {
                var7 = (4094 & var26[var6]) >> 4;
                var8 = ((vla) this).field_n * var27[var6] >> 12;
                var9 = lm.field_r[var7] * var8 >> 12;
                var10 = ou.field_e[var7] * var8 >> 12;
                var11 = var6 + (var9 >> 12) & una.field_b;
                var12 = hba.field_b & (var10 >> 12) + param1;
                var28 = ((vla) this).c(0, -27, var12);
                var16[var6] = var28[var11];
            }
        }
        return var3;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                ((vla) this).field_n = param1.d(122) << 4;
                break L1;
              } else {
                if (1 == var4_int) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (param1.h(255) != 1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((vla) this).field_g = stackIn_7_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == 107) {
                break L3;
              } else {
                ((vla) this).field_n = -22;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("vla.A(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 2) {
            return;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Orb coins: <%0>";
    }
}
