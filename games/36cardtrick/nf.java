/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static de field_d;
    static String[] field_b;
    static String field_a;
    static int field_c;

    final static void a(boolean param0, byte param1, boolean param2) {
        Object var4 = null;
        mb.a((String) null, 1024, param0, param2);
    }

    final static void a(pb param0, boolean param1, int param2, int param3, int param4) {
        try {
            param0.b(-9469, 12);
            param0.e(17, 26040);
            param0.e(param3, 26040);
            param0.e(param2, 26040);
            param0.b(-9469, param4);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "nf.C(" + (param0 != null ? "{...}" : "null") + ',' + false + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 17) {
            field_c = -8;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new de(8, 0, 4, 1);
        field_b = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_a = "Names can only contain letters, numbers, spaces and underscores";
    }
}
