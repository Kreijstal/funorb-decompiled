/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static String field_c;
    static hl field_a;
    static String field_b;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        ak.field_e = a.field_b.a(mj.field_c[12]);
        var1 = a.field_b.a(mj.field_c[13]);
        if (var1 <= ak.field_e) {
          ad.a(0, new int[10], true);
          ad.a(1, new int[6], true);
          ad.a(2, new int[2], true);
          ad.a(3, new int[3], true);
          ad.a(4, new int[2], true);
          ad.a(5, new int[2], true);
          ad.a(6, new int[2], true);
          ad.a(7, new int[2], true);
          var2 = a.field_b.field_q + a.field_b.field_r + 4;
          if (param0 != -5695) {
            return;
          } else {
            qi.field_a[6] = a.field_b.field_q + (a.field_b.field_p + 200) - -var2;
            b.field_c[6] = var2 * 2 + 24;
            return;
          }
        } else {
          ak.field_e = var1;
          ad.a(0, new int[10], true);
          ad.a(1, new int[6], true);
          ad.a(2, new int[2], true);
          ad.a(3, new int[3], true);
          ad.a(4, new int[2], true);
          ad.a(5, new int[2], true);
          ad.a(6, new int[2], true);
          ad.a(7, new int[2], true);
          var2 = a.field_b.field_q + a.field_b.field_r + 4;
          if (param0 != -5695) {
            return;
          } else {
            qi.field_a[6] = a.field_b.field_q + (a.field_b.field_p + 200) - -var2;
            b.field_c[6] = var2 * 2 + 24;
            return;
          }
        }
    }

    public static void b(int param0) {
        int var1 = 108 / ((param0 - 27) / 57);
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_b = "Open in popup window";
    }
}
