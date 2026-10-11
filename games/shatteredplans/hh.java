/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends nq {
    private byte[][] field_H;

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$0 = 0;
        int var13 = 0;
        param2 = ((param2 & 16711935) * param10 & -16711936) + ((param2 & 65280) * param10 & 16711680) >> 8;
        param10 = 256 - param10;
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = -param6; var12 < 0; var12++) {
            if (param1[param3] != 0) {
              var13 = param0[param4];
              incrementValue$0 = param4;
              param4++;
              param0[incrementValue$0] = (((var13 & 16711935) * param10 & -16711936) + ((var13 & 65280) * param10 & 16711680) >> 8) + param2;
            } else {
              param4++;
            }
            param3 = param3 + param5;
          }
          param4 = param4 + param8;
          param3 = param3 + param9;
        }
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            if (param1[param3] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param3 = param3 + param5;
            if (param1[param3] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param3 = param3 + param5;
            if (param1[param3] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param3 = param3 + param5;
            if (param1[param3] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param3 = param3 + param5;
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            if (param1[param3] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param3 = param3 + param5;
          }
          param4 = param4 + param8;
          param3 = param3 + param9;
        }
    }

    final static void b(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var12Lifetime1;
        int var12Lifetime2;
        var8 = param1 + param2 * gf.field_b;
        var9 = gf.field_b - param3;
        var10 = 0;
        var11 = 0;
        if (param2 < gf.field_a) {
          var12 = gf.field_a - param2;
          param4 = param4 - var12;
          param2 = gf.field_a;
          var11 = var11 + var12 * param3;
          var8 = var8 + var12 * gf.field_b;
        }
        if (param2 + param4 > gf.field_f) {
          param4 = param4 - (param2 + param4 - gf.field_f);
        }
        if (param1 < gf.field_i) {
          var12Lifetime1 = gf.field_i - param1;
          param3 = param3 - var12Lifetime1;
          param1 = gf.field_i;
          var11 = var11 + var12Lifetime1;
          var8 = var8 + var12Lifetime1;
          var10 = var10 + var12Lifetime1;
          var9 = var9 + var12Lifetime1;
        }
        if (param1 + param3 > gf.field_l) {
          var12Lifetime2 = param1 + param3 - gf.field_l;
          param3 = param3 - var12Lifetime2;
          var10 = var10 + var12Lifetime2;
          var9 = var9 + var12Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          if (gf.field_c == null) {
            hh.a(gf.field_h, this.field_H[param0], param5, var11, var8, param3, param4, var9, var10);
          } else {
            hh.a(gf.field_h, this.field_H[param0], param1, param2, param3, param4, param5, var11, var8, var9, var10, gf.field_c, gf.field_d);
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

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var13 = 0;
        int var9 = param1 + param2 * gf.field_b;
        int var10 = gf.field_b - param3;
        int var11 = 0;
        int var12 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        if (param2 < gf.field_a) {
          var13 = gf.field_a - param2;
          param4 = param4 - var13;
          param2 = gf.field_a;
          var12 = var12 + var13 * param3;
          var9 = var9 + var13 * gf.field_b;
        }
        if (param2 + param4 > gf.field_f) {
          param4 = param4 - (param2 + param4 - gf.field_f);
        }
        if (param1 < gf.field_i) {
          var13Lifetime1 = gf.field_i - param1;
          param3 = param3 - var13Lifetime1;
          param1 = gf.field_i;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + param3 > gf.field_l) {
          var13Lifetime2 = param1 + param3 - gf.field_l;
          param3 = param3 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (param3 <= 0 ||
          param4 <= 0) {
          return;
        }
        hh.b(gf.field_h, this.field_H[param0], param5, var12, var9, param3, param4, var10, var11, param6);
    }

    hh(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, byte[][] param5) {
        super(param0, param1, param2, param3, param4);
        this.field_H = new byte[256][];
        this.field_H = param5;
    }

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
        var13 = param2 - gf.field_i;
        var14 = param3 - gf.field_a;
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
                gf.field_h[incrementValue$1] = param6;
              }
            }
            param7 = param7 + (var19Lifetime1 + param10);
            param8 = param8 + (var19Lifetime1 + param9);
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var13 = 0;
        int var8 = param1 + param2 * gf.field_b;
        int var9 = gf.field_b - param3;
        int var10 = param4;
        int var11 = -1;
        int var12 = param4 - 1;
        int var13Lifetime1;
        int var13Lifetime2;
        if (param2 < gf.field_a) {
          var13 = gf.field_a - param2;
          param4 = param4 - var13;
          param2 = gf.field_a;
          var12 = var12 - var13;
          var8 = var8 + var13 * gf.field_b;
        }
        if (param2 + param4 > gf.field_f) {
          param4 = param4 - (param2 + param4 - gf.field_f);
        }
        if (param1 < gf.field_i) {
          var13Lifetime1 = gf.field_i - param1;
          param3 = param3 - var13Lifetime1;
          param1 = gf.field_i;
          var12 = var12 + var13Lifetime1 * var10;
          var8 = var8 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
        }
        if (param1 + param3 > gf.field_l) {
          var13Lifetime2 = param1 + param3 - gf.field_l;
          param3 = param3 - var13Lifetime2;
          var9 = var9 + var13Lifetime2;
        }
        if (param3 <= 0 ||
          param4 <= 0) {
          return;
        }
        var11 = var11 - var10 * param3;
        hh.a(gf.field_h, this.field_H[param0], param5, var12, var8, var10, param3, param4, var9, var11);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var14 = 0;
        int var9 = param1 + param2 * gf.field_b;
        int var10 = gf.field_b - param3;
        int var11 = param4;
        int var12 = -1;
        int var13 = param4 - 1;
        int var14Lifetime1;
        int var14Lifetime2;
        if (param2 < gf.field_a) {
          var14 = gf.field_a - param2;
          param4 = param4 - var14;
          param2 = gf.field_a;
          var13 = var13 - var14;
          var9 = var9 + var14 * gf.field_b;
        }
        if (param2 + param4 > gf.field_f) {
          param4 = param4 - (param2 + param4 - gf.field_f);
        }
        if (param1 < gf.field_i) {
          var14Lifetime1 = gf.field_i - param1;
          param3 = param3 - var14Lifetime1;
          param1 = gf.field_i;
          var13 = var13 + var14Lifetime1 * var11;
          var9 = var9 + var14Lifetime1;
          var10 = var10 + var14Lifetime1;
        }
        if (param1 + param3 > gf.field_l) {
          var14Lifetime2 = param1 + param3 - gf.field_l;
          param3 = param3 - var14Lifetime2;
          var10 = var10 + var14Lifetime2;
        }
        if (param3 <= 0 ||
          param4 <= 0) {
          return;
        }
        var12 = var12 - var11 * param3;
        hh.a(gf.field_h, this.field_H[param0], param5, var13, var9, var11, param3, param4, var10, var12, param6);
    }
}
