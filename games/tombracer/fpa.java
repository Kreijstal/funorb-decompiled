/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fpa {
    static String[] field_b;
    static String field_a;
    static boolean field_c;

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 75) {
            field_c = false;
          }
          qma.a((java.awt.Component) ((Object) param0), -71);
          ri.a((java.awt.Component) ((Object) param0), true);
          if (tja.field_q == null) {
            return;
          }
          tja.field_q.a(param1 ^ -59, (java.awt.Component) ((Object) param0));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("fpa.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1451) {
          field_b = (String[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = new String[]{"<%0> was bitten by a snake", "<%0> hates snakes", "<%0> thought hissing was a sign of friendship", "<%0> was popped by a python", "<%0> was chomped by a cobra", "<%0> ran headlong into a pit of poisonous snakes", "<%0>'s ankles were nibbled"};
        field_a = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }
}
