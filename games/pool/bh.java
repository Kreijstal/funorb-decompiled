/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static vh field_b;
    static String field_c;
    static jg field_a;
    static String field_d;

    final static void a(so[] param0, boolean param1, int param2, int param3, eg param4, int param5, int param6) {
        eg var8 = a.a(true, new eg(param4, false, false, false, false));
        int[] var21 = mj.a(-31121);
        var21[0] = param5;
        var21[1] = param2;
        var21[2] = param3;
        param0[0 + param6] = hc.a(new eg(param4, false, false, false, false), var21, (byte) 101);
        int[] var22 = mj.a(-31121);
        int[] var18 = var22;
        int[] var14 = var18;
        int[] var10 = var14;
        int[] var7 = var10;
        var22[2] = param3;
        var7[1] = -param2;
        var22[0] = param5;
        param0[param6 - -1] = hc.a(new eg(var8, false, false, param1, false), var22, (byte) 101);
        int[] var23 = mj.a(-31121);
        var23[0] = param5;
        var23[1] = param2;
        var23[2] = param3;
        int[] discarded$0 = dq.a((byte) 53, var23);
        param0[param6 + 2] = hc.a(new eg(param4, false, false, false, false), var23, (byte) 101);
        int[] var24 = mj.a(-31121);
        int[] var20 = var24;
        int[] var16 = var20;
        int[] var12 = var16;
        var7 = var12;
        var24[2] = param3;
        var7[1] = -param2;
        var24[0] = param5;
        int[] discarded$1 = dq.a((byte) -115, var24);
        param0[param6 + 3] = hc.a(var8, var24, (byte) 101);
    }

    final static void b(boolean param0) {
        Object var2 = null;
        rf.a((String) null, -128, re.field_d);
        if (param0) {
            field_a = null;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0) {
            bh.a(true);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You are on your last life!";
        field_c = "No spectators";
    }
}
