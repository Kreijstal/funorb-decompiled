/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static String field_d;
    static qf[] field_f;
    static String field_c;
    static String field_a;
    static ph field_e;
    static int[][] field_b;

    public static void a(boolean param0) {
        field_e = null;
        field_c = null;
        if (param0) {
          ra.a(false);
          field_d = null;
          field_a = null;
          field_b = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_b = null;
          field_f = null;
          return;
        }
    }

    final static void a(byte param0) {
        re.field_b = false;
        if (param0 != -108) {
            ra.a((byte) -36);
        }
    }

    final static void a(int param0, oi param1, int param2) {
        int var4 = 0;
        oq var5 = null;
        var5 = ej.field_j;
        var5.b(false, param0);
        var5.field_v = var5.field_v + 1;
        var4 = var5.field_v;
        var5.a(1, false);
        var5.a(param1.field_t, false);
        var5.c(-128, param1.field_l);
        var5.a(true, param1.field_u);
        var5.a(true, param1.field_m);
        var5.a(true, param1.field_s);
        var5.a(true, param1.field_p);
        int discarded$47 = var5.d(-1, var4);
        if (param2 > -23) {
          return;
        } else {
          var5.b(var5.field_v + -var4, true);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Show all game chat";
        field_d = "TAB - hide chat temporarily";
        field_a = "Create a free account to start using this feature";
        field_e = new ph();
    }
}
