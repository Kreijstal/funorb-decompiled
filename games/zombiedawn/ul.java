/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static boolean field_f;
    static long field_b;
    private lc field_a;
    private dj field_g;
    private dj field_c;
    static int field_d;
    static long field_e;

    final static void b(int param0, byte param1) {
        int var4 = ZombieDawn.field_J;
        int[] var2 = new int[1 + rc.field_u.length];
        int var3 = 0;
        if (param1 >= -65) {
            field_d = -16;
        }
        while (var3 < rc.field_u.length) {
            var2[var3] = rc.field_u[var3];
            var3++;
        }
        var2[var2.length - 1] = param0;
        rc.field_u = var2;
    }

    final static vn a(boolean param0, String param1) {
        oi var2 = bj.field_q;
        vn var3 = new vn(var2.b(param1), 27);
        var3.a();
        if (param0) {
            boolean discarded$0 = ul.a(-121, (byte) 5);
        }
        var2.a(param1, var3.field_w / 2, 17, 16777215, -1);
        return var3;
    }

    final dm a(int param0, int param1) {
        byte[] var4 = null;
        dm var3 = (dm) ((ul) this).field_a.a((long)param1, 1431655765);
        if (var3 != null) {
            return var3;
        }
        if (param1 < 32768) {
            var4 = ((ul) this).field_g.a((byte) 51, 1, param1);
        } else {
            var4 = ((ul) this).field_c.a((byte) 51, 1, param1 & 32767);
        }
        var3 = new dm();
        int var5 = 91 / ((-7 - param0) / 53);
        if (var4 != null) {
            var3.a(new de(var4), 0);
        }
        if (!(param1 < 32768)) {
            var3.d((byte) -76);
        }
        ((ul) this).field_a.a((long)param1, (Object) (Object) var3, -16709);
        return var3;
    }

    private ul() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, byte param1) {
        int var2 = 53 % ((param1 - -64) / 55);
        return param0 == (-param0 & param0) ? true : false;
    }

    static {
    }
}
