/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends ki {
    static String field_y;
    static fo field_w;
    static String field_t;
    static mh field_u;
    static String field_s;
    static boolean field_r;
    private static jp field_x;
    static int field_v;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        var5 = 100 % ((-28 - param0) / 43);
        if (this.b((byte) -124)) {
          if (-1 >= param1) {
            u.field_c.c(param2, param3);
            dj.field_a.c(param2, param3);
            return;
          } else {
            la.a(u.field_c, param2, param3, ab.field_C[param1]);
            dj.field_a.c(param2, param3);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        jp[] discarded$1 = null;
        pb var7 = null;
        pb var8 = null;
        if (param1 <= -84) {
          if (this.b((byte) -128)) {
            var8 = kd.a(this.field_m, param3, (byte) -50);
            if (var8.a((byte) -84, param3, this.field_m)) {
              ua.a(th.field_i, param2, 306, param0, ek.field_hb, 79, var8.field_p, param4, param3, 2, up.field_w, -35);
              return;
            } else {
              l.a(-35, 26746, var8, param3, 2, rg.field_f);
              var8.a(this.field_m, param3, (byte) 78);
              ua.a(th.field_i, param2, 306, param0, ek.field_hb, 79, var8.field_p, param4, param3, 2, up.field_w, -35);
              return;
            }
          } else {
            lb.g(param2, param0, 306, 480, 16777215);
            return;
          }
        } else {
          discarded$1 = this.b(33);
          if (this.b((byte) -128)) {
            var7 = kd.a(this.field_m, param3, (byte) -50);
            if (var7.a((byte) -84, param3, this.field_m)) {
              ua.a(th.field_i, param2, 306, param0, ek.field_hb, 79, var7.field_p, param4, param3, 2, up.field_w, -35);
              return;
            } else {
              l.a(-35, 26746, var7, param3, 2, rg.field_f);
              var7.a(this.field_m, param3, (byte) 78);
              ua.a(th.field_i, param2, 306, param0, ek.field_hb, 79, var7.field_p, param4, param3, 2, up.field_w, -35);
              return;
            }
          } else {
            lb.g(param2, param0, 306, 480, 16777215);
            return;
          }
        }
    }

    final jp a(boolean param0, int param1) {
        java.applet.Applet var4 = null;
        if (!param0) {
          var4 = (java.applet.Applet) null;
          oo.a((java.applet.Applet) null, 68);
          return lm.field_e[param1 + -1];
        } else {
          return lm.field_e[param1 + -1];
        }
    }

    final boolean a(boolean param0) {
        if (!(i.field_m.a("chocolate", -28138))) {
            return false;
        }
        nl.field_d = pl.a("chocolate", "chocolate_near", (byte) 114, i.field_m);
        field_x = pl.a("chocolate", "chocolate_mid", (byte) 123, i.field_m);
        ad.field_b = pl.a("chocolate", "chocolate_spires", (byte) -53, i.field_m);
        rg.field_f = pl.a("chocolate", "chocolate_far", (byte) 127, i.field_m);
        th.field_i = jh.a(0, nl.field_d);
        ek.field_hb = jh.a(0, field_x);
        up.field_w = jh.a(0, ad.field_b);
        u.field_c = pl.a("chocolate", "chocolate_small_far", (byte) -36, i.field_m);
        dj.field_a = pl.a("chocolate", "chocolate_small_near", (byte) -69, i.field_m);
        dc.field_c = pl.a("chocolate", "chocolate_character", (byte) 101, i.field_m);
        on.field_I[0] = cr.a("chocolate", i.field_m, "choc_caps", 2);
        aj.field_a[0] = cr.a("chocolate", i.field_m, "choc_segs", 2);
        lm.field_e[0] = pl.a("chocolate", "choc_centre", (byte) -126, i.field_m);
        on.field_I[1] = ig.a(on.field_I[0], param0);
        aj.field_a[1] = ig.a(aj.field_a[0], param0);
        lm.field_e[1] = pl.a(-16371, lm.field_e[0]);
        gq.field_Ub = cr.a("chocolate", i.field_m, "choc_lever", 2);
        return true;
    }

    final jp c(byte param0) {
        if (param0 >= -74) {
            this.a(false, 35, 0, 38, 68);
            return dc.field_c;
        }
        return dc.field_c;
    }

    final jp[] a(int param0, boolean param1) {
        if (!param1) {
            field_t = (String) null;
            return aj.field_a[-1 + param0];
        }
        return aj.field_a[-1 + param0];
    }

    final static m f(int param0) {
        String var1 = null;
        var1 = ud.d(true);
        if (param0 >= 68) {
          if (var1 != null) {
            if (0 > var1.indexOf('@')) {
              return new m(ud.d(true), la.b((byte) 118));
            } else {
              var1 = "";
              return new m(ud.d(true), la.b((byte) 118));
            }
          } else {
            return new m(ud.d(true), la.b((byte) 118));
          }
        } else {
          oo.d((byte) 97);
          if (var1 == null) {
            return new m(ud.d(true), la.b((byte) 118));
          } else {
            L0: {
              if (0 <= var1.indexOf('@')) {
                var1 = "";
                break L0;
              } else {
                break L0;
              }
            }
            return new m(ud.d(true), la.b((byte) 118));
          }
        }
    }

    final jp[] b(int param0) {
        if (param0 >= -12) {
            field_r = false;
            return gq.field_Ub;
        }
        return gq.field_Ub;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (!this.b((byte) -112)) {
          lb.g(param4, param2, 640, 480, 16777215);
          if (param0) {
            return;
          } else {
            field_t = (String) null;
            return;
          }
        } else {
          L0: {
            var6 = ge.a(this.field_m, param3, -20777);
            if (!var6.a((byte) -84, param3, this.field_m)) {
              l.a(0, 26746, var6, param3, 1, rg.field_f);
              var6.a(this.field_m, param3, (byte) 78);
              break L0;
            } else {
              break L0;
            }
          }
          ua.a(nl.field_d, param4, 640, param2, field_x, 95, var6.field_p, param1, param3, 1, ad.field_b, 0);
          if (param0) {
            return;
          } else {
            field_t = (String) null;
            return;
          }
        }
    }

    final jp[] a(byte param0, int param1) {
        int var3 = -63 % ((65 - param0) / 49);
        return on.field_I[-1 + param1];
    }

    oo(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
            aj.field_a = new jp[2][];
            lm.field_e = new jp[2];
            on.field_I = new jp[2][];
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "oo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean b(byte param0) {
        int stackIn_15_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param0 <= -91) {
          if (nl.field_d != null) {
            if (null != field_x) {
              if (rg.field_f != null) {
                if (ad.field_b != null) {
                  if (u.field_c != null) {
                    if (null == dj.field_a) {
                      return false;
                    } else {
                      L0: {
                        if (null == dc.field_c) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          break L0;
                        } else {
                          stackOut_30_0 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          break L0;
                        }
                      }
                      return stackIn_32_0 != 0;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_y = (String) null;
          if (nl.field_d != null) {
            if (null != field_x) {
              if (rg.field_f != null) {
                if (ad.field_b != null) {
                  if (u.field_c != null) {
                    if (null == dj.field_a) {
                      return false;
                    } else {
                      L1: {
                        if (null == dc.field_c) {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          break L1;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L1;
                        }
                      }
                      return stackIn_15_0 != 0;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param1 == 0) {
                      break L1;
                    } else {
                      field_x = (jp) null;
                      break L1;
                    }
                  }
                  var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                  param0.getAppletContext().showDocument(hg.a(param0, var2, -1), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("oo.R(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        java.applet.Applet var2 = null;
        if (param0 >= -29) {
          var2 = (java.applet.Applet) null;
          oo.a((java.applet.Applet) null, -87);
          field_t = null;
          field_x = null;
          field_y = null;
          field_w = null;
          field_u = null;
          field_s = null;
          return;
        } else {
          field_t = null;
          field_x = null;
          field_y = null;
          field_w = null;
          field_u = null;
          field_s = null;
          return;
        }
    }

    static {
        field_t = "This is <%0>'s RuneScape clan if they have one.";
        field_s = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_v = -1;
        field_y = "Remove friend";
    }
}
