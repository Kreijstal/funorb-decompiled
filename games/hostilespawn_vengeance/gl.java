/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int[] param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17) {
        int var19 = 0;
        int var18 = 0;
        while (param17 < 0) {
            param3 = param14;
            param4 = param12;
            for (var19 = param13; var19 < 0; var19++) {
                if (param3 < 147456) {
                    param0 = param10[(147456 - param3) * 128 / 147456];
                    param1 = param8[param7];
                    var18 = 256 - (param0 & 255);
                    param8[param7] = (param1 & 16711935) * var18 >> 8 & 16711935 | (param1 & 65280) * var18 >> 8 & 65280;
                }
                param7++;
                param3 = param3 + param4;
                param4 = param4 + param5;
            }
            param7 = param7 + param11;
            param14 = param14 + param15;
            param15 = param15 + param16;
            param17++;
        }
    }

    final static bd[] a(bd param0) {
        int var10 = 0;
        bd[] var3 = new bd[160];
        int[][] var4 = new int[160][];
        int var5 = param0.field_z / 8;
        int var6 = param0.field_A / 20;
        int var7 = 0;
        int var8 = 0;
        int var9 = var4.length;
        for (var10 = 0; var10 < var9; var10++) {
            var3[var10] = new bd(var5, var6);
            sb.a(var3[var10], -122);
            param0.c(-var7, -var8);
            var7 = var7 + var5;
            if (var7 >= param0.field_z) {
                var7 = 0;
                var8 = var8 + var6;
            }
            int discarded$0 = 0;
            eh.b();
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        L0: {
          var5 = 147456;
          var6 = param0 - 384 >> 4;
          var7 = param0 + 399 >> 4;
          var8 = param1 - 384 >> 4;
          var9 = param1 + 399 >> 4;
          if (var6 >= si.field_b) {
            break L0;
          } else {
            var6 = si.field_b;
            break L0;
          }
        }
        L1: {
          if (var7 <= si.field_l) {
            break L1;
          } else {
            var7 = si.field_l;
            break L1;
          }
        }
        L2: {
          if (var8 >= si.field_j) {
            break L2;
          } else {
            var8 = si.field_j;
            break L2;
          }
        }
        L3: {
          if (var9 <= si.field_a) {
            break L3;
          } else {
            var9 = si.field_a;
            break L3;
          }
        }
        var10 = (var6 << 4) - param0;
        var10 = var10 * var10;
        var11 = (var6 + 1 << 4) - param0;
        var11 = var11 * var11;
        var12 = (var6 + 2 << 4) - param0;
        var12 = var12 * var12;
        var13 = var11 - var10;
        var14 = var12 - var11;
        var15 = var14 - var13;
        var16 = (var8 << 4) - param1;
        var16 = var16 * var16;
        var17 = (var8 + 1 << 4) - param1;
        var17 = var17 * var17;
        var18 = (var8 + 2 << 4) - param1;
        var18 = var18 * var18;
        var19 = var17 - var16;
        var20 = var18 - var17;
        var21 = var20 - var19;
        var22 = var6 + var8 * si.field_e;
        var23 = si.field_e + var6 - var7;
        gl.a(0, 0, 0, 0, 0, var15, var5, var22, si.field_i, 128, param4, var23, var13, var6 - var7, var16 + var10, var19, var21, var8 - var9);
    }
}
