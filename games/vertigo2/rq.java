/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rq extends sn {
    static String field_x;
    private db field_s;
    static String field_A;
    nj field_w;
    static int field_B;
    fp field_z;
    static cr field_t;
    static int field_u;
    static String field_v;
    static boolean field_y;
    static lg field_r;

    final static void a(cc param0, int param1, r param2) {
        int var3 = 0;
        ud var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        int[] var15 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        var3 = np.field_Lb;
        ql.field_L = new cr(0L, (cr) null);
        if (param2 == null) {
          var10 = null;
          ke.a((Throwable) null, "QC1", 0);
          return;
        } else {
          param2.field_b = false;
          param2.field_d = 0;
          ni.field_d = new uo(var3, param2, param2);
          wm.field_k = new jn(var3, param2, param2, (jh) (Object) new qf());
          var4 = sp.e((byte) -113);
          if (var4 == null) {
            var11 = null;
            ke.a((Throwable) null, "QC2", 0);
            return;
          } else {
            pe.a(var4, 97);
            mp.field_g = nq.a(5138823, 0, 1513239, 2245737, 4020342, 1513239, 1127256, (cc) null, 65793, 65793, param1 ^ 94, 65793, 8947848);
            fo.field_c = nq.a(0, 16764006, 0, 0, 0, 0, 0, param0, 0, 0, 88, 0, 0);
            va.field_h = nq.a(0, 16777215, 0, 0, 0, 0, 0, param0, 0, 0, 125, 0, 0);
            var5 = bi.field_e;
            var6 = bi.field_j;
            var15 = bi.field_l;
            fm.field_g = new er(10, 14);
            fm.field_g.d();
            var8 = param1;
            L0: while (true) {
              if (var8 >= 7) {
                bi.a(var15, var5, var6);
                lr.field_H = fj.a(va.field_h, fo.field_c, var4, 10, mp.field_g);
                ql.field_L.field_M = new nj();
                return;
              } else {
                bi.e(var8, 1 + var8, -(var8 << 788472001) + 14, 16777215);
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final static er a(r param0, String param1, String param2, byte param3) {
        if (param3 != 98) {
            return null;
        }
        int var4 = param0.a((byte) 120, param2);
        int var5 = param0.a(var4, param1, 96);
        return mf.a(param0, var5, (byte) -94, var4);
    }

    final void a(int param0) {
        int var2 = 0;
        pe var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        ((rq) this).field_z.a(param0);
        var3 = (pe) (Object) ((rq) this).field_w.a((byte) 100);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((rq) this).field_s.a(-1, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_H) {
                    this.a(-1, var2, var3);
                    var3.field_H = var3.field_H - var2;
                    break L1;
                  } else {
                    this.a(-1, var3.field_H, var3);
                    var2 = var2 - var3.field_H;
                    if (!((rq) this).field_s.a(0, var3, var2, (int[]) null, (byte) 121)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (pe) (Object) ((rq) this).field_w.b(43);
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, pe param2) {
        int var4 = 0;
        int var5 = 0;
        db stackIn_5_0 = null;
        pe stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        db stackIn_6_0 = null;
        pe stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        db stackIn_7_0 = null;
        pe stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        db stackOut_4_0 = null;
        pe stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        db stackOut_6_0 = null;
        pe stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        db stackOut_5_0 = null;
        pe stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        L0: {
          if ((4 & ((rq) this).field_s.field_N[param2.field_q] ^ -1) == param0) {
            break L0;
          } else {
            if ((param2.field_E ^ -1) <= -1) {
              break L0;
            } else {
              var4 = ((rq) this).field_s.field_B[param2.field_q] / dd.field_u;
              var5 = (1048575 + (var4 + -param2.field_o)) / var4;
              param2.field_o = 1048575 & var4 * param1 + param2.field_o;
              if (param1 < var5) {
                break L0;
              } else {
                L1: {
                  if (0 == ((rq) this).field_s.field_H[param2.field_q]) {
                    param2.field_J = ra.a(param2.field_z, param2.field_J.g(), param2.field_J.h(), param2.field_J.e());
                    break L1;
                  } else {
                    L2: {
                      param2.field_J = ra.a(param2.field_z, param2.field_J.g(), 0, param2.field_J.e());
                      stackOut_4_0 = ((rq) this).field_s;
                      stackOut_4_1 = (pe) param2;
                      stackOut_4_2 = 92;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      if ((param2.field_K.field_n[param2.field_B] ^ -1) <= -1) {
                        stackOut_6_0 = (db) (Object) stackIn_6_0;
                        stackOut_6_1 = (pe) (Object) stackIn_6_1;
                        stackOut_6_2 = stackIn_6_2;
                        stackOut_6_3 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        stackIn_7_3 = stackOut_6_3;
                        break L2;
                      } else {
                        stackOut_5_0 = (db) (Object) stackIn_5_0;
                        stackOut_5_1 = (pe) (Object) stackIn_5_1;
                        stackOut_5_2 = stackIn_5_2;
                        stackOut_5_3 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        stackIn_7_3 = stackOut_5_3;
                        break L2;
                      }
                    }
                    ((db) (Object) stackIn_7_0).a(stackIn_7_1, (byte) stackIn_7_2, stackIn_7_3 != 0);
                    break L1;
                  }
                }
                L3: {
                  if ((param2.field_K.field_n[param2.field_B] ^ -1) > -1) {
                    param2.field_J.i(-1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param1 = param2.field_o / var4;
                break L0;
              }
            }
          }
        }
        param2.field_J.a(param1);
    }

    public static void e(int param0) {
        field_x = null;
        field_r = null;
        field_v = null;
        field_A = null;
        field_t = null;
        if (param0 != 0) {
            field_y = true;
        }
    }

    private final void a(int param0, int[] param1, int param2, byte param3, pe param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ra var11 = null;
        int var12 = 0;
        Object var13 = null;
        db stackIn_10_0 = null;
        pe stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        db stackIn_11_0 = null;
        pe stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        db stackIn_12_0 = null;
        pe stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        db stackOut_9_0 = null;
        pe stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        db stackOut_11_0 = null;
        pe stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        db stackOut_10_0 = null;
        pe stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        L0: {
          var12 = Vertigo2.field_L ? 1 : 0;
          if (0 == (4 & ((rq) this).field_s.field_N[param4.field_q])) {
            break L0;
          } else {
            if (param4.field_E >= 0) {
              break L0;
            } else {
              var7 = ((rq) this).field_s.field_B[param4.field_q] / dd.field_u;
              L1: while (true) {
                var8 = (1048575 - (-var7 + param4.field_o)) / var7;
                if (param2 >= var8) {
                  L2: {
                    param4.field_J.b(param1, param0, var8);
                    param4.field_o = param4.field_o + (var8 * var7 - 1048576);
                    param0 = param0 + var8;
                    param2 = param2 - var8;
                    var9 = dd.field_u / 100;
                    var10 = 262144 / var7;
                    if (var9 <= var10) {
                      break L2;
                    } else {
                      var9 = var10;
                      break L2;
                    }
                  }
                  L3: {
                    var11 = param4.field_J;
                    if (((rq) this).field_s.field_H[param4.field_q] != 0) {
                      L4: {
                        param4.field_J = ra.a(param4.field_z, var11.g(), 0, var11.e());
                        stackOut_9_0 = ((rq) this).field_s;
                        stackOut_9_1 = (pe) param4;
                        stackOut_9_2 = 87;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        if (param4.field_K.field_n[param4.field_B] >= 0) {
                          stackOut_11_0 = (db) (Object) stackIn_11_0;
                          stackOut_11_1 = (pe) (Object) stackIn_11_1;
                          stackOut_11_2 = stackIn_11_2;
                          stackOut_11_3 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          stackIn_12_2 = stackOut_11_2;
                          stackIn_12_3 = stackOut_11_3;
                          break L4;
                        } else {
                          stackOut_10_0 = (db) (Object) stackIn_10_0;
                          stackOut_10_1 = (pe) (Object) stackIn_10_1;
                          stackOut_10_2 = stackIn_10_2;
                          stackOut_10_3 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          stackIn_12_3 = stackOut_10_3;
                          break L4;
                        }
                      }
                      ((db) (Object) stackIn_12_0).a(stackIn_12_1, (byte) stackIn_12_2, stackIn_12_3 != 0);
                      param4.field_J.b(var9, var11.h());
                      break L3;
                    } else {
                      param4.field_J = ra.a(param4.field_z, var11.g(), var11.h(), var11.e());
                      break L3;
                    }
                  }
                  L5: {
                    if (0 <= param4.field_K.field_n[param4.field_B]) {
                      break L5;
                    } else {
                      param4.field_J.i(-1);
                      break L5;
                    }
                  }
                  var11.h(var9);
                  var11.b(param1, param0, -param0 + param5);
                  if (var11.l()) {
                    ((rq) this).field_z.a((sn) (Object) var11);
                    continue L1;
                  } else {
                    continue L1;
                  }
                } else {
                  param4.field_o = param4.field_o + param2 * var7;
                  break L0;
                }
              }
            }
          }
        }
        L6: {
          param4.field_J.b(param1, param0, param2);
          if (param3 >= 49) {
            break L6;
          } else {
            var13 = null;
            rq.a((cc) null, 118, (r) null);
            break L6;
          }
        }
    }

    final static void a(boolean param0, byte param1, int param2, boolean param3, String param4) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String stackIn_3_0 = null;
        int stackIn_23_0 = 0;
        String stackIn_23_1 = null;
        int stackIn_24_0 = 0;
        String stackIn_24_1 = null;
        int stackIn_25_0 = 0;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_22_0 = 0;
        String stackOut_22_1 = null;
        int stackOut_24_0 = 0;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_23_0 = 0;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          hr.field_D = param2;
          ii.field_z = true;
          var7 = 55 / ((23 - param1) / 41);
          var12 = param4;
          if (param0) {
            stackOut_2_0 = sp.field_Q;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = dc.field_M;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (-1 == (hr.field_D ^ -1)) {
            var8 = dc.a(480, var12, (byte) 79, or.field_n, oc.field_s);
            var9 = 3 + var8;
            al.field_y = new String[var9];
            dg.field_f = new int[var9];
            var10 = 0;
            L2: while (true) {
              if (var9 <= var10) {
                rc.field_c = new int[2];
                var10 = 0;
                L3: while (true) {
                  if (var8 <= var10) {
                    al.field_y[var9 - 3] = "";
                    al.field_y[var9 + -2] = var6;
                    dg.field_f[-2 + var9] = 0;
                    rc.field_c[0] = 1;
                    al.field_y[-1 + var9] = lr.field_N;
                    dg.field_f[-1 + var9] = 1;
                    rc.field_c[1] = 2;
                    break L1;
                  } else {
                    al.field_y[var10] = or.field_n[var10];
                    var10++;
                    continue L3;
                  }
                }
              } else {
                dg.field_f[var10] = -1;
                var10++;
                continue L2;
              }
            }
          } else {
            if (hr.field_D == 1) {
              var8 = dc.a(480, var12, (byte) 99, or.field_n, oc.field_s);
              var9 = 2 - -var8;
              al.field_y = new String[var9];
              dg.field_f = new int[var9];
              var10 = 0;
              L4: while (true) {
                if (var10 >= var9) {
                  rc.field_c = new int[1];
                  var10 = 0;
                  L5: while (true) {
                    if (var8 <= var10) {
                      al.field_y[-2 + var9] = "";
                      al.field_y[-1 + var9] = lr.field_N;
                      dg.field_f[var9 - 1] = 0;
                      rc.field_c[0] = 2;
                      break L1;
                    } else {
                      al.field_y[var10] = or.field_n[var10];
                      var10++;
                      continue L5;
                    }
                  }
                } else {
                  dg.field_f[var10] = -1;
                  var10++;
                  continue L4;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        }
        kg.field_G.field_b = rc.field_c.length;
        var8 = 0;
        var9 = 0;
        L6: while (true) {
          if (al.field_y.length <= var9) {
            qp.field_d = -(var8 >> 218909889) + var8 + ni.field_a;
            pk.field_o = -(var8 >> -2121510431) + ni.field_a;
            sf.field_d = kg.field_G.field_b * (vo.field_y + eb.field_h << -1315377247);
            var9 = 0;
            L7: while (true) {
              if (var9 >= al.field_y.length) {
                ui.field_d = -(sf.field_d >> 1399999553) + kf.field_b;
                kg.field_G.a(param3, we.a(gb.field_d, true, ed.field_n), 0, (byte) 80);
                return;
              } else {
                L8: {
                  stackOut_32_0 = sf.field_d;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_33_0 = stackOut_32_0;
                  if ((dg.field_f[var9] ^ -1) <= -1) {
                    stackOut_34_0 = stackIn_34_0;
                    stackOut_34_1 = ml.field_v;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L8;
                  } else {
                    stackOut_33_0 = stackIn_33_0;
                    stackOut_33_1 = cd.field_a;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    break L8;
                  }
                }
                sf.field_d = stackIn_35_0 + stackIn_35_1;
                var9++;
                continue L7;
              }
            }
          } else {
            L9: {
              stackOut_22_0 = 121;
              stackOut_22_1 = al.field_y[var9];
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              if (dg.field_f[var9] < 0) {
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = (String) (Object) stackIn_24_1;
                stackOut_24_2 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                break L9;
              } else {
                stackOut_23_0 = stackIn_23_0;
                stackOut_23_1 = (String) (Object) stackIn_23_1;
                stackOut_23_2 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                break L9;
              }
            }
            L10: {
              var10 = ao.a(stackIn_25_0, stackIn_25_1, stackIn_25_2 != 0);
              if (0 == (dg.field_f[var9] ^ -1)) {
                break L10;
              } else {
                var10 = var10 + hc.field_a * 2;
                break L10;
              }
            }
            if (var10 > var8) {
              var8 = var10;
              var9++;
              continue L6;
            } else {
              var9++;
              continue L6;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        er var6 = new er(param1, param0);
        int var7 = 47 % ((3 - param4) / 57);
        var6.d();
        bi.f(0, 0, param1, param0, 12, 5921370);
        bi.f(4, 4, -8 + param1, -8 + param0, 8, 0);
        ro.field_g.a(-125);
        bi.b(param3, param2, param1, param0, 12, 0, param5);
        var6.e(param3, param2);
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        ((rq) this).field_z.b(param0, param1, param2);
        pe var6 = (pe) (Object) ((rq) this).field_w.a((byte) 100);
        while (var6 != null) {
            if (!((rq) this).field_s.a(-1, var6)) {
                var4 = param1;
                var5 = param2;
                while (var5 > var6.field_H) {
                    this.a(var4, param0, var6.field_H, (byte) 73, var6, var5 + var4);
                    var5 = var5 - var6.field_H;
                    var4 = var4 + var6.field_H;
                    // ifne L171
                }
                this.a(var4, param0, var5, (byte) 120, var6, var5 + var4);
                var6.field_H = var6.field_H - var5;
            }
            var6 = (pe) (Object) ((rq) this).field_w.b(35);
        }
    }

    final sn c() {
        pe var1 = (pe) (Object) ((rq) this).field_w.a((byte) 100);
        if (var1 == null) {
            return null;
        }
        if (var1.field_J != null) {
            return (sn) (Object) var1.field_J;
        }
        return ((rq) this).a();
    }

    rq(db param0) {
        ((rq) this).field_w = new nj();
        ((rq) this).field_z = new fp();
        ((rq) this).field_s = param0;
    }

    final sn a() {
        pe var1_ref = null;
        int var2 = Vertigo2.field_L ? 1 : 0;
        do {
            var1_ref = (pe) (Object) ((rq) this).field_w.b(119);
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_J == null);
        return (sn) (Object) var1_ref.field_J;
    }

    final static boolean a(byte param0) {
        if (param0 <= 13) {
            field_x = null;
        }
        return ab.field_b;
    }

    final int d() {
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Purple";
        field_B = 0;
        field_x = "Blue";
        field_v = "Players";
        field_y = false;
    }
}
