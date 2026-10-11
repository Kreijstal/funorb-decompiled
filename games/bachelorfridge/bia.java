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
        int var1 = 10 / ((param0 + 27) / 54);
        field_i = null;
        field_h = null;
        field_g = null;
        field_f = null;
    }

    final static void a(byte param0, long param1, int param2) {
        pf var4 = null;
        int var5 = 0;
        pf var4Lifetime1;
        int var5Lifetime1;
        if (param0 >= 23) {
          var4 = sja.field_fb;
          var4.c(param2, (byte) 116);
          var4.field_g = var4.field_g + 1;
          var5 = var4.field_g;
          var4.d(6, 0);
          var4.b(1686281208, param1);
          var4.b((byte) -60, var4.field_g - var5);
          return;
        }
        field_h = (kv[]) null;
        var4Lifetime1 = sja.field_fb;
        var4Lifetime1.c(param2, (byte) 116);
        var4Lifetime1.field_g = var4Lifetime1.field_g + 1;
        var5Lifetime1 = var4Lifetime1.field_g;
        var4Lifetime1.d(6, 0);
        var4Lifetime1.b(1686281208, param1);
        var4Lifetime1.b((byte) -60, var4Lifetime1.field_g - var5Lifetime1);
    }

    static {
        field_i = new ws();
        field_f = new boolean[]{true, true, false, false, false, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, true, false, false, false, false, true, true, false, true, true, false};
    }
}
