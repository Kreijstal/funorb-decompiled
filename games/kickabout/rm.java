/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class rm extends qt {
    static String[] field_A;
    static boolean[] field_B;
    static int field_C;

    final static Class a(Object param0, byte param1) {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_8_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_28_0 = null;
        Class stackOut_24_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_4_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (!Integer.class.isInstance(param0)) {
              if (!Byte.class.isInstance(param0)) {
                if (Short.class.isInstance(param0)) {
                  stackOut_8_0 = Short.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  if (Long.class.isInstance(param0)) {
                    stackOut_12_0 = Long.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (!Boolean.class.isInstance(param0)) {
                      if (Float.class.isInstance(param0)) {
                        stackOut_19_0 = Float.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        L1: {
                          if (param1 >= 105) {
                            break L1;
                          } else {
                            rm.f(37);
                            break L1;
                          }
                        }
                        if (!Double.class.isInstance(param0)) {
                          if (Character.class.isInstance(param0)) {
                            stackOut_28_0 = Character.TYPE;
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackOut_24_0 = Double.TYPE;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      }
                    } else {
                      stackOut_15_0 = Boolean.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                }
              } else {
                stackOut_4_0 = Byte.TYPE;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = Integer.TYPE;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("rm.EA(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L2;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param1 + 41);
        }
        return stackIn_29_0;
    }

    rm() {
    }

    private final void a(int param0, int param1, byte param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        int stackIn_3_0 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        String stackOut_12_0 = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param7 % 2 == 0) {
                stackOut_2_0 = 128;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var10_int = stackIn_3_0;
            var11 = 18;
            if (param2 >= 99) {
              L2: {
                var12 = 140;
                on.a(((rm) this).field_j + var11, param8 - 17, var12, 25, 0, var10_int);
                var11 = 4 + (var11 - -var12);
                var12 = 36;
                on.a(((rm) this).field_j + var11, param8 - 17, var12, 25, 0, var10_int);
                var11 = 4 + var12 + var11;
                on.a(((rm) this).field_j + var11, param8 - 17, var12, 25, 0, var10_int);
                var11 = var12 + var11 - -4;
                on.a(((rm) this).field_j + var11, param8 - 17, var12, 25, 0, var10_int);
                var11 = 4 + var11 + var12;
                on.a(((rm) this).field_j + var11, -17 + param8, var12, 25, 0, var10_int);
                var11 = 4 + var12 + var11;
                on.a(var11 - -((rm) this).field_j, param8 - 17, var12, 25, 0, var10_int);
                var13 = param1 + (param4 - -param6);
                if (param7 == -1) {
                  break L2;
                } else {
                  q.field_d.c(param7 - -1 + ". ", ((rm) this).field_j + 35, param8, param5, -1);
                  break L2;
                }
              }
              L3: {
                if (var13 != 0) {
                  param4 = (var13 + param4 * 200) / (2 * var13);
                  param1 = (var13 + 200 * param1) / (2 * var13);
                  param6 = (param6 * 200 - -var13) / (2 * var13);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var15 = param3;
                q.field_d.a(var15, 35 + ((rm) this).field_j, param8, param5, -1);
                var14 = Integer.toString(param0);
                q.field_d.d(var14, ml.field_r[0] - -((rm) this).field_j, param8, param5, -1);
                if (9999 <= var13) {
                  stackOut_12_0 = "9999+";
                  stackIn_13_0 = stackOut_12_0;
                  break L4;
                } else {
                  stackOut_11_0 = Integer.toString(var13);
                  stackIn_13_0 = stackOut_11_0;
                  break L4;
                }
              }
              var16 = stackIn_13_0;
              var14 = var16;
              q.field_d.d(var16, ml.field_r[1] + ((rm) this).field_j, param8, param5, -1);
              var17 = param4 + "%";
              q.field_d.d(var17, ((rm) this).field_j + ml.field_r[2], param8, param5, -1);
              var14 = param1 + "%";
              q.field_d.d(var14, ml.field_r[3] - -((rm) this).field_j, param8, param5, -1);
              var18 = param6 + "%";
              q.field_d.d(var18, ((rm) this).field_j + ml.field_r[4], param8, param5, -1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var10;
            stackOut_15_1 = new StringBuilder().append("rm.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static qb b(int param0, byte param1) {
        return null != sr.field_f ? (qb) (Object) sr.field_f.a(-3611, (long)param0) : null;
    }

    private final void g(byte param0) {
        pb.field_C.d(sh.field_b, 192 + ((rm) this).field_j, q.field_d.field_G + 237, 16777215, -1);
    }

    final static void e(int param0) {
        np.field_Jb.a((gn) (Object) new pq(), 3);
    }

    final int b(int param0, int param1) {
        if (!la.a(100)) {
          if (0 != param0) {
            if (param1 == -22667) {
              if (param0 == 1) {
                return wr.field_f + (-((rm) this).field_i[param0].field_d + -5);
              } else {
                return super.b(param0, -22667);
              }
            } else {
              field_B = null;
              if (param0 == 1) {
                return wr.field_f + (-((rm) this).field_i[param0].field_d + -5);
              } else {
                return super.b(param0, -22667);
              }
            }
          } else {
            return 70;
          }
        } else {
          if (param0 != 0) {
            if (param0 != 1) {
              if (0 != param0) {
                if (param1 != -22667) {
                  field_B = null;
                  if (param0 == 1) {
                    return wr.field_f + (-((rm) this).field_i[param0].field_d + -5);
                  } else {
                    return super.b(param0, -22667);
                  }
                } else {
                  if (param0 == 1) {
                    return wr.field_f + (-((rm) this).field_i[param0].field_d + -5);
                  } else {
                    return super.b(param0, -22667);
                  }
                }
              } else {
                return 70;
              }
            } else {
              return -(((rm) this).field_i[1].field_d >> 1) + 340;
            }
          } else {
            return (((rm) this).field_i[0].field_d >> 1) + 25;
          }
        }
    }

    final static void a(boolean param0) {
        java.awt.Canvas var1 = null;
        if (!dr.field_a) {
            dr.field_a = true;
            var1 = ln.l(64);
            wt.field_x = el.field_A;
            us.field_j = n.field_m;
            wu discarded$0 = oo.field_c.a((byte) 76, 240, 320, (java.awt.Component) (Object) var1);
            wu discarded$1 = oo.field_c.a(-126, (java.awt.Component) (Object) var1, false);
            el.field_A = 320;
            n.field_m = 240;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        var3 = -89 / ((param0 - -49) / 52);
        if (!la.a(100)) {
          if (2 == param1) {
            return super.a(-101, param1);
          } else {
            return 410;
          }
        } else {
          return super.a(-101, param1);
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        var10 = Kickabout.field_G;
        pt.a(374 - -((rm) this).field_j, -22914, ((rm) this).field_j + 10, 390, 80);
        on.a(10 + ((rm) this).field_j, 80, 364, 320, 10, 0, 128);
        ta.e(126);
        super.a(param0, param1);
        if (la.a(param0 ^ -97)) {
          this.g((byte) -4);
          return;
        } else {
          L0: {
            if (ug.field_e != null) {
              break L0;
            } else {
              ug.field_e = jt.a(10, (byte) 100, 0, 7);
              break L0;
            }
          }
          var3 = 99;
          var4 = 11184810;
          q.field_d.d(wm.field_p, ml.field_r[0] - -((rm) this).field_j, var3, var4, -1);
          q.field_d.d(k.field_e, ((rm) this).field_j + ml.field_r[1], var3, var4, -1);
          q.field_d.d(mt.field_e, ((rm) this).field_j + ml.field_r[2], var3, var4, -1);
          q.field_d.d(ta.field_D, ml.field_r[3] - -((rm) this).field_j, var3, var4, -1);
          q.field_d.d(ku.field_e, ml.field_r[4] + ((rm) this).field_j, var3, var4, -1);
          var3 = var3 + (q.field_d.field_G - -8);
          if (ug.field_e.field_e) {
            if (null == ug.field_e.field_i) {
              var12 = bg.field_o;
              var13 = var12;
              var13 = var12;
              var3 = 385 - -q.field_d.field_G;
              un.field_d.d(var12.toLowerCase(), ((rm) this).field_j + 185, 260, 16777215, -1);
              return;
            } else {
              var5 = jw.field_Fb;
              var11 = ug.field_e.field_i[wv.field_ib];
              var6 = var11;
              var7 = ug.field_e.field_o[wv.field_ib];
              var8 = 0;
              var9 = 0;
              L1: while (true) {
                if (var9 >= 10) {
                  L2: {
                    if (var8 == 0) {
                      var4 = 16777215;
                      this.a(ug.field_e.field_f, ug.field_e.field_h, (byte) 105, ow.field_e, ug.field_e.field_m, var4, ug.field_e.field_j, -1, var3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var3 = 385 - -q.field_d.field_G;
                  un.field_d.d(var5.toLowerCase(), ((rm) this).field_j + 185, 260, 16777215, -1);
                  return;
                } else {
                  if (null != var11[var9]) {
                    L3: {
                      var4 = 16777215;
                      if (hm.a((byte) -101, var11[var9])) {
                        var4 = 16750882;
                        var8 = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var5 = "";
                    var13 = var5;
                    var13 = var5;
                    this.a(var7[4 * var9], var7[2 + 4 * var9], (byte) 104, var11[var9], var7[1 + 4 * var9], var4, var7[4 * var9 - -3], var9, var3);
                    var3 += 25;
                    var9++;
                    continue L1;
                  } else {
                    var3 += 25;
                    var9++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var5 = uf.field_a;
            var3 = 385 - -q.field_d.field_G;
            un.field_d.d(var5.toLowerCase(), ((rm) this).field_j + 185, 260, 16777215, -1);
            return;
          }
        }
    }

    public static void f(int param0) {
        field_B = null;
        field_A = null;
        if (param0 > -20) {
            field_C = 1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to KickaboutText.text_benefits."};
        field_C = -1;
    }
}
