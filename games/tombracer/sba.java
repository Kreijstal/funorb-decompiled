/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sba extends ci {
    static String field_o;
    static String field_n;
    static String field_m;

    public static void c(int param0) {
        if (param0 != -14063) {
            return;
        }
        field_n = null;
        field_m = null;
        field_o = null;
    }

    final int[][] b(int param0, int param1) {
        int[][] var19 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        int[][] var20 = ((sba) this).field_h.a(param0, (byte) -104);
        int[][] var15 = var20;
        int[][] var13 = var15;
        int[][] var3 = var13;
        if (param1 != -1) {
            return null;
        }
        if (!(!((sba) this).field_h.field_f)) {
            var19 = ((sba) this).a(param0, 0, -1);
            var21 = var19[0];
            var22 = var19[1];
            var23 = var19[2];
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            for (var11 = 0; var11 < ns.field_g; var11++) {
                var8[var11] = -var21[var11] + 4096;
                var9[var11] = -var22[var11] + 4096;
                var10[var11] = 4096 - var23[var11];
            }
        }
        return var13;
    }

    final static hja d(byte param0) {
        if (param0 <= 80) {
            field_n = null;
        }
        hja var1 = new hja(ika.field_a, kba.field_s, ak.field_p[0], pg.field_C[0], mq.field_b[0], iga.field_m[0], ck.field_c[0], mga.field_g);
        loa.a((byte) 127);
        return var1;
    }

    public sba() {
        super(1, false);
    }

    final void a(byte param0, uia param1, int param2) {
        if (param2 == 0) {
            ((sba) this).field_g = -2 == (param1.h(255) ^ -1) ? true : false;
        }
        if (param0 != 107) {
            field_n = null;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
            field_m = null;
        }
        int[] var7 = ((sba) this).field_i.a((byte) 63, param1);
        int[] var3 = var7;
        if (((sba) this).field_i.field_d) {
            var4 = ((sba) this).c(0, -106, param1);
            for (var5 = 0; ns.field_g > var5; var5++) {
                var7[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Reload game";
        field_o = "Named after their discoverer, these hotheads are incandescent with rage - as well as blazing masses of flame.";
        field_m = "You appear to be telling someone your password - please don't!";
    }
}
