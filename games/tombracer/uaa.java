/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uaa {
    static String field_d;
    static jea field_b;
    static String field_a;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 5193) {
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static int a(byte param0, gqa param1) {
        int var2_int = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = sva.field_d;
              if (param1.field_d != 2) {
                if (-5 == (param1.field_d ^ -1)) {
                  var2_int = bma.field_t[param1.field_d];
                  break L1;
                } else {
                  if ((param1.field_i ^ -1L) != (rb.field_r ^ -1L)) {
                    var2_int = bma.field_t[param1.field_d];
                    break L1;
                  } else {
                    var2_int = pm.field_a[param1.field_d];
                    break L1;
                  }
                }
              } else {
                if (param1.field_m) {
                  var2_int = sva.field_d;
                  break L1;
                } else {
                  L2: {
                    if (0 != param1.field_c) {
                      break L2;
                    } else {
                      if (-1 != (param1.field_o ^ -1)) {
                        break L2;
                      } else {
                        var2_int = pm.field_a[param1.field_d];
                        break L1;
                      }
                    }
                  }
                  var2_int = bma.field_t[param1.field_d];
                  break L1;
                }
              }
            }
            var3 = 42 / ((param0 - -71) / 44);
            stackIn_14_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("uaa.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_d = "Gold Medal Award";
        field_c = "<%0> wants to join";
    }
}
