/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static String field_b;
    static int[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 <= 12) {
          var2 = null;
          ak[] discarded$2 = je.a((fd) null, 44);
          field_a = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static ak[] a(fd param0, int param1) {
        int var5 = 0;
        ak var6 = null;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        if (!(param0.a(true))) {
            return new ak[]{};
        }
        kk var8 = param0.a(param1 ^ -83);
        while (var8.field_f == 0) {
            vj.a(10L, (byte) -49);
        }
        if (!(param1 != var8.field_f)) {
            return new ak[]{};
        }
        int[] var12 = (int[]) var8.field_c;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        ak[] var4 = new ak[var12.length >> -2072120126];
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = new ak();
            var4[var5] = var6;
            var6.field_d = var3[var5 << -390634590];
            var6.field_k = var3[1 + (var5 << -2033296062)];
            var6.field_e = var3[(var5 << -2043817374) + 2];
            var6.field_j = var3[3 + (var5 << -1303884702)];
        }
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "There's got to be a way out of here somehow!";
        field_a = new int[]{0, 6, 4, 4, 4};
    }
}
