/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tea {
    static uja field_d;
    static int field_b;
    static String field_c;
    static String field_a;

    public static void a(boolean param0) {
        if (!param0) {
          field_b = -71;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static int a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 13879) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            if (li.field_i) {
              stackIn_6_0 = de.a(param0, param2 ^ 14107).a(param1, param2 + -13878);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = ita.a(param0, param2 + -5891).b(param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("tea.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_d = new uja();
        field_b = 0;
        field_c = "Elapsed time";
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
