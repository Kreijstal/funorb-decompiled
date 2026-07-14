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
        ((le) this).field_c = param0 / 2;
        ((le) this).field_h = param0 + -((le) this).field_c;
        ((le) this).field_q = param2;
        ((le) this).field_i = ((le) this).field_q.length;
        ((le) this).field_k = (float)((le) this).field_i * param1;
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
        field_o = null;
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
        int[] var21 = null;
        int[] var22 = null;
        var17 = HoldTheLine.field_D;
        var18 = new int[param3.length + param0.length];
        var22 = var18;
        var21 = var22;
        var20 = var21;
        var19 = var20;
        var5 = var19;
        var6 = 0;
        L0: while (true) {
          if (param0.length <= var6) {
            if (param2 <= -49) {
              var6 = 0;
              L1: while (true) {
                if (param3.length / 2 <= var6) {
                  var7 = ((le) this).field_q[param1 % ((le) this).field_i];
                  if (var7 == 0) {
                    return;
                  } else {
                    gf.a(var22, var7);
                    var8 = param0[0];
                    var9 = param0[1];
                    var6 = 2;
                    L2: while (true) {
                      if (param0.length <= var6) {
                        var9 = param3[1];
                        var8 = param3[0];
                        var6 = 2;
                        L3: while (true) {
                          if (var6 >= param3.length) {
                            return;
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
                            continue L3;
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
                        continue L2;
                      }
                    }
                  }
                } else {
                  var5[param0.length + var6 * 2] = param3[-2 + (param3.length - 2 * var6)];
                  var5[param0.length - -(2 * var6) - -1] = param3[-(var6 * 2) + (param3.length + -1)];
                  var6++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            var18[var6] = param0[var6];
            var6++;
            continue L0;
          }
        }
    }

    final static hj[] a(String param0, int param1) {
        int var2 = -59 / ((-61 - param1) / 34);
        return si.a(fb.field_i, 33, param0, "");
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            IOException var2 = null;
            da var4 = null;
            da var5 = null;
            int stackIn_12_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param1 == 105) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        if (null != gg.field_N) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        gg.field_N = na.field_s.a(0, bo.field_e, uj.field_f);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (gg.field_N.field_d == 0) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return false;
                    }
                    case 7: {
                        qf.field_l = bb.b(-1);
                        cm.field_b = bb.b(-1);
                        if (gg.field_N.field_d == 1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        d.field_f = vh.field_a;
                        gg.field_N = null;
                        return true;
                    }
                    case 9: {
                        try {
                            lk.field_h = new nn((java.net.Socket) gg.field_N.field_b, na.field_s);
                            var4 = rd.field_e;
                            var5 = var4;
                            da.field_p.field_l = 0;
                            var5.field_l = 0;
                            d.field_f = a.field_S;
                            if (!param0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = -2;
                            stackIn_12_0 = stackOut_10_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = -1;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ab.field_pb = stackIn_12_0;
                            hc.field_e = stackIn_12_0;
                            rd.field_l = stackIn_12_0;
                            ui.a(de.field_L, (byte) -95, (th) (Object) da.field_p, ci.field_n, ce.field_m);
                            qn.a(-1, 0);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        gg.field_N = null;
                        return true;
                    }
                    case 14: {
                        var2 = (IOException) (Object) caughtException;
                        d.field_f = vh.field_a;
                        gg.field_N = null;
                        return true;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static qm a(wc[] param0, float param1, byte param2) {
        int var3 = 0;
        float var4 = 0.0f;
        var3 = (int)param1;
        if (param2 <= -53) {
          var4 = (float)(-var3) + param1;
          if (var4 == 0.0f) {
            if (param0.length != var3) {
              return param0[var3].a(false, var4);
            } else {
              return param0[var3 - 1].a(false, 1.0f);
            }
          } else {
            return param0[var3].a(false, var4);
          }
        } else {
          qm discarded$2 = le.a((wc[]) null, 0.40464261174201965f, (byte) 29);
          var4 = (float)(-var3) + param1;
          if (var4 == 0.0f) {
            if (param0.length != var3) {
              return param0[var3].a(false, var4);
            } else {
              return param0[var3 - 1].a(false, 1.0f);
            }
          } else {
            return param0[var3].a(false, var4);
          }
        }
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
