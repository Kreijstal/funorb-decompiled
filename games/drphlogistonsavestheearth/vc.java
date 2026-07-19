/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    private boolean field_c;
    private boolean field_h;
    private String field_g;
    static String field_d;
    static byte[][] field_f;
    private static int[] field_a;
    static he[] field_b;
    static int field_e;

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 0) {
          field_f = (byte[][]) null;
          field_b = null;
          field_f = (byte[][]) null;
          return;
        } else {
          field_b = null;
          field_f = (byte[][]) null;
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != -15493) {
            field_e = 86;
            return this.field_c;
        }
        return this.field_c;
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return this.field_h;
    }

    final void a(boolean param0, int param1) {
        this.field_h = true;
        if (param1 > -75) {
            return;
        }
        this.field_c = param0 ? true : false;
    }

    final String a(byte param0) {
        if (param0 != -58) {
            field_b = (he[]) null;
            return this.field_g;
        }
        return this.field_g;
    }

    vc(String param0) {
        this.field_c = false;
        this.field_h = false;
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "vc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_d = "Achieved";
        field_f = new byte[1000][];
        field_a = new int[98304];
        for (var0 = 92682; -46342 >= (var0 ^ -1); var0--) {
            var6 = (long)((var0 << -1220703679) - -1);
            var4 = (long)((var0 << -777326559) - 1);
            var3 = (int)((var6 * var6 >> -1397190254) + -32768L);
            var2 = (int)(-32768L + (var4 * var4 >> 1708641682));
            if (var3 >= field_a.length) {
                var3 = -1 + field_a.length;
            }
            for (var1 = -1 < (var2 ^ -1) ? 0 : var2; var3 >= var1; var1++) {
                field_a[var1] = var0;
            }
        }
    }
}
