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
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ro stackIn_4_0 = null;
        ro stackIn_7_0 = null;
        ro stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        ro stackIn_24_0 = null;
        ro stackIn_36_0 = null;
        ro stackIn_40_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        ro stackOut_3_0 = null;
        ro stackOut_39_0 = null;
        ro stackOut_35_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        ro stackOut_23_0 = null;
        ro stackOut_10_0 = null;
        ro stackOut_6_0 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackOut_3_0 = fg.field_a;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int <= 64) {
              if (param1.charAt(0) != 34) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (var4 >= var2_int) {
                    return null;
                  } else {
                    L1: {
                      var5 = param1.charAt(var4);
                      if (var5 != 46) {
                        if (hr.field_c.indexOf(var5) != -1) {
                          var3 = 0;
                          break L1;
                        } else {
                          stackOut_39_0 = as.field_t;
                          stackIn_40_0 = stackOut_39_0;
                          return stackIn_40_0;
                        }
                      } else {
                        L2: {
                          if (0 == var4) {
                            break L2;
                          } else {
                            if (var4 == -1 + var2_int) {
                              break L2;
                            } else {
                              if (var3 != 0) {
                                break L2;
                              } else {
                                var3 = 1;
                                break L1;
                              }
                            }
                          }
                        }
                        stackOut_35_0 = as.field_t;
                        stackIn_36_0 = stackOut_35_0;
                        return stackIn_36_0;
                      }
                    }
                    var4++;
                    continue L0;
                  }
                }
              } else {
                if (param1.charAt(-1 + var2_int) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (-1 + var2_int > var4) {
                      L4: {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_19_0 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              break L5;
                            } else {
                              stackOut_18_0 = 1;
                              stackIn_20_0 = stackOut_18_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_20_0;
                          break L4;
                        } else {
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                stackOut_23_0 = as.field_t;
                                stackIn_24_0 = stackOut_23_0;
                                return stackIn_24_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_10_0 = as.field_t;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_6_0 = cm.field_e;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var2;
            stackOut_46_1 = new StringBuilder().append("uc.B(").append(-77).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L7;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ')');
        }
    }

    final static hh a(byte[] param0, int param1) {
        hh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        hh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new hh(param0, cf.field_H, sj.field_a, mc.field_s, cm.field_g, hd.field_q);
              pd.a(param1 ^ param1);
              stackOut_3_0 = (hh) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("uc.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
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
        try {
            if (param8 != -87) {
                uc.e((byte) -47);
            }
            ub.a(param2, param11, nr.field_h, param1, param3, 2, param11, param4, em.field_j, 0, param1, new v(param10), param2, ih.field_b, wo.field_a, param13, param0, dn.field_l, qi.field_j, new v(param7));
            kb.a(param6, true, param12, param14, param5);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "uc.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + 2 + ',' + (param10 != null ? "{...}" : "null") + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
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
