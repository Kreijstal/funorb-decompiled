/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static int[][] field_a;
    static boolean field_b;

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var11 = new char[var2_int];
            var10 = var11;
            var9 = var10;
            var8 = var9;
            var3 = var8;
            var4 = 2;
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                stackOut_24_0 = new String(var11);
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                L2: {
                  var6 = param1.charAt(var5);
                  if (var4 == 0) {
                    var6 = Character.toLowerCase((char) var6);
                    break L2;
                  } else {
                    if (var4 == 2) {
                      var6 = hc.a(98, (char) var6);
                      break L2;
                    } else {
                      if (!Character.isUpperCase((char) var6)) {
                        break L2;
                      } else {
                        var6 = hc.a(98, (char) var6);
                        break L2;
                      }
                    }
                  }
                }
                L3: {
                  if (!Character.isLetter((char) var6)) {
                    L4: {
                      if (var6 == 46) {
                        break L4;
                      } else {
                        if (var6 == 63) {
                          break L4;
                        } else {
                          if (33 == var6) {
                            break L4;
                          } else {
                            if (Character.isSpaceChar((char) var6)) {
                              if (var4 != 2) {
                                var4 = 1;
                                break L3;
                              } else {
                                break L3;
                              }
                            } else {
                              var4 = 1;
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = 2;
                    break L3;
                  } else {
                    var4 = 0;
                    break L3;
                  }
                }
                var3[var5] = (char)var6;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("ve.A(").append(13).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_25_0;
    }

    public static void a() {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[][]{new int[22], new int[38], new int[38], new int[18], new int[28], new int[50]};
    }
}
