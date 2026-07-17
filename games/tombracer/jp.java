/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jp extends ota {
    final static void a(cn param0) {
        int var3 = 0;
        int var4 = 0;
        iu var2 = new iu(param0.a("final_frame.jpg", (byte) 114, ""), (java.awt.Component) (Object) nma.field_l);
        try {
            var3 = var2.field_m;
            var4 = var2.field_q;
            int discarded$0 = -29711;
            gb.a();
            bra.field_O = new iu(var3, var4 * 3 / 4);
            bra.field_O.c();
            var2.d(0, 0);
            hca.field_W = new iu(var3, -bra.field_O.field_q + var4);
            hca.field_W.c();
            var2.d(0, -bra.field_O.field_q);
            hca.field_W.field_p = bra.field_O.field_q;
            pfa.a(1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jp.D(" + (param0 != null ? "{...}" : "null") + 44 + 20 + 41);
        }
    }

    abstract hoa b(int param0);

    final static void a() {
        int discarded$0 = 255;
        pu.a(di.a(111));
    }

    private jp() throws Throwable {
        throw new Error();
    }

    static {
    }
}
