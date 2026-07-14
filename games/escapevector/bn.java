/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static qj field_a;
    static volatile long field_c;
    static ed[] field_d;
    static int field_b;

    public static void a(boolean param0) {
        Object var2 = null;
        field_a = null;
        if (!param0) {
          var2 = null;
          bn.a(-123, (n) null, (n) null, (java.math.BigInteger) null, (java.math.BigInteger) null);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final static void a(int param0, n param1, n param2, java.math.BigInteger param3, java.math.BigInteger param4) {
        gb.a(param4, false, param3, param2.field_g, param1, param2.field_m, param0);
    }

    final static void a(ed[] param0, int param1) {
        int var3 = 0;
        ci var4 = null;
        int var5 = 0;
        ed var6 = null;
        int var7 = EscapeVector.field_A;
        if (!(jb.field_l != null)) {
            return;
        }
        ci[] var8 = jb.field_l;
        ci[] var2 = var8;
        for (var3 = param1; var8.length > var3; var3++) {
            var4 = var8[var3];
            var5 = var4.field_b;
            var6 = param0[var5];
            var4.field_e = var6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new qj(0, 0);
        field_c = 0L;
        field_b = 0;
    }
}
