/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends vg implements bo {
    static String[] field_k;
    static int field_j;
    private int[] field_g;
    private int field_h;
    private int field_f;
    private int field_m;
    static oc[] field_l;
    static ur field_i;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = TombRacer.field_G ? 1 : 0;
        cq.field_a.a(108);
        for (var1 = 0; (var1 ^ -1) > -33; var1++) {
            eia.field_r[var1] = 0L;
        }
        if (param0 != -33) {
            Object var3 = null;
            pva discarded$0 = ea.a(70, -25, (String) null, (cka) null);
        }
        for (var1 = 0; var1 < 32; var1++) {
            bv.field_xb[var1] = 0L;
        }
        mt.field_a = 0;
    }

    final void a(int param0, int param1) {
        if (param0 != -2767) {
            return;
        }
        ((ea) this).field_f = param1;
    }

    final void a(int param0, byte param1) {
        if (param1 != -113) {
            return;
        }
        ((ea) this).field_m = param0;
    }

    public static void b(int param0) {
        field_i = null;
        if (param0 != 0) {
            field_j = -23;
        }
        field_k = null;
        field_l = null;
    }

    final void b(int param0, int param1) {
        if (param0 != 8469) {
            ((ea) this).a(-55, 80);
        }
        ((ea) this).field_h = param1;
    }

    public final void a(int param0, kh param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        param1.i(param0 + -192);
        param1.a((byte) 90, ((ea) this).field_m, 5);
        param1.a((byte) -128, ((ea) this).field_f, 8);
        param1.a((byte) 30, ((ea) this).field_h, 8);
        for (var3 = 0; ((ea) this).field_g.length > var3; var3++) {
            param1.a((byte) 3, uja.a(-113, ((ea) this).field_g[var3]), 7);
        }
        if (param0 != 200) {
            ea.b(-52);
        }
        param1.k(-1826190686);
    }

    final static void a(byte param0, int param1, uia param2, int param3, int param4) {
        param2.i(12, 0);
        param2.f(-1477662136, 17);
        param2.f(-1477662136, param3);
        param2.f(-1477662136, param4);
        int var5 = 33 % ((-57 - param0) / 48);
        param2.i(param1, 0);
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "C2SActionPacket hash:" + ((ea) this).field_f + " round:" + ((ea) this).field_m;
        for (var2 = 0; ((ea) this).field_g.length > var2; var2++) {
            var1 = var1 + " " + ((ea) this).field_g[var2];
        }
        return var1;
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -16838) {
            return;
        }
        era.field_e.b(param1 ^ -16792, param0);
        ada var2 = apa.field_c;
        if (var2 != null) {
            var2.b(-31, era.field_e.field_A, era.field_e.field_q);
        }
    }

    final static pva a(int param0, int param1, String param2, cka param3) {
        if (param0 != 17) {
            return null;
        }
        int var4 = jaggl.OpenGL.glGenProgramARB();
        jaggl.OpenGL.glBindProgramARB(param1, var4);
        jaggl.OpenGL.glProgramStringARB(param1, 34933, param2);
        jaggl.OpenGL.glGetIntegerv(34379, vf.field_b, 0);
        if (!(-1 == vf.field_b[0])) {
            jaggl.OpenGL.glBindProgramARB(param1, 0);
            return null;
        }
        jaggl.OpenGL.glBindProgramARB(param1, 0);
        return new pva(param3, param1, var4);
    }

    public final void a(kh param0, byte param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        param0.h((byte) 119);
        ((ea) this).field_m = param0.b((byte) 44, 5);
        ((ea) this).field_f = param0.b((byte) 44, 8);
        ((ea) this).field_h = param0.b((byte) 44, 8);
        for (var3 = 0; ((ea) this).field_g.length > var3; var3++) {
            ((ea) this).field_g[var3] = vp.a(param0.b((byte) 44, 7), -6487);
        }
        if (param1 != -19) {
            field_l = null;
        }
        param0.i((byte) 98);
    }

    final void a(int param0, int param1, int param2) {
        ((ea) this).field_g[param1] = param2;
        if (param0 != 17) {
            Object var5 = null;
            ((ea) this).a((kh) null, (byte) 24);
        }
    }

    ea() {
        ((ea) this).field_g = new int[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = -1;
        field_i = new ur(5);
    }
}
