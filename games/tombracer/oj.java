/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oj extends jea {
    private int field_yb;
    static String field_zb;
    private jea field_Bb;
    private jea field_wb;
    static String field_vb;
    private jea field_Ab;
    private jea field_ub;
    private jea field_xb;
    private jea field_Cb;
    static boolean[] field_tb;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        jea var14 = null;
        jea var15 = null;
        jea var16 = null;
        jea var17 = null;
        jea var18 = null;
        jea var19 = null;
        jea stackIn_14_0 = null;
        jea stackIn_14_1 = null;
        jea stackIn_14_2 = null;
        jea stackIn_15_0 = null;
        jea stackIn_15_1 = null;
        jea stackIn_15_2 = null;
        jea stackIn_16_0 = null;
        jea stackIn_16_1 = null;
        jea stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        jea stackOut_13_0 = null;
        jea stackOut_13_1 = null;
        jea stackOut_13_2 = null;
        jea stackOut_15_0 = null;
        jea stackOut_15_1 = null;
        jea stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        jea stackOut_14_0 = null;
        jea stackOut_14_1 = null;
        jea stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        L0: {
          if (((oj) this).field_t < ((oj) this).field_G * 2) {
            var6 = ((oj) this).field_t / 2;
            var5 = ((oj) this).field_t / 2;
            break L0;
          } else {
            var5 = ((oj) this).field_G;
            var6 = -((oj) this).field_G + ((oj) this).field_t;
            break L0;
          }
        }
        L1: {
          var7 = var6 - var5;
          var8 = var7;
          if (param1 > 0) {
            L2: {
              var8 = var8 * param0 / param1;
              if (var8 >= ((oj) this).field_G) {
                break L2;
              } else {
                var8 = ((oj) this).field_G;
                break L2;
              }
            }
            if (var8 <= var7) {
              break L1;
            } else {
              var8 = var7;
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          var9 = -param0 + param1;
          var10 = var7 + -var8;
          if (param2 <= -60) {
            break L3;
          } else {
            field_tb = null;
            break L3;
          }
        }
        L4: {
          var11 = 0;
          if (0 >= var9) {
            break L4;
          } else {
            var11 = (param3 * var10 - -(var9 / 2)) / var9;
            break L4;
          }
        }
        L5: {
          var12 = var11 - -(var8 / 2);
          var14 = ((oj) this).field_Cb;
          var14.field_t = var5;
          var14.field_T = 0;
          var14.field_G = ((oj) this).field_G;
          var14.field_qb = 0;
          var15 = ((oj) this).field_Bb;
          var15.field_G = ((oj) this).field_G;
          var15.field_T = var6;
          var15.field_t = ((oj) this).field_t + -var6;
          var15.field_qb = 0;
          var16 = ((oj) this).field_ub;
          var16.field_G = ((oj) this).field_G;
          var16.field_t = var7;
          var16.field_T = var5;
          var16.field_qb = 0;
          var17 = ((oj) this).field_Ab;
          var17.field_t = var12;
          var17.field_qb = 0;
          var17.field_G = ((oj) this).field_G;
          var17.field_T = 0;
          var18 = ((oj) this).field_xb;
          var18.field_t = var7 + -var12;
          var18.field_T = var12;
          var18.field_G = ((oj) this).field_G;
          var18.field_qb = 0;
          var19 = ((oj) this).field_wb;
          var19.field_G = ((oj) this).field_G;
          var19.field_qb = 0;
          stackOut_13_0 = ((oj) this).field_Cb;
          stackOut_13_1 = ((oj) this).field_Bb;
          stackOut_13_2 = ((oj) this).field_ub;
          stackIn_15_0 = stackOut_13_0;
          stackIn_15_1 = stackOut_13_1;
          stackIn_15_2 = stackOut_13_2;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          stackIn_14_2 = stackOut_13_2;
          if (param1 <= param0) {
            stackOut_15_0 = (jea) (Object) stackIn_15_0;
            stackOut_15_1 = (jea) (Object) stackIn_15_1;
            stackOut_15_2 = (jea) (Object) stackIn_15_2;
            stackOut_15_3 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            stackIn_16_2 = stackOut_15_2;
            stackIn_16_3 = stackOut_15_3;
            break L5;
          } else {
            stackOut_14_0 = (jea) (Object) stackIn_14_0;
            stackOut_14_1 = (jea) (Object) stackIn_14_1;
            stackOut_14_2 = (jea) (Object) stackIn_14_2;
            stackOut_14_3 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_16_2 = stackOut_14_2;
            stackIn_16_3 = stackOut_14_3;
            break L5;
          }
        }
        stackIn_16_2.field_X = stackIn_16_3 != 0;
        stackIn_16_1.field_X = stackIn_16_3 != 0;
        stackIn_16_0.field_X = stackIn_16_3 != 0;
        var19.field_T = var11;
        var19.field_t = var8;
    }

    final static boolean i(int param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          var1 = bva.b((byte) -107);
          if (param0 == -1) {
            break L0;
          } else {
            field_tb = null;
            break L0;
          }
        }
        var3 = -vaa.field_b + var1;
        if (var3 > 30000L) {
          vaa.field_b = var1;
          gp.field_h = 0;
          return true;
        } else {
          L1: {
            var5 = 3000;
            if (gp.field_h >= 7) {
              var5 = 12000;
              break L1;
            } else {
              if (gp.field_h < 5) {
                if (gp.field_h < 3) {
                  break L1;
                } else {
                  var5 = 6000;
                  break L1;
                }
              } else {
                var5 = 9000;
                break L1;
              }
            }
          }
          if ((long)var5 >= var3) {
            return false;
          } else {
            gp.field_h = gp.field_h + 1;
            vaa.field_b = var1;
            return true;
          }
        }
    }

    final boolean h(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = oj.i(3);
        }
        return ((oj) this).field_wb.field_E != 0 ? true : false;
    }

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var5 = 0;
          var7 = 87 / ((param1 - -53) / 38);
          var6 = ((oj) this).field_ub.field_t + -((oj) this).field_wb.field_t;
          if (0 >= var6) {
            break L0;
          } else {
            var8 = ((oj) this).field_wb.field_T;
            var9 = param3 - param2;
            var5 = (var8 * var9 + var6 / 2) / var6;
            break L0;
          }
        }
        L1: {
          if (!param0) {
            L2: {
              if (-param2 + param3 < var5) {
                var5 = -param2 + param3;
                break L2;
              } else {
                break L2;
              }
            }
            if (0 <= var5) {
              break L1;
            } else {
              var5 = 0;
              break L1;
            }
          } else {
            L3: {
              if (var5 < 0) {
                var5 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            if (var5 <= param3 + -param2) {
              break L1;
            } else {
              var5 = param3 + -param2;
              break L1;
            }
          }
        }
        return var5;
    }

    oj(long param0, oj param1) {
        this(param0, param1.field_Cb, param1.field_Bb, param1.field_Ab, param1.field_wb);
    }

    final boolean f(int param0) {
        if (0 != ((oj) this).field_Ab.field_y) {
            ((oj) this).field_yb = 20;
            return true;
        }
        if (((oj) this).field_Ab.field_E != param0) {
            if (!(0 >= ((oj) this).field_yb)) {
                ((oj) this).field_yb = ((oj) this).field_yb - 1;
            }
            if (-1 == ((oj) this).field_yb) {
                if (sta.field_B < ((oj) this).field_wb.field_K + ((oj) this).field_wb.field_A) {
                    ((oj) this).field_yb = 3;
                    return true;
                }
            }
        }
        return false;
    }

    final boolean e(byte param0) {
        if (!(((oj) this).field_Cb.field_y == 0)) {
            ((oj) this).field_yb = 20;
            return true;
        }
        if (!(((oj) this).field_Cb.field_E == 0)) {
            if (!(0 >= ((oj) this).field_yb)) {
                ((oj) this).field_yb = ((oj) this).field_yb - 1;
            }
            if (((oj) this).field_yb == 0) {
                ((oj) this).field_yb = 3;
                return true;
            }
        }
        if (param0 >= -75) {
            boolean discarded$0 = oj.i(98);
            return false;
        }
        return false;
    }

    final boolean d(byte param0) {
        if (param0 != 40) {
            return true;
        }
        if (!(0 == ((oj) this).field_Bb.field_y)) {
            ((oj) this).field_yb = 20;
            return true;
        }
        if (-1 == ((oj) this).field_Bb.field_E) {
            return false;
        }
        if (!(-1 >= ((oj) this).field_yb)) {
            ((oj) this).field_yb = ((oj) this).field_yb - 1;
        }
        if (!(((oj) this).field_yb != 0)) {
            ((oj) this).field_yb = 3;
            return true;
        }
        return false;
    }

    public static void a() {
        field_vb = null;
        field_zb = null;
        field_tb = null;
    }

    final static int a(byte param0, ica param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          if (param0 >= 68) {
            if (ln.field_F != param1) {
              if (iw.field_c != param1) {
                if (r.field_m != param1) {
                  if (jv.field_m == param1) {
                    stackOut_17_0 = 260;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    if (param1 == gq.field_w) {
                      stackOut_15_0 = 34023;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                } else {
                  stackOut_10_0 = 34165;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = 8448;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = 7681;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = 109;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("oj.B(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L0;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L0;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final boolean g(int param0) {
        int var2 = 6 / ((1 - param0) / 41);
        if (((oj) this).field_xb.field_y != 0) {
            ((oj) this).field_yb = 20;
            return true;
        }
        if (((oj) this).field_xb.field_E != 0) {
            if (((oj) this).field_yb > 0) {
                ((oj) this).field_yb = ((oj) this).field_yb - 1;
            }
            if (((oj) this).field_yb == 0) {
                if (~sta.field_B > ~(((oj) this).field_wb.field_A - -((oj) this).field_wb.field_K - (-((oj) this).field_wb.field_t - ((oj) this).field_wb.field_O))) {
                    return false;
                }
                ((oj) this).field_yb = 3;
                return true;
            }
        }
        return false;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        ((oj) this).field_t = param5;
        ((oj) this).field_T = param7;
        if (param3) {
            boolean discarded$0 = ((oj) this).h(78);
        }
        ((oj) this).field_qb = param4;
        ((oj) this).field_G = param2;
        ((oj) this).a(param6, param0, (byte) -87, param1);
    }

    oj(long param0, jea param1, jea param2, jea param3, jea param4) {
        super(param0, (jea) null);
        RuntimeException var7 = null;
        jea var9 = null;
        jea var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((oj) this).field_Cb = new jea(0L, param1);
            ((oj) this).field_Bb = new jea(0L, param2);
            ((oj) this).b(-123, ((oj) this).field_Cb);
            ((oj) this).b(-124, ((oj) this).field_Bb);
            ((oj) this).field_ub = new jea(0L, (jea) null);
            ((oj) this).b(-128, ((oj) this).field_ub);
            ((oj) this).field_Ab = new jea(0L, param3);
            ((oj) this).field_xb = new jea(0L, param3);
            var9 = ((oj) this).field_Ab;
            var10 = var9;
            ((oj) this).field_xb.field_eb = true;
            var10.field_eb = true;
            ((oj) this).field_ub.b(-124, ((oj) this).field_Ab);
            ((oj) this).field_ub.b(-122, ((oj) this).field_xb);
            ((oj) this).field_wb = new jea(0L, param4);
            ((oj) this).field_wb.field_F = true;
            ((oj) this).field_ub.b(-123, ((oj) this).field_wb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("oj.<init>(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$0 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$1 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_vb = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_zb = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$2 = var0.toLowerCase();
        var0 = "~/";
        try {
            var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$3 = new File(var0);
        field_tb = new boolean[112];
    }
}
