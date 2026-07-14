/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends pc {
    int field_K;
    int field_B;
    static int field_E;
    int field_D;
    int field_I;
    static dl field_H;
    int field_C;
    int field_J;
    static int field_F;

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        double var10 = 0.0;
        int var12 = CrazyCrystals.field_B;
        if (param3) {
            field_E = -37;
        }
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
        }
        int var8 = param6 + -((pa) this).field_J + -((pa) this).field_r + -param0;
        int var9 = param1 - (((pa) this).field_K + (param4 + ((pa) this).field_j));
        if (((pa) this).field_I * ((pa) this).field_I <= var8 * var8 - -(var9 * var9)) {
        } else {
            var10 = Math.atan2((double)var9, (double)var8) - lk.field_a;
            if (0.0 > var10) {
                var10 = var10 - 3.141592653589793 / (double)((pa) this).field_D;
            } else {
                if (var10 > 0.0) {
                    var10 = var10 + 3.141592653589793 / (double)((pa) this).field_D;
                }
            }
            ((pa) this).field_B = (int)((double)((pa) this).field_D * var10 / 6.283185307179586);
            while (((pa) this).field_B >= ((pa) this).field_D) {
                ((pa) this).field_B = ((pa) this).field_B - ((pa) this).field_D;
            }
            while (((pa) this).field_B < 0) {
                ((pa) this).field_B = ((pa) this).field_B + ((pa) this).field_D;
            }
        }
        return true;
    }

    final static void a(f[][] param0, int param1, int param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        if (param3 > -21) {
            pa.e((byte) 22);
        }
        for (var4 = -param2 + (param0.length + -2); var4 >= param2 + 1; var4--) {
            for (var5 = 1 + param1; var5 < -1 + (-param1 + param0[0].length); var5++) {
                param0[var4][var5].b(105, var4, param0, var5);
            }
        }
    }

    private pa() throws Throwable {
        throw new Error();
    }

    public static void e(byte param0) {
        if (param0 >= -90) {
            field_F = -63;
        }
        field_H = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = 56;
    }
}
