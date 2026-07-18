/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends ci {
    static cd[] field_Ib;
    ci field_Fb;
    ci field_Hb;
    static sa field_Ob;
    ci field_Mb;
    static boolean[] field_Jb;
    static boolean[] field_Lb;
    static String field_Gb;
    static String field_Eb;
    static String field_Nb;
    nb field_Kb;

    ok(long param0, ci param1, ci param2, pd param3, ci param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((ok) this).field_Fb = new ci(0L, (ci) null);
            ((ok) this).field_Kb = new nb(0L, ((ok) this).field_Fb, param2, param3);
            ((ok) this).field_Hb = new ci(0L, param4);
            ((ok) this).field_Mb = new ci(0L, param4);
            ((ok) this).field_Hb.field_db = param5;
            ((ok) this).field_Mb.field_db = param6;
            ((ok) this).a((byte) 127, (ci) (Object) ((ok) this).field_Kb);
            ((ok) this).a((byte) 123, ((ok) this).field_Hb);
            ((ok) this).a((byte) 127, ((ok) this).field_Mb);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ok.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(byte param0) {
        field_Ib = null;
        field_Lb = null;
        field_Eb = null;
        field_Jb = null;
        field_Nb = null;
        field_Ob = null;
        field_Gb = null;
    }

    ok(long param0, ok param1, String param2, String param3) {
        this(param0, (ci) (Object) param1, param1.field_Kb.field_Jb, param1.field_Kb.field_Eb, param1.field_Hb, param2, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ok) this).field_M = param0;
        ((ok) this).field_pb = param3;
        ((ok) this).field_mb = param7;
        ((ok) this).field_V = param2;
        ((ok) this).a(param1, param6, param5, 0);
        if (param4 != 28267) {
            ((ok) this).field_Mb = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (param1 + ((ok) this).field_M) / 2;
        int var6 = -param0 + ((ok) this).field_pb;
        ((ok) this).field_Kb.a(param1, -param1 + var6, 0, -3, param2, param3, ((ok) this).field_M);
        ((ok) this).field_Hb.field_M = -param1 + var5;
        ((ok) this).field_Hb.field_mb = 0;
        ((ok) this).field_Hb.field_pb = param0;
        ((ok) this).field_Hb.field_V = var6;
        ((ok) this).field_Mb.field_M = -var5 + ((ok) this).field_M;
        ((ok) this).field_Mb.field_mb = var5;
        ((ok) this).field_Mb.field_pb = param0;
        ((ok) this).field_Mb.field_V = var6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ib = new cd[5];
        field_Ob = new sa();
        field_Eb = "Invite";
        field_Gb = "Open in popup window";
        field_Nb = "Stalemate";
        field_Jb = new boolean[112];
    }
}
