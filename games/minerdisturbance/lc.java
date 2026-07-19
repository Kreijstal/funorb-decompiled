/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends pi {
    int field_q;
    int[][] field_n;
    boolean field_t;
    static ea field_u;
    static String field_o;
    static int field_s;
    int field_r;
    int field_v;
    String[][] field_p;

    final static ea[] a(int param0, int param1, int param2, int param3, byte param4) {
        ea[] var7 = new ea[9];
        ea[] var5 = var7;
        ea dupTemp$0 = hb.a(param1, 32768, param2);
        var7[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        ea dupTemp$1 = hb.a(param1, 32768, param3);
        var7[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        int var6 = -81 % ((param4 - 40) / 61);
        if (!(param0 == 0)) {
            var7[4] = hb.a(64, 32768, param0);
        }
        return var5;
    }

    public static void a(int param0) {
        if (param0 >= -36) {
            field_s = 80;
            field_u = null;
            field_o = null;
            return;
        }
        field_u = null;
        field_o = null;
    }

    final static void a(byte param0, int param1, lc param2) {
        ld var3 = null;
        try {
            var3 = sn.field_c;
            var3.d((byte) -111, param1);
            var3.c(5, param0 + 25438);
            var3.c(0, 25564);
            var3.b(param0, param2.field_q);
            var3.c(param2.field_r, 25564);
            var3.c(param2.field_v, 25564);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "lc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    lc() {
    }

    static {
        field_u = new ea(270, 70);
        field_o = "The Super Volcano Expansion";
        field_s = -1;
    }
}
