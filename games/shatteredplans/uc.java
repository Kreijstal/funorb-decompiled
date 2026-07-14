/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends vd {
    static int field_v;
    static String field_z;
    static String field_y;
    static boolean field_B;
    static int field_A;
    private int field_x;
    private int field_u;
    static int[] field_w;

    final static ro a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = param1.length();
        if (var2 == 0) {
          return fg.field_a;
        } else {
          if (-65 <= (var2 ^ -1)) {
            if (param1.charAt(0) != 34) {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var4 >= var2) {
                  if (param0 >= -43) {
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  var5 = param1.charAt(var4);
                  if (var5 != 46) {
                    if (0 != (hr.field_c.indexOf(var5) ^ -1)) {
                      var3 = 0;
                      var4++;
                      continue L0;
                    } else {
                      return as.field_t;
                    }
                  } else {
                    L1: {
                      if (0 == var4) {
                        break L1;
                      } else {
                        if (var4 == -1 + var2) {
                          break L1;
                        } else {
                          if (var3 != 0) {
                            break L1;
                          } else {
                            var3 = 1;
                            var4++;
                            continue L0;
                          }
                        }
                      }
                    }
                    return as.field_t;
                  }
                }
              }
            } else {
              if (param1.charAt(-1 + var2) == 34) {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param1.charAt(var4);
                    if (var5 == 92) {
                      L3: {
                        if (var3 != 0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L3;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L3;
                        }
                      }
                      var3 = stackIn_16_0;
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        if (var5 != 34) {
                          break L4;
                        } else {
                          if (var3 != 0) {
                            break L4;
                          } else {
                            return as.field_t;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return as.field_t;
              }
            }
          } else {
            return cm.field_e;
          }
        }
    }

    final static hh a(byte[] param0, int param1) {
        if (param0 == null) {
            return null;
        }
        hh var2 = new hh(param0, cf.field_H, sj.field_a, mc.field_s, cm.field_g, hd.field_q);
        pd.a(param1 ^ param1);
        return var2;
    }

    public static void e(byte param0) {
        field_z = null;
        field_w = null;
        if (param0 <= 61) {
            Object var2 = null;
            hh discarded$0 = uc.a((byte[]) null, -44);
        }
        field_y = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, boolean param6, bi[] param7, byte param8, int param9, bi[] param10, nq param11, boolean param12, int param13, int param14) {
        if (param8 != -87) {
            uc.e((byte) -47);
        }
        ub.a(param2, param11, nr.field_h, param1, param3, param9, param11, param4, em.field_j, 0, param1, new v(param10), param2, ih.field_b, wo.field_a, param13, param0, dn.field_l, qi.field_j, new v(param7));
        kb.a(param6, true, param12, param14, param5);
    }

    final static boolean d(byte param0) {
        if (!(-1 != rr.field_t)) {
            if (!es.a(-57, 1)) {
                return false;
            }
            rr.field_t = sa.field_a.j(-54);
            sa.field_a.field_j = 0;
        }
        if (-2 == rr.field_t) {
            if (!es.a(118, 2)) {
                return false;
            }
            rr.field_t = sa.field_a.f(-20976);
            sa.field_a.field_j = 0;
        }
        if (param0 > -25) {
            Object var2 = null;
            uc.a(-68, -91, -81, 82, -51, (String) null, true, (bi[]) null, (byte) -67, 2, (bi[]) null, (nq) null, true, 22, -30);
        }
        return es.a(-78, rr.field_t);
    }

    uc(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3);
        ((uc) this).field_u = param5;
        ((uc) this).field_x = param4;
    }

    final void a(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(((uc) this).field_s)) {
            return;
        }
        for (var3 = 0; ((uc) this).field_m > var3; var3++) {
            var2 = ui.a(((uc) this).field_x, ((uc) this).field_u, -115, 256 * var3 / ((uc) this).field_m);
            gf.j(var3 + ((uc) this).field_k, ((uc) this).field_t, ((uc) this).field_i, var2);
        }
        int var4 = 3 % ((67 - param0) / 47);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "End Game";
        field_v = 0;
        field_z = "All games";
    }
}
