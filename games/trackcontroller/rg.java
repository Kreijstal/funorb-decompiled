/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static String field_a;
    static int field_b;
    static uf field_c;

    final static void a(boolean param0) {
        if (param0) {
            field_c = (uf) null;
        }
    }

    final static void a(wb param0, int param1) {
        RuntimeException runtimeException = null;
        wb var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fe.a(true, param0, param1 ^ 15171);
              if (param1 == 14915) {
                break L1;
              } else {
                var3 = (wb) null;
                rg.a((wb) null, 121);
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

            stackIn_5_1 = new StringBuilder().append("rg.B(");

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
          throw sl.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 17883) {
            field_a = (String) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_a = "Player names can be up to 12 letters, numbers and underscores";
    }
}
