/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static int field_a;
    static byte[][] field_b;
    static String field_c;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Main.field_T;
        r.field_p = false;
        if (param0 < -18) {
          rk.field_ab = null;
          if (!ei.field_e) {
            var1 = qb.field_b;
            if (var1 > 0) {
              if (var1 == 1) {
                rk.field_ab = dh.field_g;
                rk.field_ab = bg.a((byte) 92, new CharSequence[3]);
                pc.field_a.s(-93);
                int discarded$8 = 112;
                e.a();
                return;
              } else {
                int discarded$9 = -50;
                rk.field_ab = re.a(nc.field_a, new String[1]);
                rk.field_ab = bg.a((byte) 92, new CharSequence[3]);
                pc.field_a.s(-93);
                int discarded$10 = 112;
                e.a();
                return;
              }
            } else {
              pc.field_a.s(-93);
              int discarded$11 = 112;
              e.a();
              return;
            }
          } else {
            pc.field_a.d(false);
            return;
          }
        } else {
          field_b = null;
          rk.field_ab = null;
          if (!ei.field_e) {
            var1 = qb.field_b;
            if (var1 > 0) {
              if (var1 == 1) {
                rk.field_ab = dh.field_g;
                rk.field_ab = bg.a((byte) 92, new CharSequence[3]);
                pc.field_a.s(-93);
                int discarded$12 = 112;
                e.a();
                return;
              } else {
                int discarded$13 = -50;
                rk.field_ab = re.a(nc.field_a, new String[1]);
                rk.field_ab = bg.a((byte) 92, new CharSequence[3]);
                pc.field_a.s(-93);
                int discarded$14 = 112;
                e.a();
                return;
              }
            } else {
              pc.field_a.s(-93);
              int discarded$15 = 112;
              e.a();
              return;
            }
          } else {
            pc.field_a.d(false);
            return;
          }
        }
    }

    public static void a() {
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[1000][];
    }
}
