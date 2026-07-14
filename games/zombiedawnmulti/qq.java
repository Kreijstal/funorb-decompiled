/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq {
    static cj field_b;
    static cj field_c;
    static boolean field_h;
    private int[] field_e;
    static String field_g;
    static String field_d;
    static int field_a;
    static cj field_f;

    qq(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= param0.length - -(param0.length >> -723639551)) {
            var2 = var2 << 1;
        }
        ((qq) this).field_e = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((qq) this).field_e[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (0 != (((qq) this).field_e[var4 + var4 + 1] ^ -1)) {
                var4 = var4 - -1 & var2 - 1;
            }
            ((qq) this).field_e[var4 + var4] = param0[var3];
            ((qq) this).field_e[var4 + (var4 - -1)] = var3;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 21) {
            return;
        }
        field_c = null;
        field_g = null;
        field_f = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 1481485697) {
            break L0;
          } else {
            uj discarded$2 = qq.b(81, 106);
            break L0;
          }
        }
        var3 = (((qq) this).field_e.length >> 1481485697) + -1;
        var4 = var3 & param1;
        L1: while (true) {
          var5 = ((qq) this).field_e[1 + (var4 + var4)];
          if (-1 != var5) {
            if (param1 != ((qq) this).field_e[var4 - -var4]) {
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

    final static uj b(int param0, int param1) {
        if (!df.field_H) {
            return null;
        }
        if (4 <= jp.field_c.a(param0 ^ param0)) {
            return null;
        }
        wj var2 = new wj(param1);
        jp.field_c.a((br) (Object) var2, false);
        return var2.field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_h = false;
        field_d = "Close";
    }
}
