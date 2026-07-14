/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static eaa field_c;
    static java.awt.Font field_b;
    static String field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -7778) {
            field_a = null;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static byte[] a(boolean param0, byte param1, Object param2) {
        byte[] var3 = null;
        nu var4 = null;
        if (param1 < 57) {
            field_b = null;
            if (param2 == null) {
                return null;
            }
            if (!(!(param2 instanceof byte[]))) {
                var3 = (byte[]) param2;
                if (param0) {
                    return gs.a((byte) 120, var3);
                }
                return var3;
            }
            if (!(!(param2 instanceof nu))) {
                var4 = (nu) param2;
                return var4.a(false);
            }
            throw new IllegalArgumentException();
        }
        if (param2 == null) {
            return null;
        }
        if (!(!(param2 instanceof byte[]))) {
            var3 = (byte[]) param2;
            if (param0) {
                return gs.a((byte) 120, var3);
            }
            return var3;
        }
        if (!(!(param2 instanceof nu))) {
            var4 = (nu) param2;
            return var4.a(false);
        }
        throw new IllegalArgumentException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new eaa();
        field_a = "Names should contain a maximum of 12 characters";
    }
}
