/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    static nk[] field_b;
    static int[] field_c;
    static String field_d;
    static pa[] field_a;

    protected aa() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void b(int param0) {
        Object var2 = null;
        ub.a(rt.field_e, (String) null, -117);
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, byte param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                stackOut_36_0 = var5;
                stackIn_37_0 = stackOut_36_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (var8 == 0) {
                      if (var9 != 45) {
                        if (43 != var9) {
                          break L3;
                        } else {
                          var8++;
                          break L2;
                        }
                      } else {
                        var4_int = 1;
                        var8++;
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (57 < var9) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    if (var9 < 97) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0 != 0;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (var9 < 10) {
                    L7: {
                      if (var4_int == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = 10 * var6 - -var9;
                    if (var6 == var10 / 10) {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    } else {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      return stackIn_30_0 != 0;
                    }
                  } else {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    return stackIn_25_0 != 0;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var4;
            stackOut_38_1 = new StringBuilder().append("aa.E(").append(true).append(',').append(10).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + -43 + ')');
        }
        return stackIn_37_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new nk[8];
        field_d = "Account created successfully!";
    }
}
