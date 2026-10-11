/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends rf {
    private byte[][] field_J;

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int[] param12) {
        int var15 = 0;
        int var20 = 0;
        int incrementValue$1 = 0;
        int var13;
        int var14;
        int var16;
        int var17;
        int var18;
        int var19;
        int var19Lifetime1;
        var13 = param2 - wj.field_g;
        var14 = param3 - wj.field_e;
        for (var15 = var14; var15 < var14 + param5; var15++) {
          boolean decompiledFrameRemainder0 = true;
          var16 = param11[var15];
          var17 = param12[var15];
          var18 = param4;
          if (var13 <= var16) {
            var19 = var16 - var13;
            if (var19 >= param4) {
              param7 = param7 + (param4 + param10);
              param8 = param8 + (param4 + param9);
              decompiledFrameRemainder0 = false;
            }
            else {
              param7 = param7 + var19;
              var18 = var18 - var19;
              param8 = param8 + var19;
            }
          } else {
            var19 = var13 - var16;
            if (var19 >= var17) {
              param7 = param7 + (param4 + param10);
              param8 = param8 + (param4 + param9);
              decompiledFrameRemainder0 = false;
            }
            else {
              var17 = var17 - var19;
            }
          }
          if (decompiledFrameRemainder0) {
            var19Lifetime1 = 0;
            if (var18 >= var17) {
              var19Lifetime1 = var18 - var17;
            } else {
              var17 = var18;
            }
            for (var20 = -var17; var20 < 0; var20++) {
              if (param1[param7++] == 0) {
                param8++;
              } else {
                incrementValue$1 = param8;
                param8++;
                wj.field_l[incrementValue$1] = param6;
              }
            }
            param7 = param7 + (var19Lifetime1 + param10);
            param8 = param8 + (var19Lifetime1 + param9);
          }
        }
    }

    jb(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, byte[][] param5) {
        super(param0, param1, param2, param3, param4);
        this.field_J = new byte[256][];
        this.field_J = param5;
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$12 = 0;
        int var12;
        param2 = ((param2 & 16711935) * param9 & -16711936) + ((param2 & 65280) * param9 & 16711680) >> 8;
        param9 = 256 - param9;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = -param5; var11 < 0; var11++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              var12 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (((var12 & 16711935) * param9 & -16711936) + ((var12 & 65280) * param9 & 16711680) >> 8) + param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var13 = 0;
        int var9 = param1 + param2 * wj.field_k;
        int var10 = wj.field_k - param3;
        int var11 = 0;
        int var12 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        if (param2 < wj.field_e) {
          var13 = wj.field_e - param2;
          param4 = param4 - var13;
          param2 = wj.field_e;
          var12 = var12 + var13 * param3;
          var9 = var9 + var13 * wj.field_k;
        }
        if (param2 + param4 > wj.field_j) {
          param4 = param4 - (param2 + param4 - wj.field_j);
        }
        if (param1 < wj.field_g) {
          var13Lifetime1 = wj.field_g - param1;
          param3 = param3 - var13Lifetime1;
          param1 = wj.field_g;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + param3 > wj.field_b) {
          var13Lifetime2 = param1 + param3 - wj.field_b;
          param3 = param3 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (param3 <= 0 ||
          param4 <= 0) {
          return;
        }
        jb.a(wj.field_l, this.field_J[param0], param5, var12, var9, param3, param4, var10, var11, param6);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var12Lifetime1;
        int var12Lifetime2;
        var8 = param1 + param2 * wj.field_k;
        var9 = wj.field_k - param3;
        var10 = 0;
        var11 = 0;
        if (param2 < wj.field_e) {
          var12 = wj.field_e - param2;
          param4 = param4 - var12;
          param2 = wj.field_e;
          var11 = var11 + var12 * param3;
          var8 = var8 + var12 * wj.field_k;
        }
        if (param2 + param4 > wj.field_j) {
          param4 = param4 - (param2 + param4 - wj.field_j);
        }
        if (param1 < wj.field_g) {
          var12Lifetime1 = wj.field_g - param1;
          param3 = param3 - var12Lifetime1;
          param1 = wj.field_g;
          var11 = var11 + var12Lifetime1;
          var8 = var8 + var12Lifetime1;
          var10 = var10 + var12Lifetime1;
          var9 = var9 + var12Lifetime1;
        }
        if (param1 + param3 > wj.field_b) {
          var12Lifetime2 = param1 + param3 - wj.field_b;
          param3 = param3 - var12Lifetime2;
          var10 = var10 + var12Lifetime2;
          var9 = var9 + var12Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          if (wj.field_i == null) {
            jb.a(wj.field_l, this.field_J[param0], param5, var11, var8, param3, param4, var9, var10);
          } else {
            jb.a(wj.field_l, this.field_J[param0], param1, param2, param3, param4, param5, var11, var8, var9, var10, wj.field_i, wj.field_f);
          }
          return;
        }
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var9;
        int var11;
        int var11Lifetime1;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }
}
