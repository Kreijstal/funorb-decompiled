/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends rqa {
    static String field_o;

    final static int a(int param0, byte param1) {
        int var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        param0 = param0 & 8191;
        var2 = 34 / ((param1 - -19) / 38);
        if ((param0 ^ -1) > -4097) {
          L0: {
            if (-2049 < (param0 ^ -1)) {
              stackIn_8_0 = kra.field_a[-param0 + 2048];
              break L0;
            } else {
              stackIn_8_0 = -kra.field_a[-2048 + param0];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if ((param0 ^ -1) > -6145) {
              stackIn_4_0 = -kra.field_a[6144 - param0];
              break L1;
            } else {
              stackIn_4_0 = kra.field_a[param0 - 6144];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(hbb.field_z);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("fc.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    fc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        int var1 = 95 % ((param0 - -41) / 63);
        field_o = null;
    }

    static {
        field_o = "No options available";
    }
}
