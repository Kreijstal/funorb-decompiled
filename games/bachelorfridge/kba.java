/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kba extends k {
    private int field_k;

    final void d(byte param0) {
        gea.a(4231);
        if (param0 != -68) {
            Object var3 = null;
            ((kba) this).a((byte) 21, (lu) null, 123);
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -71) {
                break L1;
              } else {
                var6 = null;
                ((kba) this).a((byte) 39, (lu) null, -88);
                break L1;
              }
            }
            var4_int = param2;
            if (var4_int != 0) {
              if (1 == var4_int) {
                L2: {
                  stackOut_8_0 = this;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (param1.b(16711935) != 1) {
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
                ((kba) this).field_f = stackIn_11_1 != 0;
                break L0;
              } else {
                return;
              }
            } else {
              ((kba) this).field_k = param1.e((byte) 76) << 4;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("kba.E(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final int[][] a(boolean param0, int param1) {
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
        int[] var24 = null;
        int[] var25 = null;
        int[][] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[][] var37 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[][] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[][] var44 = null;
        var17 = BachelorFridge.field_y;
        var37 = ((kba) this).field_h.a(param1, -858);
        var28 = var37;
        var23 = var28;
        var19 = var23;
        var18 = var19;
        var3 = var18;
        if (!param0) {
          if (((kba) this).field_h.field_b) {
            var42 = ((kba) this).a(1, param1, (byte) 109);
            var43 = ((kba) this).a(2, param1, (byte) 126);
            var6 = var37[0];
            var7 = var37[1];
            var8 = var37[2];
            var9 = 0;
            L0: while (true) {
              if (hh.field_d > var9) {
                var10 = 255 * var42[var9] >> 12 & 255;
                var11 = var43[var9] * ((kba) this).field_k >> 12;
                var12 = var11 * am.field_R[var10] >> 12;
                var13 = baa.field_z[var10] * var11 >> 12;
                var14 = var9 + (var12 >> 12) & wp.field_r;
                var15 = param1 + (var13 >> 12) & it.field_r;
                var44 = ((kba) this).a((byte) -82, 0, var15);
                var6[var9] = var44[0][var14];
                var7[var9] = var44[1][var14];
                var8[var9] = var44[2][var14];
                var9++;
                continue L0;
              } else {
                return var18;
              }
            }
          } else {
            return var18;
          }
        } else {
          int[][] discarded$1 = ((kba) this).a(false, -31);
          if (((kba) this).field_h.field_b) {
            var39 = ((kba) this).a(1, param1, (byte) 109);
            var30 = var39;
            var24 = var30;
            var40 = ((kba) this).a(2, param1, (byte) 126);
            var31 = var40;
            var25 = var31;
            var6 = var37[0];
            var7 = var37[1];
            var8 = var37[2];
            var9 = 0;
            L1: while (true) {
              if (hh.field_d > var9) {
                var10 = 255 * var39[var9] >> 12 & 255;
                var11 = var40[var9] * ((kba) this).field_k >> 12;
                var12 = var11 * am.field_R[var10] >> 12;
                var13 = baa.field_z[var10] * var11 >> 12;
                var14 = var9 + (var12 >> 12) & wp.field_r;
                var15 = param1 + (var13 >> 12) & it.field_r;
                var41 = ((kba) this).a((byte) -82, 0, var15);
                var6[var9] = var41[0][var14];
                var7[var9] = var41[1][var14];
                var8[var9] = var41[2][var14];
                var9++;
                continue L1;
              } else {
                return var18;
              }
            }
          } else {
            return var18;
          }
        }
    }

    public kba() {
        super(3, false);
        ((kba) this).field_k = 32768;
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        var14 = BachelorFridge.field_y;
        var15 = ((kba) this).field_j.a(param0, -1);
        var3 = var15;
        if (((kba) this).field_j.field_m) {
          var25 = ((kba) this).a(1, param0, (byte) 123);
          var26 = ((kba) this).a(2, param0, (byte) 108);
          var6 = 0;
          L0: while (true) {
            if (hh.field_d > var6) {
              var7 = var25[var6] >> 4 & 255;
              var8 = ((kba) this).field_k * var26[var6] >> 12;
              var9 = var8 * am.field_R[var7] >> 12;
              var10 = baa.field_z[var7] * var8 >> 12;
              var11 = wp.field_r & (var9 >> 12) + var6;
              var12 = param0 - -(var10 >> 12) & it.field_r;
              var27 = ((kba) this).a(0, var12, (byte) 105);
              var15[var6] = var27[var11];
              var6++;
              continue L0;
            } else {
              if (param1 != 0) {
                ((kba) this).field_k = -80;
                return var3;
              } else {
                return var3;
              }
            }
          }
        } else {
          if (param1 != 0) {
            ((kba) this).field_k = -80;
            return var3;
          } else {
            return var3;
          }
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var2_int = de.d(hka.field_i, -257, hea.field_r);
              if (var2_int != 1) {
                break L1;
              } else {
                param1 = "<img=0>" + param1;
                break L1;
              }
            }
            L2: {
              if (param0 <= -120) {
                break L2;
              } else {
                var3 = null;
                String discarded$2 = kba.a(-83, (String) null);
                break L2;
              }
            }
            L3: {
              if (var2_int == 2) {
                param1 = "<img=1>" + param1;
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_7_0 = (String) param1;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("kba.C(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    static {
    }
}
