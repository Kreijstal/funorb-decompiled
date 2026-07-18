/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends nm {
    int field_k;
    int field_i;
    static String field_j;

    final static pe a(int param0, byte param1, int param2, int param3) {
        pe var4 = new pe();
        var4.field_w = param2;
        var4.field_m = new int[1];
        ob.field_F.a((nm) (Object) var4, (byte) 3);
        i.a(5, var4, 108);
        return var4;
    }

    private fa() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Waiting for levels";
    }
}
