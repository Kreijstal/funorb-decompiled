/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static tc field_e;
    static boolean field_b;
    static int[] field_a;
    static long field_d;
    static String field_c;

    final static void a(String param0, long param1) {
        CharSequence var5 = null;
        jo.field_k = param0;
        try {
            ce.field_d = 2;
            var5 = (CharSequence) (Object) param0;
            fp.field_d = dh.a(var5, (byte) 74);
            fp.field_e = param1;
            int discarded$0 = 20558;
            ib.b();
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "qj.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 8 + 41);
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        pc var3 = aa.field_f;
        var3.g(param2, 15514);
        var3.e(160, 3);
        var3.e(160, 10);
        var3.b(1276387944, param1);
    }

    public static void a() {
        field_c = null;
        field_e = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Puzzle Failed!";
    }
}
