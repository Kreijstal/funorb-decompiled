/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends da implements od, g {
    ji field_m;
    static String field_j;
    static String field_l;
    static String field_n;
    static String field_k;
    static int[] field_i;

    public final void a(go param0, int param1) {
        boolean discarded$0 = false;
        try {
            if (param1 != 95) {
                discarded$0 = this.a(25);
            }
            this.b(param1 + -158);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ja.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_i = null;
        if (param0 <= 123) {
            ja.d((byte) 15);
        }
        field_l = null;
        field_n = null;
        field_k = null;
        field_j = null;
    }

    final static void a(int param0, int param1, bi param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -1;
              var5 = param2.field_z;
              var6 = param1;
              if (-param1 + var5 <= var6) {
                break L1;
              } else {
                var6 = -param1 + var5;
                break L1;
              }
            }
            var7 = param2.field_w;
            if (param0 == -174137048) {
              L2: {
                var8 = param3;
                if (var8 >= -param3 + var7) {
                  break L2;
                } else {
                  var8 = var7 - param3;
                  break L2;
                }
              }
              var9 = 0;
              L3: while (true) {
                if (var9 >= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var10 = 0;
                  L4: while (true) {
                    if (var5 <= var10) {
                      var9++;
                      continue L3;
                    } else {
                      L5: {
                        var4_int++;
                        var11 = param2.field_B[var4_int];
                        if (var11 != 0) {
                          var12 = (float)((-param1 + var10) * (var10 - param1) + (-param3 + var9) * (-param3 + var9));
                          var12 = var12 / (float)(var8 * var8 + var6 * var6);
                          var13 = (int)(256.0f * (-(float)Math.sqrt((double)var12) + 1.0f));
                          if (var13 <= 0) {
                            param2.field_B[var4_int] = 1;
                            break L5;
                          } else {
                            if ((var13 ^ -1) >= -256) {
                              L6: {
                                var14 = var11 & 16711935;
                                var14 = var14 * var13;
                                var15 = 65280 & var11;
                                var15 = var15 * var13;
                                var11 = (16711680 & var15 | -16711936 & var14) >>> -174137048;
                                stackOut_18_0 = param2.field_B;
                                stackOut_18_1 = var4_int;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                if (var11 == 0) {
                                  stackOut_20_0 = (int[]) ((Object) stackIn_20_0);
                                  stackOut_20_1 = stackIn_20_1;
                                  stackOut_20_2 = 1;
                                  stackIn_21_0 = stackOut_20_0;
                                  stackIn_21_1 = stackOut_20_1;
                                  stackIn_21_2 = stackOut_20_2;
                                  break L6;
                                } else {
                                  stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                                  stackOut_19_1 = stackIn_19_1;
                                  stackOut_19_2 = var11;
                                  stackIn_21_0 = stackOut_19_0;
                                  stackIn_21_1 = stackOut_19_1;
                                  stackIn_21_2 = stackOut_19_2;
                                  break L6;
                                }
                              }
                              stackIn_21_0[stackIn_21_1] = stackIn_21_2;
                              break L5;
                            } else {
                              var10++;
                              continue L4;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      var10++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("ja.V(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String c(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        go var6 = null;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        String stackOut_5_0 = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_m.d(false);
              var3 = this.field_m.f((byte) 119);
              if (param0 >= 61) {
                break L1;
              } else {
                var6 = (go) null;
                this.a((go) null, 80);
                break L1;
              }
            }
            L2: {
              var4 = this.field_m.l(115);
              var5 = vn.e(-13299);
              if (1890 > var4) {
                break L2;
              } else {
                if (var4 <= -3 + var5) {
                  if (!tg.a(var2_int, var3, (byte) -126, var4)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            stackOut_5_0 = re.a(um.field_b, 4371, new String[]{"1890", Integer.toString(var5 - 3)});
            stackIn_6_0 = stackOut_5_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 1;
            break L3;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return ri.field_M;
          } else {
            return (String) ((Object) stackIn_9_0);
          }
        }
    }

    public ja() {
    }

    final u a(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        u stackIn_3_0 = null;
        u stackIn_7_0 = null;
        u stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        u stackOut_2_0 = null;
        u stackOut_6_0 = null;
        u stackOut_9_0 = null;
        try {
          L0: {
            var2_int = this.field_m.d(param0);
            var3 = this.field_m.f((byte) 108);
            var4 = this.field_m.l(66);
            var5 = vn.e(-13299);
            if (1890 > var4) {
              stackOut_2_0 = tj.field_b;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-3 + var5 < var4) {
                stackOut_6_0 = tj.field_b;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (tg.a(var2_int, var3, (byte) -127, var4)) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_9_0 = tj.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return tj.field_b;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return p.field_g;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    public final void a(int param0, go param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 4340) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ja.K(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final boolean a(int param0) {
        if (param0 != 16647) {
            return true;
        }
        return this.field_m.k(-107);
    }

    static {
        field_k = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_n = "Fleets";
        field_l = "<%0> has been removed.";
    }
}
