/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends ak {
    ak field_Ib;
    static el field_Kb;
    static int field_Jb;
    ak field_Hb;
    static int field_Eb;
    ak field_Fb;
    gp field_Gb;

    public static void b(byte param0) {
        field_Kb = null;
        if (param0 >= -79) {
            pd.b((byte) -19);
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        ((pd) this).field_D = param0;
        ((pd) this).field_S = param3;
        ((pd) this).field_nb = param7;
        ((pd) this).field_K = param1;
        ((pd) this).a(param2, true, param6, param5);
        if (param4) {
            pd.j(74);
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = (param2 + ((pd) this).field_K) / 2;
        var6 = -param0 + ((pd) this).field_nb;
        if (!param1) {
          return;
        } else {
          ((pd) this).field_Gb.a(0, param2, (byte) 97, ((pd) this).field_K, 0, var6 + -param2, param3);
          ((pd) this).field_Ib.field_S = var6;
          ((pd) this).field_Ib.field_nb = param0;
          ((pd) this).field_Ib.field_K = -param2 + var5;
          ((pd) this).field_Ib.field_D = 0;
          ((pd) this).field_Hb.field_S = var6;
          ((pd) this).field_Hb.field_K = ((pd) this).field_K - var5;
          ((pd) this).field_Hb.field_D = var5;
          ((pd) this).field_Hb.field_nb = param0;
          return;
        }
    }

    final static void j(int param0) {
        ri.field_f = new hp(cm.field_o, pj.field_i, ae.field_f, mg.field_h, (ak) (Object) um.field_q, dn.field_c);
        int var1 = 40 / ((param0 - -90) / 35);
    }

    pd(long param0, ak param1, ak param2, vp param3, ak param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((pd) this).field_Fb = new ak(0L, (ak) null);
            ((pd) this).field_Gb = new gp(0L, ((pd) this).field_Fb, param2, param3);
            ((pd) this).field_Ib = new ak(0L, param4);
            ((pd) this).field_Hb = new ak(0L, param4);
            ((pd) this).field_Ib.field_cb = param5;
            ((pd) this).field_Hb.field_cb = param6;
            ((pd) this).a((ak) (Object) ((pd) this).field_Gb, (byte) 26);
            ((pd) this).a(((pd) this).field_Ib, (byte) 26);
            ((pd) this).a(((pd) this).field_Hb, (byte) 26);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pd.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean k(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = pd.k(-125);
            return oc.field_J;
        }
        return oc.field_J;
    }

    pd(long param0, pd param1, String param2, String param3) {
        this(param0, (ak) (Object) param1, param1.field_Gb.field_Ib, param1.field_Gb.field_Gb, param1.field_Ib, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = 2;
        field_Kb = new el();
    }
}
