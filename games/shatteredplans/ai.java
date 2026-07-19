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
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 <= param2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 > param2 + 1) {
                L1: {
                  if (5 + param2 >= param3) {
                    break L1;
                  } else {
                    if (param5 == param6) {
                      break L1;
                    } else {
                      var7_int = (param6 >> -1824567167) + ((param5 >> 1133010977) - -(1 & (param5 & param6)));
                      var8 = param2;
                      var9 = param6;
                      var10 = param5;
                      var11 = param2;
                      L2: while (true) {
                        if (param3 <= var11) {
                          ai.a(param0, param1, param2, var8, param4, var9, param6);
                          ai.a(param0, param1, var8, param3, (byte) -60, param5, var10);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = lg.field_d[var11];
                            if (!param1) {
                              stackOut_24_0 = dc.field_c[var12];
                              stackIn_25_0 = stackOut_24_0;
                              break L3;
                            } else {
                              stackOut_23_0 = kf.field_f[var12];
                              stackIn_25_0 = stackOut_23_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_25_0;
                            if (var7_int >= var13) {
                              if (var10 < var13) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              L5: {
                                lg.field_d[var11] = lg.field_d[var8];
                                if (var13 < var9) {
                                  var9 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              incrementValue$1 = var8;
                              var8++;
                              lg.field_d[incrementValue$1] = var12;
                              break L4;
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = param3 - 1;
                L6: while (true) {
                  if (param2 >= var7_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param2;
                    L7: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = lg.field_d[var8];
                          var10 = lg.field_d[var8 + 1];
                          if (aq.a(var10, true, var9, param1)) {
                            lg.field_d[var8] = var10;
                            lg.field_d[var8 - -1] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var7), "ai.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
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
        try {
            if (param1 != -1) {
                ai.a((byte) -80);
            }
            oj.field_Ib = param3;
            qh.field_B = param2;
            fk.a(rg.field_c, param1 ^ -80, param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ai.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        if (hp.field_m != null) {
          if (null != hp.field_m.field_e) {
            hp.field_m.field_e.field_bb = false;
            hp.field_l = null;
            hp.field_m = null;
            if (param0 != 3) {
              field_b = (int[]) null;
              return;
            } else {
              return;
            }
          } else {
            hp.field_l = null;
            hp.field_m = null;
            if (param0 != 3) {
              field_b = (int[]) null;
              return;
            } else {
              return;
            }
          }
        } else {
          hp.field_l = null;
          hp.field_m = null;
          if (param0 != 3) {
            field_b = (int[]) null;
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_d = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
