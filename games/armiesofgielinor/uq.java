/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uq extends ms {
    static int[] field_u;
    static String field_v;
    static String field_w;
    int field_z;
    static String field_x;
    static String field_y;

    final static int a(String param0, gl param1, int param2, int param3, int param4, gl param5, boolean param6) {
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
        vh stackIn_7_0 = null;
        vh stackIn_8_0 = null;
        vh stackIn_9_0 = null;
        String stackIn_9_1 = null;
        vh stackIn_10_0 = null;
        vh stackIn_11_0 = null;
        vh stackIn_12_0 = null;
        String stackIn_12_1 = null;
        vh stackOut_6_0 = null;
        vh stackOut_8_0 = null;
        String stackOut_8_1 = null;
        vh stackOut_7_0 = null;
        String stackOut_7_1 = null;
        vh stackOut_9_0 = null;
        vh stackOut_11_0 = null;
        String stackOut_11_1 = null;
        vh stackOut_10_0 = null;
        String stackOut_10_1 = null;
        L0: {
          var13 = ArmiesOfGielinor.field_M ? 1 : 0;
          var14 = param1.a(param2 ^ -20049);
          var8 = param5.a(-91);
          if (null != am.field_z) {
            break L0;
          } else {
            if (tb.a(false, 0)) {
              break L0;
            } else {
              return -1;
            }
          }
        }
        L1: {
          if (ov.field_g == sg.field_a) {
            L2: {
              vl.field_n.field_q = 0;
              cv.field_s = null;
              if (param0 != null) {
                L3: {
                  var9 = 0;
                  vd.field_b.field_q = 0;
                  if (param6) {
                    var9 = var9 | 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  vd.field_b.a((byte) -108, iq.field_e.nextInt());
                  vd.field_b.a((byte) -52, iq.field_e.nextInt());
                  vd.field_b.a(var14, 413740432);
                  vd.field_b.a(var8, 413740432);
                  var15 = (CharSequence) (Object) param0;
                  vd.field_b.a(ea.a(param2 + 18820, var15), 413740432);
                  vd.field_b.b(true, param4);
                  vd.field_b.b(1, param3);
                  vd.field_b.b(param2 + 20033, var9);
                  vl.field_n.b(param2 + 20033, 18);
                  vl.field_n.field_q = vl.field_n.field_q + 2;
                  var10 = vl.field_n.field_q;
                  var11_ref = mg.a(0, ag.d((byte) 55));
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L4;
                  } else {
                    break L4;
                  }
                }
                vl.field_n.b(var11_ref, param2 + 33883);
                fp.a(mu.field_c, cs.field_cb, (byte) 26, vd.field_b, (vh) (Object) vl.field_n);
                vl.field_n.f(0, -var10 + vl.field_n.field_q);
                break L2;
              } else {
                L5: {
                  vd.field_b.field_q = 0;
                  vd.field_b.a((byte) -57, iq.field_e.nextInt());
                  vd.field_b.a((byte) -54, iq.field_e.nextInt());
                  stackOut_6_0 = vd.field_b;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (!param1.a((byte) 125)) {
                    stackOut_8_0 = (vh) (Object) stackIn_8_0;
                    stackOut_8_1 = "";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L5;
                  } else {
                    stackOut_7_0 = (vh) (Object) stackIn_7_0;
                    stackOut_7_1 = (String) var14;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L5;
                  }
                }
                L6: {
                  ((vh) (Object) stackIn_9_0).a((String) (Object) stackIn_9_1, param2 ^ -413754288);
                  stackOut_9_0 = vd.field_b;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (param5.a((byte) -111)) {
                    stackOut_11_0 = (vh) (Object) stackIn_11_0;
                    stackOut_11_1 = (String) var8;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L6;
                  } else {
                    stackOut_10_0 = (vh) (Object) stackIn_10_0;
                    stackOut_10_1 = "";
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L6;
                  }
                }
                ((vh) (Object) stackIn_12_0).a((String) (Object) stackIn_12_1, 413740432);
                vl.field_n.b(1, 16);
                vl.field_n.field_q = vl.field_n.field_q + 1;
                var9 = vl.field_n.field_q;
                fp.a(mu.field_c, cs.field_cb, (byte) 26, vd.field_b, (vh) (Object) vl.field_n);
                vl.field_n.e(vl.field_n.field_q + -var9, 5930);
                break L2;
              }
            }
            hb.a((byte) 54, -1);
            ov.field_g = cj.field_m;
            break L1;
          } else {
            break L1;
          }
        }
        L7: {
          if (ov.field_g != cj.field_m) {
            break L7;
          } else {
            if (es.a(param2 ^ 20080, 1)) {
              L8: {
                var9 = mg.field_e.k(0);
                mg.field_e.field_q = 0;
                if (-101 < (var9 ^ -1)) {
                  break L8;
                } else {
                  if (var9 > 105) {
                    break L8;
                  } else {
                    ov.field_g = mv.field_c;
                    br.field_b = new String[var9 - 100];
                    break L7;
                  }
                }
              }
              if (var9 != 248) {
                if ((var9 ^ -1) == -100) {
                  boolean discarded$1 = es.a(-81, qa.h(1));
                  cv.field_s = new Boolean(rr.a((byte) -76, (vh) (Object) mg.field_e));
                  mg.field_e.field_q = 0;
                  break L7;
                } else {
                  fk.field_b = -1;
                  nm.field_o = var9;
                  ov.field_g = da.field_b;
                  break L7;
                }
              } else {
                tf.a((byte) -99, ag.d((byte) -127));
                lk.field_r = om.field_s;
                dj.a((byte) -128);
                ev.field_b = false;
                return var9;
              }
            } else {
              break L7;
            }
          }
        }
        L9: {
          if (mv.field_c == ov.field_g) {
            var9 = 2;
            if (es.a(-79, var9)) {
              var10 = mg.field_e.e((byte) -104);
              mg.field_e.field_q = 0;
              if (!es.a(-83, var10)) {
                break L9;
              } else {
                var11 = br.field_b.length;
                var12 = 0;
                L10: while (true) {
                  if (var12 >= var11) {
                    dj.a((byte) -128);
                    ev.field_b = false;
                    return 100 - -var11;
                  } else {
                    br.field_b[var12] = mg.field_e.h((byte) 121);
                    var12++;
                    continue L10;
                  }
                }
              }
            } else {
              break L9;
            }
          } else {
            break L9;
          }
        }
        L11: {
          if (da.field_b == ov.field_g) {
            if (!jh.g(2)) {
              break L11;
            } else {
              L12: {
                if (-256 == (nm.field_o ^ -1)) {
                  var9_ref = mg.field_e.c((byte) -85);
                  if (var9_ref == null) {
                    break L12;
                  } else {
                    ph.a(var9_ref, ag.d((byte) -5), false);
                    break L12;
                  }
                } else {
                  lk.field_r = mg.field_e.g(1);
                  break L12;
                }
              }
              dj.a((byte) -127);
              ev.field_b = false;
              return nm.field_o;
            }
          } else {
            break L11;
          }
        }
        L13: {
          if (param2 == -20032) {
            break L13;
          } else {
            field_v = null;
            break L13;
          }
        }
        L14: {
          if (am.field_z != null) {
            break L14;
          } else {
            if (!ev.field_b) {
              var9 = rn.field_d;
              rn.field_d = sm.field_c;
              ev.field_b = true;
              sm.field_c = var9;
              break L14;
            } else {
              L15: {
                if ((ca.b(0) ^ -1L) < -30001L) {
                  lk.field_r = gu.field_a;
                  break L15;
                } else {
                  lk.field_r = nw.field_y;
                  break L15;
                }
              }
              ev.field_b = false;
              return 249;
            }
          }
        }
        return -1;
    }

    abstract Object b(boolean param0);

    abstract boolean a(boolean param0);

    public static void g(int param0) {
        if (param0 >= -11) {
            field_y = null;
        }
        field_y = null;
        field_v = null;
        field_x = null;
        field_w = null;
        field_u = null;
    }

    uq(int param0) {
        ((uq) this).field_z = param0;
    }

    final static ln a(vh param0, boolean param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        ln var5 = new ln();
        ln var2 = var5;
        if (param1) {
            uq.g(56);
        }
        for (var3 = 0; (var3 ^ -1) > -7; var3++) {
            var5.field_a[var3] = param0.a((byte) 103);
            var5.field_b[var3] = param0.a((byte) 120);
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[8192];
        field_w = "Chat view has been scrolled up. Scroll down to chat.";
        field_v = "Fast";
        field_x = "<%0> is not on your ignore list.";
        field_y = "Show chat (1 unread message)";
    }
}
