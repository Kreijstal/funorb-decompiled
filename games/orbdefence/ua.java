/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_b;
    static String field_d;
    static int field_c;
    static int field_a;

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_33_0 = 0;
        boolean stackOut_26_0 = false;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1 != null) {
            var2_int = 0;
            var3 = param1.length();
            L0: while (true) {
              L1: {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    stackOut_6_0 = sk.a(param1.charAt(var2_int), -46);
                    stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var10 != 0) {
                      break L1;
                    } else {
                      if (!stackIn_7_0) {
                        break L2;
                      } else {
                        var2_int++;
                        continue L0;
                      }
                    }
                  }
                }
                stackOut_10_0 = var3;
                stackIn_13_0 = stackOut_10_0;
                break L1;
              }
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_13_0 <= var2_int) {
                      break L5;
                    } else {
                      stackOut_14_0 = sk.a(param1.charAt(var3 + -1), -46);
                      stackIn_19_0 = stackOut_14_0 ? 1 : 0;
                      stackIn_15_0 = stackOut_14_0;
                      if (var10 != 0) {
                        break L4;
                      } else {
                        if (!stackIn_15_0) {
                          break L5;
                        } else {
                          var3--;
                          stackOut_12_0 = var3;
                          stackIn_13_0 = stackOut_12_0;
                          continue L3;
                        }
                      }
                    }
                  }
                  stackOut_18_0 = -var2_int + var3;
                  stackIn_19_0 = stackOut_18_0;
                  break L4;
                }
                var4 = stackIn_19_0;
                if ((var4 ^ -1) <= -2) {
                  if (var4 <= 12) {
                    var5 = 64 % ((param0 - 32) / 47);
                    var6 = new StringBuilder(var4);
                    var7 = var2_int;
                    L6: while (true) {
                      L7: {
                        if (var3 <= var7) {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          break L7;
                        } else {
                          var8 = param1.charAt(var7);
                          stackOut_26_0 = tc.a((byte) -20, (char) var8);
                          stackIn_34_0 = stackOut_26_0 ? 1 : 0;
                          stackIn_27_0 = stackOut_26_0;
                          if (var10 != 0) {
                            break L7;
                          } else {
                            L8: {
                              L9: {
                                if (stackIn_27_0) {
                                  break L9;
                                } else {
                                  if (var10 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var9 = p.a((char) var8, 33);
                              if (0 == var9) {
                                break L8;
                              } else {
                                discarded$1 = var6.append((char) var9);
                                break L8;
                              }
                            }
                            var7++;
                            continue L6;
                          }
                        }
                      }
                      if (stackIn_34_0 != var6.length()) {
                        return var6.toString();
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var2);
            stackOut_38_1 = new StringBuilder().append("ua.D(").append(param0).append(',');
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
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        String discarded$1 = null;
        CharSequence var3 = null;
        param0--;
        if (param1 != 0) {
          var3 = (CharSequence) null;
          discarded$1 = ua.a(23, (CharSequence) null);
          param0 = param0 | param0 >>> 751128769;
          param0 = param0 | param0 >>> 691885058;
          param0 = param0 | param0 >>> -415277564;
          param0 = param0 | param0 >>> -2065323032;
          param0 = param0 | param0 >>> 1256565360;
          return param0 - -1;
        } else {
          param0 = param0 | param0 >>> 751128769;
          param0 = param0 | param0 >>> 691885058;
          param0 = param0 | param0 >>> -415277564;
          param0 = param0 | param0 >>> -2065323032;
          param0 = param0 | param0 >>> 1256565360;
          return param0 - -1;
        }
    }

    final static hj[] a(ki param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        hj[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hj[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hj[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        hj[] stackOut_1_0 = null;
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
            if (param2 > 32) {
              if (pk.a(-52, param1, param0, param3)) {
                stackOut_6_0 = sl.d((byte) -85);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (hj[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ua.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (hj[]) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -415277564) {
            field_b = (String) null;
            field_d = null;
            field_b = null;
            return;
        }
        field_d = null;
        field_b = null;
    }

    static {
        field_b = "BLIZZARD WAVE";
        field_d = "STORM BOLT";
        field_a = 0;
    }
}
