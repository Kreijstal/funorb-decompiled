/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static int field_e;
    static String field_d;
    static int field_b;
    static int field_c;
    static String field_a;
    static vp field_f;

    final static si a(String param0, int param1, int param2) {
        si var3 = null;
        RuntimeException var3_ref = null;
        si stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new si(false);
              var3.field_h = param0;
              var3.field_g = param2;
              if (param1 == 20) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = (si) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("me.B(");

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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 < 92) {
            field_c = 76;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (param0 != 20) {
            field_f = (vp) null;
        }
    }

    static {
        field_d = "Create a free account";
        field_c = 20;
        field_a = "Most Crystals";
    }
}
