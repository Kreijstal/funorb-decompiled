/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static ci[] field_a;

    final static void a(int param0, int param1, int param2, int param3, ci[] param4, int param5) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (0 < param3) {
                  var6_int = param4[param5].field_q;
                  var7 = param4[2].field_q;
                  var8 = param4[1].field_q;
                  param4[0].e(param2, param0, param1);
                  param4[2].e(-var7 + param2 + param3, param0, param1);
                  l.b(vl.field_e);
                  l.i(param2 - -var6_int, param0, param3 + (param2 + -var7), param0 - -param4[1].field_u);
                  var9 = var6_int + param2;
                  var10 = param3 + (param2 + -var7);
                  param2 = var9;
                  L2: while (true) {
                    if (param2 >= var10) {
                      l.a(vl.field_e);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param4[1].e(param2, param0, param1);
                      param2 = param2 + var8;
                      continue L2;
                    }
                  }
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
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("bk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param0 == 23196) {
                break L1;
              } else {
                field_a = (ci[]) null;
                break L1;
              }
            }
            var1_int = 0;
            var2 = 0;
            L2: while (true) {
              if (9 <= var2) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  if (rf.field_B[var2].field_c) {
                    if (var1_int != ea.field_o) {
                      var1_int++;
                      break L3;
                    } else {
                      stackIn_9_0 = var2;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L3;
                  }
                }
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "bk.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static void b(int param0) {
        Terraphoenix.field_O = 0;
        if (param0 <= 9) {
            field_a = (ci[]) null;
        }
    }

    final static boolean c(int param0) {
        if (param0 != -25704) {
            return true;
        }
        return ei.field_R;
    }

    final static boolean a(byte param0, boolean param1, int param2, CharSequence param3) {
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
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
        int var12 = 0;
        var12 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param2 < 2) {
                break L1;
              } else {
                if ((param2 ^ -1) >= -37) {
                  var4_int = 0;
                  var5 = 0;
                  var7 = 106 % ((29 - param0) / 60);
                  var6 = 0;
                  var8 = param3.length();
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= var8) {
                      stackIn_38_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var10 = param3.charAt(var9);
                          if (-1 == (var9 ^ -1)) {
                            if (var10 != 45) {
                              if (43 != var10) {
                                break L4;
                              } else {
                                if (!param1) {
                                  break L4;
                                } else {
                                  var9++;
                                  continue L2;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (var10 < 48) {
                              break L6;
                            } else {
                              if (var10 > 57) {
                                break L6;
                              } else {
                                var10 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var10 < 65) {
                              break L7;
                            } else {
                              if (90 < var10) {
                                break L7;
                              } else {
                                var10 -= 55;
                                break L5;
                              }
                            }
                          }
                          if (var10 < 97) {
                            stackIn_25_0 = 0;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            if (var10 <= 122) {
                              var10 -= 87;
                              break L5;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (var10 < param2) {
                          L8: {
                            if (var4_int == 0) {
                              break L8;
                            } else {
                              var10 = -var10;
                              break L8;
                            }
                          }
                          var11 = var10 + param2 * var6;
                          if (var6 == var11 / param2) {
                            var5 = 1;
                            var6 = var11;
                            break L3;
                          } else {
                            stackIn_34_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          stackIn_29_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var4);

            stackIn_41_1 = new StringBuilder().append("bk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L9;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L9;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_25_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              return stackIn_38_0 != 0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 6144) {
            field_a = (ci[]) null;
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != 92) {
            bk.c(62);
        }
        param1 = param1 & 8191;
        if (-4097 < (param1 ^ -1)) {
            return -2049 >= (param1 ^ -1) ? va.field_d[4096 - param1] : va.field_d[param1];
        }
        return 6144 <= param1 ? -va.field_d[-param1 + 8192] : -va.field_d[param1 + -4096];
    }

    static {
    }
}
