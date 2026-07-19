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
        if (param0 < 7) {
            field_e = 84;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final kb a(boolean param0) {
        if (!param0) {
            return (kb) null;
        }
        return sb.field_d;
    }

    final void a(int param0, th param1) {
        try {
            param1.a(29336, this.field_f);
            param1.b(param0, this.field_h);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "fh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        int[] var29 = null;
        int[] var30 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var19 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param7 == -24983) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (tc.field_d <= param5) {
                break L2;
              } else {
                param2 = param2 - (-param5 + tc.field_d);
                param5 = tc.field_d;
                break L2;
              }
            }
            L3: {
              if (param4 < tc.field_a) {
                param1 = param1 - (tc.field_a - param4);
                param4 = tc.field_a;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param5 + param2 > tc.field_e) {
                param2 = -param5 + tc.field_e;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1 + param4 <= tc.field_i) {
                break L5;
              } else {
                param1 = -param4 + tc.field_i;
                break L5;
              }
            }
            L6: {
              if (param2 <= 0) {
                break L6;
              } else {
                if ((param1 ^ -1) < -1) {
                  var21 = param3.e();
                  var30 = tc.field_b;
                  var10 = tc.field_j;
                  var11 = tc.field_c;
                  var29 = new int[4];
                  tc.b(var29);
                  param3.f();
                  tc.e(var29[0], var29[1], var29[2], var29[3]);
                  var13 = param3.field_s * param4 + param5;
                  var14 = -param2 + param3.field_s;
                  var25 = var21.field_z;
                  var22 = var25;
                  var15 = var22;
                  var16 = param4;
                  L7: while (true) {
                    if (param4 + param1 <= var16) {
                      var21.a(-param3.field_u, -param3.field_x);
                      tc.a(var30, var10, var11);
                      tc.a(var29);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var17 = param5;
                      L8: while (true) {
                        if (param2 + param5 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L7;
                        } else {
                          L9: {
                            var18 = var25[var13];
                            if (var18 != 0) {
                              L10: {
                                if (-1 <= (var17 ^ -1)) {
                                  break L10;
                                } else {
                                  if (var15[var13 + -1] == 0) {
                                    tc.d(var17, var16, param0, param6);
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (0 >= var16) {
                                  break L11;
                                } else {
                                  if (-1 == (var15[-param3.field_s + var13] ^ -1)) {
                                    tc.d(var17, var16, param0, param6);
                                    break L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (var17 >= -1 + param3.field_s) {
                                  break L12;
                                } else {
                                  if (-1 == (var15[1 + var13] ^ -1)) {
                                    tc.d(var17, var16, param0, param6);
                                    break L9;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (-1 + param3.field_y <= var16) {
                                break L9;
                              } else {
                                if (var15[param3.field_s + var13] == 0) {
                                  tc.d(var17, var16, param0, param6);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            } else {
                              break L9;
                            }
                          }
                          var13++;
                          var17++;
                          continue L8;
                        }
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
          L13: {
            var8 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var8);
            stackOut_44_1 = new StringBuilder().append("fh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L13;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L13;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    fh(String param0, String param1) {
        try {
            this.field_h = param1;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "fh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = fc.a(-29, 25, 2);
    }
}
