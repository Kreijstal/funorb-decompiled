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
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = sva.field_d;
                if (param1.field_d != 2) {
                  break L2;
                } else {
                  L3: {
                    if (param1.field_m) {
                      break L3;
                    } else {
                      L4: {
                        if (0 != param1.field_c) {
                          break L4;
                        } else {
                          if (-1 != (param1.field_o ^ -1)) {
                            break L4;
                          } else {
                            var2_int = pm.field_a[param1.field_d];
                            if (var4 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var2_int = bma.field_t[param1.field_d];
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = sva.field_d;
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                if (-5 == (param1.field_d ^ -1)) {
                  break L5;
                } else {
                  L6: {
                    if ((param1.field_i ^ -1L) != (rb.field_r ^ -1L)) {
                      break L6;
                    } else {
                      var2_int = pm.field_a[param1.field_d];
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2_int = bma.field_t[param1.field_d];
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              var2_int = bma.field_t[param1.field_d];
              break L1;
            }
            var3 = 42 / ((param0 - -71) / 44);
            stackOut_13_0 = var2_int;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("uaa.B(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
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
