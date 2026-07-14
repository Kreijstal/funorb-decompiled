/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    static int[] field_b;
    static bc field_c;
    static String[] field_d;
    static int field_a;
    static int field_e;

    final static void a(int param0, boolean param1, int param2, int param3, byte param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 <= param2) {
          return;
        } else {
          if (param3 > param2 + 1) {
            if (5 + param2 < param3) {
              if (param5 != param6) {
                var7 = (param6 >> -1824567167) + ((param5 >> 1133010977) - -(1 & (param5 & param6)));
                var8 = param2;
                var9 = param6;
                var10 = param5;
                var11 = param2;
                L0: while (true) {
                  if (param3 <= var11) {
                    ai.a(param0, param1, param2, var8, param4, var9, param6);
                    ai.a(param0, param1, var8, param3, (byte) -60, param5, var10);
                    return;
                  } else {
                    L1: {
                      var12 = lg.field_d[var11];
                      if (!param1) {
                        stackOut_31_0 = dc.field_c[var12];
                        stackIn_32_0 = stackOut_31_0;
                        break L1;
                      } else {
                        stackOut_30_0 = kf.field_f[var12];
                        stackIn_32_0 = stackOut_30_0;
                        break L1;
                      }
                    }
                    var13 = stackIn_32_0;
                    if (var7 >= var13) {
                      if (var10 < var13) {
                        var10 = var13;
                        var11++;
                        continue L0;
                      } else {
                        var11++;
                        continue L0;
                      }
                    } else {
                      L2: {
                        lg.field_d[var11] = lg.field_d[var8];
                        if (var13 < var9) {
                          var9 = var13;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var8++;
                      lg.field_d[var8] = var12;
                      var11++;
                      continue L0;
                    }
                  }
                }
              } else {
                var7 = param3 - 1;
                L3: while (true) {
                  if (param2 >= var7) {
                    return;
                  } else {
                    var8 = param2;
                    L4: while (true) {
                      if (var7 > var8) {
                        var9 = lg.field_d[var8];
                        var10 = lg.field_d[var8 + 1];
                        if (aq.a(var10, true, var9, param1)) {
                          lg.field_d[var8] = var10;
                          lg.field_d[var8 - -1] = var9;
                          var8++;
                          continue L4;
                        } else {
                          var8++;
                          continue L4;
                        }
                      } else {
                        var7--;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              L5: {
                var7 = param3 - 1;
                if (param2 >= var7) {
                  break L5;
                } else {
                  L6: {
                    var8 = param2;
                    if (var7 <= var8) {
                      break L6;
                    } else {
                      L7: {
                        var9 = lg.field_d[var8];
                        var10 = lg.field_d[var8 + 1];
                        if (aq.a(var10, true, var9, param1)) {
                          lg.field_d[var8] = var10;
                          lg.field_d[var8 - -1] = var9;
                          break L7;
                        } else {
                          var8++;
                          break L7;
                        }
                      }
                      var8++;
                      var8++;
                      var8++;
                      break L6;
                    }
                  }
                  var7--;
                  break L5;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != 1) {
            ai.a((byte) 116);
        }
    }

    final static void a(boolean param0) {
        double var1 = 0.0;
        int var3 = 0;
        var1 = 3.141592653589793 * (double)(cl.field_n % 512) / 256.0;
        var3 = 16 * (vg.field_t.field_z / 2 - 9);
        em.field_c[0] = (int)((double)var3 * Math.sin(var1));
        ul.field_Db[0] = (int)(Math.cos(var1) * (double)var3);
        em.field_c[1] = -em.field_c[0];
        ul.field_Db[1] = -ul.field_Db[0];
        var1 = var1 + 2.0943951023931953;
        em.field_c[2] = (int)(Math.sin(var1) * (double)var3);
        if (!param0) {
          return;
        } else {
          ul.field_Db[2] = (int)((double)var3 * Math.cos(var1));
          var1 = var1 + 2.0943951023931953;
          em.field_c[3] = (int)(Math.sin(var1) * (double)var3);
          ul.field_Db[3] = (int)(Math.cos(var1) * (double)var3);
          return;
        }
    }

    final static void a(boolean param0, int param1, String param2, String param3) {
        if (param1 != -1) {
          ai.a((byte) -80);
          oj.field_Ib = param3;
          qh.field_B = param2;
          fk.a(rg.field_c, param1 ^ -80, param0);
          return;
        } else {
          oj.field_Ib = param3;
          qh.field_B = param2;
          fk.a(rg.field_c, param1 ^ -80, param0);
          return;
        }
    }

    final static void a(int param0) {
        if (hp.field_m != null) {
          if (null != hp.field_m.field_e) {
            hp.field_m.field_e.field_bb = false;
            hp.field_l = null;
            hp.field_m = null;
            if (param0 != 3) {
              field_b = null;
              return;
            } else {
              return;
            }
          } else {
            hp.field_l = null;
            hp.field_m = null;
            if (param0 != 3) {
              field_b = null;
              return;
            } else {
              return;
            }
          }
        } else {
          hp.field_l = null;
          hp.field_m = null;
          if (param0 != 3) {
            field_b = null;
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
