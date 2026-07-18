/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qv extends ci {
    private int field_q;
    private int field_n;
    private int field_p;
    private int field_r;
    static int field_m;
    static kb field_o;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            int[] discarded$1 = ((qv) this).c(94, -103);
            break L0;
          }
        }
        L1: {
          var15 = ((qv) this).field_i.a((byte) 20, param1);
          var3 = var15;
          if (!((qv) this).field_i.field_d) {
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= ns.field_g) {
                break L1;
              } else {
                var5 = (ht.field_Fb[var4] << 12) / ((qv) this).field_q + ((qv) this).field_n;
                var6 = (sj.field_b[param1] << 12) / ((qv) this).field_q + ((qv) this).field_p;
                var7 = var5;
                var8 = var6;
                var9 = var5;
                var10 = var6;
                var11 = var5 * var5 >> 12;
                var12 = var6 * var6 >> 12;
                var13 = 0;
                L3: while (true) {
                  L4: {
                    if (16384 <= var12 + var11) {
                      break L4;
                    } else {
                      if (((qv) this).field_r <= var13) {
                        break L4;
                      } else {
                        var10 = 2 * (var9 * var10 >> 12) - -var8;
                        var9 = var7 + var11 - var12;
                        var11 = var9 * var9 >> 12;
                        var12 = var10 * var10 >> 12;
                        var13++;
                        continue L3;
                      }
                    }
                  }
                  L5: {
                    stackOut_9_0 = (int[]) var15;
                    stackOut_9_1 = var4;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (((qv) this).field_r - 1 <= var13) {
                      stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L5;
                    } else {
                      stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = (var13 << 12) / ((qv) this).field_r;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L5;
                    }
                  }
                  stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var15;
    }

    final static int[][] a(boolean param0, int param1, int param2, float param3, int param4, byte param5) {
        int var11 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        if (param5 >= -46) {
            field_m = -82;
        }
        int[][] var15 = new int[256][64];
        int[][] var14 = var15;
        int[][] var13 = var14;
        int[][] var9 = var13;
        lva var10 = new lva();
        var10.field_x = (int)(param3 * 4096.0f);
        var10.field_n = 3;
        var10.field_s = false;
        var10.field_w = 4;
        var10.field_u = 4;
        var10.b((byte) 116);
        uta.a(0, 256, 64);
        for (var11 = 0; var11 < 256; var11++) {
            var10.a(var15[var11], -1, var11);
        }
        return var9;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                var4_int = param2;
                if (var4_int != 0) {
                  if (1 == var4_int) {
                    ((qv) this).field_r = param1.d(121);
                    break L1;
                  } else {
                    if (var4_int == 2) {
                      ((qv) this).field_n = param1.d(124);
                      break L1;
                    } else {
                      if (3 == var4_int) {
                        ((qv) this).field_p = param1.d(121);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  ((qv) this).field_q = param1.d(param0 + 16);
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
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("qv.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
        }
    }

    public static void a() {
        field_o = null;
    }

    public qv() {
        super(0, true);
        ((qv) this).field_q = 1365;
        ((qv) this).field_n = 0;
        ((qv) this).field_p = 0;
        ((qv) this).field_r = 20;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = null;
    }
}
