/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kca {
    static String field_a;
    private int[] field_b;

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8, int param9, int param10, byte param11, int param12) {
        if (param11 > -61) {
            return 46;
        }
        if (li.field_i) {
            return nma.field_b[param7].a(param1, param3, param10, 0, param0, param2, (int[]) null, false, 0, param9, param6, param5, param12, (aja[]) null, param8 | param4 << 1341547544, (aa) null);
        }
        return ita.a(param7, 7988).a(param6, param2, param0, param9, param1, param8, param12, param4, param5, param10, param3);
    }

    public static void a(byte param0) {
        if (param0 <= 124) {
            field_a = null;
        }
        field_a = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (param0 == -123454015) {
            break L0;
          } else {
            var7 = null;
            int discarded$2 = kca.a(114, -24, -99, -33, 59, -105, (String) null, 97, -95, -68, -115, (byte) 21, -117);
            break L0;
          }
        }
        var3 = (((kca) this).field_b.length >> -123454015) + -1;
        var4 = var3 & param1;
        L1: while (true) {
          var5 = ((kca) this).field_b[1 + (var4 + var4)];
          if (var5 != -1) {
            if (param1 == ((kca) this).field_b[var4 + var4]) {
              return var5;
            } else {
              var4 = var3 & var4 - -1;
              continue L1;
            }
          } else {
            return -1;
          }
        }
    }

    kca(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while ((param0.length >> 1878611937) + param0.length >= var2) {
            var2 = var2 << 1;
        }
        ((kca) this).field_b = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((kca) this).field_b[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (0 != (((kca) this).field_b[1 + var4 - -var4] ^ -1)) {
                var4 = 1 + var4 & var2 - 1;
            }
            ((kca) this).field_b[var4 + var4] = param0[var3];
            ((kca) this).field_b[var4 + var4 + 1] = var3;
        }
    }

    static {
    }
}
