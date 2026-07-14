/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn extends tg {
    static eh field_G;
    static String field_H;
    static km field_F;
    static String field_I;

    final void b(byte param0, int param1, int param2, int param3) {
        ((gn) this).field_z = !((gn) this).field_z ? true : false;
        super.b((byte) 69, param1, param2, param3);
        int var5 = 65 % ((param0 - -33) / 42);
    }

    private gn(String param0, cd param1) {
        this(param0, vi.field_g.field_l, param1);
        ((gn) this).field_w = vi.field_g.field_i;
    }

    public static void g(boolean param0) {
        field_H = null;
        if (!param0) {
            Object var2 = null;
            gn.a((byte) 42, (String) null, 7);
        }
        field_G = null;
        field_I = null;
        field_F = null;
    }

    final static mg c(byte param0) {
        int var4_int = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        int var1 = gb.field_F[0] * db.field_k[0];
        byte[] var2 = lj.field_j[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = k.field_c[rb.a((int) var2[var4_int], 255)];
        }
        mg var4 = new mg(oj.field_Kb, se.field_d, el.field_w[0], mb.field_bb[0], db.field_k[0], gb.field_F[0], var3);
        if (param0 != -9) {
            gn.g(true);
        }
        pe.b((byte) -28);
        return var4;
    }

    final static void a(byte param0, String param1, int param2) {
        tg.field_x = 1;
        int var3 = -66 / ((-14 - param0) / 41);
        pm.field_k = param2;
    }

    private gn(String param0, ol param1, cd param2) {
        super(param0, param1, param2);
        ((gn) this).field_w = vi.field_g.field_i;
    }

    gn(String param0, cd param1, boolean param2) {
        this(param0, param1);
        ((gn) this).field_z = param2 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Waiting for textures";
        field_I = "Don't mind";
    }
}
