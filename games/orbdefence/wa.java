/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends kc {
    private byte[][] field_I;
    int[][] field_J;

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$3 = 0;
        byte dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        byte dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        byte dupTemp$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            incrementValue$3 = param4;
            param4++;
            dupTemp$4 = param2[incrementValue$3];
            param0 = dupTemp$4;
            if (dupTemp$4 == 0) {
              param5++;
            } else {
              incrementValue$5 = param5;
              param5++;
              param1[incrementValue$5] = param3[param0 & 255];
            }
            incrementValue$6 = param4;
            param4++;
            dupTemp$7 = param2[incrementValue$6];
            param0 = dupTemp$7;
            if (dupTemp$7 == 0) {
              param5++;
            } else {
              incrementValue$8 = param5;
              param5++;
              param1[incrementValue$8] = param3[param0 & 255];
            }
            incrementValue$9 = param4;
            param4++;
            dupTemp$10 = param2[incrementValue$9];
            param0 = dupTemp$10;
            if (dupTemp$10 == 0) {
              param5++;
            } else {
              incrementValue$11 = param5;
              param5++;
              param1[incrementValue$11] = param3[param0 & 255];
            }
            incrementValue$12 = param4;
            param4++;
            dupTemp$13 = param2[incrementValue$12];
            param0 = dupTemp$13;
            if (dupTemp$13 == 0) {
              param5++;
            } else {
              incrementValue$14 = param5;
              param5++;
              param1[incrementValue$14] = param3[param0 & 255];
            }
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            incrementValue$0 = param4;
            param4++;
            dupTemp$1 = param2[incrementValue$0];
            param0 = dupTemp$1;
            if (dupTemp$1 == 0) {
              param5++;
            } else {
              incrementValue$2 = param5;
              param5++;
              param1[incrementValue$2] = param3[param0 & 255];
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var12Lifetime1;
        int var12Lifetime2;
        var8 = param1 + param2 * ul.field_f;
        var9 = ul.field_f - param3;
        var10 = 0;
        var11 = 0;
        if (param2 < ul.field_d) {
          var12 = ul.field_d - param2;
          param4 = param4 - var12;
          param2 = ul.field_d;
          var11 = var11 + var12 * param3;
          var8 = var8 + var12 * ul.field_f;
        }
        if (param2 + param4 > ul.field_a) {
          param4 = param4 - (param2 + param4 - ul.field_a);
        }
        if (param1 < ul.field_i) {
          var12Lifetime1 = ul.field_i - param1;
          param3 = param3 - var12Lifetime1;
          param1 = ul.field_i;
          var11 = var11 + var12Lifetime1;
          var8 = var8 + var12Lifetime1;
          var10 = var10 + var12Lifetime1;
          var9 = var9 + var12Lifetime1;
        }
        if (param1 + param3 > ul.field_e) {
          var12Lifetime2 = param1 + param3 - ul.field_e;
          param3 = param3 - var12Lifetime2;
          var10 = var10 + var12Lifetime2;
          var9 = var9 + var12Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          if (!param6) {
            wa.a(0, ul.field_b, this.field_I[param0], this.field_J[param5], var11, var8, param3, param4, var9, var10);
          } else {
            sc.a(ul.field_b, this.field_I[param0], param5, var11, var8, param3, param4, var9, var10);
          }
          return;
        }
    }

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int incrementValue$16 = 0;
        byte dupTemp$17 = 0;
        int incrementValue$18 = 0;
        int var11;
        int var14;
        int var15;
        var11 = 256 - param10;
        for (var12 = -param7; var12 < 0; var12++) {
          for (var13 = -param6; var13 < 0; var13++) {
            incrementValue$16 = param4;
            param4++;
            dupTemp$17 = param2[incrementValue$16];
            param0 = dupTemp$17;
            if (dupTemp$17 == 0) {
              param5++;
            } else {
              var14 = param1[param5];
              var15 = param3[param0 & 255];
              incrementValue$18 = param5;
              param5++;
              param1[incrementValue$18] = ((var15 & 16711935) * param10 + (var14 & 16711935) * var11 & -16711936) + ((var15 & 65280) * param10 + (var14 & 65280) * var11 & 16711680) >> 8;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    wa(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        this.field_I = new byte[256][];
        this.field_I = param6;
        this.field_J = new int[4][];
        this.field_J[0] = param5;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var13Lifetime1;
        int var13Lifetime2;
        var9 = param1 + param2 * ul.field_f;
        var10 = ul.field_f - param3;
        var11 = 0;
        var12 = 0;
        if (param2 < ul.field_d) {
          var13 = ul.field_d - param2;
          param4 = param4 - var13;
          param2 = ul.field_d;
          var12 = var12 + var13 * param3;
          var9 = var9 + var13 * ul.field_f;
        }
        if (param2 + param4 > ul.field_a) {
          param4 = param4 - (param2 + param4 - ul.field_a);
        }
        if (param1 < ul.field_i) {
          var13Lifetime1 = ul.field_i - param1;
          param3 = param3 - var13Lifetime1;
          param1 = ul.field_i;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + param3 > ul.field_e) {
          var13Lifetime2 = param1 + param3 - ul.field_e;
          param3 = param3 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          if (!param7) {
            wa.a(0, ul.field_b, this.field_I[param0], this.field_J[param5], var12, var9, param3, param4, var10, var11, param6);
          } else {
            sc.a(ul.field_b, this.field_I[param0], param5, var12, var9, param3, param4, var10, var11, param6);
          }
          return;
        }
    }
}
