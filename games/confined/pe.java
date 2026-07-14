/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends rk {
    static va field_p;
    static volatile int field_n;
    static bi field_o;
    static int field_q;
    static int field_m;

    final static void a(ok param0, sd param1, String param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Confined.field_J ? 1 : 0;
          if (param4 == 3694) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        var5 = 0;
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (param2.length() <= var7) {
            return;
          } else {
            L2: {
              var8 = param2.charAt(var7);
              if (var8 != 60) {
                break L2;
              } else {
                var6 = param1.field_e[0] + ((var5 >> -1950152856) - -param0.c(param2.substring(0, var7)));
                break L2;
              }
            }
            L3: {
              if ((var6 ^ -1) == 0) {
                L4: {
                  if (var8 != 32) {
                    break L4;
                  } else {
                    var5 = var5 + param3;
                    break L4;
                  }
                }
                param1.field_e[var7] = param1.field_e[0] + (var5 >> 14841416) + (param0.c(param2.substring(0, var7 + 1)) - param0.a((char) var8));
                break L3;
              } else {
                param1.field_e[var7] = var6;
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                if (param0 > -47) {
                    pe.b(106);
                }
                param1.getAppletContext().showDocument(pn.a(var2, (byte) -33, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 <= 24) {
            Object var2 = null;
            pe.a((java.applet.Applet) null, (byte) -46);
        }
        field_o = null;
        field_p = null;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        ci.a(param0, "", -81);
        me.a((byte) 74, param0);
        if (param1 != 11) {
            field_o = null;
        }
    }

    private pe() throws Throwable {
        throw new Error();
    }

    final static boolean a(int[] param0, int param1) {
        long var2 = 0L;
        hc var4_ref_hc = null;
        int var4 = 0;
        int var5_int = 0;
        hc var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          if (param1 < -63) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        if (wd.field_f == lk.field_d) {
          L1: {
            var2 = ri.a(-3);
            if (tk.field_b == -1) {
              break L1;
            } else {
              if (-1 <= tg.field_S) {
                break L1;
              } else {
                var4_ref_hc = (hc) (Object) qh.field_w.a(-121);
                if (var4_ref_hc == null) {
                  break L1;
                } else {
                  if ((var4_ref_hc.field_r ^ -1L) <= (var2 ^ -1L)) {
                    break L1;
                  } else {
                    var4_ref_hc.a(true);
                    ai.field_i = var4_ref_hc.field_q.length;
                    e.field_c.field_n = 0;
                    var5_int = 0;
                    L2: while (true) {
                      if (var5_int >= ai.field_i) {
                        kk.field_c = pk.field_c;
                        pk.field_c = qm.field_y;
                        qm.field_y = Confined.field_F;
                        Confined.field_F = var4_ref_hc.field_o;
                        return true;
                      } else {
                        e.field_c.field_m[var5_int] = var4_ref_hc.field_q[var5_int];
                        var5_int++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
          L3: while (true) {
            L4: {
              if (tg.field_S < 0) {
                e.field_c.field_n = 0;
                if (!jj.a(1, (byte) -113)) {
                  return false;
                } else {
                  tg.field_S = e.field_c.h(-1);
                  e.field_c.field_n = 0;
                  ai.field_i = param0[tg.field_S];
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (jc.a(-111)) {
              if (tk.field_b == 0) {
                kk.field_c = pk.field_c;
                pk.field_c = qm.field_y;
                qm.field_y = Confined.field_F;
                Confined.field_F = tg.field_S;
                tg.field_S = -1;
                return true;
              } else {
                L5: {
                  var4 = tk.field_b;
                  if (0.0 != gl.field_i) {
                    var4 = (int)((double)var4 + hj.field_h.nextGaussian() * gl.field_i);
                    if ((var4 ^ -1) > -1) {
                      var4 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var5 = new hc((long)var4 + var2, tg.field_S, new byte[ai.field_i]);
                var6 = 0;
                L6: while (true) {
                  if (var6 >= ai.field_i) {
                    qh.field_w.a((rk) (Object) var5, (byte) -93);
                    tg.field_S = -1;
                    continue L3;
                  } else {
                    var5.field_q[var6] = e.field_c.field_m[var6];
                    var6++;
                    continue L6;
                  }
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_p = new va();
    }
}
