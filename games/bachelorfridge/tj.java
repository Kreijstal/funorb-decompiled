/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static du field_d;
    static int[] field_e;
    static int[] field_f;
    static int[][] field_b;
    static String field_a;
    static byte[] field_c;

    final static kv[] a(kv[] param0, byte param1) {
        int var2 = 0;
        kv var3_ref_kv = null;
        int var4 = BachelorFridge.field_y;
        for (var2 = 0; param0.length > var2; var2++) {
            var3_ref_kv = param0[var2];
            param0[var2].field_u = 0;
            var3_ref_kv.field_t = 0;
            param0[var2].field_n = param0[var2].field_q;
            param0[var2].field_o = param0[var2].field_p;
        }
        int var3 = -22 % ((59 - param1) / 44);
        return param0;
    }

    final static rk[] a(byte param0, lu param1) {
        rk[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        rk[] var6 = null;
        var4 = BachelorFridge.field_y;
        var6 = new rk[50];
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (-51 >= (var3 ^ -1)) {
            if (param0 != 124) {
              var5 = null;
              rk[] discarded$2 = tj.a((byte) -37, (lu) null);
              return var2;
            } else {
              return var2;
            }
          } else {
            var6[var3] = gka.a(param1, 255);
            var3++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 > -99) {
            return;
        }
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_d = new du(8, 0, 4, 1);
        field_c = new byte[]{(byte) 1, (byte) 0, (byte)3, (byte) 0, (byte) 1};
        field_a = "Continue";
    }
}
