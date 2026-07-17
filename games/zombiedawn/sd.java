/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String field_a;
    static String field_c;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final static long a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_22_0 = 0L;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              var4 = param1.length();
              if (param0 == -66) {
                break L1;
              } else {
                var8 = null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var4 <= var5) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (var6 < 65) {
                        break L5;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(-65 + var6 + 1);
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (var6 <= 122) {
                          var2_long = var2_long + (long)(-97 + var6 + 1);
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (48 > var6) {
                      break L4;
                    } else {
                      if (57 < var6) {
                        break L4;
                      } else {
                        var2_long = var2_long + (long)(27 - (-var6 - -48));
                        break L4;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L3;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (var2_long % 37L != 0L) {
                    break L8;
                  } else {
                    if (var2_long == 0L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_22_0 = var2_long;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("sd.B(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_23_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Game Complete!";
        field_c = "Email is valid";
    }
}
