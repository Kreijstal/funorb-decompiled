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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 75) {
                break L1;
              } else {
                field_c = false;
                break L1;
              }
            }
            qma.a((java.awt.Component) ((Object) param0), -71);
            ri.a((java.awt.Component) ((Object) param0), true);
            if (tja.field_q != null) {
              tja.field_q.a(param1 ^ -59, (java.awt.Component) ((Object) param0));
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("fpa.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
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
