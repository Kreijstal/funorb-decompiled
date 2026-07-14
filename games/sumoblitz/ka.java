/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka {
    static String field_a;
    static int field_b;

    final static int a(mp param0, int param1) {
        int var2 = 8 % ((param1 - -40) / 46);
        if (wn.field_b == param0) {
            return 9216;
        }
        if (nl.field_n == param0) {
            return 34065;
        }
        if (!(param0 != rt.field_C)) {
            return 34066;
        }
        throw new IllegalArgumentException();
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -59) {
            Object var2 = null;
            int discarded$0 = ka.a((mp) null, 4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Password is valid";
    }
}
