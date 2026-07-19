/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static jta field_a;
    static fp field_c;
    static String field_b;
    static uca[] field_d;

    public static void a(int param0) {
        boolean discarded$2 = false;
        CharSequence var2 = null;
        if (param0 != -1) {
          var2 = (CharSequence) null;
          discarded$2 = ej.a(false, false, (CharSequence) null);
          field_d = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(boolean param0, boolean param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_34_0 = 0;
        boolean stackOut_24_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      if (!param0) {
                        break L2;
                      } else {
                        ej.a(-107);
                        break L2;
                      }
                    }
                    var4 = jd.a(1, param2);
                    if (var4 == null) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if ((var4.length() ^ -1) <= -2) {
                        L3: {
                          if (hf.a(-62, var4.charAt(0))) {
                            break L3;
                          } else {
                            if (hf.a(114, var4.charAt(-1 + var4.length()))) {
                              break L3;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L4: while (true) {
                                L5: {
                                  if (param2.length() <= var6) {
                                    stackOut_34_0 = -1;
                                    stackIn_35_0 = stackOut_34_0;
                                    break L5;
                                  } else {
                                    var7 = param2.charAt(var6);
                                    stackOut_24_0 = hf.a(-73, (char) var7);
                                    stackIn_35_0 = stackOut_24_0 ? 1 : 0;
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
                                        if ((var5 ^ -1) > -3) {
                                          break L8;
                                        } else {
                                          if (param1) {
                                            break L8;
                                          } else {
                                            stackOut_31_0 = 0;
                                            stackIn_32_0 = stackOut_31_0;
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
                                if (stackIn_35_0 <= (var5 ^ -1)) {
                                  stackOut_38_0 = 1;
                                  stackIn_39_0 = stackOut_38_0;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                } else {
                                  stackOut_36_0 = 0;
                                  stackIn_37_0 = stackOut_36_0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var3);
            stackOut_40_1 = new StringBuilder().append("ej.B(").append(param0).append(',').append(param1).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_37_0 != 0;
                  } else {
                    return stackIn_39_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_b = "Close";
        field_c = new fp();
    }
}
