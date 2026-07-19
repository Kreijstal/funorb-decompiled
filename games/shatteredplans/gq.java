/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    static String field_b;
    static String field_f;
    static int field_d;
    int field_c;
    int field_e;
    static String field_a;
    static String field_g;

    final static int c(int param0) {
        if (param0 >= -33) {
            return -8;
        }
        return -ld.field_j + ah.field_R;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var3_int = param0.length();
              if (var3_int < 1) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (12 >= var3_int) {
                  L1: {
                    var4 = ji.a(param0, true);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if ((var4.length() ^ -1) > -2) {
                        break L1;
                      } else {
                        L2: {
                          if (tc.a(var4.charAt(0), param2 + 6)) {
                            break L2;
                          } else {
                            if (tc.a(var4.charAt(var4.length() + -1), 2)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param0.length()) {
                                  if ((var5 ^ -1) >= -1) {
                                    L4: {
                                      if (param2 == -4) {
                                        break L4;
                                      } else {
                                        gq.e(46);
                                        break L4;
                                      }
                                    }
                                    stackOut_35_0 = 1;
                                    stackIn_36_0 = stackOut_35_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackOut_31_0 = 0;
                                    stackIn_32_0 = stackOut_31_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param0.charAt(var6);
                                    if (tc.a((char) var7, 2)) {
                                      var5++;
                                      break L5;
                                    } else {
                                      var5 = 0;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if ((var5 ^ -1) > -3) {
                                      break L6;
                                    } else {
                                      if (!param1) {
                                        stackOut_27_0 = 0;
                                        stackIn_28_0 = stackOut_27_0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var3);
            stackOut_37_1 = new StringBuilder().append("gq.C(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L7;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    return stackIn_36_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final static void b(int param0) {
        nd[] var6 = null;
        int var2 = 0;
        nd var3 = null;
        nd var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            if (param0 <= 30) {
                gq.a(-49);
            }
            var6 = fe.field_C;
            nd[] var1 = var6;
            for (var2 = 0; var6.length > var2; var2++) {
                var3 = var6[var2];
                var3.field_h = 0;
                var4 = var3;
                var4.field_a = 0;
            }
            rp.field_K.a(0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "gq.E(" + param0 + ')');
        }
    }

    final static ln a(ln[] param0, int param1, ob param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ln stackIn_2_0 = null;
        ln stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ln stackOut_5_0 = null;
        ln stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var3_int = param2.j(-74);
            if (param1 == -2284) {
              if (param0.length > var3_int) {
                stackOut_5_0 = param0[var3_int];
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (ln) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("gq.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          L2: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        sr var4_ref_sr = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        sr var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            nc.field_p = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = vc.field_d.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = nc.field_p[9] >> -1723159288;
                  var4 = nc.field_p[10] >> -703280824;
                  var5 = nc.field_p[11] >> 1672033256;
                  var6 = js.field_j << 1623002628;
                  var7 = 0;
                  var8 = je.a(var6, (byte) -104) >> -1583502968;
                  var9 = oh.b(var6, -123) >> 1178877768;
                  if (-1 == pd.field_k) {
                    break L2;
                  } else {
                    if (0 == (bb.field_b ^ -1)) {
                      break L2;
                    } else {
                      var7 = pd.field_k - 320;
                      var9 = -128;
                      var8 = 240 - bb.field_b;
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var7 * var7 + var8 * var8)));
                var7 = (int)((double)var7 * var10);
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var12 = -var3 + var7;
                var13 = var8 - var4;
                var14 = var9 - var5;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var13 * var13 + var12 * var12));
                var12 = (int)((double)var12 * var10);
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var15 = 0;
                L3: while (true) {
                  if (vc.field_d.length <= var15) {
                    var16 = -47 / ((47 - param0) / 46);
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (var17_int >= vc.field_d.length) {
                        var21[var16] = -2147483648;
                        var17 = vc.field_d[var16];
                        ec.a(-1, var16);
                        var18 = 0;
                        L5: while (true) {
                          if ((var18 ^ -1) <= -4) {
                            pe.a(true, nc.field_p, false, 80, ib.field_a, false, var17);
                            er.a(var7, var13, false, var8, var14, var17, var12, var9);
                            var15++;
                            continue L3;
                          } else {
                            ib.field_a[var18] = ib.field_a[var18] + fa.field_Z[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var21[var17_int] > var21[var16]) {
                            var16 = var17_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_sr = vc.field_d[var3];
                var4_ref_sr.a(true);
                ec.a(-1, var3);
                var5 = var4_ref_sr.field_O + var4_ref_sr.field_k >> 887263169;
                var6 = var4_ref_sr.field_j - -var4_ref_sr.field_t >> -1987429983;
                var7 = var4_ref_sr.field_r + var4_ref_sr.field_E >> -1047228863;
                var8 = nc.field_p[9] >> -1858453854;
                var9 = nc.field_p[10] >> 826031970;
                var10_int = nc.field_p[11] >> 1666289442;
                var11 = ib.field_a[3] * var8 + (ib.field_a[4] * var9 + ib.field_a[5] * var10_int) >> -383412082;
                var12 = var8 * ib.field_a[6] + (var9 * ib.field_a[7] - -(var10_int * ib.field_a[8])) >> -1127755026;
                var13 = ib.field_a[11] * var10_int + (var9 * ib.field_a[10] + ib.field_a[9] * var8) >> -996352114;
                var2[var3] = var13 * var7 + var11 * var5 - -(var6 * var12) >> -203227568;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "gq.F(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static bi d(int param0) {
        int var4_int = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var1 = cm.field_g[0] * mc.field_s[0];
        byte[] var2 = hd.field_q[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = eo.field_fb[we.a((int) var2[var4_int], 255)];
        }
        bi var4 = new bi(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[param0], var3);
        pd.a(0);
        return var4;
    }

    gq(int param0, int param1, int param2, int param3) {
        this.field_c = param0;
        this.field_e = param3;
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_f = null;
        field_a = null;
        int var1 = 69 / ((67 - param0) / 43);
    }

    static {
        field_b = "Continue";
        field_f = "Connection timed out. Please try using a different server.";
        field_a = "Waiting for <%0> to start the game...";
        field_g = "Fleets destroyed";
    }
}
