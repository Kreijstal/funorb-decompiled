/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rb implements n {
    private long field_a;
    static String field_c;
    static je field_b;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var4 = -107 / ((param2 - 41) / 55);
            var3 = nf.a(true, param0);
            if ((param1.indexOf(param0) ^ -1) != 0) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1.indexOf(var3) ^ -1) == 0) {
                L1: {
                  L2: {
                    if (param1.startsWith(param0)) {
                      break L2;
                    } else {
                      if (param1.startsWith(var3)) {
                        break L2;
                      } else {
                        if (param1.endsWith(param0)) {
                          break L2;
                        } else {
                          if (!param1.endsWith(var3)) {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L1;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("rb.L(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    abstract gu c(int param0);

    final static boolean a(long param0, String param1, int param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        int stackIn_8_0 = 0;
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
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
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
            L1: {
              if (param2 == -17231) {
                break L1;
              } else {
                field_b = (je) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 == null) {
                  break L3;
                } else {
                  L4: {
                    if (param3 != 2) {
                      break L4;
                    } else {
                      if (!wq.a(param0, param1, (byte) -125)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("rb.I(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          L6: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final static ne a(int param0, byte param1, bv param2) {
        ne var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_2_0 = null;
        ne stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ne stackOut_3_0 = null;
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
            if (-1 != (param0 ^ -1)) {
              var3 = new ne();
              no.a(param2, var3, param0, -24721);
              var3.j(-78);
              var4 = -72 / ((-5 - param1) / 60);
              stackOut_3_0 = (ne) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("rb.G(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ne) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        pu var4_ref_pu = null;
        int var4 = 0;
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
        pu var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var19 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            mn.field_t = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = iq.field_a.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              L2: {
                if (var3 >= var1_int) {
                  var3 = mn.field_t[param0] >> -629540216;
                  break L2;
                } else {
                  var4_ref_pu = iq.field_a[var3];
                  var17 = var4_ref_pu;
                  var17 = var4_ref_pu;
                  var4_ref_pu.a(-3831);
                  cq.a((byte) -116, var3);
                  var5 = var4_ref_pu.field_L + var4_ref_pu.field_p >> 470108033;
                  var6 = var4_ref_pu.field_H + var4_ref_pu.field_P >> -401580991;
                  var7 = var4_ref_pu.field_D + var4_ref_pu.field_J >> -1252407999;
                  var8 = mn.field_t[9] >> -1855318878;
                  var9 = mn.field_t[10] >> -710206046;
                  var10_int = mn.field_t[11] >> -1792785598;
                  var11 = var8 * pd.field_a[3] + pd.field_a[4] * var9 - -(pd.field_a[5] * var10_int) >> -1764664338;
                  var12 = var10_int * pd.field_a[8] + (var8 * pd.field_a[6] + var9 * pd.field_a[7]) >> -2022129842;
                  var13 = pd.field_a[10] * var9 + pd.field_a[9] * var8 + pd.field_a[11] * var10_int >> -1708086482;
                  var2[var3] = var11 * var5 - -(var12 * var6) - -(var7 * var13) >> -893537680;
                  var3++;
                  if (var19 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                var4 = mn.field_t[10] >> 264936072;
                var5 = mn.field_t[11] >> -1314104728;
                var6 = ib.field_j << 1554443236;
                var7 = 0;
                var8 = ae.b(var6, 100) >> 1785809320;
                var9 = g.a(param0 + -10, var6) >> 534432968;
                if (sm.field_d == -1) {
                  break L3;
                } else {
                  if (ko.field_b != -1) {
                    var9 = -128;
                    var7 = sm.field_d - 320;
                    var8 = -ko.field_b + 240;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var8 * var8 + var7 * var7)));
              var9 = (int)((double)var9 * var10);
              var8 = (int)((double)var8 * var10);
              var7 = (int)((double)var7 * var10);
              var12 = var7 + -var3;
              var13 = var8 - var4;
              var14 = -var5 + var9;
              var10 = 256.0 / Math.sqrt((double)(var13 * var13 + var12 * var12 + var14 * var14));
              var12 = (int)((double)var12 * var10);
              var13 = (int)((double)var13 * var10);
              var14 = (int)((double)var14 * var10);
              var15 = 0;
              L4: while (true) {
                stackOut_12_0 = iq.field_a.length;
                stackOut_12_1 = var15;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                L5: while (true) {
                  if (stackIn_13_0 <= stackIn_13_1) {
                    break L0;
                  } else {
                    var16 = 0;
                    if (var19 == 0) {
                      var17_int = 1;
                      L6: while (true) {
                        if (var17_int >= iq.field_a.length) {
                          var21[var16] = -2147483648;
                          var17 = iq.field_a[var16];
                          cq.a((byte) -116, var16);
                          var18 = 0;
                          L7: while (true) {
                            L8: {
                              if (-4 >= (var18 ^ -1)) {
                                ou.a(var17, true, true, false, false, pd.field_a, mn.field_t);
                                fp.a(var13, var17, var9, var8, var12, var7, var14, (byte) 120);
                                var15++;
                                break L8;
                              } else {
                                pd.field_a[var18] = pd.field_a[var18] + sd.field_s[var15][var18];
                                var18++;
                                if (var19 != 0) {
                                  break L8;
                                } else {
                                  continue L7;
                                }
                              }
                            }
                            continue L4;
                          }
                        } else {
                          stackOut_18_0 = var21[var16];
                          stackOut_18_1 = var21[var17_int];
                          stackIn_13_0 = stackOut_18_0;
                          stackIn_13_1 = stackOut_18_1;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          if (var19 != 0) {
                            continue L5;
                          } else {
                            L9: {
                              if (stackIn_19_0 < stackIn_19_1) {
                                var16 = var17_int;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var17_int++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "rb.C(" + param0 + ')');
        }
    }

    public final void a(int param0) {
        if (param0 <= 123) {
            return;
        }
        this.field_a = vi.b(99);
    }

    public final gu a(boolean param0) {
        if (param0) {
            return (gu) null;
        }
        if (!(!this.b(81))) {
            return lq.field_c;
        }
        if (!((350L + this.field_a ^ -1L) >= (vi.b(-96) ^ -1L))) {
            return ad.field_K;
        }
        return this.c(118);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ru param5) {
        int incrementValue$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var20 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (-param4 + param3 << -602358776) / param5.field_g;
              var7 = var6_int * param5.field_i + (param4 << -2082097144);
              param2 = param2 + param5.field_i;
              param0 = param0 + param5.field_d;
              var8 = param2 - -(qn.field_l * param0);
              var9 = 0;
              var10 = param5.field_h;
              var11 = param5.field_e;
              var12 = qn.field_l + -var11;
              if (param0 < qn.field_a) {
                var14 = qn.field_a + -param0;
                param0 = qn.field_a;
                var10 = var10 - var14;
                var9 = var9 + var11 * var14;
                var8 = var8 + qn.field_l * var14;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -1708086482) {
                break L2;
              } else {
                rb.e(-63);
                break L2;
              }
            }
            L3: {
              var13 = 0;
              if (param2 < qn.field_j) {
                var14 = qn.field_j + -param2;
                var9 = var9 + var14;
                var8 = var8 + var14;
                param2 = qn.field_j;
                var13 = var13 + var14;
                var12 = var12 + var14;
                var7 = var7 + var6_int * var14;
                var11 = var11 - var14;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (qn.field_f >= var10 + param0) {
                break L4;
              } else {
                var10 = var10 - (param0 - -var10 + -qn.field_f);
                break L4;
              }
            }
            L5: {
              if (qn.field_e >= var11 + param2) {
                break L5;
              } else {
                var14 = -qn.field_e + param2 - -var11;
                var12 = var12 + var14;
                var13 = var13 + var14;
                var11 = var11 - var14;
                break L5;
              }
            }
            L6: {
              if (0 >= var11) {
                break L6;
              } else {
                if ((var10 ^ -1) < -1) {
                  param0 = -var10;
                  L7: while (true) {
                    if (-1 >= (param0 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      if (var20 == 0) {
                        param2 = -var11;
                        L8: while (true) {
                          L9: {
                            if (param2 >= 0) {
                              var8 = var8 + var12;
                              stackOut_34_0 = var9;
                              stackOut_34_1 = var13;
                              stackIn_35_0 = stackOut_34_0;
                              stackIn_35_1 = stackOut_34_1;
                              break L9;
                            } else {
                              var15 = var14 >> -1513187960;
                              var14 = var14 + var6_int;
                              var16 = -var15 + 256;
                              stackOut_23_0 = 0;
                              stackOut_23_1 = var15;
                              stackIn_35_0 = stackOut_23_0;
                              stackIn_35_1 = stackOut_23_1;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (var20 != 0) {
                                break L9;
                              } else {
                                L10: {
                                  L11: {
                                    if (stackIn_24_0 <= stackIn_24_1) {
                                      break L11;
                                    } else {
                                      var8++;
                                      var9++;
                                      if (var20 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    incrementValue$1 = var9;
                                    var9++;
                                    var17 = param5.field_j[param5.field_k[incrementValue$1] & 255];
                                    if (0 != var17) {
                                      L13: {
                                        if (255 < var15) {
                                          break L13;
                                        } else {
                                          var18 = qn.field_d[var8];
                                          var19 = (var17 & 16711935) * var15 + (16711935 & var18) * var16 >> 208566024 & 16711935;
                                          qn.field_d[var8] = var19 + rn.a(65280, rn.a(var17, 65280) * var15 + rn.a(var18, 65280) * var16 >> -1903824056);
                                          if (var20 == 0) {
                                            break L12;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      qn.field_d[var8] = var17;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  var8++;
                                  break L10;
                                }
                                param2++;
                                continue L8;
                              }
                            }
                          }
                          var9 = stackIn_35_0 + stackIn_35_1;
                          param0++;
                          continue L7;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var6 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var6);
            stackOut_37_1 = new StringBuilder().append("rb.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param5 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L14;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L14;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                field_b = (je) null;
                break L1;
              }
            }
            L2: {
              if ((param1[param0 >> 106908741] & 1 << (param0 & 31)) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("rb.F(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public final String a(byte param0) {
        if (!this.b(88)) {
          if ((vi.b(65) ^ -1L) <= (350L + this.field_a ^ -1L)) {
            if (param0 != 55) {
              this.field_a = -82L;
              return this.b((byte) -71);
            } else {
              return this.b((byte) -71);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 65280) {
            field_c = (String) null;
        }
    }

    abstract String b(byte param0);

    static {
        field_c = "This <%0> is currently wielding the <%2>. Are you sure you wish to replace it with the <%1>? The <%2> will be lost forever if you do this.";
    }
}
