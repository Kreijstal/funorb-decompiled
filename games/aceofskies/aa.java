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

    public static void a() {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void b() {
        Object var2 = null;
        ub.a(rt.field_e, (String) null, -117);
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
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
                stackOut_34_0 = var5;
                stackIn_35_0 = stackOut_34_0;
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
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
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
                      stackOut_27_0 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      return stackIn_28_0 != 0;
                    }
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
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
            stackOut_36_0 = (RuntimeException) var4;
            stackOut_36_1 = new StringBuilder().append("aa.E(").append(true).append(',').append(10).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + -43 + ')');
        }
        return stackIn_35_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new nk[8];
        field_d = "Account created successfully!";
    }
}
