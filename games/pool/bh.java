/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static vh field_b;
    static String field_c;
    static jg field_a;
    static String field_d;

    final static void a(so[] param0, boolean param1, int param2, int param3, eg param4, int param5, int param6) {
        eg var8 = null;
        int[] var19 = null;
        int[] var14 = null;
        int[] var10 = null;
        int[] var7 = null;
        int[] var20 = null;
        int[] var16 = null;
        int[] var12 = null;
        try {
            var8 = a.a(true, new eg(param4, false, false, false, false));
            var19 = mj.a(-31121);
            var19[0] = param5;
            var19[1] = param2;
            var19[2] = param3;
            param0[0 + param6] = hc.a(new eg(param4, false, false, false, false), var19, (byte) 101);
            var14 = mj.a(-31121);
            var10 = var14;
            var7 = var10;
            var14[2] = param3;
            var7[1] = -param2;
            var14[0] = param5;
            param0[param6 - -1] = hc.a(new eg(var8, false, false, param1, false), var14, (byte) 101);
            var20 = mj.a(-31121);
            var20[0] = param5;
            var20[1] = param2;
            var20[2] = param3;
            dq.a((byte) 53, var20);
            param0[param6 + 2] = hc.a(new eg(param4, false, false, false, false), var20, (byte) 101);
            var16 = mj.a(-31121);
            var12 = var16;
            var7 = var12;
            var16[2] = param3;
            var7[1] = -param2;
            var16[0] = param5;
            dq.a((byte) -115, var16);
            param0[param6 + 3] = hc.a(var8, var16, (byte) 101);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "bh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(boolean param0) {
        String var2 = (String) null;
        rf.a((String) null, -128, re.field_d);
        if (param0) {
            field_a = (jg) null;
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
        field_d = "You are on your last life!";
        field_c = "No spectators";
    }
}
