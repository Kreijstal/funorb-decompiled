/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static te field_b;
    static fk field_e;
    static byte[][] field_a;
    static String field_d;
    static String field_c;

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param0) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param3) {
          var4 += 2;
          var4++;
          return qk.field_b[var4];
        } else {
          var4++;
          return qk.field_b[var4];
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new te(11, 0, 1, 2);
        field_e = new fk(0);
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_a = new byte[1000][];
        field_c = "Menu";
    }
}
