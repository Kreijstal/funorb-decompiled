/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends o {
    int field_k;
    static String field_l;
    static sa field_j;
    static jc field_n;
    static String field_m;

    final static void a(pf param0, int param1) {
        int var2 = 0;
        if (wf.field_R == param0) {
          return;
        } else {
          fk.field_q.e(-3435);
          mh.field_d.g();
          wf.field_R = param0;
          if (wf.field_R != null) {
            fk.field_q.a(false, wf.field_R, 59);
            var2 = 0 % ((-35 - param1) / 36);
            return;
          } else {
            var2 = 0 % ((-35 - param1) / 36);
            return;
          }
        }
    }

    ef(int param0) {
        ((ef) this).field_k = param0;
    }

    public static void a(int param0) {
        Object var2 = null;
        field_n = null;
        field_j = null;
        if (param0 != 27706) {
          var2 = null;
          ef.a((pf) null, -119);
          field_l = null;
          field_m = null;
          return;
        } else {
          field_l = null;
          field_m = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Hide chat";
        field_j = new sa();
        field_n = new jc();
        field_m = "Remove friend";
    }
}
