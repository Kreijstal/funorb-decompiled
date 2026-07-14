/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hta extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_o = -94;
        }
        return new nc((Object) (Object) frb.a(70, 121));
    }

    final static int[] a(String param0, boolean param1, boolean param2) {
        int var4_int = 0;
        int[] var17 = null;
        int[] var15 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int var5 = 0;
        int var7 = VoidHunters.field_G;
        byte[] var16 = ps.a(param0, 1);
        byte[] var14 = var16;
        byte[] var12 = var14;
        byte[] var10 = var12;
        byte[] var9 = var10;
        byte[] var3 = var9;
        if (var9 == null) {
            return null;
        }
        if (!param2) {
            Object var8 = null;
            int[] discarded$0 = hta.a((String) null, false, false);
        }
        if (!(!param1)) {
            var16 = var14;
            if ((var16.length ^ -1) > -2) {
                return null;
            }
            var4_int = var16[0];
            if (var4_int > tcb.field_p) {
                return null;
            }
            var17 = new int[-1 + var16.length];
            var15 = var17;
            var13 = var15;
            var11 = var13;
            var5_ref_int__ = var11;
            for (var6 = 0; var6 < var17.length; var6++) {
                var5_ref_int__[var6] = var9[1 + var6];
            }
            return var5_ref_int__;
        }
        var16 = var14;
        int[] var4 = new int[var16.length];
        for (var5 = 0; var5 < var16.length; var5++) {
            var4[var5] = var16[var5];
        }
        return var4;
    }

    hta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 51;
    }
}
