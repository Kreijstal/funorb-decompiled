/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs {
    static qh field_c;
    static String field_b;
    static jea field_a;

    final static String a(byte param0) {
        int var1 = 0;
        var1 = 126 % ((param0 - -60) / 52);
        if (kl.field_a == gsa.field_y) {
          return ub.field_i;
        } else {
          if (wt.field_d != gsa.field_y) {
            if (!gva.field_b.b(124)) {
              return uaa.field_a;
            } else {
              return jo.field_E;
            }
          } else {
            return uaa.field_a;
          }
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "No Reward (DNF)";
    }
}
