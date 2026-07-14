/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends lj {
    static ll field_v;
    private Object field_w;

    final boolean e(int param0) {
        if (param0 != 10999) {
            return false;
        }
        return false;
    }

    public static void a(boolean param0) {
        field_v = null;
        if (param0) {
            field_v = null;
        }
    }

    final Object c(byte param0) {
        if (param0 != 103) {
            return null;
        }
        return ((hb) this).field_w;
    }

    final static boolean a(int param0, int[] param1, boolean param2) {
        if (param2) {
            Object var4 = null;
            boolean discarded$0 = hb.a(-21, (int[]) null, true);
        }
        return (param1[param0 >> 304338277] & 1 << (31 & param0)) != 0 ? true : false;
    }

    final static int a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        int var4 = -1;
        for (var5 = param0; var5 < param3; var5++) {
            var4 = var4 >>> 1042230088 ^ of.field_g[(param2[var5] ^ var4) & 255];
        }
        if (param1 >= -106) {
            field_v = null;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    hb(Object param0, int param1) {
        super(param1);
        ((hb) this).field_w = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new ll();
    }
}
