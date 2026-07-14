/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tw {
    static kv[] field_c;
    static String field_d;
    static String field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 < 44) {
            field_b = null;
        }
    }

    final static void a(int param0, jfa param1, int param2) {
        if (!(!bp.e(-29919))) {
            return;
        }
        sja.field_fb.c(91, (byte) 104);
        sja.field_fb.field_g = sja.field_fb.field_g + 2;
        int var3 = sja.field_fb.field_g;
        sja.field_fb.d(param0, 0);
        rha.a(param1.field_g, (lu) (Object) sja.field_fb, (byte) -81);
        int var4 = 21 / ((param2 - 3) / 60);
        sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var3);
    }

    final static cq a(je param0, byte param1) {
        cq var2 = null;
        var2 = new cq(param0, (bw) (Object) param0);
        if (param1 != -36) {
          field_d = null;
          rma.field_d.a((bw) (Object) var2, true);
          saa.field_a.a((tda) (Object) param0);
          return var2;
        } else {
          rma.field_d.a((bw) (Object) var2, true);
          saa.field_a.a((tda) (Object) param0);
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Rated game";
        field_b = "Sudden Death";
        field_a = new int[8192];
    }
}
