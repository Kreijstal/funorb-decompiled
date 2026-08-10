/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_b;
    static String field_d;
    static int field_c;
    static int field_a;

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1 != null) {
            var2_int = 0;
            var3 = param1.length();
            L0: while (true) {
              L1: {
                if (var2_int >= var3) {
                  break L1;
                } else {
                  if (!sk.a(param1.charAt(var2_int), -46)) {
                    break L1;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var3 <= var2_int) {
                    break L3;
                  } else {
                    if (!sk.a(param1.charAt(var3 + -1), -46)) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = -var2_int + var3;
                if ((var4 ^ -1) <= -2) {
                  if (var4 <= 12) {
                    var5 = 64 % ((param0 - 32) / 47);
                    var6 = new StringBuilder(var4);
                    var7 = var2_int;
                    L4: while (true) {
                      if (var3 <= var7) {
                        if (0 != var6.length()) {
                          return var6.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L5: {
                          var8 = param1.charAt(var7);
                          if (tc.a((byte) -20, (char) var8)) {
                            var9 = p.a((char) var8, 33);
                            if (0 == var9) {
                              break L5;
                            } else {
                              discarded$0 = var6.append((char) var9);
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var7++;
                        continue L4;
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
          L6: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("ua.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        if (param1 != 0) {
            CharSequence var3 = (CharSequence) null;
            ua.a(23, (CharSequence) null);
        }
        param0 = param0 | param0 >>> 751128769;
        param0 = param0 | param0 >>> 691885058;
        param0 = param0 | param0 >>> -415277564;
        param0 = param0 | param0 >>> -2065323032;
        param0 = param0 | param0 >>> 1256565360;
        return param0 - -1;
    }

    final static hj[] a(ki param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        hj[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hj[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 > 32) {
              if (pk.a(-52, param1, param0, param3)) {
                stackIn_7_0 = sl.d((byte) -85);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (hj[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ua.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
