/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends mg {
    private byte[][] field_H;

    ol(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        this.field_H = new byte[256][];
        this.field_H = ol.a(param5, param6);
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var11;
        int var12;
        int var13;
        for (var9 = -param6; var9 < 0; var9++) {
          for (var10 = -param5; var10 < 0; var10++) {
            incrementValue$11 = param3;
            param3++;
            var11 = 255 & param1[incrementValue$11];
            if (var11 == 0) {
              param4++;
            } else {
              var12 = ((param2 & 16711935) * var11 & -16711936) + ((param2 & 65280) * var11 & 16711680) >> 8;
              var11 = 256 - var11;
              var13 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (((var13 & 16711935) * var11 & -16711936) + ((var13 & 65280) * var11 & 16711680) >> 8) + var12;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var12;
        int var13;
        int var14;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = -param5; var11 < 0; var11++) {
            incrementValue$11 = param3;
            param3++;
            var12 = (255 & param1[incrementValue$11]) * param9 >> 8;
            if (var12 == 0) {
              param4++;
            } else {
              var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
              var12 = 256 - var12;
              var14 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var13Lifetime1;
        int var13Lifetime2;
        var9 = param1 + param2 * mi.field_a;
        var10 = mi.field_a - param3;
        var11 = 0;
        var12 = 0;
        if (param2 < mi.field_l) {
          var13 = mi.field_l - param2;
          param4 = param4 - var13;
          param2 = mi.field_l;
          var12 = var12 + var13 * param3;
          var9 = var9 + var13 * mi.field_a;
        }
        if (param2 + param4 > mi.field_e) {
          param4 = param4 - (param2 + param4 - mi.field_e);
        }
        if (param1 < mi.field_b) {
          var13Lifetime1 = mi.field_b - param1;
          param3 = param3 - var13Lifetime1;
          param1 = mi.field_b;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + param3 > mi.field_k) {
          var13Lifetime2 = param1 + param3 - mi.field_k;
          param3 = param3 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          if (!param7) {
            ol.a(mi.field_f, this.field_H[param0], param5, var12, var9, param3, param4, var10, var11, param6);
          } else {
            hd.a(mi.field_f, this.field_H[param0], param5, var12, var9, param3, param4, var10, var11, param6);
          }
          return;
        }
    }

    private final static byte[][] a(int[] param0, byte[][] param1) {
        int var2_int = 0;
        int var5 = 0;
        byte[][] var2;
        int var3;
        int var4_int;
        byte[] var4;
        int var6;
        int var3Lifetime1;
        for (var2_int = 0; var2_int < param0.length; var2_int++) {
          var3 = param0[var2_int];
          var4_int = (var3 >> 15 & 510) + (var3 & 255);
          param0[var2_int] = var4_int / 3 + (var3 >> 8 & 255) >> 1;
        }
        var2 = param1;
        for (var3Lifetime1 = 0; var3Lifetime1 < var2.length; var3Lifetime1++) {
          var4 = var2[var3Lifetime1];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6 != 0) {
              var4[var5] = (byte)param0[var6];
            }
          }
        }
        return param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var12Lifetime1;
        int var12Lifetime2;
        var8 = param1 + param2 * mi.field_a;
        var9 = mi.field_a - param3;
        var10 = 0;
        var11 = 0;
        if (param2 < mi.field_l) {
          var12 = mi.field_l - param2;
          param4 = param4 - var12;
          param2 = mi.field_l;
          var11 = var11 + var12 * param3;
          var8 = var8 + var12 * mi.field_a;
        }
        if (param2 + param4 > mi.field_e) {
          param4 = param4 - (param2 + param4 - mi.field_e);
        }
        if (param1 < mi.field_b) {
          var12Lifetime1 = mi.field_b - param1;
          param3 = param3 - var12Lifetime1;
          param1 = mi.field_b;
          var11 = var11 + var12Lifetime1;
          var8 = var8 + var12Lifetime1;
          var10 = var10 + var12Lifetime1;
          var9 = var9 + var12Lifetime1;
        }
        if (param1 + param3 > mi.field_k) {
          var12Lifetime2 = param1 + param3 - mi.field_k;
          param3 = param3 - var12Lifetime2;
          var10 = var10 + var12Lifetime2;
          var9 = var9 + var12Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          if (!param6) {
            ol.a(mi.field_f, this.field_H[param0], param5, var11, var8, param3, param4, var9, var10);
          } else {
            hd.a(mi.field_f, this.field_H[param0], param5, var11, var8, param3, param4, var9, var10);
          }
          return;
        }
    }
}
