/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends am {
    static db field_s;
    private int field_t;
    private int field_u;
    private int field_v;

    final void a(byte param0) {
        if (param0 <= 123) {
            return;
        }
        ie.a(14837);
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          var11 = Torquing.field_u;
          if (param0 > 86) {
            break L0;
          } else {
            field_s = null;
            break L0;
          }
        }
        var16 = ((sd) this).field_l.a(param1, 25657);
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (((sd) this).field_l.field_b) {
          var4 = dp.field_a[param1];
          var5 = -2048 + var4 >> 1;
          var6 = 0;
          L1: while (true) {
            if (ci.field_c > var6) {
              L2: {
                var8 = q.field_b[var6];
                var9 = var8 + -2048 >> 1;
                if (((sd) this).field_v == 0) {
                  var7 = ((sd) this).field_u * (-var4 + var8);
                  break L2;
                } else {
                  var10 = var9 * var9 + var5 * var5 >> 12;
                  var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0f)) * 4096.0);
                  var7 = (int)(3.141592653589793 * (double)(((sd) this).field_u * var7));
                  break L2;
                }
              }
              L3: {
                var7 = var7 - (var7 & -4096);
                if (((sd) this).field_t == 0) {
                  var7 = jh.field_x[(var7 & 4091) >> 4] + 4096 >> 1;
                  break L3;
                } else {
                  if (2 != ((sd) this).field_t) {
                    break L3;
                  } else {
                    L4: {
                      var7 -= 2048;
                      if (var7 >= 0) {
                        break L4;
                      } else {
                        var7 = -var7;
                        break L4;
                      }
                    }
                    var7 = 2048 - var7 << 1;
                    var16[var6] = var7;
                    var6++;
                    continue L1;
                  }
                }
              }
              var16[var6] = var7;
              var6++;
              continue L1;
            } else {
              return var12;
            }
          }
        } else {
          return var12;
        }
    }

    final static void a(rm param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        byte[] var4 = null;
        short[] var5 = null;
        short[] var6 = null;
        short[] var7 = null;
        byte[] var8 = null;
        short[] var9 = null;
        short[] var10 = null;
        short[] var11 = null;
        byte[] var12 = null;
        short[] var13 = null;
        short[] var14 = null;
        short[] var15 = null;
        byte[] var16 = null;
        short[] var17 = null;
        short[] var18 = null;
        short[] var19 = null;
        byte[] var20 = null;
        short[] var21 = null;
        short[] var22 = null;
        short[] var23 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param0.field_u == null) {
              param0.field_u = new short[param1];
              param0.field_n = new short[param1];
              param0.field_x = new short[param1];
              param0.field_s = new byte[param1];
              return;
            } else {
              if (param1 + param0.field_k >= param0.field_u.length) {
                var3_int = (3 + 3 * param0.field_k) / 2;
                var20 = new byte[var3_int];
                var16 = var20;
                var12 = var16;
                var8 = var12;
                var4 = var8;
                var21 = new short[var3_int];
                var17 = var21;
                var13 = var17;
                var9 = var13;
                var5 = var9;
                var22 = new short[var3_int];
                var18 = var22;
                var14 = var18;
                var10 = var14;
                var6 = var10;
                var23 = new short[var3_int];
                var19 = var23;
                var15 = var19;
                var11 = var15;
                var7 = var11;
                dk.a(param0.field_s, 0, var20, 0, param0.field_k);
                dk.a(param0.field_u, 0, var21, 0, param0.field_k);
                dk.a(param0.field_n, 0, var22, 0, param0.field_k);
                dk.a(param0.field_x, 0, var23, 0, param0.field_k);
                param0.field_s = var4;
                param0.field_n = var6;
                param0.field_u = var5;
                param0.field_x = var7;
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("sd.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + 0 + 41);
        }
    }

    public static void g(byte param0) {
        int var1 = 127;
        field_s = null;
    }

    public sd() {
        super(0, true);
        ((sd) this).field_t = 0;
        ((sd) this).field_u = 1;
        ((sd) this).field_v = 0;
    }

    final static la a(boolean param0, int param1, byte param2, int param3, boolean param4) {
        if (param2 > -62) {
            return null;
        }
        return hc.a(false, param0, param3, 8505, false, param1);
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 2) {
          L0: {
            boolean discarded$8 = sd.b(107);
            if (qk.field_q.c(484)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (qk.field_q.c(484)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = Torquing.field_u;
        try {
          if (param1 == 35) {
            var4_int = param2;
            if (0 == var4_int) {
              ((sd) this).field_v = param0.i((byte) -101);
              return;
            } else {
              if (var4_int == 1) {
                ((sd) this).field_t = param0.i((byte) -101);
                return;
              } else {
                if (3 == var4_int) {
                  ((sd) this).field_u = param0.i((byte) -101);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("sd.H(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L0;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L0;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
    }
}
