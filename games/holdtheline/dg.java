/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dg {
    static ge field_a;
    static long field_d;
    static String[] field_b;
    static int field_c;

    final static int b() {
        return uf.field_a;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        String var2 = null;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            if (qe.field_g != null) {
              return;
            } else {
              dl.field_h = nl.field_e.toLowerCase();
              hf.field_l = od.field_q.toLowerCase();
              qe.field_g = new String[14];
              qe.field_g[7] = bi.field_h;
              qe.field_g[10] = va.field_h;
              qe.field_g[4] = td.field_d;
              qe.field_g[8] = ug.field_i;
              qe.field_g[6] = nh.field_K;
              qe.field_g[13] = rb.field_B;
              qe.field_g[5] = td.field_d;
              qe.field_g[11] = va.field_h;
              qe.field_g[0] = ca.field_o;
              uk.field_c = new String[27];
              qe.field_g[3] = dd.field_H;
              qe.field_g[1] = gb.field_J;
              qe.field_g[9] = lj.field_d;
              qe.field_g[2] = dd.field_H;
              uk.field_c[15] = td.field_d;
              uk.field_c[14] = nh.field_K;
              uk.field_c[16] = td.field_d;
              uk.field_c[18] = hn.field_J;
              uk.field_c[17] = uk.field_d;
              uk.field_c[1] = mg.field_i;
              uk.field_c[2] = da.field_s;
              uk.field_c[26] = eb.field_p;
              uk.field_c[4] = hk.field_b;
              uk.field_c[19] = nm.field_a;
              uk.field_c[9] = ld.field_f;
              uk.field_c[13] = dd.field_H;
              uk.field_c[11] = sa.field_f;
              uk.field_c[3] = hl.field_c;
              uk.field_c[7] = ka.field_e;
              uk.field_c[0] = ca.field_o;
              uk.field_c[20] = sa.field_a;
              uk.field_c[6] = hk.field_b;
              uk.field_c[12] = rb.field_B;
              uk.field_c[21] = gk.field_c;
              th.field_n = new String[]{uk.field_c[4], uk.field_c[0]};
              ki.field_i = new String[]{uk.field_c[9], uk.field_c[0]};
              pg.field_L = new String[]{uk.field_c[0], jc.field_d, b.field_e, o.field_b};
              var1_int = od.field_i.length;
              var2 = Integer.toString(var1_int);
              var3 = 0;
              L1: while (true) {
                if (var1_int <= var3) {
                  la.field_f = new String[8];
                  ij.field_c[3] = new int[1];
                  ij.field_c[2] = new int[1];
                  nn.field_g = new String[8];
                  ij.field_c[1] = new int[1];
                  ij.field_c[0] = new int[1];
                  nn.field_g[0] = mi.field_h;
                  la.field_f[0] = jh.a(bl.field_n, -125, mi.field_h);
                  nn.field_g[1] = qh.field_a;
                  la.field_f[1] = jh.a(ra.field_cb, -125, qh.field_a);
                  nn.field_g[2] = u.field_Q;
                  la.field_f[2] = jh.a(q.field_b, -119, u.field_Q);
                  nn.field_g[3] = lf.field_d;
                  la.field_f[3] = jh.a(vk.field_d, wb.a(-9342, 9219), lf.field_d);
                  nn.field_g[5] = fj.field_p;
                  la.field_f[5] = jh.a(tg.field_a, -128, fj.field_p);
                  nn.field_g[4] = ga.field_a;
                  la.field_f[4] = jh.a(jk.field_l, -120, ga.field_a);
                  nn.field_g[7] = fe.field_a;
                  la.field_f[7] = jh.a(i.field_l, -121, fe.field_a);
                  nn.field_g[6] = rg.field_d;
                  la.field_f[6] = jh.a(gn.field_j, -128, rg.field_d);
                  v.field_A = new String[4][];
                  sg.field_gb = new String[4][];
                  var3 = 0;
                  L2: while (true) {
                    if (4 <= var3) {
                      break L0;
                    } else {
                      var12 = go.field_g[var3];
                      var5 = var12.length;
                      sg.field_gb[var3] = new String[var5];
                      v.field_A[var3] = new String[var5];
                      var6 = 0;
                      L3: while (true) {
                        if (var5 <= var6) {
                          var3++;
                          var3++;
                          continue L2;
                        } else {
                          var7 = var12[var6];
                          sg.field_gb[var3][var6] = nn.field_g[var7];
                          v.field_A[var3][var6] = la.field_f[var7];
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  od.field_i[var3] = od.field_i[var3] + ' ' + (var3 - -1) + "/" + var2;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "dg.C(" + -9342 + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        var2 = -62 / ((param0 - -7) / 54);
        if (param1 < 48) {
          if (param1 < 65) {
            L0: {
              if (param1 < 97) {
                break L0;
              } else {
                if (122 < param1) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return false;
          } else {
            if (param1 <= 90) {
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              return stackIn_28_0 != 0;
            } else {
              L1: {
                L2: {
                  if (param1 < 97) {
                    break L2;
                  } else {
                    if (122 < param1) {
                      break L2;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L1;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L1;
              }
              return stackIn_25_0 != 0;
            }
          }
        } else {
          if (57 < param1) {
            if (param1 >= 65) {
              if (param1 > 90) {
                if (param1 >= 97) {
                  if (122 < param1) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (param1 >= 97) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int discarded$0 = -1;
        return param0 + rf.a(param2 + -param0 - -1, in.field_c);
    }

    public static void a(int param0) {
        if (param0 != 32137) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0, java.math.BigInteger param1, th param2, th param3, java.math.BigInteger param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          te.a(param1, param4, param3, 0, 126, param2.field_l, param2.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("dg.D(").append(false).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          L1: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final static void a() {
        ih var4 = null;
        int var3 = HoldTheLine.field_D;
        try {
            if (eb.field_o != null) {
                if (!(l.field_b)) {
                    am.a(3, (byte) -67, eb.field_o);
                }
            }
            int var2 = 96;
            var4 = (ih) (Object) fb.field_n.b((byte) 121);
            while (var4 != null) {
                int discarded$0 = -79;
                na.a(4, var4);
                var4 = (ih) (Object) fb.field_n.c((byte) -75);
            }
            if (of.a(-969)) {
                ec.field_y = ie.a(10, 31043, 2, 0);
            }
            h.b((byte) -92);
            wd.a(of.a(-969), (byte) 97);
            gi.a((byte) 80);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "dg.A(" + -118 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ge();
    }
}
