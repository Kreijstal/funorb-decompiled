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
        field_x = null;
        field_y = null;
        if (param0 != -12) {
            CharSequence var2 = (CharSequence) null;
            fj.a((CharSequence) null, 26, true);
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
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        boolean stackIn_25_0 = false;
        String stackIn_33_0 = null;
        int stackIn_36_0 = 0;
        String stackIn_39_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_24_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
                                      L6: {
                                        if (param0.length() <= var6) {
                                          break L6;
                                        } else {
                                          var7 = param0.charAt(var6);
                                          stackOut_24_0 = cf.a((char) var7, (byte) 78);
                                          stackIn_36_0 = stackOut_24_0 ? 1 : 0;
                                          stackIn_25_0 = stackOut_24_0;
                                          if (var8 != 0) {
                                            break L5;
                                          } else {
                                            L7: {
                                              L8: {
                                                if (!stackIn_25_0) {
                                                  break L8;
                                                } else {
                                                  var5++;
                                                  if (var8 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              var5 = 0;
                                              break L7;
                                            }
                                            L9: {
                                              if (-3 < (var5 ^ -1)) {
                                                break L9;
                                              } else {
                                                if (!param2) {
                                                  stackIn_33_0 = rg.field_a;
                                                  decompiledRegionSelector0 = 5;
                                                  break L0;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            var6++;
                                            if (var8 == 0) {
                                              continue L4;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                      stackIn_36_0 = -1;
                                      break L5;
                                    }
                                    if (stackIn_36_0 > (var5 ^ -1)) {
                                      stackIn_39_0 = ac.field_a;
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
                            stackIn_21_0 = ac.field_a;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        }
                      }
                      stackIn_16_0 = wh.field_a;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_11_0 = wh.field_a;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = wh.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var3);

            stackIn_43_1 = new StringBuilder().append("fj.D(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L10;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L10;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_4_0 = ef.a(var4_long, -27981, (String) (var6), param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("fj.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
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
