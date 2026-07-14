/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static String field_e;
    static int field_b;
    static tk field_a;
    static vh field_d;
    static boolean field_c;

    final static double[] a(int param0, double[] param1, double[] param2) {
        if (param0 != 2) {
            lf.a(-30, (byte) -80);
        }
        return new double[]{-(param1[1] * param2[2]) + param2[1] * param1[2], -(param1[2] * param2[0]) + param2[2] * param1[0], -(param2[1] * param1[0]) + param1[1] * param2[0]};
    }

    final static void a(int param0, byte param1) {
        jd.field_b = param0;
        if (param1 <= 74) {
            field_d = null;
        }
    }

    final static void a(java.math.BigInteger param0, byte[] param1, java.math.BigInteger param2, ge param3, int param4, int param5, int param6) {
        int var9 = 0;
        int var7 = w.a(8, param4);
        if (!(null != cb.field_a)) {
            cb.field_a = new java.security.SecureRandom();
        }
        int[] var14 = new int[4];
        int[] var13 = var14;
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var8 = var11;
        for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = cb.field_a.nextInt();
        }
        if (null != gd.field_f) {
            // if_icmpgt L98
        } else {
            gd.field_f = new ge(var7);
        }
        gd.field_f.field_v = 0;
        gd.field_f.a(param1, (byte) 0, param5, param4);
        gd.field_f.b(var7, (byte) -8);
        gd.field_f.a(32052, var14);
        if (il.field_b != null) {
            // if_icmpgt L171
        } else {
            il.field_b = new ge(100);
        }
        il.field_b.field_v = 0;
        il.field_b.a(10, false);
        int var10 = param6;
        var9 = var10;
        while (var10 < 4) {
            il.field_b.a(true, var14[var10]);
            var10++;
        }
        il.field_b.a((byte) -81, param4);
        il.field_b.a(param2, 116, param0);
        param3.a(il.field_b.field_t, (byte) 0, 0, il.field_b.field_v);
        param3.a(gd.field_f.field_t, (byte) 0, 0, gd.field_f.field_v);
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 != 112) {
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "You have been removed from <%0>'s game.";
        field_c = true;
    }
}
