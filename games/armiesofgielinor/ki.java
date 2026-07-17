/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static String field_c;
    static tv field_e;
    static String field_f;
    static kl field_b;
    static String field_a;
    static String[][] field_d;

    final static wd a(int param0) {
        if (nb.field_i == oh.field_L) {
            throw new IllegalStateException();
        }
        if (lm.field_d != oh.field_L) {
            return null;
        }
        oh.field_L = nb.field_i;
        return p.field_a;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = (param0 * param0 >> 12) * param0 >> 12;
        var3 = param0 * 6 + -61440;
        var4 = (var3 * param0 >> 12) + 40960;
        if (param1 >= -26) {
          int discarded$2 = ki.a(85, -2);
          return var4 * var2 >> 12;
        } else {
          return var4 * var2 >> 12;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_f = null;
        field_a = null;
        field_d = null;
        if (param0 <= 87) {
          ki.a((byte) 12);
          field_b = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> of <%1> strength with +<%2> bonus";
        field_f = "Leather armour helps to protect against ranged damage.";
        field_a = "Don't mind";
        field_e = new tv();
        field_d = new String[][]{new String[7], new String[4], new String[4], new String[5], new String[2], new String[5]};
    }
}
