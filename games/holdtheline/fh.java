/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends sd {
    private String field_h;
    static int field_g;
    static int[] field_d;
    private String field_f;
    static int field_e;

    public static void b(byte param0) {
        field_d = null;
    }

    final kb a(boolean param0) {
        if (!param0) {
            return null;
        }
        return sb.field_d;
    }

    final void a(int param0, th param1) {
        try {
            param1.a(29336, ((fh) this).field_f);
            param1.b(param0, ((fh) this).field_h);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "fh.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, hj param3, int param4, int param5, int param6, int param7) {
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
        hj var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var19 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (~tc.field_d >= ~param5) {
                break L1;
              } else {
                param2 = param2 - (-param5 + tc.field_d);
                param5 = tc.field_d;
                break L1;
              }
            }
            L2: {
              if (param4 < tc.field_a) {
                param1 = param1 - (tc.field_a - param4);
                param4 = tc.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~(param5 + param2) < ~tc.field_e) {
                param2 = -param5 + tc.field_e;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (~(param1 + param4) >= ~tc.field_i) {
                break L4;
              } else {
                param1 = -param4 + tc.field_i;
                break L4;
              }
            }
            L5: {
              if (param2 <= 0) {
                break L5;
              } else {
                if (param1 > 0) {
                  var21 = param3.e();
                  var32 = tc.field_b;
                  var10 = tc.field_j;
                  var11 = tc.field_c;
                  var30 = new int[4];
                  tc.b(var30);
                  param3.f();
                  tc.e(var30[0], var30[1], var30[2], var30[3]);
                  var13 = param3.field_s * param4 + param5;
                  var14 = -param2 + param3.field_s;
                  var31 = var21.field_z;
                  var28 = var31;
                  var25 = var28;
                  var22 = var25;
                  var15 = var22;
                  var16 = param4;
                  L6: while (true) {
                    if (~(param4 + param1) >= ~var16) {
                      var21.a(-param3.field_u, -param3.field_x);
                      tc.a(var32, var10, var11);
                      tc.a(var30);
                      break L0;
                    } else {
                      var17 = param5;
                      L7: while (true) {
                        if (param2 + param5 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          var18 = var31[var13];
                          if (var18 != 0) {
                            L8: {
                              if (var17 <= 0) {
                                break L8;
                              } else {
                                if (var15[var13 + -1] == 0) {
                                  tc.d(var17, var16, param0, param6);
                                  var13++;
                                  var17++;
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (0 >= var16) {
                                break L9;
                              } else {
                                if (var15[-param3.field_s + var13] == 0) {
                                  tc.d(var17, var16, param0, param6);
                                  var13++;
                                  var17++;
                                  continue L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var17 >= -1 + param3.field_s) {
                                break L10;
                              } else {
                                if (var15[1 + var13] == 0) {
                                  tc.d(var17, var16, param0, param6);
                                  var13++;
                                  var17++;
                                  continue L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (-1 + param3.field_y <= var16) {
                              var13++;
                              var17++;
                              continue L7;
                            } else {
                              if (var15[param3.field_s + var13] == 0) {
                                tc.d(var17, var16, param0, param6);
                                var13++;
                                var17++;
                                continue L7;
                              } else {
                                var13++;
                                var17++;
                                continue L7;
                              }
                            }
                          } else {
                            var13++;
                            var17++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var8 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var8;
            stackOut_47_1 = new StringBuilder().append("fh.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param3 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L11;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + -24983 + 41);
        }
    }

    fh(String param0, String param1) {
        try {
            ((fh) this).field_h = param1;
            ((fh) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "fh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = fc.a(-29, 25, 2);
    }
}
