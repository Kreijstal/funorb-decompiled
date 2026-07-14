/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends mf {
    static String field_i;
    static int[] field_h;
    static bi[] field_j;

    final static jb a(int param0, boolean param1, boolean param2, int param3) {
        bd var8 = null;
        bd var9 = null;
        jb var7 = new jb(3);
        var7.field_m = param1 ? true : false;
        var7.field_b = 215;
        var7.field_k = 520;
        var7.field_s = 62;
        var7.field_c = 81;
        var7.field_l = param3;
        int var5 = 20 + (var7.field_c + var7.field_b);
        if (tj.a(true)) {
            var8 = new bd(16, ba.field_Q, (ok) (Object) pn.field_a);
            var8.field_j = 320 + -(var8.field_f / 2);
            var8.field_b = var5;
            var7.a((byte) -61, var8);
            var5 += 40;
        }
        if (bj.field_m) {
            var9 = new bd(11, rn.field_d, (ok) (Object) pn.field_a);
            var9.field_b = var5;
            var9.field_j = 320 - var9.field_f / 2;
            var5 += 40;
            var7.a((byte) -120, var9);
        }
        bd var10 = new bd(14, fl.field_b, (ok) (Object) pn.field_a);
        var10.field_j = -(var10.field_f / 2) + param0;
        var10.field_b = var5;
        var7.a((byte) -111, var10);
        var7.a(param2, 26206, 0);
        return var7;
    }

    final String a(String param0, boolean param1) {
        if (((bk) this).a((byte) -126, param0) == fb.field_e) {
            return ml.field_c;
        }
        if (!param1) {
            return null;
        }
        return si.field_d;
    }

    final fi a(byte param0, String param1) {
        int var3 = null == nl.a(0, param1) ? 1 : 0;
        if (param0 > -44) {
            return null;
        }
        if (!(var3 != 0)) {
            return fb.field_e;
        }
        return nn.field_q;
    }

    public static void e(int param0) {
        field_i = null;
        field_h = null;
        if (param0 != 62) {
            return;
        }
        field_j = null;
    }

    bk(ul param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<col=FFFFFF>Other missiles:</col> awarded at random whenever nothing else is due.";
        field_j = new bi[4];
        field_h = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1};
    }
}
