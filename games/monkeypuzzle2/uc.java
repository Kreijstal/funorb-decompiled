/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static na field_e;
    static int field_b;
    static gk field_a;
    static String[] field_f;
    private static long[] field_c;
    static String field_d;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        L0: {
          var8 = 480;
          var9 = param3 - param1;
          var10 = (int)Math.sqrt((double)(var8 * var8 + var9 * var9));
          var11 = (int)(65536.0 / Math.sqrt((double)(var8 * var8 + var9 * var9)));
          var8 = var8 * var11;
          var9 = var9 * var11;
          var12 = 78;
          var13 = param1;
          var14 = 558;
          var15 = param3;
          if (var12 <= var14) {
            break L0;
          } else {
            var16 = var12;
            var12 = var14;
            var14 = var16;
            break L0;
          }
        }
        L1: {
          if (var13 <= var15) {
            break L1;
          } else {
            var16 = var13;
            var13 = var15;
            var15 = var16;
            break L1;
          }
        }
        L2: {
          var12 = var12 - 3;
          var13 = var13 - 3;
          var14 = var14 + 3;
          var15 = var15 + 3;
          if (var12 >= ge.field_a) {
            break L2;
          } else {
            var12 = ge.field_a;
            break L2;
          }
        }
        L3: {
          if (var13 >= ge.field_f) {
            break L3;
          } else {
            var13 = ge.field_f;
            break L3;
          }
        }
        L4: {
          if (var14 <= ge.field_j) {
            break L4;
          } else {
            var14 = ge.field_j;
            break L4;
          }
        }
        L5: {
          if (var15 <= ge.field_k) {
            break L5;
          } else {
            var15 = ge.field_k;
            break L5;
          }
        }
        bf.field_h = 85;
        bh.field_j = param6 * 128 / 3;
        vh.field_I = (var13 - param1) * var8;
        nc.field_e = (var13 - param1) * var9;
        cg.field_h = (var12 - 78) * var8;
        l.field_u = (var12 - 78) * var9;
        ak.field_u = param7;
        uc.a(78, param1, 3, param5, 0, 0, var10, ge.field_i, var13 * ge.field_h + var12, param6, var8, var9, var13 - var15, var12 - var14, ge.field_h - (var14 - var12));
    }

    public static void b() {
        field_e = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: while (true) {
          if (param12 >= 0) {
            return;
          } else {
            ti.field_a = cg.field_h;
            gi.field_c = l.field_u;
            var15 = param13;
            L1: while (true) {
              if (var15 >= 0) {
                param8 = param8 + param14;
                param12++;
                vh.field_I = vh.field_I + param10;
                nc.field_e = nc.field_e + param11;
                continue L0;
              } else {
                L2: {
                  param1 = gi.field_c - vh.field_I >> 16;
                  if (param1 >= -3) {
                    if (param1 <= 3) {
                      param0 = ti.field_a + nc.field_e >> 16;
                      if (param0 >= -3) {
                        if (param0 <= param6 + 3) {
                          L3: {
                            if (param0 >= 3) {
                              if (param0 <= param6 - 3) {
                                stackOut_15_0 = param9;
                                stackIn_16_0 = stackOut_15_0;
                                break L3;
                              } else {
                                stackOut_14_0 = (param6 + 3 - param0) * bh.field_j >> 8;
                                stackIn_16_0 = stackOut_14_0;
                                break L3;
                              }
                            } else {
                              stackOut_12_0 = (param0 + 3) * bh.field_j >> 8;
                              stackIn_16_0 = stackOut_12_0;
                              break L3;
                            }
                          }
                          L4: {
                            param4 = stackIn_16_0;
                            param5 = param1 * param4 * bf.field_h >> 8;
                            if (param5 < 0) {
                              stackOut_18_0 = ak.field_u[param4 + param5];
                              stackIn_19_0 = stackOut_18_0;
                              break L4;
                            } else {
                              stackOut_17_0 = ak.field_u[param4 - param5];
                              stackIn_19_0 = stackOut_17_0;
                              break L4;
                            }
                          }
                          param1 = stackIn_19_0;
                          var16 = (param1 & 16711935) * param3;
                          param1 = (var16 & -16711936) + (param1 * param3 - var16 & 16711680) >>> 8;
                          var16 = param7[param8];
                          var17 = param1 + var16;
                          param1 = (param1 & 16711935) + (var16 & 16711935);
                          var16 = (param1 & 16777472) + (var17 - param1 & 65536);
                          param7[param8] = var17 - var16 | var16 - (var16 >>> 8);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var15++;
                param8++;
                ti.field_a = ti.field_a + param10;
                gi.field_c = gi.field_c + param11;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (sd.a(37, var3) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("uc.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 0 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(char param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              if (65 > param0) {
                break L2;
              } else {
                if (param0 <= 90) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (97 > param0) {
                break L3;
              } else {
                if (param0 > 122) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    final static void a() {
        rh.field_B = false;
        int discarded$0 = MonkeyPuzzle2.field_D.a((byte) 114);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_b = 9;
        field_e = new na();
        field_a = new gk(256);
        field_c = new long[256];
        field_f = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_d = "Unfortunately your configuration doesn't support fullscreen mode.";
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_c[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (1L != (var0 & 1L)) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = -3932672073523589310L ^ var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
