/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wa extends vh {
    static String field_q;
    static int field_s;
    static volatile int field_p;
    static String field_t;
    static bg[] field_r;

    public static void c(int param0) {
        field_t = null;
        field_q = null;
        field_r = null;
        if (param0 != 21834) {
            field_q = (String) null;
        }
    }

    final static void a(ci param0, byte param1, String param2) {
        try {
            fa.field_d = param0;
            if (param1 < 19) {
                wa.c(-64);
            }
            jh.field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "wa.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(ci param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ci var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var19 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (l.field_b <= param1) {
                break L1;
              } else {
                param7 = param7 - (l.field_b + -param1);
                param1 = l.field_b;
                break L1;
              }
            }
            L2: {
              if (l.field_d > param5) {
                param2 = param2 - (l.field_d + -param5);
                param5 = l.field_d;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 + param7 <= l.field_f) {
                break L3;
              } else {
                param7 = -param1 + l.field_f;
                break L3;
              }
            }
            L4: {
              if (param5 - -param2 <= l.field_c) {
                break L4;
              } else {
                param2 = -param5 + l.field_c;
                break L4;
              }
            }
            L5: {
              if ((param7 ^ -1) >= -1) {
                break L5;
              } else {
                if ((param2 ^ -1) >= -1) {
                  break L5;
                } else {
                  var21 = param0.d();
                  var30 = l.field_i;
                  var10 = l.field_k;
                  var11 = l.field_j;
                  var29 = new int[4];
                  l.b(var29);
                  param0.a();
                  l.i(var29[0], var29[1], var29[2], var29[3]);
                  var13 = param1 + param0.field_r * param5;
                  var14 = -param7 + param0.field_r;
                  var25 = var21.field_z;
                  var22 = var25;
                  var15 = var22;
                  var16 = param5;
                  L6: while (true) {
                    if (param5 + param2 <= var16) {
                      var16 = 60 / ((param3 - 1) / 51);
                      var21.b(-param0.field_p, -param0.field_v);
                      l.a(var30, var10, var11);
                      l.a(var29);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var17 = param1;
                      L7: while (true) {
                        if (param1 - -param7 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          var18 = var25[var13];
                          if (0 != var18) {
                            L8: {
                              L9: {
                                L10: {
                                  if ((var17 ^ -1) >= -1) {
                                    break L10;
                                  } else {
                                    if (0 == var15[-1 + var13]) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (var16 <= 0) {
                                    break L11;
                                  } else {
                                    if (-1 == (var15[var13 - param0.field_r] ^ -1)) {
                                      break L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (var17 >= -1 + param0.field_r) {
                                    break L12;
                                  } else {
                                    if (var15[1 + var13] == 0) {
                                      break L9;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (param0.field_t - 1 > var16) {
                                  if (0 == var15[var13 - -param0.field_r]) {
                                    break L9;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  var13++;
                                  var17++;
                                  continue L7;
                                }
                              }
                              l.e(var17, var16, param6, param4);
                              break L8;
                            }
                            var13++;
                            var17++;
                            continue L7;
                          } else {
                            var13++;
                            var17++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var8 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var8);
            stackOut_38_1 = new StringBuilder().append("wa.L(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L13;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new char[var2_int];
              if (param0 == -117) {
                break L1;
              } else {
                var6 = (String) null;
                wa.a((ci) null, (byte) 117, (String) null);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[-1 + (var2_int + -var4)] = param1.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("wa.N(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    wa() {
    }

    static {
        field_q = "OM-4 FG";
        field_s = 65280;
        field_p = 0;
    }
}
