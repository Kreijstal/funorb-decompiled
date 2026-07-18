/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends rf {
    static String field_i;
    static int field_k;
    int[] field_j;
    static String[] field_f;
    int field_g;
    static byte[][] field_h;

    final static String a(int param0) {
        if (uh.field_k == jl.field_a) {
            return wj.field_c;
        }
        if (!qa.field_a.b(false)) {
            return qa.field_a.a((byte) 2);
        }
        if (ie.field_x == jl.field_a) {
            return qa.field_a.a((byte) 2);
        }
        return lc.field_hb;
    }

    private we() throws Throwable {
        throw new Error();
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_31_0 = 0;
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
        int stackOut_19_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_34_0 = var5;
                stackIn_35_0 = stackOut_34_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (var9 == 45) {
                        var4_int = 1;
                        break L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
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
                    if (97 > var9) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0 != 0;
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
                      if (var4_int != 0) {
                        var9 = -var9;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var10 = var6 * 10 - -var9;
                    if (var6 != var10 / 10) {
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      return stackIn_31_0 != 0;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    }
                  } else {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0 != 0;
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
            stackOut_36_1 = new StringBuilder().append("we.B(").append(-108).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + true + ',' + 10 + ')');
        }
        return stackIn_35_0 != 0;
    }

    public static void b(byte param0) {
        field_f = null;
        field_h = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
        field_f = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_h = new byte[250][];
    }
}
