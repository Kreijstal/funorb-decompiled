/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends oh {
    int field_k;
    static int field_j;
    int field_i;
    static boolean field_h;

    final static int[] a(int[] param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int[] var3 = new int[param1];
        if (param2 != 49) {
            field_j = 50;
        }
        for (var4 = 1; var4 < param1; var4++) {
            var5 = var4;
            while (true) {
                var5--;
                if (-1 < (var5 ^ -1)) {
                    break;
                }
                // if_icmpge L73
                var3[var5 + 1] = var3[var5];
            }
            var3[1 + var5] = var4;
        }
        return var3;
    }

    final void a(int param0, byte param1, int param2) {
        ((ik) this).field_i = param0;
        ((ik) this).field_k = param2;
        if (param1 < 7) {
            ((ik) this).field_i = -64;
        }
    }

    ik() {
    }

    final static mj a(int param0, long param1) {
        if (param0 > -87) {
            return null;
        }
        return (mj) (Object) qp.field_w.a(65280, param1);
    }

    final static int a(int param0) {
        if (param0 != -26918) {
            return 113;
        }
        return of.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
    }
}
