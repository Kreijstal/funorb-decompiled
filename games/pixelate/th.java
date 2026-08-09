/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static String field_a;
    static tf field_b;

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = fb.a(wo.field_h, (byte) 119, rj.field_I);
              if (-2 == (var2_int ^ -1)) {
                param1 = "<img=0>" + param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == var2_int) {
                param1 = "<img=1>" + param1;
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_7_0 = (String) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("th.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -94) {
            field_b = (tf) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        param0 = param0 & param1;
        if (-4097 < (param0 ^ -1)) {
          L0: {
            if (-2049 >= (param0 ^ -1)) {
              stackIn_8_0 = -k.field_i[-2048 + param0];
              break L0;
            } else {
              stackIn_8_0 = k.field_i[2048 - param0];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (-6145 < (param0 ^ -1)) {
              stackIn_4_0 = -k.field_i[-param0 + 6144];
              break L1;
            } else {
              stackIn_4_0 = k.field_i[param0 - 6144];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static void a(int param0) {
        if (param0 != 8191) {
          th.a(17);
          gf.a(pm.field_s, true, 32, nk.field_b);
          ke.field_d = true;
          return;
        } else {
          gf.a(pm.field_s, true, 32, nk.field_b);
          ke.field_d = true;
          return;
        }
    }

    static {
        field_a = "Mouse over an icon for details";
    }
}
