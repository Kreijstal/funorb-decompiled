/*
 * Decompiled by CFR-JS 0.4.0.
 */
class am extends gn {
    am field_f;
    am field_e;
    long field_l;
    static byte[] field_j;
    static String field_m;
    static tf field_g;
    static kg[] field_h;
    static int field_k;
    static int[] field_i;

    public static void e(int param0) {
        field_i = null;
        field_h = null;
        field_m = null;
        field_g = null;
        if (param0 != 13421568) {
            field_j = null;
        }
        field_j = null;
    }

    final long f(byte param0) {
        if (param0 <= 58) {
            ((am) this).field_f = null;
        }
        return ((am) this).field_l;
    }

    protected am() {
    }

    final boolean a(byte param0) {
        if (!(((am) this).field_e != null)) {
            return false;
        }
        if (param0 != -60) {
            return true;
        }
        return true;
    }

    final void f(int param0) {
        if (!(null != ((am) this).field_e)) {
            return;
        }
        ((am) this).field_e.field_f = ((am) this).field_f;
        ((am) this).field_f.field_e = ((am) this).field_e;
        ((am) this).field_e = null;
        ((am) this).field_f = null;
        int var2 = 96 % ((param0 - -38) / 33);
    }

    final void a(long param0, byte param1) {
        if (param1 >= -110) {
            return;
        }
        if (!(((am) this).field_e == null)) {
            throw new RuntimeException();
        }
        ((am) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_j = new byte[4096];
        for (var0 = 0; var0 < 4096; var0++) {
            field_j[var0] = (byte) 1;
        }
        field_m = "Add <%0> to friend list";
        field_k = -1;
        field_i = new int[]{16711680, 16711680, 16737792, 16755200, 13421568, 11206400, 6749952, 65280};
    }
}
