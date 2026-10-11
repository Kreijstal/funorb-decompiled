/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends lr {
    private byte[][] field_U;

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var13Lifetime1;
        int var13Lifetime2;
        var9 = param1 + param2 * qh.field_l;
        var10 = qh.field_l - param3;
        var11 = 0;
        var12 = 0;
        if (param2 < qh.field_c) {
          var13 = qh.field_c - param2;
          param4 = param4 - var13;
          param2 = qh.field_c;
          var12 = var12 + var13 * param3;
          var9 = var9 + var13 * qh.field_l;
        }
        if (param2 + param4 > qh.field_g) {
          param4 = param4 - (param2 + param4 - qh.field_g);
        }
        if (param1 < qh.field_b) {
          var13Lifetime1 = qh.field_b - param1;
          param3 = param3 - var13Lifetime1;
          param1 = qh.field_b;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + param3 > qh.field_j) {
          var13Lifetime2 = param1 + param3 - qh.field_j;
          param3 = param3 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          if (!param7) {
            wl.b(qh.field_d, this.field_U[param0], param5, var12, var9, param3, param4, var10, var11, param6);
          } else {
            an.b(qh.field_d, this.field_U[param0], param5, var12, var9, param3, param4, var10, var11, param6);
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
        int var13;
        int var13Lifetime1;
        int var13Lifetime2;
        var8 = param1 + param2 * qh.field_l;
        var9 = qh.field_l - param3;
        var10 = param4;
        var11 = -1;
        var12 = param4 - 1;
        if (param2 < qh.field_c) {
          var13 = qh.field_c - param2;
          param4 = param4 - var13;
          param2 = qh.field_c;
          var12 = var12 - var13;
          var8 = var8 + var13 * qh.field_l;
        }
        if (param2 + param4 > qh.field_g) {
          param4 = param4 - (param2 + param4 - qh.field_g);
        }
        if (param1 < qh.field_b) {
          var13Lifetime1 = qh.field_b - param1;
          param3 = param3 - var13Lifetime1;
          param1 = qh.field_b;
          var12 = var12 + var13Lifetime1 * var10;
          var8 = var8 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
        }
        if (param1 + param3 > qh.field_j) {
          var13Lifetime2 = param1 + param3 - qh.field_j;
          param3 = param3 - var13Lifetime2;
          var9 = var9 + var13Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          var11 = var11 - var10 * param3;
          if (!param6) {
            wl.a(qh.field_d, this.field_U[param0], param5, var12, var8, var10, param3, param4, var9, var11);
          } else {
            an.a(qh.field_d, this.field_U[param0], param5, var12, var8, var10, param3, param4, var9, var11);
          }
          return;
        }
    }

    wl(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        this.field_U = new byte[256][];
        this.field_U = wl.a(param5, param6);
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        int var13 = 0;
        for (var10 = -param7; var10 < 0; var10++) {
          for (var11 = -param6; var11 < 0; var11++) {
            var12 = 255 & param1[param3];
            if (var12 != 0) {
              var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
              var12 = 256 - var12;
              var14 = param0[param4];
              incrementValue$0 = param4;
              param4++;
              param0[incrementValue$0] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
            } else {
              param4++;
            }
            param3 = param3 + param5;
          }
          param4 = param4 + param8;
          param3 = param3 + param9;
        }
    }

    private final static void b(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        int var14;
        int var14Lifetime1;
        int var14Lifetime2;
        var9 = param1 + param2 * qh.field_l;
        var10 = qh.field_l - param3;
        var11 = param4;
        var12 = -1;
        var13 = param4 - 1;
        if (param2 < qh.field_c) {
          var14 = qh.field_c - param2;
          param4 = param4 - var14;
          param2 = qh.field_c;
          var13 = var13 - var14;
          var9 = var9 + var14 * qh.field_l;
        }
        if (param2 + param4 > qh.field_g) {
          param4 = param4 - (param2 + param4 - qh.field_g);
        }
        if (param1 < qh.field_b) {
          var14Lifetime1 = qh.field_b - param1;
          param3 = param3 - var14Lifetime1;
          param1 = qh.field_b;
          var13 = var13 + var14Lifetime1 * var11;
          var9 = var9 + var14Lifetime1;
          var10 = var10 + var14Lifetime1;
        }
        if (param1 + param3 > qh.field_j) {
          var14Lifetime2 = param1 + param3 - qh.field_j;
          param3 = param3 - var14Lifetime2;
          var10 = var10 + var14Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          var12 = var12 - var11 * param3;
          if (!param7) {
            wl.a(qh.field_d, this.field_U[param0], param5, var13, var9, var11, param3, param4, var10, var12, param6);
          } else {
            an.a(qh.field_d, this.field_U[param0], param5, var13, var9, var11, param3, param4, var10, var12, param6);
          }
          return;
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
        var8 = param1 + param2 * qh.field_l;
        var9 = qh.field_l - param3;
        var10 = 0;
        var11 = 0;
        if (param2 < qh.field_c) {
          var12 = qh.field_c - param2;
          param4 = param4 - var12;
          param2 = qh.field_c;
          var11 = var11 + var12 * param3;
          var8 = var8 + var12 * qh.field_l;
        }
        if (param2 + param4 > qh.field_g) {
          param4 = param4 - (param2 + param4 - qh.field_g);
        }
        if (param1 < qh.field_b) {
          var12Lifetime1 = qh.field_b - param1;
          param3 = param3 - var12Lifetime1;
          param1 = qh.field_b;
          var11 = var11 + var12Lifetime1;
          var8 = var8 + var12Lifetime1;
          var10 = var10 + var12Lifetime1;
          var9 = var9 + var12Lifetime1;
        }
        if (param1 + param3 > qh.field_j) {
          var12Lifetime2 = param1 + param3 - qh.field_j;
          param3 = param3 - var12Lifetime2;
          var10 = var10 + var12Lifetime2;
          var9 = var9 + var12Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          if (!param6) {
            wl.a(qh.field_d, this.field_U[param0], param5, var11, var8, param3, param4, var9, var10);
          } else {
            an.a(qh.field_d, this.field_U[param0], param5, var11, var8, param3, param4, var9, var10);
          }
          return;
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int incrementValue$0 = 0;
        int var14 = 0;
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = -param6; var12 < 0; var12++) {
            var13 = (255 & param1[param3]) * param10 >> 8;
            if (var13 != 0) {
              var14 = ((param2 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var13 & 16711680) >> 8;
              var13 = 256 - var13;
              var15 = param0[param4];
              incrementValue$0 = param4;
              param4++;
              param0[incrementValue$0] = (((var15 & 16711935) * var13 & -16711936) + ((var15 & 65280) * var13 & 16711680) >> 8) + var14;
            } else {
              param4++;
            }
            param3 = param3 + param5;
          }
          param4 = param4 + param8;
          param3 = param3 + param9;
        }
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
}
