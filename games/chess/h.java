/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends o {
    static String field_m;
    int field_p;
    int field_o;
    static int field_n;
    int field_l;
    int[] field_q;
    int field_j;
    int field_k;
    static lb field_s;
    int field_r;

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        ((h) this).field_l = param5;
        ((h) this).field_j = param0;
        ((h) this).field_k = param6;
        ((h) this).field_o = param7;
        ((h) this).field_r = param1;
        ((h) this).field_q = param3;
        if (param2 != 0) {
            return;
        }
        ((h) this).field_p = param4;
    }

    public static void a(int param0) {
        field_m = null;
        field_s = null;
        if (param0 != 1187598372) {
            Object var2 = null;
            h.a((byte[]) null, -55, 110, (int[]) null, 44);
        }
    }

    final static void a(int param0, int param1) {
        int var3 = Chess.field_G;
        if (param1 != 0) {
            return;
        }
        pg var4 = (pg) (Object) nd.field_h.g(-18110);
        while (var4 != null) {
            tm.a(false, var4, param0);
            var4 = (pg) (Object) nd.field_h.a((byte) -122);
        }
    }

    final static void a(byte[] param0, int param1, int param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Chess.field_G;
        for (var5 = 0; var5 < ge.field_eb.length; var5++) {
            param1 = ge.field_eb[var5];
            var6 = var5 << 1187598372;
            while (true) {
                param1--;
                if (param1 == 0) {
                    break;
                }
                var6++;
                param4 = ve.field_Hb[var6];
                param3[param0[param4]] = param3[param0[param4]] + 1;
                ve.field_Hb[param3[param0[param4]]] = param4;
            }
        }
        if (param2 != 1187598372) {
            h.a(104);
        }
    }

    h() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Mute this player for 48 hours";
    }
}
