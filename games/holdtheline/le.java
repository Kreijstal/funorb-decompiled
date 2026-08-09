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
            this.field_c = param0 / 2;
            this.field_h = param0 + -this.field_c;
            this.field_q = param2;
            this.field_i = this.field_q.length;
            this.field_k = (float)this.field_i * param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "le.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_s = null;
        field_u = null;
        field_m = null;
        field_p = null;
        if (!param0) {
            return;
        }
        field_o = (int[][]) null;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        int[] var5 = null;
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var17 = HoldTheLine.field_D;
        try {
          L0: {
            var18 = new int[param3.length + param0.length];
            var20 = var18;
            var19 = var20;
            var5 = var19;
            var6 = 0;
            L1: while (true) {
              if (param0.length <= var6) {
                if (param2 <= -49) {
                  var6 = 0;
                  L2: while (true) {
                    if (param3.length / 2 <= var6) {
                      var7 = this.field_q[param1 % this.field_i];
                      if (var7 != 0) {
                        gf.a(var20, var7);
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
                                decompiledRegionSelector0 = 2;
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
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      var5[param0.length + var6 * 2] = param3[-2 + (param3.length - 2 * var6)];
                      var5[param0.length - -(2 * var6) - -1] = param3[-(var6 * 2) + (param3.length + -1)];
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
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
            var5_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5_ref);

            stackIn_20_1 = new StringBuilder().append("le.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static hj[] a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hj[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -59 / ((-61 - param1) / 34);
            stackIn_1_0 = si.a(fb.field_i, 33, param0, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("le.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            long dupTemp$1 = 0L;
            IOException var2 = null;
            da var4 = null;
            da var5 = null;
            int stackIn_12_0 = 0;
            Throwable decompiledCaughtException = null;
            if (param1 == 105) {
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
                dupTemp$1 = bb.b(-1);
                qf.field_l = dupTemp$1;
                cm.field_b = dupTemp$1;
                if (gg.field_N.field_d == 1) {
                  try {
                    L1: {
                      L2: {
                        lk.field_h = new nn((java.net.Socket) (gg.field_N.field_b), na.field_s);
                        var4 = rd.field_e;
                        var5 = var4;
                        da.field_p.field_l = 0;
                        var5.field_l = 0;
                        d.field_f = a.field_S;
                        if (!param0) {
                          stackIn_12_0 = -1;
                          break L2;
                        } else {
                          stackIn_12_0 = -2;
                          break L2;
                        }
                      }
                      ab.field_pb = stackIn_12_0;
                      hc.field_e = stackIn_12_0;
                      rd.field_l = stackIn_12_0;
                      ui.a(de.field_L, (byte) -95, da.field_p, ci.field_n, ce.field_m);
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
            } else {
              return true;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = (int)param1;
              if (param2 <= -53) {
                break L1;
              } else {
                le.a((wc[]) null, 0.40464261174201965f, (byte) 29);
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
                  stackIn_5_0 = param0[var3_int - 1].a(false, 1.0f);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_7_0 = param0[var3_int].a(false, var4);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("le.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_u = new e(6, 0, 4, 2);
        field_o = new int[][]{new int[]{200, 2}, new int[]{500, 5}, new int[]{100, 1}, new int[]{100, 1}, new int[]{100, 1}, new int[]{100, 1}, new int[]{100, 1}, new int[]{200, 2}, new int[]{200, 2}, new int[]{200, 2}, new int[]{200, 2}, new int[]{300, 3}, new int[]{200, 2}, new int[]{300, 3}, new int[]{200, 2}, new int[]{300, 3}};
        field_p = "This password contains your Player Name, and would be easy to guess";
        field_n = new ah();
    }
}
