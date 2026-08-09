/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static String field_a;
    static boolean field_b;
    static dl[] field_c;

    final static void a(String param0, int param1) {
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
              if (param1 == 48) {
                break L1;
              } else {
                field_b = false;
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

            stackIn_5_1 = new StringBuilder().append("ag.B(");

            if (param0 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        if (param1 != 48) {
            return false;
        }
        if (param0 < 48) {
            return false;
        }
        if (param0 > 57) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 19266) {
            field_b = false;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_a = "Return to Main Menu";
    }
}
