/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends td {
    static kia field_p;

    final static int a(byte[] param0, int param1, int param2) {
        if (param1 != -31303) {
            return 34;
        }
        return mk.a(param0, 0, -115, param2);
    }

    public static void c(byte param0) {
        if (param0 < 123) {
            wc.c((byte) 20);
        }
        field_p = null;
    }

    final ii a(op param0, int param1) {
        if (param1 != 3) {
            field_p = null;
        }
        return (ii) (Object) new jaa(((wc) this).field_g, ((wc) this).field_h, ((wc) this).field_k, ((wc) this).field_n);
    }

    wc(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((wc) this).field_n = param3;
        ((wc) this).field_k = param2;
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (!sl.a(true, (byte) -85, param1)) {
            return false;
        }
        for (var2 = param0; var2 < param1.length(); var2++) {
            if (!(io.a(true, param1.charAt(var2)))) {
                return false;
            }
        }
        return true;
    }

    static {
    }
}
