/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class es {
    static kc field_b;
    static String field_a;

    public static void a(boolean param0) {
        if (param0) {
            es.a(false);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, sw param2, int param3, da param4, int param5, ha param6, int param7, int param8, no param9, int param10) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var11_int = -47 / ((param8 - -59) / 50);
              if (null != pja.field_o) {
                hg.field_c = 0;
                rua.field_o = rua.field_o + 1;
                if (jua.field_a < rua.field_o) {
                  if (param9 != null) {
                    usb.a(param3, param9, pja.field_o, param7, 1, param0, param5);
                    break L1;
                  } else {
                    if (param4 == null) {
                      break L1;
                    } else {
                      jqb.a(param0, param1, pja.field_o, (byte) 100, param3, param10, param4, param6, param2, param5, param7);
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                hg.field_c = hg.field_c + 1;
                if (hg.field_c <= mna.field_b) {
                  break L1;
                } else {
                  rua.field_o = 0;
                  break L1;
                }
              }
            }
            pja.field_o = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var11);

            stackIn_14_1 = new StringBuilder().append("es.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_24_2 + ',' + param10 + ')');
        }
    }

    static {
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
