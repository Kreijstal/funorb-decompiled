/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static ea[] field_a;
    static String field_b;
    static int field_c;
    static int field_d;

    final static String a(boolean param0) {
        if (!il.field_n) {
          if (pe.field_pb >= ch.field_f) {
            if (pe.field_pb >= od.field_o + ch.field_f) {
              if (param0) {
                return null;
              } else {
                field_d = -59;
                return null;
              }
            } else {
              return fa.field_c;
            }
          } else {
            if (param0) {
              return null;
            } else {
              field_d = -59;
              return null;
            }
          }
        } else {
          if (param0) {
            return null;
          } else {
            field_d = -59;
            return null;
          }
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                param2 = ke.a('_', (byte) 75, param2, "");
                var4 = 123 % ((param0 - 59) / 55);
                var3 = re.a(param1, 0);
                if ((param2.indexOf(param1) ^ -1) != 0) {
                  break L2;
                } else {
                  if ((param2.indexOf(var3) ^ -1) == 0) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("a.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            field_a = (ea[]) null;
        }
    }

    static {
        field_b = "Pause Menu";
    }
}
