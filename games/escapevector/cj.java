/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static ed field_a;
    static String field_b;
    static int[][] field_d;
    static String field_c;

    final static void a(int param0, mf param1) {
        ed var2 = new ed(param1.a(-4, "", "final_frame.jpg"), (java.awt.Component) (Object) of.field_d);
        int var3 = var2.field_s;
        int var4 = var2.field_x;
        hf.a(param0 ^ 58);
        cb.field_a = new ed(var3, 3 * var4 / 4);
        cb.field_a.g();
        var2.d(0, param0);
        s.field_G = new ed(var3, -cb.field_a.field_x + var4);
        s.field_G.g();
        var2.d(0, -cb.field_a.field_x);
        s.field_G.field_v = cb.field_a.field_x;
        dl.a((byte) 120);
    }

    final static void a(byte param0) {
        int var5 = EscapeVector.field_A;
        int var2 = -55 % ((param0 - -59) / 39);
        int[] var6 = ul.field_I;
        int[] var1 = var6;
        int var3 = 0;
        int var4 = var6.length;
        while (var4 > var3) {
            int incrementValue$0 = var3;
            var3++;
            var6[incrementValue$0] = 0;
            int incrementValue$1 = var3;
            var3++;
            var6[incrementValue$1] = 0;
            int incrementValue$2 = var3;
            var3++;
            var6[incrementValue$2] = 0;
            int incrementValue$3 = var3;
            var3++;
            var6[incrementValue$3] = 0;
            int incrementValue$4 = var3;
            var3++;
            var6[incrementValue$4] = 0;
            int incrementValue$5 = var3;
            var3++;
            var6[incrementValue$5] = 0;
            int incrementValue$6 = var3;
            var3++;
            var6[incrementValue$6] = 0;
            int incrementValue$7 = var3;
            var3++;
            var6[incrementValue$7] = 0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 17159) {
          cj.a((byte) 122);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Just play";
        field_b = " - show/hide mini-map";
    }
}
