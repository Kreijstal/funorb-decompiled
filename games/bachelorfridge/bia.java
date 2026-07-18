/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bia extends bw {
    static ws field_i;
    static kv[] field_h;
    static eaa field_g;
    static boolean[] field_f;

    bia() {
    }

    public static void a(int param0) {
        int var1 = 10;
        field_i = null;
        field_h = null;
        field_g = null;
        field_f = null;
    }

    final static void a(byte param0, long param1, int param2) {
        pf var4 = null;
        int var5 = 0;
        if (param0 < 23) {
          field_h = null;
          var4 = sja.field_fb;
          var4.c(param2, (byte) 116);
          var4.field_g = var4.field_g + 1;
          var5 = var4.field_g;
          var4.d(6, 0);
          var4.b(1686281208, param1);
          var4.b((byte) -60, var4.field_g + -var5);
          return;
        } else {
          var4 = sja.field_fb;
          var4.c(param2, (byte) 116);
          var4.field_g = var4.field_g + 1;
          var5 = var4.field_g;
          var4.d(6, 0);
          var4.b(1686281208, param1);
          var4.b((byte) -60, var4.field_g + -var5);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ws();
        field_f = new boolean[]{true, true, false, false, false, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, true, false, false, false, false, true, true, false, true, true, false};
    }
}
