/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int field_d;
    static String field_b;
    static cj field_a;
    static int field_c;

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_21_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = tg.a(param1, false);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (-2 < (var4.length() ^ -1)) {
                          break L2;
                        } else {
                          L3: {
                            var5 = 76 % ((25 - param2) / 53);
                            if (eb.a((byte) 56, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (eb.a((byte) 84, var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                var6 = 0;
                                var7 = 0;
                                L4: while (true) {
                                  L5: {
                                    L6: {
                                      if (param1.length() <= var7) {
                                        break L6;
                                      } else {
                                        var8 = param1.charAt(var7);
                                        stackOut_21_0 = eb.a((byte) -75, (char) var8);
                                        stackIn_33_0 = stackOut_21_0 ? 1 : 0;
                                        stackIn_22_0 = stackOut_21_0;
                                        if (var9 != 0) {
                                          break L5;
                                        } else {
                                          L7: {
                                            if (!stackIn_22_0) {
                                              var6 = 0;
                                              if (var9 == 0) {
                                                break L7;
                                              } else {
                                                var6++;
                                                break L7;
                                              }
                                            } else {
                                              var6++;
                                              break L7;
                                            }
                                          }
                                          L8: {
                                            if (-3 < (var6 ^ -1)) {
                                              break L8;
                                            } else {
                                              if (!param0) {
                                                stackOut_29_0 = 0;
                                                stackIn_30_0 = stackOut_29_0;
                                                decompiledRegionSelector0 = 4;
                                                break L0;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          var7++;
                                          if (var9 == 0) {
                                            continue L4;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_32_0 = 0;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L5;
                                  }
                                  if (stackIn_33_0 >= var6) {
                                    stackOut_36_0 = 1;
                                    stackIn_37_0 = stackOut_36_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackOut_34_0 = 0;
                                    stackIn_35_0 = stackOut_34_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var3);
            stackOut_38_1 = new StringBuilder().append("vd.C(").append(param0).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    return stackIn_37_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            vd.a(false, 109L);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, long param1) {
        long stackIn_7_0 = 0L;
        long stackIn_8_0 = 0L;
        long stackIn_9_0 = 0L;
        int stackIn_9_1 = 0;
        long stackOut_6_0 = 0L;
        long stackOut_8_0 = 0L;
        int stackOut_8_1 = 0;
        long stackOut_7_0 = 0L;
        int stackOut_7_1 = 0;
        if ((param1 ^ -1L) < -1L) {
          if (!param0) {
            if (-1L == (param1 % 10L ^ -1L)) {
              L0: {
                be.a(-1L + param1, true);
                stackOut_6_0 = 1L;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param0) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L0;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L0;
                }
              }
              be.a(stackIn_9_0, stackIn_9_1 != 0);
              if (ZombieDawnMulti.field_E) {
                be.a(param1, true);
                return;
              } else {
                return;
              }
            } else {
              be.a(param1, true);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_d = 1;
        field_b = "Wise";
    }
}
