/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static ti field_a;
    static hi field_b;

    final static void a(byte param0, float param1, String param2) {
        ea.field_n = param2;
        int var3 = -91 / ((param0 - -66) / 55);
        ah.field_a = param1;
    }

    final static void a(pg param0, int param1, int param2, int param3) {
        dg.field_b = param2;
        if (param3 <= 96) {
            vf.a(false);
            tj.field_y = param1;
            kf.field_i = param0;
            return;
        }
        tj.field_y = param1;
        kf.field_i = param0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            vf.b(false);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void b(boolean param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        var5 = mh.field_b;
        var1 = var5;
        var2 = 0;
        var3 = var5.length;
        L0: while (true) {
          if (var3 <= var2) {
            if (!param0) {
              field_a = null;
              return;
            } else {
              return;
            }
          } else {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new hi();
    }
}
