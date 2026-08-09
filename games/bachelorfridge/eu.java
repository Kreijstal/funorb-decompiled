/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu {
    static js field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            eu.a(true);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1, long param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -58) {
                break L1;
              } else {
                eu.a(true);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 == null) {
                  break L3;
                } else {
                  L4: {
                    if ((param3 ^ -1) != -3) {
                      break L4;
                    } else {
                      if (!eea.a(param0, param2, -110)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("eu.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    static {
        field_a = "Type your password again to make sure it's correct";
    }
}
