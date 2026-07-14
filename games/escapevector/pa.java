/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static hh field_b;
    static hh field_a;

    final static void a(boolean param0) {
        if (!(nf.field_u)) {
            throw new IllegalStateException();
        }
        c.field_u = true;
        ic.a((byte) -126, param0);
        ff.field_e = 0;
    }

    public static void a(byte param0) {
        if (param0 != 103) {
            field_a = null;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = EscapeVector.field_A;
        bi.b();
        ij.field_i = 11;
        pb.field_c = new int[260];
        for (var1 = 0; (var1 ^ -1) > -257; var1++) {
            var2 = 15.0;
            pb.field_c[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
        }
        if (param0 >= -19) {
            field_b = null;
        }
        int var5 = 256;
        var1 = var5;
        while (var5 < pb.field_c.length) {
            pb.field_c[var5] = 255;
            var5++;
        }
    }

    static {
    }
}
