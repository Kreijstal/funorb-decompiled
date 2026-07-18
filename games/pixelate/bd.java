/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static tf field_a;
    static int field_c;
    static java.applet.Applet field_b;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 == 70) {
            return;
        }
        bd.a((byte) -62, false, -83, 24);
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        aa var4_ref = null;
        ak var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (qo.field_o != qa.field_f.field_i) {
                wa.field_i = wa.field_i + (qa.field_f.field_i - qo.field_o);
                qo.field_o = qa.field_f.field_i;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 <= -50) {
              L2: {
                if (oh.field_b >= qh.field_c) {
                  break L2;
                } else {
                  oh.field_b = oh.field_b + 1;
                  break L2;
                }
              }
              if (oh.field_b > 0) {
                L3: {
                  r.b(-96);
                  ui.field_i.a(-28476, param1);
                  if (td.field_b == null) {
                    break L3;
                  } else {
                    if (!ln.field_q) {
                      td.field_b = null;
                      break L3;
                    } else {
                      boolean discarded$3 = td.field_b.a(ui.field_i.field_gb, param1, (byte) 99, ui.field_i.field_tb);
                      break L3;
                    }
                  }
                }
                var4_int = 0;
                L4: while (true) {
                  if (5 <= var4_int) {
                    L5: {
                      if (0 == gh.field_u.field_P) {
                        break L5;
                      } else {
                        hc.field_M = new oe(gh.field_u.field_tb, gh.field_u.field_gb, gh.field_u.field_K, gh.field_u.field_nb, param3, cm.field_o, pj.field_i, ae.field_f, mg.field_h, um.field_q, dn.field_c, (String) null, 0L);
                        break L5;
                      }
                    }
                    L6: {
                      var4_ref = ah.a((byte) -110, fq.field_q, param2, v.field_c);
                      if (var4_ref == null) {
                        break L6;
                      } else {
                        int discarded$4 = 125;
                        fj.a(var4_ref);
                        break L6;
                      }
                    }
                    int discarded$5 = 88;
                    var8 = pk.a();
                    if (var8 != null) {
                      up.field_o = var8;
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    L7: {
                      var5 = fm.field_f[var4_int];
                      if (var5 != null) {
                        L8: {
                          if (var5.field_P == 0) {
                            break L8;
                          } else {
                            cg.a((byte) -13, var5, var4_int);
                            break L8;
                          }
                        }
                        var6 = kl.a(var4_int, 0);
                        fm.field_h[var4_int].field_H = h.field_V[var6];
                        hk.field_e[var4_int].field_cb = rg.field_a[var6];
                        var4_int++;
                        break L7;
                      } else {
                        var4_int++;
                        break L7;
                      }
                    }
                    var4_int++;
                    continue L4;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "bd.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            field_a = null;
            if (hf.field_q < 20) {
                return true;
            }
            if (!re.a(106)) {
                return true;
            }
            if (ra.field_g <= 0) {
                return false;
            }
            if (ri.a(-81)) {
                return false;
            }
            return true;
        }
        if (hf.field_q < 20) {
            return true;
        }
        if (!re.a(106)) {
            return true;
        }
        if (ra.field_g <= 0) {
            return false;
        }
        if (ri.a(-81)) {
            return false;
        }
        return true;
    }

    final boolean b(int param0) {
        if (param0 == -21) {
          if ((Object) (Object) kk.field_b != this) {
            if ((Object) (Object) e.field_d != this) {
              if ((Object) (Object) Pixelate.field_G == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a() {
        lm var1 = null;
        int var2 = Pixelate.field_H ? 1 : 0;
        try {
            aj.field_t = 0;
            f.field_q = 0;
            qp.field_L = null;
            vp.field_Hb.e(-111);
            bq.field_b.e(-127);
            var1 = vm.field_b.a(-89);
            while (var1 != null) {
                var1.e(17);
                var1 = vm.field_b.a((byte) 50);
            }
            var1 = hq.field_q.a(-84);
            while (var1 != null) {
                var1.e(17);
                var1 = hq.field_q.a((byte) 50);
            }
            gk.field_db = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bd.A(" + -1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new tf(270, 70);
    }
}
