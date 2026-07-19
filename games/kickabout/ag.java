/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends gn {
    static int field_h;
    vm field_i;
    static String field_l;
    static rg field_f;
    static int field_e;
    int field_j;
    static int field_g;
    gn field_k;

    final static hd a(int param0, int param1) {
        hd var2 = new hd((long)param1, (hd) null);
        var2.field_R = sp.a((byte) 26, param0);
        return var2;
    }

    public static void a(byte param0) {
        field_f = null;
        field_l = null;
        if (param0 < 66) {
            ag.a((byte) 34);
        }
    }

    ag(vm param0, gn param1) {
        try {
            this.field_i = param0;
            this.field_j = param0.m();
            this.field_k = param1;
            this.field_i.b(128 + mn.field_a * this.field_j >> -1975549464);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ag.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "<%0>: Show Chat";
    }
}
