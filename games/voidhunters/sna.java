/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class sna extends le {
    private int field_i;

    final int[][] a(int param0, int param1) {
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
          var17 = VoidHunters.field_G;
          if (param0 == 255) {
            break L0;
          } else {
            sna.d(-89);
            break L0;
          }
        }
        L1: {
          var31 = ((sna) this).field_d.a(param1, (byte) -127);
          var27 = var31;
          var23 = var27;
          var19 = var23;
          var18 = var19;
          var3 = var18;
          if (((sna) this).field_d.field_g) {
            var32 = ((sna) this).a(1, param1, 255);
            var33 = ((sna) this).a(2, param1, 255);
            var6 = var31[0];
            var7 = var31[1];
            var8 = var31[2];
            var9 = 0;
            L2: while (true) {
              if (hob.field_d <= var9) {
                break L1;
              } else {
                var10 = var32[var9] * 255 >> 12 & 255;
                var11 = ((sna) this).field_i * var33[var9] >> 12;
                var12 = jmb.field_q[var10] * var11 >> 12;
                var13 = qta.field_o[var10] * var11 >> 12;
                var14 = var9 - -(var12 >> 12) & gbb.field_q;
                var15 = wf.field_d & param1 + (var13 >> 12);
                var34 = ((sna) this).a((byte) 82, 0, var15);
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

    final static byte[] a(byte[] param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var4 = new byte[param1];
          var3 = var4;
          cua.a(param0, 0, var4, 0, param1);
          return var4;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("sna.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + 5666 + ')');
        }
    }

    final static Class a(Object param0, byte param1) {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_30_0 = null;
        Class stackOut_26_0 = null;
        Object stackOut_11_0 = null;
        Class stackOut_8_0 = null;
        Class stackOut_5_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            if (Integer.class.isInstance(param0)) {
              stackOut_2_0 = Integer.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!Byte.class.isInstance(param0)) {
                if (!Short.class.isInstance(param0)) {
                  if (param1 > 94) {
                    if (Long.class.isInstance(param0)) {
                      stackOut_15_0 = Long.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (Boolean.class.isInstance(param0)) {
                        stackOut_19_0 = Boolean.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (Float.class.isInstance(param0)) {
                          stackOut_23_0 = Float.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (!Double.class.isInstance(param0)) {
                            if (Character.class.isInstance(param0)) {
                              stackOut_30_0 = Character.TYPE;
                              stackIn_31_0 = stackOut_30_0;
                              break L0;
                            } else {
                              return null;
                            }
                          } else {
                            stackOut_26_0 = Double.TYPE;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          }
                        }
                      }
                    }
                  } else {
                    stackOut_11_0 = null;
                    stackIn_12_0 = stackOut_11_0;
                    return (Class) (Object) stackIn_12_0;
                  }
                } else {
                  stackOut_8_0 = Short.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = Byte.TYPE;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("sna.K(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L1;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param1 + ')');
        }
        return stackIn_31_0;
    }

    final static void d(int param0) {
        int var2 = VoidHunters.field_G;
        if ((1 << vqa.field_g.field_L & vqa.field_g.field_m.field_f) != -1) {
            ifa.field_g[8] = ut.field_a;
        } else {
            if (-1 != vqa.field_g.field_m.field_f) {
                ifa.field_g[8] = ema.field_q;
            } else {
                ifa.field_g[8] = ds.field_f;
            }
        }
        if (param0 != -19057) {
            sna.d(80);
        }
    }

    public sna() {
        super(3, false);
        ((sna) this).field_i = 32768;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 <= -60) {
                break L1;
              } else {
                ((sna) this).field_i = -36;
                break L1;
              }
            }
            L2: {
              var4_int = param0;
              if (var4_int != 0) {
                L3: {
                  if (var4_int != 1) {
                    break L3;
                  } else {
                    L4: {
                      stackOut_8_0 = this;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (param2.e((byte) -121) != 1) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L4;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L4;
                      }
                    }
                    ((sna) this).field_g = stackIn_11_1 != 0;
                    break L3;
                  }
                }
                break L2;
              } else {
                ((sna) this).field_i = param2.e(1869) << 4;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("sna.F(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] var25 = null;
        int[] var26 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var27 = null;
        int var14 = VoidHunters.field_G;
        int[] var15 = ((sna) this).field_f.a((byte) -42, param0);
        int[] var3 = var15;
        if (((sna) this).field_f.field_e) {
            var25 = ((sna) this).a(1, param0, 255);
            var26 = ((sna) this).a(2, param0, 255);
            for (var6 = 0; var6 < hob.field_d; var6++) {
                var7 = (4084 & var25[var6]) >> 4;
                var8 = var26[var6] * ((sna) this).field_i >> 12;
                var9 = var8 * jmb.field_q[var7] >> 12;
                var10 = var8 * qta.field_o[var7] >> 12;
                var11 = gbb.field_q & (var9 >> 12) + var6;
                var12 = wf.field_d & (var10 >> 12) + param0;
                var27 = ((sna) this).a(0, var12, 255);
                var15[var6] = var27[var11];
            }
        }
        if (!param1) {
            return null;
        }
        return var3;
    }

    final void c(byte param0) {
        taa.e((byte) 124);
        if (param0 >= -35) {
            ((sna) this).field_i = 33;
        }
    }

    static {
    }
}
