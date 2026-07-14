/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static cf field_f;
    static int[] field_g;
    static ne field_i;
    static cf field_d;
    static String field_e;
    static boolean field_j;
    static int[] field_h;
    static ge field_c;
    static String field_b;
    static vg[] field_a;

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        hb.field_d = param2;
        sl.field_f = param3;
        if (param0 >= -21) {
            return;
        }
        re.field_A = param4;
        ok.field_e = param1;
    }

    final static void b(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        int[] var5 = vf.field_b;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var3 > var2) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static void a(int param0) {
        cj.a((byte) 118, gi.b(param0 ^ 12476));
        if (param0 != 0) {
            field_i = null;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_g = null;
        field_c = null;
        if (param0 != 26) {
          qc.a((byte) 37, 124, -19, 37, -63);
          field_h = null;
          field_b = null;
          field_e = null;
          field_i = null;
          field_f = null;
          return;
        } else {
          field_h = null;
          field_b = null;
          field_e = null;
          field_i = null;
          field_f = null;
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1, byte param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        td var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          if (param3 <= 0) {
            var4 = param0;
            break L0;
          } else {
            var8 = new byte[param1];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (param1 <= var5_int) {
                break L0;
              } else {
                var8[var5_int] = param0[param3 + var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        if (param2 >= -39) {
          qc.a(-60);
          var5 = new td();
          var5.a((byte) 0);
          var5.a((long)(param1 * 8), 19668, var4);
          var6 = new byte[64];
          var5.a(var6, -6, 0);
          return var6;
        } else {
          var5 = new td();
          var5.a((byte) 0);
          var5.a((long)(param1 * 8), 19668, var4);
          var6 = new byte[64];
          var5.a(var6, -6, 0);
          return var6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new cf();
        field_g = new int[]{0, 0};
        field_i = new ne();
        field_e = "You are not currently logged in to the<nbsp>game.";
        field_d = new cf();
        field_b = "To Customer Support";
        field_j = false;
        field_h = new int[256];
    }
}
