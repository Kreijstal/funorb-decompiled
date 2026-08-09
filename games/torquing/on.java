/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends qf {
    static eb field_e;
    static String field_d;
    static String field_b;
    static int field_c;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 160) {
            on.b(104);
            field_e = null;
            return;
        }
        field_e = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, int param1, fn param2, byte param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              dn.field_h = param0;
              p.field_x = param2;
              wp.field_y = param1;
              if (param3 == -58) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("on.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 != 160) {
            field_e = (eb) null;
            return i.field_R;
        }
        return i.field_R;
    }

    static {
        field_e = new eb(64);
        field_c = 160;
    }
}
