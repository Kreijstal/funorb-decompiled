/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pla {
    private int[] field_a;
    static String field_b;

    public static void b(int param0) {
        field_b = null;
        if (param0 != -1) {
            field_b = null;
        }
    }

    pla(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (param0.length - -(param0.length >> -804711007) >= var2) {
            var2 = var2 << 1;
        }
        ((pla) this).field_a = new int[var2 - -var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((pla) this).field_a[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = param0[var3] & var2 - 1;
            while (-1 != ((pla) this).field_a[var4 + var4 + 1]) {
                var4 = var4 - -1 & -1 + var2;
            }
            ((pla) this).field_a[var4 + var4] = param0[var3];
            ((pla) this).field_a[var4 + (var4 + 1)] = var3;
        }
    }

    final static jua a(int param0, String[] param1) {
        jua var2 = new jua(false);
        var2.field_c = param1;
        if (param0 <= 80) {
            pla.b(3);
        }
        return var2;
    }

    final static int b(int param0, int param1) {
        if (param0 <= 18) {
            field_b = null;
        }
        param1 = param1 & 8191;
        if (-4097 >= (param1 ^ -1)) {
            return 6144 <= param1 ? ida.field_b[param1 - 6144] : -ida.field_b[-param1 + 6144];
        }
        return (param1 ^ -1) <= -2049 ? -ida.field_b[-2048 + param1] : ida.field_b[2048 - param1];
    }

    final static goa a(int param0) {
        if (param0 != -1) {
            field_b = null;
        }
        return new goa(hha.a(false), nd.b((byte) -107));
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = -1 + (((pla) this).field_a.length >> 1006001825);
        if (param1 == 1) {
          var4 = var3 & param0;
          L0: while (true) {
            var5 = ((pla) this).field_a[var4 + (var4 - -1)];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (((pla) this).field_a[var4 + var4] == param0) {
                return var5;
              } else {
                var4 = var4 + 1 & var3;
                continue L0;
              }
            }
          }
        } else {
          return -46;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please check if address is correct";
        pda discarded$0 = new pda(false);
    }
}
