/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qv extends ms {
    static String field_l;
    static String field_o;
    int[] field_m;
    int field_n;
    static da field_k;

    final static void a(int param0) {
        ts.field_a = ts.field_a + 13;
        if (param0 != 2) {
          field_l = (String) null;
          fb.field_a = fb.field_a - 9;
          kn.field_b = kn.field_b - 4;
          ha.field_f = ha.field_f + 18;
          return;
        } else {
          fb.field_a = fb.field_a - 9;
          kn.field_b = kn.field_b - 4;
          ha.field_f = ha.field_f + 18;
          return;
        }
    }

    final static void a(int param0, int param1) {
        String discarded$6 = null;
        dj discarded$7 = null;
        dj discarded$8 = null;
        mf var2 = null;
        CharSequence var3 = null;
        var2 = fh.field_n[param0];
        if (param1 != 4) {
          var3 = (CharSequence) null;
          discarded$6 = qv.a(false, -82, (CharSequence) null);
          var2.c(-1);
          discarded$7 = qq.a(18416, var2);
          return;
        } else {
          var2.c(-1);
          discarded$8 = qq.a(18416, var2);
          return;
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        boolean stackIn_23_0 = false;
        String stackIn_30_0 = null;
        int stackIn_33_0 = 0;
        String stackIn_36_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        int stackOut_32_0 = 0;
        boolean stackOut_22_0 = false;
        String stackOut_29_0 = null;
        String stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = qq.field_Q;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if ((var3_int ^ -1) > -2) {
                  break L1;
                } else {
                  if (12 >= var3_int) {
                    L2: {
                      var4 = uk.a(-1, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (-2 >= (var4.length() ^ -1)) {
                          L3: {
                            if (wv.a((byte) -88, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (!wv.a((byte) -86, var4.charAt(-1 + var4.length()))) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  L5: {
                                    if (var6 >= param2.length()) {
                                      stackOut_32_0 = -1;
                                      stackIn_33_0 = stackOut_32_0;
                                      break L5;
                                    } else {
                                      var7 = param2.charAt(var6);
                                      stackOut_22_0 = wv.a((byte) -99, (char) var7);
                                      stackIn_33_0 = stackOut_22_0 ? 1 : 0;
                                      stackIn_23_0 = stackOut_22_0;
                                      if (var8 != 0) {
                                        break L5;
                                      } else {
                                        L6: {
                                          L7: {
                                            if (!stackIn_23_0) {
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
                                          if (var5 < 2) {
                                            break L8;
                                          } else {
                                            if (param0) {
                                              break L8;
                                            } else {
                                              stackOut_29_0 = ma.field_a;
                                              stackIn_30_0 = stackOut_29_0;
                                              decompiledRegionSelector0 = 4;
                                              break L0;
                                            }
                                          }
                                        }
                                        var6++;
                                        continue L4;
                                      }
                                    }
                                  }
                                  if (stackIn_33_0 > (var5 ^ -1)) {
                                    stackOut_35_0 = m.field_T;
                                    stackIn_36_0 = stackOut_35_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    var6 = -54 / ((48 - param1) / 41);
                                    stackOut_37_0 = null;
                                    stackIn_38_0 = stackOut_37_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_18_0 = m.field_T;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = qq.field_Q;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_8_0 = qq.field_Q;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var3);
            stackOut_39_1 = new StringBuilder().append("qv.A(").append(param0).append(',').append(param1).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_36_0;
                  } else {
                    return (String) ((Object) stackIn_38_0);
                  }
                }
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 18) {
            field_k = (da) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    private qv() throws Throwable {
        throw new Error();
    }

    static {
        field_l = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
