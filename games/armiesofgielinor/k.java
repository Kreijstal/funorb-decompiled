/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_c;
    static String[] field_a;
    static String field_b;

    final static String a(CharSequence param0, boolean param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!rs.a(param0.charAt(var2_int), (byte) -52)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!rs.a(param0.charAt(var3 - 1), (byte) -52)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = var3 - var2_int;
                  if (var4 >= 1) {
                    if ((var4 ^ -1) >= -13) {
                      L5: {
                        var5 = new StringBuilder(var4);
                        var6 = var2_int;
                        if (!param1) {
                          break L5;
                        } else {
                          field_a = (String[]) null;
                          break L5;
                        }
                      }
                      L6: while (true) {
                        if (var3 <= var6) {
                          if (var5.length() != 0) {
                            stackIn_29_0 = var5.toString();
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            stackIn_27_0 = null;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          L7: {
                            var7 = param0.charAt(var6);
                            if (!ph.a(-14, (char) var7)) {
                              break L7;
                            } else {
                              var8 = pv.a(124, (char) var7);
                              if (var8 != 0) {
                                discarded$0 = var5.append((char) var8);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var6++;
                          continue L6;
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
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("k.B(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_27_0);
          } else {
            return stackIn_29_0;
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
