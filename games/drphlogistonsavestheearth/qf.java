/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static he[] field_e;
    static int field_d;
    static String field_a;
    static nh field_b;
    private int[] field_f;
    static String field_c;
    static he[] field_g;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = (((qf) this).field_f.length >> -1500775551) + param1;
        var4 = param0 & var3;
        L0: while (true) {
          var5 = ((qf) this).field_f[1 + (var4 - -var4)];
          if (-1 != var5) {
            if (((qf) this).field_f[var4 + var4] != param0) {
              var4 = 1 + var4 & var3;
              continue L0;
            } else {
              return var5;
            }
          } else {
            return -1;
          }
        }
    }

    qf(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (param0.length - -(param0.length >> -468706367) >= var2) {
            var2 = var2 << 1;
        }
        ((qf) this).field_f = new int[var2 - -var2];
        for (var3 = 0; var2 + var2 > var3; var3++) {
            ((qf) this).field_f[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (-1 != ((qf) this).field_f[1 + var4 + var4]) {
                var4 = var4 - -1 & -1 + var2;
            }
            ((qf) this).field_f[var4 + var4] = param0[var3];
            ((qf) this).field_f[1 + var4 + var4] = var3;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        field_e = null;
        if (param0 != 64) {
            qf.a((byte) -43);
        }
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Password: ";
    }
}
