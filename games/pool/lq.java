/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lq extends ud {
    private ko field_P;
    static String field_O;
    static so field_R;
    static int[] field_T;
    static String field_S;
    static dd field_Q;
    static String field_U;
    static String field_N;
    static int field_V;
    static int field_W;

    final static boolean b(byte param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_13_0 = 0;
            if (param1 <= kn.field_e.field_v) {
              return true;
            } else {
              if (null == jd.field_c) {
                return false;
              } else {
                try {
                  L0: {
                    L1: {
                      var2_int = jd.field_c.d(107);
                      if (param0 >= 27) {
                        break L1;
                      } else {
                        field_U = null;
                        break L1;
                      }
                    }
                    if (0 >= var2_int) {
                      L2: {
                        if (-1 < (var2_int ^ -1)) {
                          dn.c(64);
                          break L2;
                        } else {
                          if ((bf.d((byte) 127) ^ -1L) >= -30001L) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            dn.c(64);
                            break L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        if (var2_int > param1 + -kn.field_e.field_v) {
                          var2_int = param1 + -kn.field_e.field_v;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      jd.field_c.a(var2_int, 0, kn.field_e.field_v, kn.field_e.field_t);
                      ob.field_v = rl.a((byte) -97);
                      kn.field_e.field_v = kn.field_e.field_v + var2_int;
                      if (param1 <= kn.field_e.field_v) {
                        kn.field_e.field_v = 0;
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    dn.c(43);
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return false;
                } else {
                  return false;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public lq() {
        super(0, 0, nk.field_j, md.field_b, (fp) null, (cc) null);
        ((lq) this).field_P = new ko();
    }

    final void k(int param0) {
        int var4 = Pool.field_O;
        aa var2 = new aa(((lq) this).field_P);
        if (param0 != -22216) {
            return;
        }
        oe var3 = (oe) (Object) var2.b((byte) -92);
        while (var3 != null) {
            var3.field_R = false;
            var3 = (oe) (Object) var2.b(param0 ^ 22169);
        }
        ((lq) this).field_L = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        vh var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        pn var9 = null;
        L0: {
          var7 = Pool.field_O;
          if (sh.field_P.field_k == cb.field_g) {
            break L0;
          } else {
            fd.field_J = fd.field_J + (sh.field_P.field_k + -cb.field_g);
            cb.field_g = sh.field_P.field_k;
            break L0;
          }
        }
        L1: {
          if (ir.field_h <= em.field_P) {
            break L1;
          } else {
            em.field_P = em.field_P + 1;
            break L1;
          }
        }
        if ((em.field_P ^ -1) >= -1) {
          return;
        } else {
          L2: {
            wa.l(23323);
            fl.field_q.a(param1, false);
            if (null == sg.field_J) {
              break L2;
            } else {
              if (!ea.field_z) {
                sg.field_J = null;
                break L2;
              } else {
                boolean discarded$1 = sg.field_J.a(-125, fl.field_q.field_sb, param1, fl.field_q.field_ib);
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            if (5 <= var4) {
              L4: {
                if (param2 == d.field_e.field_R) {
                  break L4;
                } else {
                  fc.field_b = new wm(d.field_e.field_sb, d.field_e.field_ib, d.field_e.field_gb, d.field_e.field_Db, param3, tq.field_m, dg.field_J, qg.field_f, uo.field_Lb, e.field_e, ei.field_A, (String) null, 0L);
                  break L4;
                }
              }
              L5: {
                var9 = uk.a(param0, (byte) -126, ad.field_x, kj.field_j);
                if (var9 != null) {
                  na.a(var9, 122);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var8 = dk.a(1);
                if (var8 != null) {
                  kk.field_B = var8;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              var5 = il.field_g[var4];
              if (var5 != null) {
                L7: {
                  if (-1 == (var5.field_R ^ -1)) {
                    break L7;
                  } else {
                    hb.a(27937, var5, var4);
                    break L7;
                  }
                }
                var6 = f.a(param2 ^ 5, var4);
                uo.field_Mb[var4].field_hb = sg.field_M[var6];
                ta.field_b[var4].field_nb = nk.field_i[var6];
                var4++;
                continue L3;
              } else {
                var4++;
                continue L3;
              }
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var8 = Pool.field_O;
        int var6 = 22 / ((param1 - -42) / 53);
        if (!(((lq) this).field_z == null)) {
            ((lq) this).field_z.a(true, param2, (byte) -63, param3, (ei) this);
        }
        aa var5 = new aa(((lq) this).field_P);
        ei var7 = (ei) (Object) var5.a(0);
        while (var7 != null) {
            var7.a(param0, (byte) 28, ((lq) this).field_C + param2, ((lq) this).field_D + param3);
            var7 = (ei) (Object) var5.c((byte) -71);
        }
    }

    final static boolean a(String param0, int param1) {
        if (param1 != -1) {
            lq.i(82);
        }
        return gf.a(param1 ^ 88, param0) != null ? true : false;
    }

    final ei g(int param0) {
        int var4 = Pool.field_O;
        aa var2 = new aa(((lq) this).field_P);
        oe var3 = (oe) (Object) var2.b((byte) -92);
        while (var3 != null) {
            if (!(!var3.field_R)) {
                return var3.f((byte) 127);
            }
            var3 = (oe) (Object) var2.b(-84);
        }
        if (param0 == -1) {
            return null;
        }
        lq.i(65);
        return null;
    }

    final void h(int param0) {
        int var4 = Pool.field_O;
        if (param0 != 11741) {
            return;
        }
        aa var2 = new aa(((lq) this).field_P);
        oe var3 = (oe) (Object) var2.b((byte) -92);
        while (var3 != null) {
            if (var3.a(false)) {
                var3.a((byte) -117);
            }
            var3 = (oe) (Object) var2.b(-86);
        }
    }

    final void h(byte param0) {
        if (param0 <= 121) {
            return;
        }
        aa var2 = new aa(((lq) this).field_P);
        oe var3 = (oe) (Object) var2.b((byte) -92);
        while (var3 != null) {
            if (var3.g((byte) -20)) {
                var3.a((byte) -117);
            }
            var3 = (oe) (Object) var2.b(-112);
        }
        ((lq) this).field_L = (ei) (Object) ((lq) this).j(110);
    }

    final static void a(boolean param0) {
        wa.m(8421504);
        nk.b(-31384);
        fc.field_b = null;
        if (!param0) {
            lq.i(114);
        }
        lq.i(15975);
    }

    public static void g(byte param0) {
        field_U = null;
        field_N = null;
        field_T = null;
        field_O = null;
        field_S = null;
        if (param0 != -47) {
            return;
        }
        field_R = null;
        field_Q = null;
    }

    final static void i(int param0) {
        fm.field_H = false;
        if (param0 != 15975) {
            field_U = null;
        }
        if (null != im.field_Ub) {
            im.field_Ub.f(17517);
        }
        if (0 != hn.field_b) {
            cl.a(param0 ^ 1124);
        }
        gj.field_G = 0;
    }

    final oe j(int param0) {
        aa var2 = null;
        oe var3 = null;
        L0: {
          if (param0 >= 101) {
            break L0;
          } else {
            field_S = null;
            break L0;
          }
        }
        var2 = new aa(((lq) this).field_P);
        var3 = (oe) (Object) var2.b((byte) -92);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_R) {
              var3 = (oe) (Object) var2.b(-128);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final static void l(int param0) {
        int var3 = Pool.field_O;
        gi.field_t = 0;
        int var1 = 83 % ((17 - param0) / 34);
        cm.field_J = null;
        nr.field_S = 0;
        cf.field_k.d((byte) 69);
        jq.field_c.d((byte) 48);
        rg var2 = df.field_b.a((byte) -125);
        while (var2 != null) {
            var2.a(false);
            var2 = df.field_b.b(83);
        }
        var2 = gd.field_c.a((byte) -125);
        while (var2 != null) {
            var2.a(false);
            var2 = gd.field_c.b(68);
        }
        th.field_a = 0;
    }

    final void b(ei param0, int param1) {
        if (!(param0 instanceof oe)) {
            throw new IllegalArgumentException();
        }
        oe var3 = (oe) (Object) param0;
        if (param1 != 30000) {
            field_W = 61;
        }
        ((lq) this).field_P.a((byte) -84, (ma) (Object) var3);
        var3.field_R = true;
        boolean discarded$0 = var3.a((ei) this, (byte) 66);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new int[1024];
        field_O = "Friends";
        field_U = "Connection lost. <%0>";
        field_S = "mm:ss";
        field_W = 0;
        field_N = " and <%0>";
    }
}
