/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le extends rd {
    static float[] field_s;
    private int[] field_q;
    static e field_u;
    static int field_r;
    static int[][] field_o;
    static ah field_n;
    static String field_p;
    static int field_t;
    static hj field_m;

    le(int param0, float param1, int[] param2) {
        try {
            ((le) this).field_c = param0 / 2;
            ((le) this).field_h = param0 + -((le) this).field_c;
            ((le) this).field_q = param2;
            ((le) this).field_i = ((le) this).field_q.length;
            ((le) this).field_k = (float)((le) this).field_i * param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "le.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_s = null;
        field_u = null;
        field_m = null;
        field_p = null;
        field_o = null;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var17 = HoldTheLine.field_D;
        try {
          L0: {
            var18 = new int[param3.length + param0.length];
            var22 = var18;
            var21 = var22;
            var20 = var21;
            var19 = var20;
            var5_array = var19;
            var6 = 0;
            L1: while (true) {
              if (param0.length <= var6) {
                if (param2 <= -49) {
                  var6 = 0;
                  L2: while (true) {
                    if (param3.length / 2 <= var6) {
                      var7 = ((le) this).field_q[param1 % ((le) this).field_i];
                      if (var7 != 0) {
                        gf.a(var22, var7);
                        var8 = param0[0];
                        var9 = param0[1];
                        var6 = 2;
                        L3: while (true) {
                          if (param0.length <= var6) {
                            var9 = param3[1];
                            var8 = param3[0];
                            var6 = 2;
                            L4: while (true) {
                              if (var6 >= param3.length) {
                                break L0;
                              } else {
                                var10 = param3[var6];
                                var11 = param3[var6 + 1];
                                var12 = (float)(var10 + -var8);
                                var13 = (float)(var11 - var9);
                                var14 = (float)Math.sqrt((double)(var13 * var13 + var12 * var12));
                                var12 = var12 / var14;
                                var13 = var13 / var14;
                                var15 = (4.0f - var12 + var13) * 0.25f;
                                var16 = lk.a(var15, -1, var7);
                                tc.d(var8, var9, var10, var11, var16);
                                var8 = var10;
                                var9 = var11;
                                var6 += 2;
                                continue L4;
                              }
                            }
                          } else {
                            var10 = param0[var6];
                            var11 = param0[1 + var6];
                            var12 = (float)(var10 - var8);
                            var13 = (float)(-var9 + var11);
                            var14 = (float)Math.sqrt((double)(var12 * var12 + var13 * var13));
                            var13 = var13 / var14;
                            var12 = var12 / var14;
                            var15 = (var12 - var13 + 4.0f) * 0.25f;
                            var16 = lk.a(var15, -1, var7);
                            tc.d(var8, var9, var10, var11, var16);
                            var9 = var11;
                            var8 = var10;
                            var6 += 2;
                            continue L3;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      var5_array[param0.length + var6 * 2] = param3[-2 + (param3.length - 2 * var6)];
                      var5_array[param0.length - -(2 * var6) - -1] = param3[-(var6 * 2) + (param3.length + -1)];
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                var18[var6] = param0[var6];
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("le.D(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    final static hj[] a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hj[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -59 / ((-61 - param1) / 34);
            stackOut_0_0 = si.a(fb.field_i, 33, param0, "");
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("le.C(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            IOException var2 = null;
            da var4 = null;
            da var5 = null;
            int stackIn_10_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_8_0 = 0;
            L0: {
              if (null != gg.field_N) {
                break L0;
              } else {
                gg.field_N = na.field_s.a(0, bo.field_e, uj.field_f);
                break L0;
              }
            }
            if (gg.field_N.field_d == 0) {
              return false;
            } else {
              long dupTemp$2 = bb.b(-1);
              qf.field_l = dupTemp$2;
              cm.field_b = dupTemp$2;
              if (gg.field_N.field_d == 1) {
                try {
                  L1: {
                    L2: {
                      lk.field_h = new nn((java.net.Socket) gg.field_N.field_b, na.field_s);
                      var4 = rd.field_e;
                      var5 = var4;
                      da.field_p.field_l = 0;
                      var5.field_l = 0;
                      d.field_f = a.field_S;
                      if (!param0) {
                        stackOut_9_0 = -1;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = -2;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    ab.field_pb = stackIn_10_0;
                    hc.field_e = stackIn_10_0;
                    rd.field_l = stackIn_10_0;
                    ui.a(de.field_L, (byte) -95, (th) (Object) da.field_p, ci.field_n, ce.field_m);
                    qn.a(-1, 0);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  d.field_f = vh.field_a;
                  gg.field_N = null;
                  return true;
                }
                gg.field_N = null;
                return true;
              } else {
                d.field_f = vh.field_a;
                gg.field_N = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static qm a(wc[] param0, float param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        qm stackIn_5_0 = null;
        qm stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        qm stackOut_4_0 = null;
        qm stackOut_6_0 = null;
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
              var3_int = (int)param1;
              if (param2 <= -53) {
                break L1;
              } else {
                qm discarded$2 = le.a((wc[]) null, 0.40464261174201965f, (byte) 29);
                break L1;
              }
            }
            L2: {
              var4 = (float)(-var3_int) + param1;
              if (var4 != 0.0f) {
                break L2;
              } else {
                if (param0.length != var3_int) {
                  break L2;
                } else {
                  stackOut_4_0 = param0[var3_int - 1].a(false, 1.0f);
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
            stackOut_6_0 = param0[var3_int].a(false, var4);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("le.E(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new e(6, 0, 4, 2);
        field_o = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
        field_p = "This password contains your Player Name, and would be easy to guess";
        field_n = new ah();
    }
}
