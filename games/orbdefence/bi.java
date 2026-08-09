/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static byte[] field_c;
    static String field_a;
    static String field_b;
    static String field_d;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 72 % ((-47 - param0) / 37);
        field_a = null;
        field_d = null;
    }

    final static int a(CharSequence param0, char param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param0.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var4 <= var5) {
                      break L4;
                    } else {
                      var8 = param1;
                      var7 = param0.charAt(var5);
                      if (var6 != 0) {
                        if (var7 >= var8) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var7 == var8) {
                            var3_int++;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var5++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param2 >= 123) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                field_c = (byte[]) null;
                break L2;
              }
              stackIn_13_0 = var3_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("bi.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    static {
        field_a = "SPLITTO";
        field_c = new byte[520];
        field_d = "Win";
        field_b = "Go Back";
    }
}
