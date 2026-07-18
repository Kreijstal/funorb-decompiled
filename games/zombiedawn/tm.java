/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class tm extends le {
    static int[] field_n;
    static vn field_m;
    static int[] field_i;
    static int[] field_l;
    static vn[] field_h;
    fn field_j;
    static int[] field_k;
    static String field_o;

    final static void a(int param0, int param1, int param2, vn[] param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param5 > 0) {
                  var6_int = param3[0].field_r;
                  var7 = param3[2].field_r;
                  var8 = param3[1].field_r;
                  param3[0].c(param0, param2, param4);
                  param3[2].c(-var7 + (param5 + param0), param2, param4);
                  bi.b(eo.field_c);
                  bi.c(param0 + var6_int, param2, param5 + param0 + -var7, param3[1].field_q + param2);
                  var9 = param0 + var6_int;
                  var10 = param0 + param5 + -var7;
                  param0 = var9;
                  L2: while (true) {
                    if (param0 >= var10) {
                      bi.a(eo.field_c);
                      break L0;
                    } else {
                      param3[1].c(param0, param2, param4);
                      param0 = param0 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("tm.E(").append(param0).append(',').append(32421).append(',').append(param2).append(',');
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
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static Class b(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        Class stackIn_30_0 = null;
        Class stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_6_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_31_0 = null;
        Class stackOut_29_0 = null;
        Object stackOut_26_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_9_0 = null;
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
            if (param1.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1.equals((Object) (Object) "I")) {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (!param1.equals((Object) (Object) "S")) {
                  if (!param1.equals((Object) (Object) "J")) {
                    if (!param1.equals((Object) (Object) "Z")) {
                      if (param1.equals((Object) (Object) "F")) {
                        stackOut_19_0 = Float.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (param1.equals((Object) (Object) "D")) {
                          stackOut_23_0 = Double.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (param0 > 64) {
                            if (!param1.equals((Object) (Object) "C")) {
                              stackOut_31_0 = Class.forName(param1);
                              stackIn_32_0 = stackOut_31_0;
                              break L0;
                            } else {
                              stackOut_29_0 = Character.TYPE;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            }
                          } else {
                            stackOut_26_0 = null;
                            stackIn_27_0 = stackOut_26_0;
                            return (Class) (Object) stackIn_27_0;
                          }
                        }
                      }
                    } else {
                      stackOut_15_0 = Boolean.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = Long.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("tm.B(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return stackIn_32_0;
    }

    public static void a() {
        field_o = null;
        field_m = null;
        field_l = null;
        field_i = null;
        field_n = null;
        field_k = null;
        field_h = null;
    }

    final static eo a(byte param0, String param1) {
        RuntimeException var2 = null;
        eo stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        eo stackOut_5_0 = null;
        Object stackOut_7_0 = null;
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
            if (vh.field_c != tk.field_a) {
              L1: {
                if (tk.field_a != hm.field_H) {
                  break L1;
                } else {
                  if (!param1.equals((Object) (Object) kk.field_k)) {
                    break L1;
                  } else {
                    tk.field_a = ic.field_S;
                    stackOut_5_0 = r.field_G;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
              r.field_G = null;
              tk.field_a = vh.field_c;
              kk.field_k = param1;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("tm.C(").append(51).append(',');
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return (eo) (Object) stackIn_8_0;
    }

    tm(int param0) {
        ((tm) this).field_j = fn.a(vb.field_D[param0], 100, 256);
        hn discarded$0 = aa.a(120, ((tm) this).field_j);
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        boolean[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        boolean[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        boolean[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        boolean[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        boolean[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          var9 = new int[1 + tl.field_g.length];
          var19 = var9;
          var16 = var19;
          var13 = var16;
          var10 = var13;
          var4 = var10;
          var20 = new int[tl.field_g.length + 1];
          var17 = var20;
          var14 = var17;
          var11 = var14;
          var5 = var11;
          var21 = new boolean[1 + tl.field_g.length];
          var18 = var21;
          var15 = var18;
          var12 = var15;
          var6 = var12;
          var7 = 0;
          L0: while (true) {
            if (tl.field_g.length <= var7) {
              var4[-1 + var19.length] = param0;
              var5[var20.length + -1] = param3;
              var6[-1 + var21.length] = param2;
              oo.field_U = var5;
              ka.field_h = var6;
              tl.field_g = var4;
              return;
            } else {
              var9[var7] = tl.field_g[var7];
              var5[var7] = oo.field_U[var7];
              var6[var7] = ka.field_h[var7];
              var7++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var4_ref, "tm.D(" + param0 + ',' + -77 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[9];
        field_n = new int[9];
        field_k = new int[9];
        field_i = new int[9];
        field_n[0] = 320;
        field_i[0] = 5;
        field_l[0] = 3;
        field_k[0] = 47;
        field_n[1] = 344;
        field_i[1] = 5;
        field_l[1] = 4;
        field_n[2] = 376;
        field_k[1] = 50;
        field_i[2] = 5;
        field_l[2] = 3;
        field_n[3] = 400;
        field_k[2] = 47;
        field_i[3] = 5;
        field_l[3] = 3;
        field_k[3] = 47;
        field_n[4] = 424;
        field_i[4] = 5;
        field_l[4] = 3;
        field_k[4] = 47;
        field_n[5] = 296;
        field_i[5] = 6;
        field_l[5] = 3;
        field_k[5] = 44;
        field_n[6] = 272;
        field_i[6] = 6;
        field_l[6] = 3;
        field_n[7] = 216;
        field_k[6] = 44;
        field_i[7] = 5;
        field_l[7] = 4;
        field_n[8] = 192;
        field_k[7] = 55;
        field_i[8] = 5;
        field_l[8] = 3;
        field_k[8] = 47;
    }
}
