/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static uj field_d;
    int field_e;
    int field_c;
    static int field_a;
    static cr field_f;
    static String field_b;

    final static ji a(byte param0, ed param1) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Vertigo2.field_L ? 1 : 0;
        int var2 = -50 % ((-39 - param0) / 41);
        int discarded$0 = param1.h(-11);
        int var3 = param1.h(-11);
        ji var4 = qf.a(-39, var3);
        var4.field_t = param1.h(-11);
        int var5 = param1.h(-11);
        for (var6 = 0; var6 < var5; var6++) {
            var7 = param1.h(-11);
            var4.a((byte) 110, var7, param1);
        }
        var4.a(-107);
        return var4;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, uh param1, String param2, boolean param3) {
        b var8 = null;
        String var9 = null;
        String var11 = null;
        b var12 = null;
        String var13 = null;
        b var10 = null;
        oq.a(uk.field_v, -1, 4462, param1.a((byte) -38), (String) null, (int[]) null, (cr) (Object) param1, 0L, (String) null);
        if (param1.field_kc) {
            if (param1.field_xc != 2) {
                // if_icmple L55
            } else {
                var8 = un.field_Lb;
                var9 = Vertigo2.a(new String[1], ch.field_g, param0 + -243);
                var8.field_n.a(var9, 10, param0 + -117);
            }
        }
        un.field_Lb.a(param0 ^ 119);
        if (param3) {
            if (br.field_Q != un.field_Lb.field_j) {
                var10 = un.field_Lb;
                var11 = Vertigo2.a(new String[1], as.field_f, -113);
                var10.field_n.a(var11, 15, 0);
            } else {
                var12 = un.field_Lb;
                var13 = Vertigo2.a(new String[1], be.field_s, param0 ^ 60);
                var12.field_n.a(var13, 16, 0);
            }
        }
        b var14 = un.field_Lb;
        if (param0 != 117) {
            field_b = null;
        }
        int var5 = sd.field_N;
        int var6 = no.field_e;
        var14.field_n.c(0, var6, -1220, var5, 0);
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (!(!tf.a((byte) 45))) {
            ol.a(param1, param4, param6, 74);
            if (un.field_Lb != null) {
                if (un.field_Lb.a(param2, param4, param6, param5, 2)) {
                    param4 = false;
                    ql.i(113);
                }
            }
            mh.a(param4, (byte) -73, param6);
            pp.a(param3 ^ -21953, param4, param0);
            param4 = false;
        }
        if (param3 != 21911) {
            ve.a((byte) 13);
        }
        return param4;
    }

    ve(int param0, int param1, int param2, int param3) {
        ((ve) this).field_e = param0;
        ((ve) this).field_c = param3;
    }

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        if (param0 > -124) {
            ve.a((byte) -20);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new uj(1);
        field_a = 34;
        field_b = "Similar rating";
    }
}
