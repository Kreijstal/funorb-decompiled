/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static String field_a;
    static boolean[] field_f;
    static mm field_g;
    static String field_c;
    static String field_b;
    static String field_d;
    static ck field_e;

    public static void a(byte param0) {
        if (param0 != 92) {
          field_c = (String) null;
          field_g = null;
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, ck param4, int param5) {
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
        int stackIn_25_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var20 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (param1 + -param2 << 1042191592) / param4.field_K;
              param5 = param5 + param4.field_F;
              var7 = (param2 << -286083416) - -(var6_int * param4.field_F);
              if (param0 <= -96) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              param3 = param3 + param4.field_z;
              var8 = hk.field_j * param3 + param5;
              var9 = 0;
              var10 = param4.field_H;
              var11 = param4.field_I;
              var12 = hk.field_j + -var11;
              var13 = 0;
              if (param3 < hk.field_h) {
                var14 = hk.field_h + -param3;
                var8 = var8 + var14 * hk.field_j;
                var9 = var9 + var11 * var14;
                var10 = var10 - var14;
                param3 = hk.field_h;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (hk.field_b < var10 + param3) {
                var10 = var10 - (-hk.field_b + param3 + var10);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (hk.field_c <= param5) {
                break L4;
              } else {
                var14 = hk.field_c + -param5;
                var12 = var12 + var14;
                var11 = var11 - var14;
                var9 = var9 + var14;
                var13 = var13 + var14;
                var7 = var7 + var14 * var6_int;
                param5 = hk.field_c;
                var8 = var8 + var14;
                break L4;
              }
            }
            L5: {
              if (var11 + param5 > hk.field_g) {
                var14 = var11 + (param5 - hk.field_g);
                var13 = var13 + var14;
                var12 = var12 + var14;
                var11 = var11 - var14;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((var11 ^ -1) >= -1) {
                break L6;
              } else {
                if (0 < var10) {
                  param3 = -var10;
                  L7: while (true) {
                    if (0 <= param3) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      if (var20 == 0) {
                        param5 = -var11;
                        L8: while (true) {
                          L9: {
                            if (0 <= param5) {
                              var9 = var9 + var13;
                              stackOut_35_0 = var8 + var12;
                              stackIn_36_0 = stackOut_35_0;
                              break L9;
                            } else {
                              var15 = var14 >> 1563408872;
                              var14 = var14 + var6_int;
                              var16 = -var15 + 256;
                              stackOut_24_0 = var15;
                              stackIn_36_0 = stackOut_24_0;
                              stackIn_25_0 = stackOut_24_0;
                              if (var20 != 0) {
                                break L9;
                              } else {
                                L10: {
                                  L11: {
                                    if (stackIn_25_0 < 0) {
                                      var9++;
                                      var8++;
                                      if (var20 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    incrementValue$1 = var9;
                                    var9++;
                                    var17 = param4.field_D[incrementValue$1];
                                    if (var17 == 0) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if ((var15 ^ -1) >= -256) {
                                          break L13;
                                        } else {
                                          hk.field_l[var8] = var17;
                                          if (var20 == 0) {
                                            break L12;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      var18 = hk.field_l[var8];
                                      var19 = var16 * (16711935 & var18) + var15 * (var17 & 16711935) >> 484059016 & 16711935;
                                      hk.field_l[var8] = lb.a(65280, lb.a(65280, var17) * var15 + var16 * lb.a(65280, var18) >> -1554550744) + var19;
                                      break L12;
                                    }
                                  }
                                  var8++;
                                  break L10;
                                }
                                param5++;
                                continue L8;
                              }
                            }
                          }
                          var8 = stackIn_36_0;
                          param3++;
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
            stackOut_38_0 = (RuntimeException) (var6);
            stackOut_38_1 = new StringBuilder().append("bn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param4 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L14;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L14;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static cd a(boolean param0, boolean param1) {
        cd var2 = null;
        ck var3 = null;
        cd stackIn_2_0 = null;
        cd stackIn_3_0 = null;
        cd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        cd stackIn_6_0 = null;
        cd stackIn_7_0 = null;
        cd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cd stackOut_5_0 = null;
        cd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cd stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cd stackOut_1_0 = null;
        cd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        cd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0) {
          L0: {
            var3 = (ck) null;
            bn.a((byte) 42, -57, 101, -103, (ck) null, 71);
            var2 = new cd(true);
            stackOut_5_0 = (cd) (var2);
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = (cd) ((Object) stackIn_7_0);
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (cd) ((Object) stackIn_6_0);
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_e = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new cd(true);
            stackOut_1_0 = (cd) (var2);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (cd) ((Object) stackIn_3_0);
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (cd) ((Object) stackIn_2_0);
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_e = stackIn_4_1 != 0;
          return var2;
        }
    }

    final static void a(long param0, int param1, byte param2) {
        uf var4 = null;
        int var5 = 0;
        if (param2 != -84) {
          field_f = (boolean[]) null;
          var4 = we.field_b;
          var4.f(param1, -4);
          var4.field_n = var4.field_n + 1;
          var5 = var4.field_n;
          var4.a(true, 6);
          var4.a(param0, (byte) 0);
          var4.b(var4.field_n + -var5, true);
          return;
        } else {
          var4 = we.field_b;
          var4.f(param1, -4);
          var4.field_n = var4.field_n + 1;
          var5 = var4.field_n;
          var4.a(true, 6);
          var4.a(param0, (byte) 0);
          var4.b(var4.field_n + -var5, true);
          return;
        }
    }

    static {
        field_c = "PANIC!";
        field_a = "Kick";
        field_d = "Loading graphics";
        field_b = "Enter name of player to delete from list";
    }
}
