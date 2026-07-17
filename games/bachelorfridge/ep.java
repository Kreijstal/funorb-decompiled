/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends pu {
    static int[] field_l;
    static int field_m;

    final static void a(byte param0, jfa param1, boolean param2, int param3, int[] param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        if (bp.e(-29919)) {
            return;
        }
        sja.field_fb.c(88, (byte) 114);
        sja.field_fb.field_g = sja.field_fb.field_g + 2;
        int var5_int = sja.field_fb.field_g;
        rha.a(param1.field_g, (lu) (Object) sja.field_fb, (byte) -119);
        sja.field_fb.d(param2 ? 1 : 0, 0);
        sja.field_fb.d(param3, 0);
        int[] var6 = param4;
        if (param0 != 42) {
            return;
        }
        try {
            for (var7 = 0; var6.length > var7; var7++) {
                var8 = var6[var7];
                sja.field_fb.d(var8, 0);
            }
            sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var5_int);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ep.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1) {
        la.field_r = param0;
        if (param1 != 8192) {
            ep.a(true, 42, 63);
        }
    }

    public static void b(int param0) {
        field_l = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        pf var3 = null;
        var3 = sja.field_fb;
        var3.c(param1, (byte) 107);
        var3.d(3, 0);
        var3.d(8, 0);
        if (param0) {
          return;
        } else {
          var3.b(param2, -123);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[8192];
        field_m = 0;
    }
}
