/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cfa extends bw {
    int field_j;
    int field_i;
    int field_g;
    int field_k;
    int field_h;
    int field_f;

    final static void a(int param0, int param1, float param2, int param3, int param4, int param5) {
        int var14 = BachelorFridge.field_y;
        int var6_int = 100;
        if (!(var6_int >= param0)) {
            param0 = var6_int;
        }
        int var7 = 16 / var6_int + 1;
        int var8 = var6_int * var7;
        int[] var16 = new int[4 + var8 * 2];
        int[] var15 = var16;
        int[] var9 = var15;
        int var10 = 0;
        int var11 = param0;
        if (-1 == (var11 ^ -1)) {
            return;
        }
        var16[0] = param3;
        var16[1] = param5;
        int var12 = var11 * var7;
        int var13 = 0;
        if (param1 != 13574) {
            return;
        }
        try {
            while (var12 >= var13) {
                var9[2 + 2 * var13] = param3 - (int)((double)param2 * Math.sin(6.283185307179586 * (double)(-(var10 - -var13)) / (double)var8));
                var9[1 + (2 - -(2 * var13))] = -(int)(Math.cos((double)(-(var13 + var10)) * 6.283185307179586 / (double)var8) * (double)param2) + param5;
                var13++;
            }
            sq.a(var16, 0, 2 * (2 + var12), param4);
            var10 = var10 + var12;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cfa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private cfa() throws Throwable {
        throw new Error();
    }

    static {
    }
}
