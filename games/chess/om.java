/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends o {
    static ao[] field_m;
    static boolean field_j;
    int field_k;
    static boolean field_l;

    final static void a(int param0) {
        if (!(ga.a(true))) {
            return;
        }
        int var1 = 79 / ((-32 - param0) / 61);
        qh.a(false, false, 4);
    }

    final static rk[] a(um param0, int param1, boolean param2, int param3) {
        if (tj.a(param1, param3, param0, (byte) 83)) {
          if (!param2) {
            km[] discarded$2 = om.a(-88, -113, -21, (byte) -38);
            return dl.a(-15326);
          } else {
            return dl.a(-15326);
          }
        } else {
          return null;
        }
    }

    final static km[] a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var7 = Chess.field_G;
        km[] var8 = new km[9];
        km[] var4 = var8;
        var8[0] = rd.a(param0, param2, 14727);
        int var6 = 119 % ((param3 - 22) / 35);
        for (var5 = 1; -10 < (var5 ^ -1); var5++) {
            var8[var5] = var8[0];
        }
        var4[4] = rd.a(64, param1, 14727);
        return var4;
    }

    public static void c(byte param0) {
        if (param0 > -98) {
            om.c((byte) -118);
            field_m = null;
            return;
        }
        field_m = null;
    }

    private om() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_m = new ao[255];
        field_j = false;
        for (var0 = 0; field_m.length > var0; var0++) {
            field_m[var0] = new ao();
        }
        field_l = false;
    }
}
