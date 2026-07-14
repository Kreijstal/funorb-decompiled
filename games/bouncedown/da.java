/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static java.awt.Color field_d;
    static String field_c;
    private int[] field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 > -20) {
            da.a(121);
        }
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Bounce.field_N;
          var3 = -1 + (((da) this).field_a.length >> 382701601);
          var4 = param1 & var3;
          if (param0 <= -53) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: while (true) {
          var5 = ((da) this).field_a[var4 + (var4 + 1)];
          if (-1 != var5) {
            if (param1 != ((da) this).field_a[var4 - -var4]) {
              var4 = 1 + var4 & var3;
              continue L1;
            } else {
              return var5;
            }
          } else {
            return -1;
          }
        }
    }

    da(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= (param0.length >> 23824321) + param0.length) {
            var2 = var2 << 1;
        }
        ((da) this).field_a = new int[var2 + var2];
        for (var3 = 0; var3 < var2 - -var2; var3++) {
            ((da) this).field_a[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (0 != (((da) this).field_a[var4 + (var4 - -1)] ^ -1)) {
                var4 = -1 + var2 & 1 + var4;
            }
            ((da) this).field_a[var4 - -var4] = param0[var3];
            ((da) this).field_a[1 + (var4 + var4)] = var3;
        }
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "To Customer Support";
        field_d = new java.awt.Color(10040319);
        field_b = "Loading extra data";
    }
}
