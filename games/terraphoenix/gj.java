/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static int field_a;

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            var4_int = -1;
            var5 = param1;
            L1: while (true) {
              if (var5 >= param0) {
                L2: {
                  if (param2 == 255) {
                    break L2;
                  } else {
                    field_a = -58;
                    break L2;
                  }
                }
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = dm.field_b[(param3[var5] ^ var4_int) & 255] ^ var4_int >>> -808185496;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("gj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(boolean param0, int param1, int param2, nb param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              ab.field_g[0] = j.field_H.nextInt();
              ab.field_g[param2] = j.field_H.nextInt();
              ab.field_g[3] = (int)kd.field_c;
              nc.field_c.field_k = 0;
              ab.field_g[2] = (int)(kd.field_c >> -1776611488);
              nc.field_c.e(ab.field_g[0], param2 ^ 8958);
              nc.field_c.e(ab.field_g[1], 8959);
              nc.field_c.e(ab.field_g[2], 8959);
              nc.field_c.e(ab.field_g[3], 8959);
              eh.a(9371, nc.field_c);
              nc.field_c.h(-1564407352, param1);
              param3.a((byte) -2, nc.field_c);
              di.field_l.field_k = 0;
              if (!param0) {
                di.field_l.i(16, 18);
                break L1;
              } else {
                di.field_l.i(18, param2 ^ 16);
                break L1;
              }
            }
            L2: {
              di.field_l.field_k = di.field_l.field_k + 2;
              var5_int = di.field_l.field_k;
              di.field_l.e(nd.field_i, 8959);
              di.field_l.a(pc.field_a, 21);
              var6 = 0;
              if (jm.field_c) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (hf.field_x) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param4) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (og.field_e != null) {
                var6 = var6 | 16;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              di.field_l.i(var6, -112);
              var7 = kf.a(-95, dg.a(false));
              if (var7 != null) {
                break L6;
              } else {
                var7 = "";
                break L6;
              }
            }
            L7: {
              di.field_l.a(var7, 2295);
              if (og.field_e != null) {
                di.field_l.b(og.field_e, -108);
                break L7;
              } else {
                break L7;
              }
            }
            ea.a(ga.field_o, nc.field_c, 0, dj.field_c, di.field_l);
            di.field_l.g(-var5_int + di.field_l.field_k, -20125);
            bc.a(-1, param2 + -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("gj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ')');
        }
    }

    final static boolean a(e param0, int param1, byte param2, int param3) {
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param2 >= 57) {
                break L1;
              } else {
                field_a = -15;
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (rd.field_t <= var4_int) {
                stackIn_19_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  if (param1 < p.field_a[var4_int].field_f) {
                    break L3;
                  } else {
                    if (p.field_a[var4_int].field_f + 32 < param1) {
                      break L3;
                    } else {
                      if (param3 < p.field_a[var4_int].field_e) {
                        break L3;
                      } else {
                        if (p.field_a[var4_int].field_e - -32 < param3) {
                          break L3;
                        } else {
                          if (null == p.field_a[var4_int].field_d) {
                            break L3;
                          } else {
                            L4: {
                              L5: {
                                if (p.field_a[var4_int].field_d.field_k) {
                                  break L5;
                                } else {
                                  if (p.field_a[var4_int].field_d.field_C != 0) {
                                    sj.field_b = (p.field_a[var4_int].field_d.field_i - p.field_a[var4_int].field_d.field_gb) * 32;
                                    lg.field_c = (p.field_a[var4_int].field_d.field_i + p.field_a[var4_int].field_d.field_gb) * 16;
                                    eg.field_p = p.field_a[var4_int].field_d.field_R;
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              sj.field_b = (-p.field_a[var4_int].field_d.field_H + p.field_a[var4_int].field_d.field_F) * 32;
                              lg.field_c = 16 * (p.field_a[var4_int].field_d.field_H + p.field_a[var4_int].field_d.field_F);
                              eg.field_p = p.field_a[var4_int].field_d.field_E;
                              break L4;
                            }
                            qd.a((byte) 69, 33);
                            stackIn_16_0 = 1;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("gj.C(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    final static void a(bm param0, bm param1, int param2, int param3, pk param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, bm param14, int param15, int param16, pk param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            pe.a(param3, param4, 48, param17);
            aj.a(param7, -19605, param5, param15, param12);
            tb.a(param8, param2 ^ 21361, param19);
            uh.a(param0, param1, param13, param9, -128, param11);
            ph.a(param10, param14, param16, -1);
            if (param2 == 0) {
              kb.a(param6, param20, param18, (byte) -83);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("gj.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param15).append(',').append(param16).append(',');

            if (param17 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
