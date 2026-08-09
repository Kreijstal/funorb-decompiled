/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    boolean field_a;
    String field_d;
    static String field_b;
    String field_c;

    final static boolean a(int param0, int param1, wk param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 21405) {
                break L1;
              } else {
                km.a((byte) 1);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param1 ^ -1) >= 47) {
                  break L3;
                } else {
                  if (47 <= (param1 ^ -1)) {
                    break L3;
                  } else {
                    if ((float)param1 >= (float)qj.field_d * 1.0f) {
                      break L3;
                    } else {
                      if ((float)me.field_Bb * 1.0f <= (float)param3) {
                        break L3;
                      } else {
                        stackIn_8_0 = 1;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("km.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_8_0 != 0;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 15) {
            km.a((byte) -128);
        }
    }

    static {
        field_b = "Select a location!";
    }
}
