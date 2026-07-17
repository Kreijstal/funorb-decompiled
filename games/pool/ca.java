/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends re {
    static int field_h;
    static boolean[][] field_j;
    static int field_l;
    static String field_m;
    static kf[] field_g;
    private String field_k;
    static int field_i;
    private String field_n;

    public static void b(int param0) {
        if (param0 != 17518) {
            ca.b(8);
            field_j = null;
            field_m = null;
            field_g = null;
            return;
        }
        field_j = null;
        field_m = null;
        field_g = null;
    }

    final tf b(byte param0) {
        int var2 = -73 % ((param0 - -54) / 43);
        return dg.field_L;
    }

    final void a(byte param0, ge param1) {
        try {
            int var3_int = -92 / ((22 - param0) / 51);
            param1.a(false, ((ca) this).field_n);
            param1.a(((ca) this).field_k, 109);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ca.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ca(String param0, String param1) {
        try {
            ((ca) this).field_k = param1;
            ((ca) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ca.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 128;
        field_m = "The objective of nine-ball pool is to legally \"pot\" the 9 ball. Before we get to that, we \"break\", but the first thing you might want to do is <u=ffffff>move the cue ball</u>. <col=99ff99>Hold</col> down the <img=0> <col=99ff99>left mouse button over the cue ball and drag</col> it to where you would like to place it.";
        field_i = -1;
        field_g = new kf[2];
    }
}
