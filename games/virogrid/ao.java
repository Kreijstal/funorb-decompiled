/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends km {
    static String field_Nb;
    km field_Lb;
    um field_Ib;
    km field_Fb;
    static ob field_Kb;
    km field_Mb;
    static String field_Jb;
    static km field_Eb;
    static boolean field_Gb;
    static float field_Hb;

    ao(long param0, km param1, km param2, qm param3, km param4, String param5, String param6) {
        super(param0, param1);
        ((ao) this).field_Lb = new km(0L, (km) null);
        ((ao) this).field_Ib = new um(0L, ((ao) this).field_Lb, param2, param3);
        ((ao) this).field_Fb = new km(0L, param4);
        ((ao) this).field_Mb = new km(0L, param4);
        ((ao) this).field_Fb.field_V = param5;
        ((ao) this).field_Mb.field_V = param6;
        ((ao) this).a(0, (km) (Object) ((ao) this).field_Ib);
        ((ao) this).a(0, ((ao) this).field_Fb);
        ((ao) this).a(0, ((ao) this).field_Mb);
    }

    final static km d(boolean param0) {
        if (!param0) {
            km discarded$0 = ao.d(false);
            return uf.field_j.field_Jb;
        }
        return uf.field_j.field_Jb;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (((ao) this).field_K - -param1) / 2;
        int var6 = -param2 + ((ao) this).field_ub;
        ((ao) this).field_Ib.a(0, -103, ((ao) this).field_K, param1, -param1 + var6, 0, param0);
        ((ao) this).field_Fb.field_F = var6;
        ((ao) this).field_Fb.field_K = -param1 + var5;
        ((ao) this).field_Fb.field_tb = param3;
        ((ao) this).field_Fb.field_ub = param2;
        ((ao) this).field_Mb.field_ub = param2;
        ((ao) this).field_Mb.field_F = var6;
        ((ao) this).field_Mb.field_tb = var5;
        ((ao) this).field_Mb.field_K = ((ao) this).field_K + -var5;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ao) this).field_tb = param1;
        ((ao) this).field_F = param5;
        ((ao) this).field_K = param0;
        ((ao) this).field_ub = param3;
        ((ao) this).a(param4, param2, param6, param7 ^ param7);
    }

    ao(long param0, ao param1, String param2, String param3) {
        this(param0, (km) (Object) param1, param1.field_Ib.field_Eb, param1.field_Ib.field_Hb, param1.field_Fb, param2, param3);
    }

    public static void g(int param0) {
        field_Jb = null;
        field_Nb = null;
        int var1 = 13 / ((-63 - param0) / 49);
        field_Eb = null;
        field_Kb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "You ran out of time";
        field_Kb = new ob();
        field_Jb = "<%0> has left the lobby.";
        field_Hb = 0.0f;
    }
}
