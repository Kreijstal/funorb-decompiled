/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static aa field_e;
    static String field_a;
    static volatile boolean field_c;
    static int field_d;
    static String field_f;
    static int[] field_b;

    public static void b(int param0) {
        field_b = null;
        if (param0 != -2069072125) {
            return;
        }
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final static void a(int param0) {
        qj var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var1 = ii.field_r[39];
        var2 = 40;
        var3 = 0;
        if (param0 == 208) {
          L0: while (true) {
            if (mb.field_d.length <= var3) {
              ia.field_b.a(-91);
              return;
            } else {
              mb.field_d[var3] = new qj(var2, var2);
              mb.field_d[var3].a();
              var1.a(208, 208, var2 << -673407325, var2 << -2069072125, (int)(0.5 + 16384.0 * (double)var3 / 26.0), 4096);
              var3++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_f = "All";
        field_c = false;
        field_e = new aa(1, 2, 2, 0);
    }
}
