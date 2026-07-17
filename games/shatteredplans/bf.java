/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static String field_b;
    static int[] field_c;
    static String field_d;
    static String[] field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int var17 = 0;
        var17 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param14 < param8) {
          if (param8 >= param10) {
            if (param14 >= param10) {
              lr.a(param6, param1, -31232, param5, param10, gf.field_h, param13, param4, param8, param2, param7, param3, param0, param9, param12, param14, param11);
              return;
            } else {
              lr.a(param5, param7, -31232, param6, param14, gf.field_h, param13, param2, param8, param4, param1, param11, param0, param9, param12, param10, param3);
              return;
            }
          } else {
            lr.a(param12, param9, -31232, param6, param14, gf.field_h, param2, param13, param10, param4, param1, param0, param11, param7, param5, param8, param3);
            return;
          }
        } else {
          if (param10 <= param14) {
            if (param8 >= param10) {
              lr.a(param12, param9, -31232, param5, param10, gf.field_h, param4, param13, param14, param2, param7, param0, param3, param1, param6, param8, param11);
              return;
            } else {
              lr.a(param5, param7, -31232, param12, param8, gf.field_h, param4, param2, param14, param13, param9, param11, param3, param1, param6, param10, param0);
              return;
            }
          } else {
            lr.a(param6, param1, -31232, param12, param8, gf.field_h, param2, param4, param10, param13, param9, param3, param11, param7, param5, param14, param0);
            return;
          }
        }
    }

    final static void a(byte param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            oe.field_f = false;
            if (param0 <= -123) {
              L1: {
                mg.field_C = false;
                if (ji.field_G == null) {
                  break L1;
                } else {
                  if (!ji.field_G.field_E) {
                    break L1;
                  } else {
                    L2: {
                      if (8 != param1) {
                        break L2;
                      } else {
                        L3: {
                          param1 = 2;
                          if (!el.field_b) {
                            param2 = aa.field_N;
                            break L3;
                          } else {
                            param2 = dp.field_p;
                            break L3;
                          }
                        }
                        no.field_e.a(16311, qh.field_B);
                        break L2;
                      }
                    }
                    L4: {
                      var3_int = 1;
                      if (10 == param1) {
                        var3_int = 0;
                        int discarded$2 = -26049;
                        mm.f();
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var3_int == 0) {
                        break L5;
                      } else {
                        L6: {
                          if (oe.field_f) {
                            param2 = re.a(in.field_l, 4371, new String[1]);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (!jh.field_D) {
                            break L7;
                          } else {
                            param2 = eo.field_ib;
                            break L7;
                          }
                        }
                        ji.field_G.a(param2, param1, -86);
                        break L5;
                      }
                    }
                    if (param1 == 256) {
                      break L1;
                    } else {
                      if (param1 == 10) {
                        break L1;
                      } else {
                        if (el.field_b) {
                          break L1;
                        } else {
                          no.field_e.l(8);
                          return;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("bf.C(").append(param0).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
            on.field_b = true;
            io.field_c.field_z = param1;
            var2_int = so.field_q.field_g;
            var3 = so.field_q.field_d;
            var4 = io.field_c.field_nb.c(param1, 272, io.field_c.field_Y);
            var5 = -(var4 / 2) + -110 + var3 / 2 - -7;
            so.field_v.a(320, -(2 * var5) + (-120 + var3), (byte) 102, var5, (var2_int - 320) / 2);
            so.field_v.field_F = cs.a(16, 3, so.field_v.field_mb, 11579568, 8421504, 2105376);
            io.field_c.a(-24 + so.field_v.field_K - 24, -24 + so.field_v.field_mb - 20, (byte) 67, 16, 24);
            li.field_d.a(80, 24, (byte) 115, so.field_v.field_mb - 44, 120);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "bf.B(" + 113 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[4];
        field_a = new String[]{"All scores", "My scores", "Best each"};
        field_d = "To Customer Support";
        field_b = "On";
    }
}
