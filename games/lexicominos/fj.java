/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends si {
    byte[] field_w;
    static String field_x;
    int field_A;
    static String field_y;
    dl field_z;

    public static void f(byte param0) {
        String discarded$0 = null;
        field_x = null;
        field_y = null;
        if (param0 != -12) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = fj.a((CharSequence) null, 26, true);
        }
    }

    final static void a(int param0, mc param1, boolean param2) {
        th var3 = ed.field_q;
        var3.h(param0, 0);
        var3.c(2, -1);
        if (param2) {
            return;
        }
        try {
            var3.c(0, -1);
            var3.c(param1.field_j, -1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "fj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        boolean stackIn_25_0 = false;
        String stackIn_33_0 = null;
        int stackIn_36_0 = 0;
        String stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        boolean stackOut_24_0 = false;
        String stackOut_32_0 = null;
        String stackOut_38_0 = null;
        String stackOut_20_0 = null;
        String stackOut_15_0 = null;
        String stackOut_10_0 = null;
        String stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var3_int = param0.length();
              if (param1 == 100) {
                L1: {
                  if ((var3_int ^ -1) > -2) {
                    break L1;
                  } else {
                    if ((var3_int ^ -1) >= -13) {
                      L2: {
                        var4 = ck.a(param0, (byte) -48);
                        if (var4 == null) {
                          break L2;
                        } else {
                          if ((var4.length() ^ -1) > -2) {
                            break L2;
                          } else {
                            L3: {
                              if (cf.a(var4.charAt(0), (byte) 78)) {
                                break L3;
                              } else {
                                if (!cf.a(var4.charAt(-1 + var4.length()), (byte) 78)) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    L5: {
                                      if (param0.length() <= var6) {
                                        stackOut_35_0 = -1;
                                        stackIn_36_0 = stackOut_35_0;
                                        break L5;
                                      } else {
                                        var7 = param0.charAt(var6);
                                        stackOut_24_0 = cf.a((char) var7, (byte) 78);
                                        stackIn_36_0 = stackOut_24_0 ? 1 : 0;
                                        stackIn_25_0 = stackOut_24_0;
                                        if (var8 != 0) {
                                          break L5;
                                        } else {
                                          L6: {
                                            L7: {
                                              if (!stackIn_25_0) {
                                                break L7;
                                              } else {
                                                var5++;
                                                if (var8 == 0) {
                                                  break L6;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                            }
                                            var5 = 0;
                                            break L6;
                                          }
                                          L8: {
                                            if (-3 < (var5 ^ -1)) {
                                              break L8;
                                            } else {
                                              if (!param2) {
                                                stackOut_32_0 = rg.field_a;
                                                stackIn_33_0 = stackOut_32_0;
                                                decompiledRegionSelector0 = 5;
                                                break L0;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          var6++;
                                          continue L4;
                                        }
                                      }
                                    }
                                    if (stackIn_36_0 > (var5 ^ -1)) {
                                      stackOut_38_0 = ac.field_a;
                                      stackIn_39_0 = stackOut_38_0;
                                      decompiledRegionSelector0 = 6;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackOut_20_0 = ac.field_a;
                            stackIn_21_0 = stackOut_20_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      }
                      stackOut_15_0 = wh.field_a;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_10_0 = wh.field_a;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = (String) null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = wh.field_a;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var3);
            stackOut_41_1 = new StringBuilder().append("fj.D(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0;
                  } else {
                    return stackIn_39_0;
                  }
                }
              }
            }
          }
        }
    }

    final byte[] d(byte param0) {
        int var2 = -4 % ((2 - param0) / 38);
        if (!(!this.field_v)) {
            throw new RuntimeException();
        }
        return this.field_w;
    }

    final int c(byte param0) {
        if (param0 != 16) {
            fj.f((byte) 77);
            if (!(!this.field_v)) {
                return 0;
            }
            return 100;
        }
        if (!(!this.field_v)) {
            return 0;
        }
        return 100;
    }

    final static kb a(String param0, String param1, boolean param2, int param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        int var7 = 0;
        CharSequence var8 = null;
        kb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        kb stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var7 = -46 / ((26 - param3) / 36);
              var6 = null;
              if ((param1.indexOf('@') ^ -1) == 0) {
                var8 = (CharSequence) ((Object) param1);
                var4_long = fd.a((byte) -58, var8);
                break L1;
              } else {
                var6 = param1;
                break L1;
              }
            }
            stackOut_3_0 = ef.a(var4_long, -27981, (String) (var6), param2, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("fj.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
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
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    fj() {
    }

    static {
        field_x = "Email is valid";
        field_y = "Waiting for music";
    }
}
