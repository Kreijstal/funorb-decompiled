/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static dd field_b;
    static int field_e;
    static boolean field_d;
    static vh field_f;
    static cf field_g;
    static long field_c;
    static String field_a;

    final static void a(byte param0, int param1) {
        if (param1 == 0) {
            return;
        }
        if (nd.field_i.c(0)) {
            return;
        }
        if (param0 != 48) {
            return;
        }
        aa var4 = new aa(nd.field_i);
        ij var5 = (ij) (Object) var4.b((byte) -92);
        if (param1 == var5.field_m) {
            if (kg.field_m == -1) {
                var5.a((byte) -117);
            } else {
                if (var5.field_H > kg.field_m) {
                    var5.field_B = 0;
                } else {
                    if (kg.field_m < var5.field_B + var5.field_H) {
                        kg.field_m = var5.field_B + var5.field_H;
                    }
                }
            }
        }
        ij var3 = (ij) (Object) var4.b(-108);
        while (var3 != null) {
            if (!(param1 != var3.field_m)) {
                var3.a((byte) -117);
            }
            var3 = (ij) (Object) var4.b(-88);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_f = null;
        if (param0 != 0) {
            field_g = null;
        }
    }

    final static int[] a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        int var7 = Pool.field_O;
        int[] var8 = new int[param2.length - -param3];
        int[] var4 = var8;
        int var6 = -104 % ((param0 - 60) / 52);
        for (var5 = 0; param2.length > var5; var5++) {
            var8[var5] = param2[var5];
        }
        while (var4.length > var5) {
            var4[var5] = param1;
            var5++;
        }
        return var4;
    }

    final static void a(int[] param0, int param1, int[] param2, int[] param3, int param4, int[] param5, byte param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = Pool.field_O;
        if (param6 != 56) {
            Object var12 = null;
            int[] discarded$0 = qg.a(106, -48, (int[]) null, -106);
        }
        for (var7 = param1; param4 > var7; var7++) {
            var8 = -param2[0] + param5[var7];
            var9 = param3[var7] + -param2[1];
            var10 = param0[var7] - param2[2];
            param5[var7] = var10 * param2[5] + (param2[3] * var8 - -(param2[4] * var9)) >> 770276624;
            param3[var7] = param2[7] * var9 + (var8 * param2[6] - -(var10 * param2[8])) >> -1153017296;
            param0[var7] = param2[9] * var8 - -(var9 * param2[10]) - -(param2[11] * var10) >> 43494672;
        }
    }

    static {
    }
}
