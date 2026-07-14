/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends df {
    static String field_w;
    static boolean field_v;
    boolean field_y;
    char[] field_s;
    static String field_q;
    static int field_u;
    char[] field_p;
    static String[] field_o;
    int[] field_x;
    String field_t;
    int[] field_r;

    final static void f(byte param0) {
        if (!(eh.field_P)) {
            throw new IllegalStateException();
        }
        or.field_a = true;
        wk.a(false, true);
        gm.field_i = 0;
        if (param0 != -91) {
            Object var2 = null;
            eb discarded$0 = si.a(-82, (qb) null, -122, (byte) -43, -19, -109);
        }
    }

    final static int a(int param0, int param1, e param2, e param3, int param4, String param5, boolean param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        ob stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ob stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ob stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String stackIn_19_2 = null;
        ob stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ob stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        ob stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        String stackIn_22_2 = null;
        ob stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ob stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        String stackOut_18_2 = null;
        ob stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        String stackOut_17_2 = null;
        ob stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ob stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        String stackOut_21_2 = null;
        ob stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        String stackOut_20_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var14 = param3.a((byte) -126);
        var8 = param2.a((byte) 77);
        if (param4 >= 116) {
          L0: {
            if (wg.field_f == null) {
              if (ts.a(false, -2)) {
                break L0;
              } else {
                return -1;
              }
            } else {
              break L0;
            }
          }
          L1: {
            if (cs.field_j == j.field_r) {
              L2: {
                js.field_f.field_j = 0;
                sa.field_d = null;
                if (param5 == null) {
                  L3: {
                    eo.field_cb.field_j = 0;
                    eo.field_cb.e(11135, na.field_u.nextInt());
                    eo.field_cb.e(11135, na.field_u.nextInt());
                    stackOut_16_0 = eo.field_cb;
                    stackOut_16_1 = 95;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (!param3.a(2)) {
                      stackOut_18_0 = (ob) (Object) stackIn_18_0;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = "";
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      break L3;
                    } else {
                      stackOut_17_0 = (ob) (Object) stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = (String) var14;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      break L3;
                    }
                  }
                  L4: {
                    ((ob) (Object) stackIn_19_0).a((byte) stackIn_19_1, stackIn_19_2);
                    stackOut_19_0 = eo.field_cb;
                    stackOut_19_1 = 95;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (!param2.a(2)) {
                      stackOut_21_0 = (ob) (Object) stackIn_21_0;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = "";
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      break L4;
                    } else {
                      stackOut_20_0 = (ob) (Object) stackIn_20_0;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = (String) var8;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      break L4;
                    }
                  }
                  ((ob) (Object) stackIn_22_0).a((byte) stackIn_22_1, stackIn_22_2);
                  js.field_f.c(16, (byte) -69);
                  js.field_f.field_j = js.field_f.field_j + 1;
                  var9 = js.field_f.field_j;
                  co.a(25050, (ob) (Object) js.field_f, hr.field_a, eo.field_cb, jl.field_V);
                  js.field_f.b(js.field_f.field_j + -var9, (byte) 119);
                  break L2;
                } else {
                  L5: {
                    var9 = 0;
                    eo.field_cb.field_j = 0;
                    if (param6) {
                      var9 = var9 | 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    eo.field_cb.e(11135, na.field_u.nextInt());
                    eo.field_cb.e(11135, na.field_u.nextInt());
                    eo.field_cb.a((byte) 95, var14);
                    eo.field_cb.a((byte) 95, var8);
                    var15 = (CharSequence) (Object) param5;
                    eo.field_cb.a((byte) 95, cn.a(var15, (byte) 53));
                    eo.field_cb.d(param0, 255);
                    eo.field_cb.c(param1, (byte) -108);
                    eo.field_cb.c(var9, (byte) -60);
                    js.field_f.c(18, (byte) -76);
                    js.field_f.field_j = js.field_f.field_j + 2;
                    var10 = js.field_f.field_j;
                    var11_ref = ck.a((byte) -128, kq.f((byte) 124));
                    if (var11_ref == null) {
                      var11_ref = "";
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  js.field_f.a(var11_ref, (byte) 0);
                  co.a(25050, (ob) (Object) js.field_f, hr.field_a, eo.field_cb, jl.field_V);
                  js.field_f.f(-549342136, -var10 + js.field_f.field_j);
                  break L2;
                }
              }
              d.a(-1, (byte) 82);
              cs.field_j = qe.field_k;
              break L1;
            } else {
              break L1;
            }
          }
          L7: {
            if (cs.field_j != qe.field_k) {
              break L7;
            } else {
              if (!es.a(110, 1)) {
                break L7;
              } else {
                L8: {
                  var9 = sa.field_a.j(-83);
                  sa.field_a.field_j = 0;
                  if (100 > var9) {
                    break L8;
                  } else {
                    if (105 < var9) {
                      break L8;
                    } else {
                      cs.field_j = k.field_h;
                      ae.field_e = new String[-100 + var9];
                      break L7;
                    }
                  }
                }
                if ((var9 ^ -1) != -249) {
                  if (99 != var9) {
                    cs.field_j = nr.field_m;
                    ej.field_e = var9;
                    rr.field_t = -1;
                    break L7;
                  } else {
                    boolean discarded$1 = es.a(119, nc.a(-85));
                    sa.field_d = new Boolean(ro.a((byte) -24, (ob) (Object) sa.field_a));
                    sa.field_a.field_j = 0;
                    break L7;
                  }
                } else {
                  ce.a(kq.f((byte) 125), true);
                  nl.field_c = dh.field_b;
                  q.g(-125);
                  ke.field_j = false;
                  return var9;
                }
              }
            }
          }
          L9: {
            if (k.field_h != cs.field_j) {
              break L9;
            } else {
              var9 = 2;
              if (es.a(-87, var9)) {
                var10 = sa.field_a.f(-20976);
                sa.field_a.field_j = 0;
                if (!es.a(126, var10)) {
                  break L9;
                } else {
                  var11 = ae.field_e.length;
                  var12 = 0;
                  L10: while (true) {
                    if (var11 <= var12) {
                      q.g(-113);
                      ke.field_j = false;
                      return 100 + var11;
                    } else {
                      ae.field_e[var12] = sa.field_a.e((byte) -126);
                      var12++;
                      continue L10;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
          }
          L11: {
            if (nr.field_m != cs.field_j) {
              break L11;
            } else {
              if (uc.d((byte) -28)) {
                L12: {
                  if ((ej.field_e ^ -1) == -256) {
                    var9_ref = sa.field_a.i(1910283844);
                    if (var9_ref == null) {
                      break L12;
                    } else {
                      jf.a(-25602, var9_ref, kq.f((byte) 125));
                      break L12;
                    }
                  } else {
                    nl.field_c = sa.field_a.e(-1);
                    break L12;
                  }
                }
                q.g(-99);
                ke.field_j = false;
                return ej.field_e;
              } else {
                break L11;
              }
            }
          }
          L13: {
            if (null != wg.field_f) {
              break L13;
            } else {
              if (!ke.field_j) {
                var9 = of.field_f;
                of.field_f = bb.field_c;
                bb.field_c = var9;
                ke.field_j = true;
                break L13;
              } else {
                L14: {
                  if (wh.a(18) > 30000L) {
                    nl.field_c = gq.field_f;
                    break L14;
                  } else {
                    nl.field_c = wb.field_d;
                    break L14;
                  }
                }
                ke.field_j = false;
                return 249;
              }
            }
          }
          return -1;
        } else {
          return 63;
        }
    }

    public static void e(byte param0) {
        field_w = null;
        field_o = null;
        if (param0 != -117) {
            return;
        }
        field_q = null;
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(((si) this).field_x == null)) {
            for (var2 = 0; var2 < ((si) this).field_x.length; var2++) {
                ((si) this).field_x[var2] = ee.a(((si) this).field_x[var2], 32768);
            }
        }
        var2 = 123 % ((-18 - param0) / 55);
        if (!(((si) this).field_r == null)) {
            for (var3 = 0; ((si) this).field_r.length > var3; var3++) {
                ((si) this).field_r[var3] = ee.a(((si) this).field_r[var3], 32768);
            }
        }
    }

    private final void a(ob param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        char[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char stackOut_7_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (1 == param2) {
            ((si) this).field_t = param0.e(-1);
            break L0;
          } else {
            if ((param2 ^ -1) == -3) {
              var4 = param0.j(-100);
              ((si) this).field_p = new char[var4];
              ((si) this).field_r = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  L2: {
                    ((si) this).field_r[var5] = param0.f(-20976);
                    var6 = param0.g(-2852);
                    stackOut_14_0 = ((si) this).field_p;
                    stackOut_14_1 = var5;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (-1 != (var6 ^ -1)) {
                      stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = oa.a(-12541, (byte) var6);
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      break L2;
                    } else {
                      stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = 0;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      break L2;
                    }
                  }
                  stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (3 != param2) {
                if ((param2 ^ -1) == -5) {
                  ((si) this).field_y = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param0.j(-81);
                ((si) this).field_s = new char[var4];
                ((si) this).field_x = new int[var4];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    L4: {
                      ((si) this).field_x[var5] = param0.f(-20976);
                      var6 = param0.g(-2852);
                      stackOut_5_0 = ((si) this).field_s;
                      stackOut_5_1 = var5;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var6 != 0) {
                        stackOut_7_0 = (char[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = oa.a(-12541, (byte) var6);
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        break L4;
                      } else {
                        stackOut_6_0 = (char[]) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 0;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        break L4;
                      }
                    }
                    stackIn_8_0[stackIn_8_1] = (char) stackIn_8_2;
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        L5: {
          if (param1 < -58) {
            break L5;
          } else {
            ((si) this).field_t = null;
            break L5;
          }
        }
    }

    final static eb a(int param0, qb param1, int param2, byte param3, int param4, int param5) {
        java.awt.Frame var9 = tl.a(true, param1, param4, param2, param5, param0);
        java.awt.Frame var6 = var9;
        if (var9 == null) {
            return null;
        }
        eb var7 = new eb();
        int var8 = -69 % ((44 - param3) / 49);
        var7.field_d = var9;
        java.awt.Component discarded$0 = var7.field_d.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, 0, param0, param5);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    final void a(ob param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        L0: while (true) {
          var3 = param0.j(param1 ^ 109);
          if (var3 != 0) {
            this.a(param0, (byte) -67, var3);
            continue L0;
          } else {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                ((si) this).field_y = false;
                break L1;
              }
            }
            return;
          }
        }
    }

    si() {
        ((si) this).field_y = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Total fleets produced in this territory this turn.";
        field_q = "Open";
    }
}
