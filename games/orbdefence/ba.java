/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    int field_f;
    static e field_a;
    static hj field_e;
    static int field_c;
    static String field_g;
    int field_d;
    static im field_b;

    final static qg[] a(int param0) {
        int var2 = 0;
        int var3 = OrbDefence.field_D ? 1 : 0;
        qg[] var1 = new qg[ec.field_K];
        for (var2 = 0; ec.field_K > var2; var2++) {
            var1[var2] = new qg(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], fl.field_a[var2], vc.field_g);
        }
        md.a((byte) -127);
        return var1;
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            i.field_a = new hj(640, 58);
            hc.field_i = new hj(640, 122);
            i.field_a.d();
            ul.h(3, 3, 634, 50, 0);
            ul.h(65, 3, 511, 50, 10359);
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                ul.e(150, 2, 50, 8947848, 32);
                ul.e(151, 2, 50, 8947848, 32);
                ul.e(256, 2, 50, 8947848, 32);
                ul.e(257, 2, 50, 8947848, 32);
                ul.e(390, 2, 50, 8947848, 32);
                ul.e(391, 2, 50, 8947848, 32);
                gk.field_a.e(2, 2, 636, 50, 32);
                ul.d(3, 53, 634, 0);
                ul.d(2, 54, 636, 13749446);
                ul.d(1, 55, 638, 13749446);
                ul.d(2, 56, 636, 13749446);
                ul.d(3, 57, 634, 0);
                ul.e(0, 0, 150, 480);
                dh.field_X.c(-(dh.field_X.field_s / 2) + 295, 0);
                ul.e(200, 0, 300, 480);
                dh.field_X.c(-(dh.field_X.field_s / 2) + 320, 0);
                ul.e(300, 0, 640, 480);
                dh.field_X.c(210 + -(dh.field_X.field_s / 2), 0);
                ul.c();
                ob.field_I.a(gb.field_e, 85, 30, 16777215, -1);
                jd.field_c.a(cf.field_g, 200, 40, 16777215, -1);
                ob.field_I.a(nh.field_a, 339, 30, 16777215, -1);
                ul.e(0, 0, 640, 2);
                ul.a(0, 0, 640, 480, 11184810, 4605510);
                cb.field_a.a(-40);
                hc.field_i.d();
                ul.a(3, 2, 634, 117, 0, 10359);
                ul.e(0, 120, 640, 480);
                ul.a(0, -358, 640, 480, 11184810, 4605510);
                ul.c();
                ug.a(63, 39, 172, 72, 295);
                ug.a(42, 0, 2, 120, 175);
                ug.a(42, 0, 462, 120, 176);
                ul.a(468, 6, 164, 24, 5132630, 1644825);
                ul.d(468, 6, 164, 24, 8947848);
                cb.field_a.a(-40);
                break L0;
              } else {
                ul.e(320 + var1_int, 3, 50, 0, var1_int * var1_int >> 8);
                ul.e(-var1_int + 320, 3, 50, 0, var1_int * var1_int >> 8);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "ba.A(" + -27 + ')');
        }
    }

    public static void b() {
        field_b = null;
        field_g = null;
        field_e = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ba(int param0, int param1, int param2, int param3) {
        ((ba) this).field_f = param3;
        ((ba) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_a = new e();
        field_b = new im();
    }
}
