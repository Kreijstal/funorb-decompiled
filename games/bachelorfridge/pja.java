/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pja {
    static String field_c;
    static kv[] field_b;
    static int[] field_g;
    static be[][] field_a;
    static rp field_e;
    static kv[] field_d;
    static String field_f;

    public static void a(byte param0) {
        field_f = null;
        int var1 = -126 / ((param0 - -54) / 35);
        field_e = null;
        field_a = null;
        field_b = null;
        field_c = null;
        field_g = null;
        field_d = null;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -11204) {
            return;
        }
        bi.field_h.a(param1, 7802);
    }

    final static void a(byte param0, boolean param1) {
        gja.field_m.a(0, 0, 20077);
        if (param0 < 49) {
            pja.a((byte) 94, true);
        }
    }

    final static void a(boolean param0, int param1) {
        ph.field_E = param1 * 100 / 150;
        ph.field_G = 400 * param1 / 150;
        if (param0) {
          return;
        } else {
          ph.field_D = (param1 << -306306736) / 150;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = "Warning! <%0> will win in <%1> turns!";
        field_a = new be[10][9];
        field_g = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
            field_g[var0] = rn.c(40960, var0);
        }
        field_f = "Return to Main Menu";
    }
}
