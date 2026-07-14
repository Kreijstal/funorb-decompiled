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
          var8 = param2 - param0;
          var9 = param3 - param1;
          var10 = (int)Math.sqrt((double)(var8 * var8 + var9 * var9));
          var11 = (int)(65536.0 / Math.sqrt((double)(var8 * var8 + var9 * var9)));
          var8 = var8 * var11;
          var9 = var9 * var11;
          var12 = param0;
          var13 = param1;
          var14 = param2;
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
          var12 = var12 - param4;
          var13 = var13 - param4;
          var14 = var14 + param4;
          var15 = var15 + param4;
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
        bf.field_h = 256 / param4;
        bh.field_j = param6 * 128 / param4;
        vh.field_I = (var13 - param1) * var8;
        nc.field_e = (var13 - param1) * var9;
        cg.field_h = (var12 - param0) * var8;
        l.field_u = (var12 - param0) * var9;
        ak.field_u = param7;
        uc.a(param0, param1, param4, param5, 0, 0, var10, ge.field_i, var13 * ge.field_h + var12, param6, var8, var9, var13 - var15, var12 - var14, ge.field_h - (var14 - var12));
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != -2355) {
            field_f = null;
        }
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
                  if (param1 >= -param2) {
                    if (param1 <= param2) {
                      param0 = ti.field_a + nc.field_e >> 16;
                      if (param0 >= -param2) {
                        if (param0 <= param6 + param2) {
                          L3: {
                            if (param0 >= param2) {
                              if (param0 <= param6 - param2) {
                                stackOut_15_0 = param9;
                                stackIn_16_0 = stackOut_15_0;
                                break L3;
                              } else {
                                stackOut_14_0 = (param6 + param2 - param0) * bh.field_j >> 8;
                                stackIn_16_0 = stackOut_14_0;
                                break L3;
                              }
                            } else {
                              stackOut_12_0 = (param0 + param2) * bh.field_j >> 8;
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

    final static void a(java.applet.Applet param0, int param1) {
        if (param1 != 0) {
            field_a = null;
        }
        String var2 = param0.getParameter("username");
        if (var2 != null) {
            CharSequence var3 = (CharSequence) (Object) var2;
            // ifne L51
        }
        return;
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            uc.a(64, -115, 108, 7, 0, -16, -44, (int[]) null);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (65 > param0) {
                break L3;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (97 > param0) {
                break L4;
              } else {
                if (param0 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static void a(int param0) {
        if (param0 <= 5) {
            boolean discarded$0 = uc.a('', false);
        }
        rh.field_B = false;
        int discarded$1 = MonkeyPuzzle2.field_D.a((byte) 114);
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
          if (-257 >= (var2 ^ -1)) {
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= -9) {
                field_c[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (1L != (var0 & 1L)) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = -3932672073523589310L ^ var0 >>> 2028372225;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
