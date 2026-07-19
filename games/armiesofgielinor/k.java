/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_c;
    static String[] field_a;
    static String field_b;

    final static String a(CharSequence param0, boolean param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_36_0 = 0;
        Object stackIn_38_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_35_0 = 0;
        boolean stackOut_27_0 = false;
        String stackOut_39_0 = null;
        Object stackOut_37_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= var3) {
                      break L3;
                    } else {
                      stackOut_6_0 = rs.a(param0.charAt(var2_int), (byte) -52);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          break L3;
                        } else {
                          var2_int++;
                          continue L1;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = var2_int;
                  stackIn_13_0 = stackOut_10_0;
                  break L2;
                }
                L4: while (true) {
                  L5: {
                    L6: {
                      if (stackIn_13_0 >= var3) {
                        break L6;
                      } else {
                        stackOut_14_0 = rs.a(param0.charAt(var3 - 1), (byte) -52);
                        stackIn_19_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var9 != 0) {
                          break L5;
                        } else {
                          if (!stackIn_15_0) {
                            break L6;
                          } else {
                            var3--;
                            stackOut_12_0 = var2_int;
                            stackIn_13_0 = stackOut_12_0;
                            continue L4;
                          }
                        }
                      }
                    }
                    stackOut_18_0 = var3 - var2_int;
                    stackIn_19_0 = stackOut_18_0;
                    break L5;
                  }
                  var4 = stackIn_19_0;
                  if (var4 >= 1) {
                    if ((var4 ^ -1) >= -13) {
                      L7: {
                        var5 = new StringBuilder(var4);
                        var6 = var2_int;
                        if (!param1) {
                          break L7;
                        } else {
                          field_a = (String[]) null;
                          break L7;
                        }
                      }
                      L8: while (true) {
                        L9: {
                          if (var3 <= var6) {
                            stackOut_35_0 = var5.length() ^ -1;
                            stackIn_36_0 = stackOut_35_0;
                            break L9;
                          } else {
                            var7 = param0.charAt(var6);
                            stackOut_27_0 = ph.a(-14, (char) var7);
                            stackIn_36_0 = stackOut_27_0 ? 1 : 0;
                            stackIn_28_0 = stackOut_27_0;
                            if (var9 != 0) {
                              break L9;
                            } else {
                              L10: {
                                if (!stackIn_28_0) {
                                  break L10;
                                } else {
                                  var8 = pv.a(124, (char) var7);
                                  if (var8 != 0) {
                                    discarded$2 = var5.append((char) var8);
                                    break L10;
                                  } else {
                                    if (var9 == 0) {
                                      break L10;
                                    } else {
                                      discarded$3 = var5.append((char) var8);
                                      break L10;
                                    }
                                  }
                                }
                              }
                              var6++;
                              continue L8;
                            }
                          }
                        }
                        if (stackIn_36_0 != -1) {
                          stackOut_39_0 = var5.toString();
                          stackIn_40_0 = stackOut_39_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          stackOut_37_0 = null;
                          stackIn_38_0 = stackOut_37_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
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
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var2);
            stackOut_41_1 = new StringBuilder().append("k.B(");
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
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_38_0);
          } else {
            return stackIn_40_0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -13) {
            return;
        }
        field_c = null;
    }

    static {
        field_a = new String[]{"N", "E", "S", "W"};
        field_b = "Difficulty: ";
    }
}
