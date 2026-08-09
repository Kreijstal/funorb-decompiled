/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int field_a;
    static o[] field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
            String var2 = (String) null;
            lk.a(47, (vd) null, 92, (fg) null, (String) null);
        }
    }

    final static void a(int param0, vd param1, int param2, fg param3, String param4) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = wizardrun.field_H;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = -117 % ((param0 - 0) / 57);
            var8 = 1;
            L1: while (true) {
              if (var8 >= param4.length()) {
                break L0;
              } else {
                L2: {
                  var9 = param4.charAt(var8);
                  if (var9 == 60) {
                    var6 = param3.field_e[0] + (var5_int >> -951373336) + param1.b(param4.substring(0, var8));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-1 != var6) {
                    param3.field_e[var8] = var6;
                    break L3;
                  } else {
                    L4: {
                      if (var9 != 32) {
                        break L4;
                      } else {
                        var5_int = var5_int + param2;
                        break L4;
                      }
                    }
                    param3.field_e[var8] = param3.field_e[0] + (var5_int >> -712605240) + (param1.b(param4.substring(0, 1 + var8)) + -param1.a((char) var9));
                    break L3;
                  }
                }
                L5: {
                  if (var9 == 62) {
                    var6 = -1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("lk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_19_0), stackIn_25_2 + ')');
        }
    }

    static {
        field_a = 0;
    }
}
