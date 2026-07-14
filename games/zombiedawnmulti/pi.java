/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static String field_c;
    int field_d;
    static String field_b;
    static ri field_f;
    static String field_h;
    static String field_e;
    static int field_i;
    static String field_g;
    static ip field_a;

    pi(int param0) {
        ((pi) this).field_d = param0;
    }

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        if (param0 != -19162) {
            field_b = null;
        }
        field_f = null;
        field_g = null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int[] param4, int param5, int param6, int param7) {
        if (!param3) {
            return;
        }
        Object var9 = null;
        vk.a((int[]) null, param1, param6, param2, (byte) -117, param4, param5, param7, param0);
    }

    final static void a(byte param0, boolean param1, boolean param2, ic param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          mj.field_Fb[0] = c.field_c.nextInt();
          mj.field_Fb[1] = c.field_c.nextInt();
          mj.field_Fb[2] = (int)(nm.field_c >> 1948345184);
          mj.field_Fb[3] = (int)nm.field_c;
          pm.field_R.field_j = 0;
          pm.field_R.b(33, mj.field_Fb[0]);
          pm.field_R.b(param0 ^ 84, mj.field_Fb[1]);
          pm.field_R.b(-111, mj.field_Fb[2]);
          pm.field_R.b(param0 ^ 88, mj.field_Fb[3]);
          jq.a(pm.field_R, 13746);
          pm.field_R.a(param4, (byte) -54);
          if (param0 == -59) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          param3.a(pm.field_R, -1);
          ma.field_a.field_j = 0;
          if (!param2) {
            ma.field_a.a(param0 ^ -68, 16);
            break L1;
          } else {
            ma.field_a.a(-102, 18);
            break L1;
          }
        }
        L2: {
          ma.field_a.field_j = ma.field_a.field_j + 2;
          var5 = ma.field_a.field_j;
          ma.field_a.b(95, v.field_f);
          ma.field_a.a(qa.field_i, true);
          var6 = 0;
          if (cm.field_e) {
            var6 = var6 | 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!gj.field_e) {
            break L3;
          } else {
            var6 = var6 | 4;
            break L3;
          }
        }
        L4: {
          if (!param1) {
            break L4;
          } else {
            var6 = var6 | 8;
            break L4;
          }
        }
        L5: {
          if (null != oe.field_f) {
            var6 = var6 | 16;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          ma.field_a.a(-81, var6);
          var7 = wg.a(0, jl.b(0));
          if (var7 == null) {
            var7 = "";
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          ma.field_a.a(var7, (byte) 105);
          if (null != oe.field_f) {
            ma.field_a.b(-16171, oe.field_f);
            break L7;
          } else {
            break L7;
          }
        }
        hd.a(gn.field_L, (byte) -122, tp.field_v, pm.field_R, (k) (Object) ma.field_a);
        ma.field_a.b(false, -var5 + ma.field_a.field_j);
        cb.a(-1, false);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1 >= oo.field_f) {
            break L0;
          } else {
            param3 = param3 - (oo.field_f - param1);
            param1 = oo.field_f;
            break L0;
          }
        }
        L1: {
          if (oo.field_e > param5) {
            param4 = param4 - (-param5 + oo.field_e);
            param5 = oo.field_e;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (oo.field_g >= param1 + param3) {
            break L2;
          } else {
            param3 = oo.field_g - param1;
            break L2;
          }
        }
        if (param0 <= -88) {
          L3: {
            if (oo.field_d < param4 + param5) {
              param4 = oo.field_d + -param5;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param3 >= -1) {
              break L4;
            } else {
              if (-1 < param4) {
                var6 = oo.field_b * param5 + param1;
                var7 = oo.field_b + -param3;
                param5 = -param4;
                L5: while (true) {
                  if (param5 >= 0) {
                    return;
                  } else {
                    param1 = -param3;
                    L6: while (true) {
                      if (param1 >= 0) {
                        var6 = var6 + var7;
                        param5++;
                        continue L5;
                      } else {
                        var8 = oo.field_i[var6];
                        if ((255 & var8 >> -191798296) > param2) {
                          if ((255 & var8 >> -1579167280) <= (var8 & 65280) >> -194018744) {
                            L7: {
                              var9 = ((16711680 & var8) >> 1703656975) - 60;
                              if (var9 > 255) {
                                var9 = 255;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var10 = 65280 & var8;
                            var10 = -(var10 >> 1524593221) + (var10 >> -1951905311) & 65280;
                            var11 = 31 & var8 >> -656512189;
                            oo.field_i[var6] = cr.b(cr.b(var9 << -46440176, var10), var11);
                            var6++;
                            param1++;
                            continue L6;
                          } else {
                            var6++;
                            param1++;
                            continue L6;
                          }
                        } else {
                          var6++;
                          param1++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Offline";
        field_h = "Traits affect your zombies for the entire match. Drag GREEN (square) research here to apply it.";
        field_b = "Return to lobby";
        field_g = "Suggested names: ";
        field_e = "Message game";
        field_a = new ip();
    }
}
