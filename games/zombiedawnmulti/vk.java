/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends rg {
    static String field_K;
    static int[] field_J;
    private th field_H;
    static String field_F;
    static String field_G;
    static boolean field_E;
    static pd field_I;
    static String[] field_L;

    final void b(int param0, cf param1) {
        if (!(param1 instanceof df)) {
            throw new IllegalArgumentException();
        }
        if (param0 != 3016) {
            return;
        }
        df var3 = (df) (Object) param1;
        ((vk) this).field_H.a(-25612, (br) (Object) var3);
        var3.field_R = true;
        boolean discarded$0 = var3.a((cf) this, 0);
    }

    final static boolean l(byte param0) {
        Object var2 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 <= -121) {
            break L0;
          } else {
            var2 = null;
            String discarded$2 = vk.a(-28, (CharSequence) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (fn.field_i < 20) {
              break L2;
            } else {
              if (!ge.p(-86)) {
                break L2;
              } else {
                L3: {
                  if (qq.field_a <= 0) {
                    break L3;
                  } else {
                    if (re.b(-118)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void h(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(((vk) this).field_H);
        df var3 = (df) (Object) var2.c(-3);
        if (param0 > -84) {
            boolean discarded$0 = vk.l((byte) 127);
        }
        while (var3 != null) {
            if (var3.i(-27388)) {
                var3.a(true);
            }
            var3 = (df) (Object) var2.a((byte) -113);
        }
        ((vk) this).field_B = (cf) (Object) ((vk) this).j((byte) -119);
    }

    public static void k(byte param0) {
        field_K = null;
        field_I = null;
        int var1 = 90 / ((30 - param0) / 47);
        field_F = null;
        field_J = null;
        field_G = null;
        field_L = null;
    }

    final static void a(ka param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1 == 83) {
            break L0;
          } else {
            field_J = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 3) {
            var2 = 0;
            L2: while (true) {
              if (uf.field_g <= var2) {
                ub.field_ub[param0.a(true)] = ub.field_ub[param0.a(true)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (var3 >= uf.field_g) {
                    uf.field_g = var2;
                    uf.field_g = uf.field_g + 1;
                    uk.field_M[uf.field_g] = param0;
                    return;
                  } else {
                    L4: {
                      if (uk.field_M[var3].field_l != param0.field_l) {
                        break L4;
                      } else {
                        var4 = uk.field_M[var3].a(true);
                        if (ub.field_ub[var4] <= sj.field_m) {
                          break L4;
                        } else {
                          ub.field_ub[var4] = ub.field_ub[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      }
                    }
                    var2++;
                    uk.field_M[var2] = uk.field_M[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (param0.field_l == uk.field_M[var2].field_l) {
                  ub.field_ub[uk.field_M[var2].a(true)] = ub.field_ub[uk.field_M[var2].a(true)] + 1;
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            ub.field_ub[var2] = 0;
            var2++;
            continue L1;
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        if (param0 != 20) {
            Object var3 = null;
            vk.a((int[]) null, true, 94, 30, (byte) 84, (int[]) null, 90, 72, -73);
        }
        return so.a(false, -52, param1);
    }

    final static boolean i(byte param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -39) {
            break L0;
          } else {
            var2 = null;
            vk.a((int[]) null, false, -127, -95, (byte) -9, (int[]) null, -29, -30, -79);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!a.a(-107)) {
              break L2;
            } else {
              if ((8 & wf.field_m) != 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void h(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(((vk) this).field_H);
        df var3 = (df) (Object) var2.c(-3);
        while (var3 != null) {
            var3.field_R = false;
            var3 = (df) (Object) var2.a((byte) -112);
        }
        ((vk) this).field_B = null;
        if (param0 >= -81) {
            boolean discarded$0 = vk.i((byte) 56);
        }
    }

    final df j(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(((vk) this).field_H);
        df var3 = (df) (Object) var2.c(-3);
        while (var3 != null) {
            if (!(!var3.field_R)) {
                return var3;
            }
            var3 = (df) (Object) var2.a((byte) -48);
        }
        if (param0 < -118) {
            return null;
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(((vk) this).field_h == null)) {
            ((vk) this).field_h.a(true, param1, -15112, param3, (cf) this);
        }
        if (param0 != -2) {
            return;
        }
        ch var5 = new ch(((vk) this).field_H);
        cf var6 = (cf) (Object) var5.a(32397);
        while (var6 != null) {
            var6.a(-2, param1 - -((vk) this).field_i, param2, param3 + ((vk) this).field_y);
            var6 = (cf) (Object) var5.e(-3);
        }
    }

    final cf f(int param0) {
        ch var2 = null;
        df var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(((vk) this).field_H);
        if (param0 == -1963) {
          var3 = (df) (Object) var2.c(-3);
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_R) {
                return var3.g(122);
              } else {
                var3 = (df) (Object) var2.a((byte) -38);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static ja[] a(int param0, int param1, ul param2, int param3) {
        if (!ud.a(param3, param2, param1, (byte) -42)) {
            return null;
        }
        if (param0 < 32) {
            boolean discarded$0 = vk.i((byte) -118);
        }
        return eb.a(33);
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, byte param4, int[] param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          var9 = 13 / ((param4 - 48) / 58);
          if ((param2 ^ -1) == -2) {
            mj.field_Hb[param2] = (nc) (Object) new ho(param2, param1, param3, param6, param8, param7, param5);
            break L0;
          } else {
            if (3 != param2) {
              if (param2 == -5) {
                mj.field_Hb[param2] = (nc) (Object) new ol(param2, param1, param3, param6, param8, param7, param5);
                break L0;
              } else {
                L1: {
                  if (5 == param2) {
                    break L1;
                  } else {
                    if (-7 == param2) {
                      break L1;
                    } else {
                      if (10 == param2) {
                        mj.field_Hb[param2] = (nc) (Object) new si(param2, param1, param3, param6, param8, param7, param5);
                        break L0;
                      } else {
                        if (param2 == 12) {
                          mj.field_Hb[param2] = (nc) (Object) new vo(param2, param1, param3, param6, param8, param7, param5);
                          break L0;
                        } else {
                          if (param2 == 14) {
                            mj.field_Hb[param2] = (nc) (Object) new vj(param2, param1, param3, param6, param8, param7, param5);
                            break L0;
                          } else {
                            if (-16 == (param2 ^ -1)) {
                              mj.field_Hb[param2] = (nc) (Object) new tk(param2, param1, param3, param6, param8, param7, param5);
                              break L0;
                            } else {
                              if (13 == param2) {
                                mj.field_Hb[param2] = (nc) (Object) new kp(param2, param1, param3, param6, param8, param7, param5);
                                break L0;
                              } else {
                                mj.field_Hb[param2] = new nc(param2, param1, param3, param6, param8, param7, param5);
                                break L0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                mj.field_Hb[param2] = (nc) (Object) new mq(param2, param1, param3, param6, param8, param7, param5);
                break L0;
              }
            } else {
              mj.field_Hb[param2] = (nc) (Object) new fk(param2, param1, param3, param6, param8, param7, param5);
              break L0;
            }
          }
        }
        ab.field_h = (si) (Object) mj.field_Hb[10];
    }

    public vk() {
        super(0, 0, ub.field_wb, kc.field_a, (nl) null, (bj) null);
        ((vk) this).field_H = new th();
    }

    final void g(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(((vk) this).field_H);
        if (param0 != 118) {
            field_J = null;
        }
        df var3 = (df) (Object) var2.c(-3);
        while (var3 != null) {
            if (!(!var3.h(-6134))) {
                var3.a(true);
            }
            var3 = (df) (Object) var2.a((byte) -30);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "(Including <%0>)";
        field_G = "Achievements can only be earned in Rated games.";
        field_K = "Music: ";
        field_L = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_E = false;
    }
}
