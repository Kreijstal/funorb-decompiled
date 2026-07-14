/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static gh field_j;
    static int[] field_c;
    static int[][] field_e;
    static int[] field_k;
    static int[] field_f;
    static cn field_i;
    static int field_l;
    static int field_a;
    static int[] field_d;
    static boolean field_g;
    static String[][] field_h;
    static int[] field_b;

    public static void a(boolean param0) {
        field_h = null;
        field_j = null;
        field_d = null;
        field_i = null;
        field_k = null;
        field_b = null;
        field_c = null;
        if (param0) {
            return;
        }
        field_e = null;
        field_f = null;
    }

    final static void a(boolean param0, int param1) {
        int var3 = SteelSentinels.field_G;
        if (!param0) {
            boolean discarded$0 = uc.a(-115, 79);
        }
        tc var4 = (tc) (Object) ic.field_B.e(13058);
        while (var4 != null) {
            vh.a(param1, var4, (byte) 107);
            var4 = (tc) (Object) ic.field_B.a((byte) -53);
        }
        kf var5 = (kf) (Object) je.field_w.e(13058);
        while (var5 != null) {
            ma.a(param1, var5, -2864);
            var5 = (kf) (Object) je.field_w.a((byte) -40);
        }
    }

    final static void a(wk[] param0, int param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = SteelSentinels.field_G;
        if (param0 != null) {
            if (!(param1 > 0)) {
                return;
            }
            var5 = param0[0].field_z;
            var6 = param0[2].field_z;
            var7 = param0[1].field_z;
            param0[0].a(param4, param2);
            param0[2].a(param1 + (param4 - var6), param2);
            pb.b(aj.field_v);
            pb.h(param4 + var5, param2, param4 + param1 + -var6, param0[1].field_B + param2);
            var8 = var5 + param4;
            var9 = param4 + param1 + -var6;
            param4 = var8;
            if (param3 != -39) {
                return;
            }
            while (param4 < var9) {
                param0[1].a(param4, param2);
                param4 = param4 + var7;
            }
            pb.a(aj.field_v);
            return;
        }
    }

    final static boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = SteelSentinels.field_G;
        if (!nk.f((byte) -125)) {
            if (oc.a(param0, -105, true)) {
                return false;
            }
        }
        if (!(!t.a(fe.field_D, param0, -20370))) {
            return true;
        }
        int[] var7 = dn.field_bc;
        int[] var2 = var7;
        if (param1 != -3958) {
            Object var6 = null;
            uc.a((wk[]) null, 91, -31, (byte) -121, -77);
        }
        for (var3 = 0; var3 < var7.length; var3++) {
            var4 = var7[var3];
            if (!(var4 != param0)) {
                return true;
            }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[23][];
        field_c = new int[23];
        field_k = new int[23];
        field_d = new int[23];
        field_f = new int[23];
        km.a((byte) -44, 460, new int[9], 180, 30, 160, 0);
        km.a((byte) -44, 460, new int[7], 180, 30, 200, 1);
        km.a((byte) -44, 460, new int[8], 180, 30, 200, 2);
        km.a((byte) -44, 460, new int[8], 180, 30, 200, 3);
        km.a((byte) -44, 460, new int[7], 180, 30, 200, 4);
        km.a((byte) -44, 460, new int[4], 180, 30, 406, 5);
        km.a((byte) -44, 460, new int[4], 180, 30, 406, 6);
        km.a((byte) -44, 0, new int[4], 0, 0, 0, 7);
        km.a((byte) -44, 460, new int[4], 180, 30, 406, 8);
        km.a((byte) -44, 460, new int[4], 180, 30, 406, 9);
        km.a((byte) -44, 460, new int[2], 180, 30, 400, 10);
        km.a((byte) -44, 460, new int[1], 290, 30, 400, 11);
        km.a((byte) -44, 460, new int[0], 180, 30, 200, 12);
        km.a((byte) -44, 0, new int[4], 0, 0, 0, 13);
        km.a((byte) -44, 0, new int[4], 0, 0, 0, 14);
        km.a((byte) -44, 460, new int[6], 180, 30, 400, 15);
        km.a((byte) -44, 460, new int[1], 180, 30, 400, 16);
        km.a((byte) -44, 460, new int[13], 180, 30, 140, 17);
        km.a((byte) -44, 0, new int[0], 0, 0, 0, 18);
        km.a((byte) -44, 0, new int[24], 0, 30, 0, 19);
        km.a((byte) -44, 0, new int[7], 0, 30, 0, 20);
        km.a((byte) -44, 460, new int[1], 180, 30, 200, 21);
        km.a((byte) -44, 460, new int[6], 180, 30, 200, 22);
        field_h = new String[][]{new String[3], new String[3]};
    }
}
