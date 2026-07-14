/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends wl {
    boolean field_i;
    int field_j;
    int[] field_l;
    static o[] field_k;

    public static void a(int param0) {
        if (param0 != 10615) {
            return;
        }
        field_k = null;
    }

    final static void a(byte param0, byte[] param1, int[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = wizardrun.field_H;
        if (param0 >= -91) {
            Object var8 = null;
            te.a((byte) 19, (byte[]) null, (int[]) null, 2, 7);
        }
        for (var5 = 0; var5 < id.field_b.length; var5++) {
            param4 = id.field_b[var5];
            var6 = var5 << 976761508;
            while (true) {
                param4--;
                if (-1 == (param4 ^ -1)) {
                    break;
                }
                var6++;
                param3 = cb.field_e[var6];
                param2[param1[param3]] = param2[param1[param3]] + 1;
                cb.field_e[param2[param1[param3]]] = param3;
            }
        }
    }

    te() {
        ((te) this).field_i = false;
    }

    static {
    }
}
