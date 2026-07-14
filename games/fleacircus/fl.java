/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_d;
    private int[] field_a;
    static ak field_e;
    static boolean field_f;
    static dd field_b;
    static char[][] field_c;

    final static void a(boolean param0, boolean param1, String param2, int param3) {
        fh.a(-55);
        if (param3 != -22175) {
            return;
        }
        nb.field_a.i(param3 ^ 22250);
        lg.field_b = new ul(aa.field_s, (String) null, jg.field_d, param1, param0);
        ak.field_a = new ui(nb.field_a, (qa) (Object) lg.field_b);
        nb.field_a.b((qa) (Object) ak.field_a, (byte) -35);
    }

    final static void a(byte param0, rh param1) {
        if (param0 < 90) {
            Object var3 = null;
            fl.a((byte) 103, (rh) null);
        }
        hk.b(param1.a(0, "", "headers.packvorbis"));
        hk var2 = hk.a(param1, "jagex logo2.packvorbis", "");
        sf discarded$0 = var2.b();
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_b = null;
        if (param0 != 26113) {
            return;
        }
        field_d = null;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = fleas.field_A ? 1 : 0;
          var3 = (((fl) this).field_a.length >> -491016159) - 1;
          if (param1 > 114) {
            break L0;
          } else {
            int discarded$2 = ((fl) this).a(82, (byte) 96);
            break L0;
          }
        }
        var4 = param0 & var3;
        L1: while (true) {
          var5 = ((fl) this).field_a[1 + var4 + var4];
          if ((var5 ^ -1) != 0) {
            if (param0 == ((fl) this).field_a[var4 + var4]) {
              return var5;
            } else {
              var4 = var3 & 1 + var4;
              continue L1;
            }
          } else {
            return -1;
          }
        }
    }

    fl(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= (param0.length >> 1430897505) + param0.length) {
            var2 = var2 << 1;
        }
        ((fl) this).field_a = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((fl) this).field_a[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3] & -1 + var2;
            while ((((fl) this).field_a[1 + (var4 + var4)] ^ -1) != 0) {
                var4 = 1 + var4 & -1 + var2;
            }
            ((fl) this).field_a[var4 + var4] = param0[var3];
            ((fl) this).field_a[var4 + var4 - -1] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0>The entrance:<%1> the fleas will fall from the bottom of this after a short delay at the start of each level.";
        field_e = new ak();
        field_f = true;
        field_c = new char[40][21];
    }
}
