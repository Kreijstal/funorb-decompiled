/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_b;
    static String field_a;
    static int field_c;
    static j field_d;

    final static void a(ee param0, byte param1, int param2, di param3, String param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              if (var7 >= param4.length()) {
                L2: {
                  if (param1 == 61) {
                    break L2;
                  } else {
                    field_a = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var8 = param4.charAt(var7);
                  if ((var8 ^ -1) != -61) {
                    break L3;
                  } else {
                    var6 = param3.field_a[0] + (var5_int >> -6068152) + param0.a(param4.substring(0, var7));
                    break L3;
                  }
                }
                L4: {
                  if (-1 != var6) {
                    param3.field_a[var7] = var6;
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
                    param3.field_a[var7] = param3.field_a[0] + ((var5_int >> -2142316216) - -param0.a(param4.substring(0, var7 + 1)) + -param0.a((char) var8));
                    break L4;
                  }
                }
                if (62 == var8) {
                  var6 = -1;
                  var7++;
                  continue L1;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("s.A(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 30235) {
            return;
        }
        field_b = null;
    }

    static {
        field_b = "Passwords must be between 5 and 20 characters long";
        field_a = "Play free version";
    }
}
