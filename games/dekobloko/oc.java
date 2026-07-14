/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int field_c;
    static vj field_b;
    static String field_d;
    private int[] field_a;

    public static void a(boolean param0) {
        if (!param0) {
            field_d = null;
        }
        field_d = null;
        field_b = null;
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var3 = -1 + (((oc) this).field_a.length >> 1043895585);
        if (param0 == -68) {
          var4 = var3 & param1;
          L0: while (true) {
            var5 = ((oc) this).field_a[1 + (var4 + var4)];
            if (0 != (var5 ^ -1)) {
              if (((oc) this).field_a[var4 - -var4] == param1) {
                return var5;
              } else {
                var4 = 1 + var4 & var3;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          return 51;
        }
    }

    final static ij[] a(byte param0) {
        if (param0 != 27) {
            oc.a(false);
        }
        return new ij[]{ah.field_f, ge.field_g, hn.field_c};
    }

    oc(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= param0.length + (param0.length >> -1972935807)) {
            var2 = var2 << 1;
        }
        ((oc) this).field_a = new int[var2 - -var2];
        for (var3 = 0; var2 + var2 > var3; var3++) {
            ((oc) this).field_a[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (-1 != ((oc) this).field_a[var4 - (-var4 + -1)]) {
                var4 = -1 + var2 & var4 - -1;
            }
            ((oc) this).field_a[var4 + var4] = param0[var3];
            ((oc) this).field_a[1 + var4 + var4] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Confirm Email:";
    }
}
