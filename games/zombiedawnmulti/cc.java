/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static ri field_c;
    static ja[] field_b;
    static String field_a;
    static String field_d;

    final static boolean a(String param0, String param1, String param2, int param3, int param4, fe param5, boolean param6) {
        RuntimeException var7 = null;
        tf var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (mp.field_b == id.field_B) {
              L1: {
                if (param4 == -10663) {
                  break L1;
                } else {
                  field_b = (ja[]) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var8 = new tf(nb.field_a, param5);
                  nb.field_a.b(param4 ^ -8815, var8);
                  if (sd.h(3853)) {
                    break L3;
                  } else {
                    L4: {
                      iq.field_c = null;
                      mc.field_g = param2;
                      am.field_a = param0;
                      if (!param6) {
                        stackIn_9_0 = 0;
                        break L4;
                      } else {
                        stackIn_9_0 = 1;
                        break L4;
                      }
                    }
                    ab.field_k = stackIn_9_0 != 0;
                    id.field_B = dj.field_k;
                    rj.field_J = param3;
                    ch.field_j = param1;
                    if (!ZombieDawnMulti.field_E) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var8.p(param4 ^ -10591);
                break L2;
              }
              stackIn_13_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var7);

            stackIn_16_1 = new StringBuilder().append("cc.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_26_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    public static void a(byte param0) {
        if (param0 != -52) {
            return;
        }
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_a = "Click here to close help.";
        field_d = "Cloak your zombies in pure fear. Humans will run from them above all else, falling right into your clutches.";
    }
}
