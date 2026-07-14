/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static String field_a;
    static String field_b;
    static dd[][] field_d;
    static rb field_e;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_e = null;
        if (param0 <= 31) {
          field_e = null;
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final static boolean a(byte param0, di param1, int param2) {
        byte[] var5 = null;
        byte[] var3 = null;
        if (param0 <= 5) {
            Object var4 = null;
            boolean discarded$0 = jl.a((byte) -59, (di) null, -110);
            var5 = param1.b(param2, -31413);
            var3 = var5;
            if (!(var5 != null)) {
                return false;
            }
            oa.a(true, var5);
            return true;
        }
        var5 = param1.b(param2, -31413);
        var3 = var5;
        if (!(var5 != null)) {
            return false;
        }
        oa.a(true, var5);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> are all out of lives!";
        field_a = "To <%0>: ";
    }
}
