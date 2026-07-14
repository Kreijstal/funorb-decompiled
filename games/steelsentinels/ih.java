/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ia {
    static ee field_s;
    static int field_t;
    static String field_p;
    static int field_n;
    static String field_o;
    static String field_q;
    static String field_u;
    static int field_r;

    public static void c(int param0) {
        if (param0 != 18384) {
            return;
        }
        field_u = null;
        field_o = null;
        field_s = null;
        field_p = null;
        field_q = null;
    }

    final vd a(String param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (gm.a(true, param0) != null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (var3 == 0) {
          return fa.field_d;
        } else {
          if (param1 != -1) {
            var4 = null;
            vd discarded$2 = ((ih) this).a((String) null, -6);
            return vf.field_b;
          } else {
            return vf.field_b;
          }
        }
    }

    ih(jf param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        Object var4 = null;
        if (((ih) this).a(param1, -1) != fa.field_d) {
          if (param0 != 100) {
            var4 = null;
            String discarded$2 = ((ih) this).a(5, (String) null);
            return mg.field_lc;
          } else {
            return mg.field_lc;
          }
        } else {
          return oh.field_g;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Accept rematch";
        field_o = "(1 player wants to join)";
        field_u = "You must play 1 more rated game before playing with the current options.";
    }
}
