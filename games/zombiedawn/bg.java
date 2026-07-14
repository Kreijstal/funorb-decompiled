/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends le {
    byte[] field_m;
    static vo field_i;
    int field_j;
    static String field_n;
    long field_h;
    static int field_k;
    static vk field_l;
    static vn[] field_o;

    public static void c(byte param0) {
        if (param0 != -44) {
            int discarded$0 = bg.a(-106, 54, false, -127);
        }
        field_o = null;
        field_i = null;
        field_n = null;
        field_l = null;
    }

    bg(long param0, int param1, byte[] param2) {
        ((bg) this).field_h = param0;
        ((bg) this).field_m = param2;
        ((bg) this).field_j = param1;
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        int var4 = -43 % ((-39 - param0) / 61);
        return qo.b((byte) -123);
    }

    final static boolean a(int param0) {
        if (param0 != 2) {
            field_k = -82;
        }
        return (rc.field_x ^ -1) != (rc.field_p ^ -1) ? true : false;
    }

    final static int a(int param0, int param1, ji param2, String param3, ji param4, int param5, boolean param6) {
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
        de stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        de stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        de stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String stackIn_18_2 = null;
        de stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        de stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        de stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_21_2 = null;
        de stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        de stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        String stackOut_17_2 = null;
        de stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        String stackOut_16_2 = null;
        de stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        de stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        String stackOut_20_2 = null;
        de stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        String stackOut_19_2 = null;
        var13 = ZombieDawn.field_J;
        var14 = param2.a(-1);
        var11_ref = var14;
        var11_ref = var14;
        var8 = param4.a(param0 ^ -106);
        var11_ref = var8;
        var11_ref = var8;
        if (param0 == 105) {
          L0: {
            if (sn.field_c != null) {
              break L0;
            } else {
              if (!i.a(false, true)) {
                return -1;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (ui.field_g == ic.field_T) {
              L2: {
                dp.field_e.field_j = 0;
                ba.field_g = null;
                if (param3 == null) {
                  L3: {
                    dh.field_e.field_j = 0;
                    dh.field_e.h(-127, p.field_b.nextInt());
                    dh.field_e.h(-119, p.field_b.nextInt());
                    stackOut_15_0 = dh.field_e;
                    stackOut_15_1 = -88;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (!param2.b(32)) {
                      stackOut_17_0 = (de) (Object) stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = "";
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      break L3;
                    } else {
                      stackOut_16_0 = (de) (Object) stackIn_16_0;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = (String) var14;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      break L3;
                    }
                  }
                  L4: {
                    ((de) (Object) stackIn_18_0).a((byte) stackIn_18_1, stackIn_18_2);
                    stackOut_18_0 = dh.field_e;
                    stackOut_18_1 = -88;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (!param4.b(param0 ^ 73)) {
                      stackOut_20_0 = (de) (Object) stackIn_20_0;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = "";
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      break L4;
                    } else {
                      stackOut_19_0 = (de) (Object) stackIn_19_0;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = (String) var8;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      break L4;
                    }
                  }
                  ((de) (Object) stackIn_21_0).a((byte) stackIn_21_1, stackIn_21_2);
                  dp.field_e.i(16, 64);
                  dp.field_e.field_j = dp.field_e.field_j + 1;
                  var9 = dp.field_e.field_j;
                  ab.a(dh.field_e, pm.field_c, (byte) 108, (de) (Object) dp.field_e, pj.field_p);
                  dp.field_e.d(param0 + -211, -var9 + dp.field_e.field_j);
                  break L2;
                } else {
                  L5: {
                    var9 = 0;
                    dh.field_e.field_j = 0;
                    if (param6) {
                      var9 = var9 | 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    dh.field_e.h(23, p.field_b.nextInt());
                    dh.field_e.h(-117, p.field_b.nextInt());
                    dh.field_e.a((byte) -88, var14);
                    dh.field_e.a((byte) -88, var8);
                    var15 = (CharSequence) (Object) param3;
                    dh.field_e.a((byte) -88, qb.a(-122, var15));
                    dh.field_e.a(param5, (byte) 105);
                    dh.field_e.i(param1, 53);
                    dh.field_e.i(var9, 66);
                    dp.field_e.i(18, 125);
                    dp.field_e.field_j = dp.field_e.field_j + 2;
                    var10 = dp.field_e.field_j;
                    var11_ref = ff.a(hc.a(0), (byte) -128);
                    if (var11_ref != null) {
                      break L6;
                    } else {
                      var11_ref = "";
                      break L6;
                    }
                  }
                  dp.field_e.a(param0 + 23, var11_ref);
                  ab.a(dh.field_e, pm.field_c, (byte) -109, (de) (Object) dp.field_e, pj.field_p);
                  dp.field_e.g(57, -var10 + dp.field_e.field_j);
                  break L2;
                }
              }
              vl.a((byte) -46, -1);
              ic.field_T = oe.field_a;
              break L1;
            } else {
              break L1;
            }
          }
          L7: {
            if (oe.field_a != ic.field_T) {
              break L7;
            } else {
              if (ck.a((byte) -125, 1)) {
                L8: {
                  var9 = fj.field_g.d((byte) -119);
                  fj.field_g.field_j = 0;
                  if ((var9 ^ -1) > -101) {
                    break L8;
                  } else {
                    if (var9 > 105) {
                      break L8;
                    } else {
                      ic.field_T = og.field_B;
                      ho.field_a = new String[-100 + var9];
                      break L7;
                    }
                  }
                }
                if (var9 != 248) {
                  if (99 != var9) {
                    ic.field_T = qo.field_w;
                    jd.field_b = -1;
                    l.field_d = var9;
                    break L7;
                  } else {
                    boolean discarded$1 = ck.a((byte) -103, lo.a(false));
                    ba.field_g = new Boolean(uh.a((byte) -36, (de) (Object) fj.field_g));
                    fj.field_g.field_j = 0;
                    break L7;
                  }
                } else {
                  jc.a((byte) 34, hc.a(0));
                  sc.field_d = wk.field_z;
                  p.a(param0 + -104);
                  nm.field_d = false;
                  return var9;
                }
              } else {
                break L7;
              }
            }
          }
          L9: {
            if (og.field_B == ic.field_T) {
              var9 = 2;
              if (ck.a((byte) -128, var9)) {
                var10 = fj.field_g.f(param0 ^ 107);
                fj.field_g.field_j = 0;
                if (ck.a((byte) -100, var10)) {
                  var11 = ho.field_a.length;
                  var12 = 0;
                  L10: while (true) {
                    if (var12 >= var11) {
                      p.a(1);
                      nm.field_d = false;
                      return 100 + var11;
                    } else {
                      ho.field_a[var12] = fj.field_g.d(19988);
                      var12++;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            } else {
              break L9;
            }
          }
          L11: {
            if (qo.field_w != ic.field_T) {
              break L11;
            } else {
              if (!nn.a(-2887)) {
                break L11;
              } else {
                L12: {
                  if ((l.field_d ^ -1) != -256) {
                    sc.field_d = fj.field_g.a(true);
                    break L12;
                  } else {
                    var9_ref = fj.field_g.h(-1);
                    if (var9_ref == null) {
                      break L12;
                    } else {
                      qg.a(165, hc.a(0), var9_ref);
                      break L12;
                    }
                  }
                }
                p.a(1);
                nm.field_d = false;
                return l.field_d;
              }
            }
          }
          L13: {
            if (null != sn.field_c) {
              break L13;
            } else {
              if (nm.field_d) {
                L14: {
                  if (30000L >= gd.a(-127)) {
                    sc.field_d = rl.field_a;
                    break L14;
                  } else {
                    sc.field_d = dl.field_b;
                    break L14;
                  }
                }
                nm.field_d = false;
                return 249;
              } else {
                var9 = ci.field_c;
                ci.field_c = cn.field_j;
                nm.field_d = true;
                cn.field_j = var9;
                break L13;
              }
            }
          }
          return -1;
        } else {
          return 44;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Quit";
        field_i = new vo();
        field_k = 2;
        field_l = new vk();
    }
}
