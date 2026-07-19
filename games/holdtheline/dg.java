/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dg {
    static ge field_a;
    static long field_d;
    static String[] field_b;
    static int field_c;

    final static int b(byte param0) {
        if (param0 != 65) {
            return -106;
        }
        return uf.field_a;
    }

    final static void b(int param0) {
        String[] array$2 = null;
        String[] array$3 = null;
        RuntimeException var1 = null;
        int var1_int = 0;
        String var2 = null;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            if (qe.field_g != null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                dl.field_h = nl.field_e.toLowerCase();
                hf.field_l = od.field_q.toLowerCase();
                qe.field_g = new String[14];
                qe.field_g[7] = bi.field_h;
                qe.field_g[10] = va.field_h;
                if (param0 == -9342) {
                  break L1;
                } else {
                  field_a = (ge) null;
                  break L1;
                }
              }
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
              L2: while (true) {
                if (var1_int <= var3) {
                  la.field_f = new String[8];
                  ij.field_c[3] = new int[]{lf.field_g};
                  ij.field_c[2] = new int[]{ik.field_a};
                  nn.field_g = new String[8];
                  ij.field_c[1] = new int[]{km.field_G};
                  ij.field_c[0] = new int[]{rl.field_I};
                  nn.field_g[0] = mi.field_h;
                  la.field_f[0] = jh.a(bl.field_n, param0 + 9217, mi.field_h);
                  nn.field_g[1] = qh.field_a;
                  la.field_f[1] = jh.a(ra.field_cb, -125, qh.field_a);
                  nn.field_g[2] = u.field_Q;
                  la.field_f[2] = jh.a(q.field_b, -119, u.field_Q);
                  nn.field_g[3] = lf.field_d;
                  la.field_f[3] = jh.a(vk.field_d, wb.a(param0, 9219), lf.field_d);
                  nn.field_g[5] = fj.field_p;
                  la.field_f[5] = jh.a(tg.field_a, -128, fj.field_p);
                  nn.field_g[4] = ga.field_a;
                  la.field_f[4] = jh.a(jk.field_l, -120, ga.field_a);
                  nn.field_g[7] = fe.field_a;
                  la.field_f[7] = jh.a(i.field_l, param0 + 9221, fe.field_a);
                  nn.field_g[6] = rg.field_d;
                  la.field_f[6] = jh.a(gn.field_j, param0 + 9214, rg.field_d);
                  v.field_A = new String[4][];
                  sg.field_gb = new String[4][];
                  var3 = 0;
                  L3: while (true) {
                    if (4 <= var3) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var12 = go.field_g[var3];
                      var5 = var12.length;
                      array$2 = new String[var5];
                      sg.field_gb[var3] = array$2;
                      array$3 = new String[var5];
                      v.field_A[var3] = array$3;
                      var6 = 0;
                      L4: while (true) {
                        if (var5 <= var6) {
                          var3++;
                          continue L3;
                        } else {
                          var7 = var12[var6];
                          sg.field_gb[var3][var6] = nn.field_g[var7];
                          v.field_A[var3][var6] = la.field_f[var7];
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  od.field_i[var3] = od.field_i[var3] + ' ' + (var3 - -1) + "/" + var2;
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "dg.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        if (param1 != -1) {
          return -64;
        } else {
          return param0 + rf.a(param2 + -param0 - -1, in.field_c, param1 + 0);
        }
    }

    public static void a(int param0) {
        if (param0 != 32137) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0, java.math.BigInteger param1, th param2, th param3, java.math.BigInteger param4) {
        RuntimeException runtimeException = null;
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
            L1: {
              te.a(param1, param4, param3, 0, 126, param2.field_l, param2.field_i);
              if (!param0) {
                break L1;
              } else {
                dg.a(-78);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dg.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static void a(byte param0) {
        ih var4 = null;
        int var3 = HoldTheLine.field_D;
        try {
            if (eb.field_o != null) {
                if (!(l.field_b)) {
                    am.a(3, (byte) -67, eb.field_o);
                }
            }
            int var2 = 96 / ((-25 - param0) / 60);
            var4 = (ih) ((Object) fb.field_n.b((byte) 121));
            while (var4 != null) {
                na.a(4, var4, (byte) -79);
                var4 = (ih) ((Object) fb.field_n.c((byte) -75));
            }
            if (of.a(-969)) {
                ec.field_y = ie.a(10, 31043, 2, 0);
            }
            h.b((byte) -92);
            wd.a(of.a(-969), (byte) 97);
            gi.a((byte) 80);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ')');
        }
    }

    static {
        field_a = new ge();
    }
}
