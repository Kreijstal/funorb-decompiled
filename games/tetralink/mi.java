/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends hl {
    static boolean field_Pb;
    static hl field_Kb;
    static String field_Mb;
    private hl field_Ob;
    private hl field_Lb;
    static String field_Nb;

    final static void a(hl param0, hl param1, int param2) {
        try {
            if (null == param0.field_fb) {
                param0.field_fb = new je();
            }
            if (!(null != param1.field_fb)) {
                param1.field_fb = new je();
            }
            if (!(null != wb.field_f)) {
                wb.field_f = new kd(64);
            }
            if (null == sd.field_nb) {
                sd.field_nb = new kd(64);
            }
            og.field_j = param0.field_fb;
            mm.field_s = param1.field_fb;
            ji.h(0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "mi.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param2 != 3) {
            return;
        }
        ((mi) this).a((byte) -98, param1, param5, param3, param0);
        this.d(param4, 62);
    }

    private final void d(int param0, int param1) {
        ((mi) this).field_Lb.a((byte) -123, ((mi) this).field_Lb.f(-122), 0, ((mi) this).field_R, 0);
        int var3 = ((mi) this).field_Lb.field_Hb - -param0;
        ((mi) this).field_Ob.a((byte) -121, ((mi) this).field_Hb - var3, 0, ((mi) this).field_R, var3);
    }

    mi(long param0, oh param1, oh param2, int param3, hl param4, String param5) {
        this(param0, (hl) null, param4, param5);
        try {
            ((mi) this).field_Lb.field_vb = param2;
            ((mi) this).field_Lb.field_X = param1;
            ((mi) this).field_Lb.field_J = param3;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "mi.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final int e(int param0, int param1) {
        if (param0 > -118) {
            field_Nb = null;
            return ((mi) this).field_Lb.f(-81) + (param1 - -((mi) this).field_Ob.f(-85));
        }
        return ((mi) this).field_Lb.f(-81) + (param1 - -((mi) this).field_Ob.f(-85));
    }

    final static void a(int param0, int param1, int param2) {
        bc var3 = nd.field_Lb;
        var3.f(param2, (byte) -92);
        var3.a(param0, false);
        var3.a(10, false);
        var3.b(param1, false);
    }

    mi(long param0, mi param1, String param2) {
        this(param0, param1.field_Lb, param1.field_Ob, param2);
    }

    public static void h(int param0) {
        field_Kb = null;
        field_Mb = null;
        field_Nb = null;
    }

    private mi(long param0, hl param1, hl param2, String param3) {
        super(param0, (hl) null);
        try {
            ((mi) this).field_Lb = new hl(0L, param1);
            ((mi) this).field_Ob = new hl(0L, param2);
            ((mi) this).field_Ob.field_jb = param3;
            ((mi) this).a((byte) 94, ((mi) this).field_Lb);
            ((mi) this).a((byte) -88, ((mi) this).field_Ob);
            ((mi) this).c((byte) 95);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "mi.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Mb = "<%0> has joined your game.";
        field_Nb = "Add <%0> to ignore list";
    }
}
