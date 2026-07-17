/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    int field_a;
    static int[] field_b;
    static String[][] field_g;
    static String field_f;
    static gj field_d;
    static int field_e;
    static ta field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0) {
        ng.field_e = null;
        bg.field_d = null;
        int var1 = 25 % ((-35 - param0) / 32);
        oc.field_e = null;
        af.field_p = null;
        qk.field_b = null;
        db.field_b = null;
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = 0;
        field_d = null;
        field_g = null;
        field_f = null;
        field_b = null;
    }

    ec(int param0) {
        ((ec) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        field_b = new int[36864];
        var0 = 96;
        var1 = 96;
        var2 = 0;
        L0: while (true) {
          if (var2 >= field_b.length) {
            field_g = new String[][]{new String[1]};
            field_f = "Loading extra data";
            field_e = 64;
            field_d = new gj();
            field_c = new ta();
            return;
          } else {
            var3 = var2 / 192;
            var4 = -(192 * var3) + var2;
            var5 = var4 - var0;
            var6 = var3 - var1;
            var7 = 255.0 - 255.0 * Math.sqrt((double)(var6 * var6 + var5 * var5)) / (double)var0;
            field_b[var2] = (int)(0.5 + var7);
            if (field_b[var2] < 0) {
              field_b[var2] = 0;
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }
}
