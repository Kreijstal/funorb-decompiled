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
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 <= param2) {
              return;
            } else {
              if (param3 > param2 + 1) {
                L1: {
                  if (5 + param2 >= param3) {
                    break L1;
                  } else {
                    if (param5 == param6) {
                      break L1;
                    } else {
                      L2: {
                        var7_int = (param6 >> 1) + ((param5 >> 1) - -(1 & (param5 & param6)));
                        var8 = param2;
                        var9 = param6;
                        var10 = param5;
                        var11 = param2;
                        if (param3 <= var11) {
                          break L2;
                        } else {
                          L3: {
                            var12 = lg.field_d[var11];
                            if (!param1) {
                              stackOut_25_0 = dc.field_c[var12];
                              stackIn_26_0 = stackOut_25_0;
                              break L3;
                            } else {
                              stackOut_24_0 = kf.field_f[var12];
                              stackIn_26_0 = stackOut_24_0;
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              var13 = stackIn_26_0;
                              if (var7_int >= var13) {
                                if (var10 < var13) {
                                  var10 = var13;
                                  break L4;
                                } else {
                                  break L5;
                                }
                              } else {
                                L6: {
                                  lg.field_d[var11] = lg.field_d[var8];
                                  if (var13 < var9) {
                                    var9 = var13;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                int incrementValue$1 = var8;
                                var8++;
                                lg.field_d[incrementValue$1] = var12;
                                var11++;
                                break L5;
                              }
                            }
                            var11++;
                            break L4;
                          }
                          var11++;
                          var11++;
                          break L2;
                        }
                      }
                      ai.a(param0, param1, param2, var8, param4, var9, param6);
                      ai.a(param0, param1, var8, param3, (byte) -60, param5, var10);
                      break L0;
                    }
                  }
                }
                var7_int = param3 - 1;
                L7: while (true) {
                  if (param2 >= var7_int) {
                    return;
                  } else {
                    var8 = param2;
                    L8: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L7;
                      } else {
                        L9: {
                          var9 = lg.field_d[var8];
                          var10 = lg.field_d[var8 + 1];
                          if (aq.a(var10, true, var9, param1)) {
                            lg.field_d[var8] = var10;
                            lg.field_d[var8 - -1] = var9;
                            var8++;
                            break L9;
                          } else {
                            var8++;
                            break L9;
                          }
                        }
                        var8++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var7, "ai.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
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
        double var1 = 3.141592653589793 * (double)(cl.field_n % 512) / 256.0;
        int var3 = 16 * (vg.field_t.field_z / 2 - 9);
        em.field_c[0] = (int)((double)var3 * Math.sin(var1));
        ul.field_Db[0] = (int)(Math.cos(var1) * (double)var3);
        em.field_c[1] = -em.field_c[0];
        ul.field_Db[1] = -ul.field_Db[0];
        var1 = var1 + 2.0943951023931953;
        em.field_c[2] = (int)(Math.sin(var1) * (double)var3);
        ul.field_Db[2] = (int)((double)var3 * Math.cos(var1));
        var1 = var1 + 2.0943951023931953;
        em.field_c[3] = (int)(Math.sin(var1) * (double)var3);
        ul.field_Db[3] = (int)(Math.cos(var1) * (double)var3);
    }

    final static void a(boolean param0, int param1, String param2, String param3) {
        try {
            if (param1 != -1) {
                ai.a((byte) -80);
            }
            oj.field_Ib = param3;
            qh.field_B = param2;
            fk.a(rg.field_c, param1 ^ -80, param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ai.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
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
