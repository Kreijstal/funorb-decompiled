/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static int field_c;
    static int field_a;
    static String field_b;

    final static int a(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 32564) {
            sm.a(true);
          }
          if (!param1) {
            stackIn_6_0 = re.field_g.b(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = wb.field_m.b(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("sm.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        if (!param0) {
          String var2 = (String) null;
          sm.a(22, false, (String) null);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Open in popup window";
        field_c = 240;
    }
}
