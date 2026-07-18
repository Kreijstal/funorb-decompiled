/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends pi {
    static ta field_v;
    int field_w;
    static int field_s;
    uj field_u;
    static int field_t;
    static om field_o;
    static String field_r;
    int field_q;
    static String field_p;
    String field_n;

    public static void a(byte param0) {
        field_r = null;
        field_o = null;
        field_v = null;
        field_p = null;
        int var1 = -5;
    }

    final static void a(int param0) {
        fa.field_c = null;
        pe.field_pb = 0;
        ng.field_l = -1;
        il.field_n = false;
        lj.field_q = -1;
    }

    final static void a(int param0, int param1) {
        ld var2 = sn.field_c;
        var2.d((byte) -87, param1);
        var2.c(param0, 25564);
        var2.c(2, 25564);
    }

    tc(uj param0, int param1, int param2) {
        try {
            ((tc) this).field_u = param0;
            ((tc) this).field_n = param0.a((byte) -115);
            ((tc) this).field_q = param1;
            ((tc) this).field_w = param2;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "tc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new ta();
        field_r = "This password contains your Player Name, and would be easy to guess";
        field_p = "An alternative to conventional mining. Using this you can push rocks into gaps or force ore out of boulders. Essential for the eccentric dwarf.";
    }
}
