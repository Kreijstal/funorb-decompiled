/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_a;
    static ge[] field_d;
    static volatile boolean field_c;
    static String field_b;

    final static void a(int param0, byte param1, eg param2, String param3, qi param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -1;
              if (param1 == -113) {
                break L1;
              } else {
                ua.a(125);
                break L1;
              }
            }
            var7 = 1;
            L2: while (true) {
              if (var7 >= param3.length()) {
                break L0;
              } else {
                L3: {
                  var8 = param3.charAt(var7);
                  if (60 == var8) {
                    var6 = param4.field_g[0] + (var5_int >> -2014425080) + param2.a(param3.substring(0, var7));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((var6 ^ -1) != 0) {
                    param4.field_g[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (var8 == 32) {
                        var5_int = var5_int + param0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param4.field_g[var7] = (var5_int >> -571783416) + param4.field_g[0] + param2.a(param3.substring(0, 1 + var7)) + -param2.a((char) var8);
                    break L4;
                  }
                }
                L6: {
                  if (var8 == 62) {
                    var6 = -1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param4 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        int var1 = 68 % ((18 - param0) / 56);
        field_b = null;
    }

    static {
        field_a = "Accept";
        field_c = false;
        field_b = "Passwords must be between 5 and 20 letters and numbers";
    }
}
