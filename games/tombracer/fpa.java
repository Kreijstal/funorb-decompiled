/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fpa {
    static String[] field_b;
    static String field_a;
    static boolean field_c;

    final static void a(java.awt.Canvas param0, byte param1) {
        if (param1 != 75) {
          L0: {
            field_c = false;
            qma.a((java.awt.Component) (Object) param0, -71);
            ri.a((java.awt.Component) (Object) param0, true);
            if (tja.field_q != null) {
              tja.field_q.a(param1 ^ -59, (java.awt.Component) (Object) param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            qma.a((java.awt.Component) (Object) param0, -71);
            ri.a((java.awt.Component) (Object) param0, true);
            if (tja.field_q != null) {
              tja.field_q.a(param1 ^ -59, (java.awt.Component) (Object) param0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1451) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"<%0> was bitten by a snake", "<%0> hates snakes", "<%0> thought hissing was a sign of friendship", "<%0> was popped by a python", "<%0> was chomped by a cobra", "<%0> ran headlong into a pit of poisonous snakes", "<%0>'s ankles were nibbled"};
        field_a = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }
}
