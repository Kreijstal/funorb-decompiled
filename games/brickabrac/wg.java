/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_e;
    static lo field_c;
    java.awt.Frame field_a;
    static String field_b;
    static String field_d;
    static int field_f;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((wg) this).field_e = true;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "wg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(String param0, byte param1, boolean param2, String param3, int param4, String param5, int param6) {
        m var7 = null;
        RuntimeException var7_ref = null;
        m var8 = null;
        int stackIn_1_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
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
        try {
          L0: {
            var7 = new m(param5);
            var8 = new m(param3);
            stackOut_0_0 = wl.a(param0, param2, param4, var7, param6, var8, 4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("wg.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(-74).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    final static int a(boolean param0) {
        dp.field_v.a(77);
        if (!vd.field_f.b(72)) {
            return sm.b(-1);
        }
        return 0;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final void a(tg param0, int param1) {
        try {
            sq.a(param0, -20954, ((wg) this).field_a);
            int var3_int = -13 / ((param1 - 82) / 32);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "wg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static void a(int param0, km param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -53) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              if (param1.field_a < 0) {
                break L2;
              } else {
                if (pg.field_k.length <= param1.field_a) {
                  break L2;
                } else {
                  pg.field_k[param1.field_a] = param1;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("wg.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        mh var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        gb var9 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (hj.field_Yb <= hc.field_f) {
                break L1;
              } else {
                hc.field_f = hc.field_f + 1;
                break L1;
              }
            }
            L2: {
              if (kc.field_q.field_f == ej.field_O) {
                break L2;
              } else {
                rn.field_h = rn.field_h + (-ej.field_O + kc.field_q.field_f);
                ej.field_O = kc.field_q.field_f;
                break L2;
              }
            }
            if (hc.field_f <= 0) {
              return;
            } else {
              L3: {
                ef.a(-124);
                gp.field_d.a(param3, -15211);
                if (null != vd.field_a) {
                  if (um.field_e) {
                    boolean discarded$1 = vd.field_a.a(gp.field_d.field_db, gp.field_d.field_Eb, 116, param3);
                    break L3;
                  } else {
                    vd.field_a = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (5 <= var4_int) {
                  L5: {
                    if (mj.field_c.field_L != 0) {
                      no.field_p = new am(mj.field_c.field_Eb, mj.field_c.field_db, mj.field_c.field_Ib, mj.field_c.field_cb, param1, re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t, (String) null, 0L);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var9 = sj.a(om.field_oc, np.field_a, -13294, param0);
                    if (var9 != null) {
                      hj.a(0, var9);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var8 = pn.c(-9235);
                  if (var8 != null) {
                    ep.field_e = var8;
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  L7: {
                    var5 = ik.field_i[var4_int];
                    if (var5 != null) {
                      L8: {
                        if (var5.field_L != 0) {
                          wd.a(784, var4_int, var5);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var6 = tm.a(var4_int, (byte) 18);
                      vj.field_a[var4_int].field_wb = ef.field_b[var6];
                      wd.field_F[var4_int].field_Mb = rh.field_e[var6];
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "wg.B(" + param0 + ',' + param1 + ',' + -1 + ',' + param3 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    wg() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new lo();
        field_d = "Game full";
        field_b = "Please try again in a few minutes.";
    }
}
