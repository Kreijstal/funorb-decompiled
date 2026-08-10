/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static kb field_b;
    static long field_a;

    public static void a(int param0) {
        if (param0 != 908) {
            return;
        }
        field_b = null;
    }

    final static void a(rj param0, le param1, int param2, String param3, byte param4) {
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
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param4 > 89) {
                break L1;
              } else {
                field_a = -103L;
                break L1;
              }
            }
            var6 = -1;
            var7 = 1;
            L2: while (true) {
              if (param3.length() <= var7) {
                break L0;
              } else {
                L3: {
                  var8 = param3.charAt(var7);
                  if (var8 == 60) {
                    var6 = (var5_int >> -1378449592) - -param0.field_a[0] - -param1.b(param3.substring(0, var7));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (0 != (var6 ^ -1)) {
                    param0.field_a[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (var8 != 32) {
                        break L5;
                      } else {
                        var5_int = var5_int + param2;
                        break L5;
                      }
                    }
                    param0.field_a[var7] = param0.field_a[0] + ((var5_int >> -728364984) - -param1.b(param3.substring(0, 1 + var7)) + -param1.a((char) var8));
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

            stackIn_21_1 = new StringBuilder().append("fa.A(");

            if (param0 == null) {
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

            if (param1 == null) {
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


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ',' + param4 + ')');
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> -1854361759;
        if (param0 > -32) {
          fa.a(78, -6);
          param1 = param1 | param1 >>> -2134165982;
          param1 = param1 | param1 >>> 1796537348;
          param1 = param1 | param1 >>> -124584952;
          param1 = param1 | param1 >>> 460566480;
          return 1 + param1;
        } else {
          param1 = param1 | param1 >>> -2134165982;
          param1 = param1 | param1 >>> 1796537348;
          param1 = param1 | param1 >>> -124584952;
          param1 = param1 | param1 >>> 460566480;
          return 1 + param1;
        }
    }

    static {
        field_b = null;
    }
}
