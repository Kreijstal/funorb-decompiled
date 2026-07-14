/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static o field_b;
    private int[] field_e;
    static hl[] field_c;
    static int field_a;
    static boolean field_d;

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = -1 + (((dl) this).field_e.length >> 2009344033);
        var5 = -84 / ((-77 - param0) / 40);
        var4 = var3 & param1;
        L0: while (true) {
          var6 = ((dl) this).field_e[1 + (var4 + var4)];
          if (var6 == -1) {
            return -1;
          } else {
            if (param1 == ((dl) this).field_e[var4 + var4]) {
              return var6;
            } else {
              var4 = 1 + var4 & var3;
              continue L0;
            }
          }
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0) {
            return null;
        }
        if (!(!param2)) {
            var4 += 4;
        }
        if (param1) {
            var4 += 2;
        }
        if (!(!param3)) {
            var4++;
        }
        return hd.field_g[var4];
    }

    final static lh a(ja param0, byte param1, String param2, String param3, ue param4) {
        int var5 = param4.a(param3, false);
        int var7 = -19 % ((param1 - 3) / 59);
        int var6 = param4.a(param2, true, var5);
        return qd.a(var5, var6, param0, (byte) 108, param4);
    }

    final static String b(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param3)) {
            var4 += 4;
        }
        if (!(!param2)) {
            var4 += 2;
        }
        if (param0) {
            var4++;
        }
        if (!param1) {
            return null;
        }
        return lb.field_d[var4];
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (!param0) {
            dl.a(false);
        }
    }

    final static void a(byte param0, String[] param1) {
        if (param0 != -12) {
            return;
        }
        if (!(sb.field_g == null)) {
            sb.field_g.field_H.a(param0 ^ -1897, param1);
        }
        if (n.field_l != null) {
            n.field_l.field_z.a(1891, param1);
        }
    }

    dl(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= (param0.length >> 1058163905) + param0.length) {
            var2 = var2 << 1;
        }
        ((dl) this).field_e = new int[var2 + var2];
        for (var3 = 0; var2 - -var2 > var3; var3++) {
            ((dl) this).field_e[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = var2 + -1 & param0[var3];
            while (-1 != ((dl) this).field_e[var4 + var4 - -1]) {
                var4 = 1 + var4 & var2 - 1;
            }
            ((dl) this).field_e[var4 + var4] = param0[var3];
            ((dl) this).field_e[1 + (var4 - -var4)] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new o(7, 0, 1, 1);
    }
}
