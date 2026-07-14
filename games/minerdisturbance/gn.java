/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static String field_b;
    static String field_c;
    static String field_a;

    final static int a(int param0, byte[] param1, boolean param2) {
        if (!param2) {
            gn.a(4);
        }
        return qn.a(-1648911295, 0, param0, param1);
    }

    final static ea[] a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
            Object var5 = null;
            int discarded$0 = gn.a(-10, (byte[]) null, false);
        }
        return lc.a(param2, 1, param1, param0, (byte) 127);
    }

    final static vk[] a(int param0, vf param1) {
        int var5 = 0;
        vk var6 = null;
        int var7 = MinerDisturbance.field_ab;
        if (!(param1.b((byte) 104))) {
            return new vk[]{};
        }
        ia var8 = param1.a((byte) -114);
        if (param0 != -591) {
            field_b = null;
        }
        while (-1 == (var8.field_c ^ -1)) {
            gf.a(10L, param0 + -9718);
        }
        if (!((var8.field_c ^ -1) != -3)) {
            return new vk[]{};
        }
        int[] var12 = (int[]) var8.field_a;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        vk[] var4 = new vk[var12.length >> 989840002];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new vk();
            var4[var5] = var6;
            var6.field_f = var3[var5 << 1451436130];
            var6.field_c = var3[(var5 << -1048749150) - -1];
            var6.field_h = var3[2 + (var5 << -418419230)];
            var6.field_b = var3[(var5 << 1024740450) - -3];
        }
        return var4;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 28808) {
            Object var2 = null;
            gn.a((bj) null, (byte) 33);
        }
    }

    final static void a(bj param0, byte param1) {
        int var2 = 86 % ((param1 - -42) / 57);
        b.a(param0.a("", 0, "headers.packvorbis"));
        b var3 = b.a(param0, "jagex logo2.packvorbis", "");
        ji discarded$0 = var3.a();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Ranking: Worm Chow";
        field_c = "Unfortunately you are not eligible to create an account.";
        field_a = "Volcano";
    }
}
