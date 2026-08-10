/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ka {
    static int[][] field_b;
    static dq field_c;

    final static void a(int param0, wl param1) {
        od var7 = null;
        byte[] var19 = null;
        aj var9 = null;
        byte[] var20 = null;
        cs var11 = null;
        byte[] var21 = null;
        try {
            if (null == wl.field_Kb) {
                var7 = new od();
                var19 = var7.a(-959081435, 128, 128, 16);
                wl.field_Kb = sf.a(false, param0 + -145, var19);
            }
            if (mq.field_e == null) {
                var9 = new aj();
                var20 = var9.a(param0 + -12, 128, 16, 128);
                mq.field_e = sf.a(false, -137, var20);
            }
            if (param0 != 8) {
                field_c = (dq) null;
            }
            var11 = param1.field_cc;
            if (var11.b(true) && null == ho.field_a) {
                var21 = gg.a(8, -93, 16.0f, new ol(419684), 128, 128, 4.0f, 4.0f, 0.5f, 16, 0.6000000238418579f);
                ho.field_a = sf.a(false, -137, var21);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "nb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 10536) {
            wl var3 = (wl) null;
            nb.a(-6, (wl) null);
        }
    }

    nb(wl param0) {
        hl discarded$0 = null;
        hl discarded$1 = null;
        hl discarded$2 = null;
        hl discarded$3 = null;
        nn discarded$4 = null;
        try {
            discarded$0 = new hl((fq) null, 5126, 3, 0);
            discarded$1 = new hl((fq) null, 5126, 2, 0);
            discarded$2 = new hl((fq) null, 5126, 3, 0);
            discarded$3 = new hl((fq) null, 5121, 4, 0);
            discarded$4 = new nn();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "nb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_b = (int[][]) null;
        if (param0 < 66) {
            field_c = (dq) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
    }
}
