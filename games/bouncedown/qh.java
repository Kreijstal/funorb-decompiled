/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    private boolean field_f;
    private String field_a;
    private boolean field_h;
    static eh field_c;
    static String field_e;
    static int[] field_i;
    static byte[][] field_b;
    static String field_d;
    static int[] field_g;

    final boolean b(int param0) {
        if (param0 < 37) {
            return false;
        }
        return ((qh) this).field_f;
    }

    final void a(boolean param0, byte param1) {
        ((qh) this).field_h = true;
        ((qh) this).field_f = param0 ? true : false;
        int var3 = -101 / ((2 - param1) / 36);
    }

    final String a(byte param0) {
        if (param0 > -30) {
            return null;
        }
        return ((qh) this).field_a;
    }

    final boolean a(int param0) {
        if (param0 != 1000) {
            return false;
        }
        return ((qh) this).field_h;
    }

    final static void a(ke param0, int param1, int param2) {
        ii var5 = null;
        int var4 = 0;
        try {
            var5 = hh.field_p;
            var5.a(true, param1);
            var5.field_h = var5.field_h + 1;
            var4 = var5.field_h;
            var5.a(1, (byte) 107);
            var5.a(param0.field_g, (byte) 54);
            var5.a(param0.field_i, (byte) 48);
            var5.b(param0.field_h, (byte) 101);
            var5.b(param0.field_k, (byte) 97);
            var5.b(param0.field_j, (byte) 124);
            var5.b(param0.field_o, (byte) 106);
            int discarded$0 = var5.b(var4, -1);
            var5.b(-var4 + var5.field_h, true);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "qh.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + -22762 + 41);
        }
    }

    public static void b(byte param0) {
        field_i = null;
        field_g = null;
        if (param0 != -101) {
          qh.b((byte) 75);
          field_b = null;
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    qh(String param0) {
        ((qh) this).field_f = false;
        ((qh) this).field_h = false;
        try {
            ((qh) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "qh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new eh(1, 2, 2, 0);
        field_b = new byte[1000][];
        field_g = new int[12];
        field_d = "Passwords must be between 5 and 20 letters and numbers";
    }
}
