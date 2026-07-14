/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static String field_m;
    static String field_e;
    private ul field_b;
    static String field_c;
    static vk field_k;
    private f field_i;
    static int field_h;
    static int[] field_f;
    static String field_d;
    static boolean field_g;
    private ul field_l;
    static String field_j;
    private f field_a;

    final jd a(int param0, byte param1, int[] param2) {
        if (1 == ((me) this).field_l.c(-1)) {
            return this.a(0, param0, false, param2);
        }
        if (-2 == (((me) this).field_l.d(param0, -2) ^ -1)) {
            return this.a(param0, 0, false, param2);
        }
        if (param1 != -64) {
            Object var5 = null;
            sl discarded$0 = me.a((byte[]) null, false);
        }
        throw new RuntimeException();
    }

    final jd a(int param0, int[] param1, int param2) {
        if (!(((me) this).field_b.c(-1) != 1)) {
            return this.a(-1991540092, param1, 0, param0);
        }
        if (param2 <= 99) {
            field_c = null;
        }
        if (!(((me) this).field_b.d(param0, -2) != 1)) {
            return this.a(-1991540092, param1, param0, 0);
        }
        throw new RuntimeException();
    }

    final static bo a(int param0, java.applet.Applet param1) {
        int var5 = 0;
        bo var6 = null;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        String var2 = ec.a(param1, (byte) 112, "jagex-last-login-method");
        if (!(var2 != null)) {
            return wi.field_h;
        }
        bo[] var3 = io.a(true);
        int var4 = 53 % ((param0 - 52) / 37);
        for (var5 = 0; var5 < var3.length; var5++) {
            var6 = var3[var5];
            if (!(!var6.a(var2, (byte) -107))) {
                return var6;
            }
        }
        return wi.field_h;
    }

    public static void a(byte param0) {
        field_m = null;
        field_d = null;
        if (param0 != 119) {
            me.a((byte) -96);
        }
        field_f = null;
        field_e = null;
        field_c = null;
        field_j = null;
        field_k = null;
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = on.a(param2, -18924);
        int var4 = wn.a(-126, param2);
        int var5 = on.a(param0, -18924);
        if (param1 != -2106461552) {
            return null;
        }
        int var6 = wn.a(-127, param0);
        int var7 = (int)((long)var3 * (long)var5 >> 1988394960);
        int var8 = (int)((long)var3 * (long)var6 >> 1889680848);
        int var9 = (int)((long)var5 * (long)var4 >> -1063871984);
        int var10 = (int)((long)var6 * (long)var4 >> -2106461552);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static sl a(byte[] param0, boolean param1) {
        if (param0 == null) {
            return null;
        }
        sl var2 = new sl(param0, k.field_i, qj.field_o, oq.field_w, vj.field_p, tp.field_t, qp.field_t);
        if (!param1) {
            field_h = -18;
        }
        fd.h((byte) 126);
        return var2;
    }

    private final jd a(int param0, int param1, boolean param2, int[] param3) {
        ac var9_ref = null;
        int var5 = ((536875007 & param0) << 1153577700 | param0 >>> -1105277716) ^ param1;
        var5 = var5 | param0 << -1460177968;
        if (param2) {
            field_h = -103;
        }
        long var6 = 4294967296L ^ (long)var5;
        jd var8 = (jd) (Object) ((me) this).field_a.a(0, var6);
        if (var8 != null) {
            return var8;
        }
        if (param3 != null) {
            if (-1 <= (param3[0] ^ -1)) {
                return null;
            }
        }
        ac var9 = (ac) (Object) ((me) this).field_i.a(0, var6);
        if (var9 == null) {
            var9_ref = ac.a(((me) this).field_l, param0, param1);
            if (var9_ref == null) {
                return null;
            }
            ((me) this).field_i.a(!param2 ? true : false, var6, (br) (Object) var9_ref);
        }
        jd var8_ref = var9_ref.a(param3);
        if (var8_ref == null) {
            return null;
        }
        var9_ref.a(!param2 ? true : false);
        ((me) this).field_a.a(true, var6, (br) (Object) var8_ref);
        return var8_ref;
    }

    private final jd a(int param0, int[] param1, int param2, int param3) {
        int var5 = (param2 << -1991540092 & 65526 | param2 >>> 871629708) ^ param3;
        var5 = var5 | param2 << -376634288;
        long var6 = (long)var5;
        jd var8 = (jd) (Object) ((me) this).field_a.a(0, var6);
        if (var8 != null) {
            return var8;
        }
        if (param1 != null) {
            if ((param1[0] ^ -1) >= -1) {
                return null;
            }
        }
        jc var9 = jc.a(((me) this).field_b, param2, param3);
        if (var9 == null) {
            return null;
        }
        jd var10 = var9.a();
        jd var8_ref = var10;
        ((me) this).field_a.a(true, var6, (br) (Object) var8_ref);
        if (param1 != null) {
            param1[0] = param1[0] - var10.field_h.length;
        }
        if (param0 != -1991540092) {
            return null;
        }
        return var8_ref;
    }

    me(ul param0, ul param1) {
        ((me) this).field_i = new f(256);
        ((me) this).field_a = new f(256);
        ((me) this).field_b = param0;
        ((me) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Refuse to believe. The truth is in here.";
        field_f = new int[]{};
        field_c = "Block their path.";
        field_d = "Kick";
        field_e = "Unpacking music";
        field_j = "Expert";
    }
}
