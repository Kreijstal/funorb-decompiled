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
        try {
            if (param1 != 95) {
                this.a(25);
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
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
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
                        if ((var11 ^ -1) != -1) {
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
                                stackIn_20_0 = param2.field_B;

                                stackIn_20_1 = var4_int;

                                if (var11 == 0) {
                                  stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                                  stackIn_21_1 = stackIn_20_1;
                                  stackIn_21_2 = 1;
                                  break L6;
                                } else {
                                  stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                                  stackIn_21_1 = stackIn_20_1;
                                  stackIn_21_2 = var11;
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
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("ja.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
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
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            stackIn_6_0 = re.a(um.field_b, 4371, new String[]{"1890", Integer.toString(var5 - 3)});
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
        try {
          L0: {
            var2_int = this.field_m.d(param0);
            var3 = this.field_m.f((byte) 108);
            var4 = this.field_m.l(66);
            var5 = vn.e(-13299);
            if (1890 > var4) {
              stackIn_3_0 = tj.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-3 + var5 < var4) {
                stackIn_7_0 = tj.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (tg.a(var2_int, var3, (byte) -127, var4)) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_10_0 = tj.field_b;
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
        try {
            if (param0 != 4340) {
                field_l = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ja.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
