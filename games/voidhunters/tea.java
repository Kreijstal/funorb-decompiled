/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tea {
    static uja field_d;
    static int field_b;
    static String field_c;
    static String field_a;

    public static void a(boolean param0) {
        if (param0) {
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
        field_b = -71;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static int a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 13879) {
            field_a = (String) null;
          }
          if (li.field_i) {
            stackIn_6_0 = de.a(param0, param2 ^ 14107).a(param1, param2 - 13878);
            return stackIn_6_0;
          }
          stackIn_4_0 = ita.a(param0, param2 - 5891).b(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tea.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_d = new uja();
        field_b = 0;
        field_c = "Elapsed time";
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
