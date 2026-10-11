/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static ed[] field_f;
    static uf field_g;
    static String[] field_b;
    private int field_e;
    private int field_c;
    private int field_d;
    static hl field_a;

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        tj var4 = null;
        var3 = EscapeVector.field_A;
        try {
          var4 = qa.f((byte) -49);
          if (p.field_h != 0) {
            if (!aj.b(-124)) {
              if (1 == p.field_h) {
                kh.a(true, -1230, true);
              }
              if (p.field_h == 2) {
                n.field_h = false;
                gi.a((byte) -126);
                di.field_d = null;
                if (null != de.field_i) {
                  ml.a(de.field_i, 3, (byte) 101);
                }
                ci.a(0);
              }
            }
            p.field_h = 0;
            mj.field_d = 0;
            gi.a((byte) -105);
          }
          if (param0 >= -47) {
            return;
          }
          if (var4 == null) {
            if (null == ma.field_a &&
              !wk.field_c) {
              pf.e((byte) -111);
            }
            if (!wk.field_c) {
              if (pg.field_b) {
                qj.a(-883);
                hm.field_o.e(117);
              } else {
                if (0 <= od.field_q) {
                  sn.c(-1);
                  hn.field_l.j(2525);
                } else {
                  if (!n.field_h) {
                    if (!e.field_a) {
                      if (!hn.field_n) {
                        if (!ch.field_b) {
                          if (pl.field_q == null) {
                            if (null != da.field_c) {
                              rl.e(-46);
                            } else {
                              if (mj.field_d < 1000) {
                                mj.field_d = mj.field_d + 1;
                              }
                              ma.field_a.h(-41);
                            }
                          } else {
                            ff.a((byte) 127);
                          }
                        } else {
                          var2 = qk.field_e.f(-1) ? 1 : 0;
                          if (var2 != 0) {
                            return;
                          }
                        }
                      } else {
                        mn.d((byte) -120);
                        var2 = rc.field_a.f(-91) ? 1 : 0;
                        if (var2 != 0) {
                          return;
                        }
                      }
                    } else {
                      var2 = da.field_b.j(-122) ? 1 : 0;
                      if (var2 != 0) {
                        return;
                      }
                    }
                  } else {
                    if (mm.a(-59)) {
                      return;
                    }
                  }
                }
              }
            } else {
              kc.a((byte) -75);
            }
            lh.a(72);
          } else {
            var4.e((byte) 62);
          }
          if (aj.b(-102)) {
            return;
          }
          ce.field_f.d(-32464);
          ua.field_c.b(126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "mb.F(" + param0 + ')');
        }
    }

    final static boolean b(byte param0) {
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        try {
          stackIn_4_0 = (aj.b(-96)) ? 0 : 1;
          var1_int = stackIn_4_0;
          if (var1_int != 0 &&
            !ce.field_f.field_h &&
            !ce.field_f.field_c) {
            return false;
          }
          if (var1_int != 0 &&
            !ua.field_c.a(-19836)) {
            return false;
          }
          if (var1_int != 0 &&
            bj.e((byte) 98) &&
            se.field_b == null) {
            return false;
          }
          if (var1_int != 0 &&
            bj.e((byte) 116) &&
            ob.field_b == null) {
            return false;
          }
          if (var1_int != 0 &&
            bj.e((byte) 111) &&
            null != he.field_u) {
            return false;
          }
          if (param0 <= -61) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "mb.A(" + param0 + ')');
        }
    }

    final static void a(ed param0, int param1) {
        RuntimeException runtimeException = null;
        int[] var2 = null;
        int[] var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ah.field_j = param0;
          of.field_a = new ed(param0.field_A, param0.field_z);
          if (param1 > -11) {
            field_a = (hl) null;
          }
          var3 = new int[4];
          var2 = var3;
          em.a(var3);
          of.field_a.g();
          param0.c(0, 0);
          md.field_D.a(107);
          em.b(var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("mb.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        try {
          field_b = null;
          field_g = null;
          field_f = null;
          if (param0 != 4) {
            mb.b((byte) -110);
          }
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "mb.B(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        oe var4 = null;
        String[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (this.field_c != param1) {
            return;
          }
          if (this.field_d > param2) {
            return;
          }
          var4 = ma.field_a;
          if (param0 != 11827) {
            var5 = (String[]) null;
            mb.a((String[]) null, 86);
          }
          if (var4 == null) {
            return;
          }
          var4.a(param1, false, this.field_e, 255 ^ this.field_e);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var4_ref), "mb.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    mb(int param0, int param1, int param2) {
        try {
          this.field_c = param1;
          this.field_d = param0;
          this.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "mb.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(String[] args, int param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != ol.field_E) {
            ol.field_E.field_G.a(args, (byte) -103);
          }
          if (param1 != 4) {
            return;
          }
          if (rc.field_b != null) {
            rc.field_b.field_K.a(args, (byte) -103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("mb.E(");
          if (args == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = new ed[17];
        field_b = new String[]{"Congratulations, commander. Thanks to your superb skills, all of our technology has been recovered.", "The aliens will not be happy. It is now only a matter of time before they come back to Earth.", "This time, however, we and our valuable weapons will be ready."};
    }
}
