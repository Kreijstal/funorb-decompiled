/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends ng {
    static String field_T;
    private int field_S;
    static boolean field_P;
    static eg field_R;
    static int[] field_Q;
    private wd field_O;

    public static void c() {
        field_T = null;
        field_Q = null;
        field_R = null;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        var5 = vb.field_a[param3][param0];
        var6 = 1 + var5;
        var7 = var5 - 1;
        var8 = gl.field_l[param3][param0][1][0];
        var9 = gl.field_l[param3][param0][1][1];
        var10 = var9 + -var8;
        if (var10 > 0) {
          L0: {
            var11 = ic.field_E[vb.field_a[param3][param0]][param2];
            if ((var11 & 32) <= 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var12 = stackIn_5_0;
            var13 = 0;
            if (var7 >= 0) {
              break L1;
            } else {
              var7 += 64;
              break L1;
            }
          }
          L2: {
            if (64 > var6) {
              break L2;
            } else {
              var6 -= 64;
              break L2;
            }
          }
          L3: {
            var14 = 0;
            var11 = ic.field_E[var6][param2];
            if ((var11 & 32) <= 0) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L3;
            } else {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L3;
            }
          }
          L4: {
            var13 = stackIn_12_0;
            var11 = ic.field_E[var7][param2];
            if ((var11 & 32) <= 0) {
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L4;
            } else {
              stackOut_13_0 = 1;
              stackIn_15_0 = stackOut_13_0;
              break L4;
            }
          }
          L5: {
            var14 = stackIn_15_0;
            if (null == kj.field_C) {
              break L5;
            } else {
              if (null == kj.field_C[0]) {
                break L5;
              } else {
                L6: {
                  var15 = kj.field_C[0].field_v;
                  var16 = param1 + (64 - var15);
                  var17 = var16;
                  var18 = param1 + param4;
                  var19 = 0;
                  if (var14 == 0) {
                    if (var12 == 0) {
                      if (var13 != 0) {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L6;
                      } else {
                        stackOut_24_0 = 0;
                        stackIn_27_0 = stackOut_24_0;
                        break L6;
                      }
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_27_0 = stackOut_22_0;
                      break L6;
                    }
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_27_0 = stackOut_20_0;
                    break L6;
                  }
                }
                var19 = stackIn_27_0;
                if (var19 == 0) {
                  return;
                } else {
                  ll.a(var17, 0, var8, var5, var14 != 0, var13 != 0, var12 != 0, var16, -1, var18, true, var9);
                  return;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(ee param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param1 == 0) {
                break L1;
              } else {
                ((tk) this).a(-59, 121, false, 81);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("tk.RA(");
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
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a() {
        RuntimeException var1 = null;
        byte[] var1_array = null;
        ge[] var2 = null;
        rh var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = bh.field_q.a(-2, "font", "");
              var1_array = var7;
              var2 = mh.a(122, ic.field_C, "font", "");
              int discarded$3 = 256;
              fc.field_p = id.a(var7, var2);
              int discarded$4 = 8015912;
              int discarded$5 = 16301089;
              var3 = vh.a(var2, 2, 33, var7);
              tf.field_x = (eg) (Object) var3;
              var11 = var3.field_O[0];
              var10 = var11;
              var9 = var10;
              var8 = var9;
              var4 = var8;
              if (var3.field_O.length >= 1) {
                break L1;
              } else {
                var3.field_O = new int[1][];
                break L1;
              }
            }
            var3.field_O[0] = var11;
            var5 = 1;
            L2: while (true) {
              if (var5 >= 2) {
                var3.field_O[1][2] = 8015912;
                var3.field_O[1][1] = 16301089;
                var3.field_x = 17;
                var3.field_O[0][1] = 15057307;
                var3.field_O[0][2] = 6488064;
                var3.field_K = 5;
                break L0;
              } else {
                var3.field_O[var5] = new int[var11.length];
                he.a(var4, 0, var3.field_O[var5], 0, var11.length);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "tk.UA(" + 102 + ')');
        }
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        if (param2 > -97) {
            return;
        }
        try {
            ((tk) this).field_S = ((tk) this).field_S + 1;
            super.a(param0, param1, (byte) -112, param3);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "tk.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String b(boolean param0) {
        if (param0) {
            tk.b(-20, -30, -128, 99, -33);
        }
        if (!((tk) this).field_w) {
            return null;
        }
        return ((tk) this).field_O.a((byte) -10);
    }

    final static String a(String param0, lj param1, String param2) {
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!param1.b(-7957)) {
              stackOut_2_0 = (String) param0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              stackOut_4_0 = param2 + " - " + param1.c(59) + "%";
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("tk.SA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + 256 + ')');
        }
        return stackIn_5_0;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        rj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ka var12 = null;
        ka var13 = null;
        ka var14 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          L0: {
            if (!param2) {
              break L0;
            } else {
              field_Q = null;
              break L0;
            }
          }
          L1: {
            L2: {
              var5 = ((tk) this).field_m + param1 + (((tk) this).field_p >> 1);
              var6 = (((tk) this).field_l >> 1) + ((tk) this).field_i + param0;
              var8 = ((tk) this).field_O.b(-53);
              if (bl.field_S == var8) {
                break L2;
              } else {
                if (jh.field_c != var8) {
                  if (lk.field_c == var8) {
                    var14 = ub.field_f[2];
                    var14.b(var5 + -(var14.field_u >> 1), var6 - (var14.field_x >> 1), 256);
                    break L1;
                  } else {
                    if (var8 == tf.field_w) {
                      var13 = ub.field_f[1];
                      var13.b(-(var13.field_u >> 1) + var5, var6 + -(var13.field_x >> 1), 256);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                var12 = ub.field_f[0];
                var9 = var12.field_q << 1;
                var10 = var12.field_v << 1;
                if (lh.field_v == null) {
                  break L4;
                } else {
                  if (var9 > lh.field_v.field_u) {
                    break L4;
                  } else {
                    if (var10 <= lh.field_v.field_x) {
                      ad.a(-50, lh.field_v);
                      qg.b();
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              lh.field_v = new ka(var9, var10);
              ad.a(120, lh.field_v);
              break L3;
            }
            var12.b(112, 144, var12.field_q << 4, var12.field_v << 4, -((tk) this).field_S << 10, 4096);
            int discarded$1 = -9;
            ie.b();
            lh.field_v.b(var5 + -var12.field_q, var6 - var12.field_v, 256);
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    tk(wd param0) {
        try {
            ((tk) this).field_O = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "tk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "to return to the normal view.";
        field_Q = new int[]{6, 6, 7, 7, 7, 7};
    }
}
