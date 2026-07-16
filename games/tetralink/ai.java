/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai {
    static int[] field_e;
    static int field_h;
    static String field_c;
    static String field_f;
    static int[] field_g;
    static int field_i;
    static int field_d;
    static int field_b;
    static int[] field_a;

    final static ah a(boolean param0, int param1, boolean param2, int param3, byte param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            bo var8 = null;
            ah stackIn_16_0 = null;
            Throwable decompiledCaughtException = null;
            ah stackOut_15_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (ug.field_ab.field_g != null) {
                    ch.field_r = new p(ug.field_ab.field_g, 5200, 0);
                    ug.field_ab.field_g = null;
                    var6 = (Object) (Object) new sk(255, ch.field_r, new p(ug.field_ab.field_b, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param4 >= 18) {
                    break L2;
                  } else {
                    field_c = null;
                    break L2;
                  }
                }
                L3: {
                  if (ch.field_r == null) {
                    break L3;
                  } else {
                    L4: {
                      if (ok.field_b == null) {
                        ok.field_b = new p[ug.field_ab.field_m.length];
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (null == ok.field_b[param1]) {
                        ok.field_b[param1] = new p(ug.field_ab.field_m[param1], 12000, 0);
                        ug.field_ab.field_m[param1] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7 = (Object) (Object) new sk(param1, ch.field_r, ok.field_b[param1], 2097152);
                    break L3;
                  }
                }
                L6: {
                  var8 = mb.field_u.a(param1, 80, (sk) var7, (sk) var6, param2);
                  if (!param0) {
                    break L6;
                  } else {
                    var8.d(5127);
                    break L6;
                  }
                }
                stackOut_15_0 = new ah((hk) (Object) var8, param5, param3);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_16_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL a(java.net.URL param0, byte param1, java.applet.Applet param2) {
        Object var3 = null;
        if (param1 >= -101) {
            ai.a(125);
        }
        Object var4 = null;
        if (bm.field_s != null) {
            if (!bm.field_s.equals((Object) (Object) param2.getParameter("settings"))) {
                var3 = (Object) (Object) bm.field_s;
                var4 = var3;
                var4 = var3;
            }
        }
        if (ke.field_g != null) {
            if (!(ke.field_g.equals((Object) (Object) param2.getParameter("session")))) {
                var4 = (Object) (Object) ke.field_g;
            }
        }
        return of.a((String) var3, param0, -1, -103, (String) var4);
    }

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_c = null;
        if (param0 != 13408) {
            boolean discarded$0 = ai.a((byte) 74);
        }
    }

    final static boolean a(byte param0) {
        fa.field_e = true;
        if (param0 != 105) {
            Object var2 = null;
            java.net.URL discarded$0 = ai.a((java.net.URL) null, (byte) -1, (java.applet.Applet) null);
        }
        hk.field_c = k.a(0) + 15000L;
        return (fn.field_R ^ -1) == -12 ? true : false;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        var3 = 0;
        var5 = -117 / ((param2 - 78) / 35);
        var4 = ab.field_Q;
        L0: while (true) {
          if (var3 >= hk.field_b.length) {
            return -1;
          } else {
            var6 = bi.field_c[var3];
            if (-1 >= (var6 ^ -1)) {
              var7 = tn.a(true, 1, hk.field_b[var3]);
              var8 = nh.field_Nb + -(var7 >> 2042928993);
              var4 = var4 + cd.field_e;
              if (tb.a(param1, var8 + -ao.field_a, var4, param0, (ao.field_a << -834566463) + var7, (hc.field_q << 367977153) + i.field_n, -124)) {
                return var6;
              } else {
                var4 = var4 + (i.field_n + cd.field_e + (hc.field_q << 60781185));
                var3++;
                continue L0;
              }
            } else {
              var4 = var4 + hl.field_wb;
              var3++;
              continue L0;
            }
          }
        }
    }

    final static kh b(byte param0) {
        if (param0 <= 85) {
            field_h = -20;
        }
        kh var1 = new kh(wm.field_l, mm.field_w, qa.field_x[0], i.field_t[0], je.field_h[0], sn.field_e[0], ga.field_a[0], ti.field_c);
        an.b(-104);
        return var1;
    }

    final static int c(byte param0) {
        if ((vd.field_a ^ -1) <= -3) {
          L0: {
            if (0 != th.field_l) {
              L1: {
                if (d.field_i != null) {
                  if (d.field_i.c(107)) {
                    if (d.field_i.a("", 0)) {
                      if (d.field_i.a("", (byte) -81)) {
                        break L1;
                      } else {
                        return 29;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!rm.field_i.c(121)) {
                return 43;
              } else {
                if (!rm.field_i.a("commonui", (byte) -87)) {
                  return 57;
                } else {
                  if (ib.field_a.c(91)) {
                    if (!ib.field_a.a("commonui", (byte) -123)) {
                      return 80;
                    } else {
                      if (!q.field_b.c(88)) {
                        return 82;
                      } else {
                        if (!q.field_b.a(false)) {
                          return 86;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    return 71;
                  }
                }
              }
            } else {
              if (!rm.field_i.c(121)) {
                return 20;
              } else {
                if (!rm.field_i.a("commonui", (byte) -128)) {
                  return 40;
                } else {
                  if (ib.field_a.c(114)) {
                    if (!ib.field_a.a("commonui", (byte) -75)) {
                      return 60;
                    } else {
                      if (q.field_b.c(100)) {
                        if (!q.field_b.a(false)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      } else {
                        return 70;
                      }
                    }
                  } else {
                    return 50;
                  }
                }
              }
            }
          }
          if (param0 <= -14) {
            return 100;
          } else {
            return 82;
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Time: <%0>";
        field_i = 0;
        field_c = "Switch to 2D mode";
        field_e = new int[4];
        field_a = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
