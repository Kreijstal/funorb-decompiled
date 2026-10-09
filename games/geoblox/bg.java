/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends m {
    private byte[][] field_K;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var12Lifetime1;
        int var12Lifetime2;
        var8 = param1 + param2 * vb.field_f;
        var9 = vb.field_f - param3;
        var10 = 0;
        var11 = 0;
        if (param2 < vb.field_i) {
          var12 = vb.field_i - param2;
          param4 = param4 - var12;
          param2 = vb.field_i;
          var11 = var11 + var12 * param3;
          var8 = var8 + var12 * vb.field_f;
        }
        if (param2 + param4 > vb.field_d) {
          param4 = param4 - (param2 + param4 - vb.field_d);
        }
        if (param1 < vb.field_e) {
          var12Lifetime1 = vb.field_e - param1;
          param3 = param3 - var12Lifetime1;
          param1 = vb.field_e;
          var11 = var11 + var12Lifetime1;
          var8 = var8 + var12Lifetime1;
          var10 = var10 + var12Lifetime1;
          var9 = var9 + var12Lifetime1;
        }
        if (param1 + param3 > vb.field_k) {
          var12Lifetime2 = param1 + param3 - vb.field_k;
          param3 = param3 - var12Lifetime2;
          var10 = var10 + var12Lifetime2;
          var9 = var9 + var12Lifetime2;
        }
        if (param3 > 0 &&
            param4 > 0) {
          if (vb.field_a == null) {
            bg.a(vb.field_c, this.field_K[param0], param5, var11, var8, param3, param4, var9, var10);
          } else {
            bg.a(vb.field_c, this.field_K[param0], param1, param2, param3, param4, param5, var11, var8, var9, var10, vb.field_a, vb.field_l);
          }
          return;
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int[] param12) {
        int incrementValue$1 = 0;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        var13 = param2 - vb.field_e;
        var14 = param3 - vb.field_i;
        var15 = var14;
        while (true) {
          if (var15 >= var14 + param5) {
            return;
          }
          var16 = param11[var15];
          var17 = param12[var15];
          var18 = param4;
          if (var13 <= var16) {
            var19 = var16 - var13;
            if (var19 >= param4) {
              param7 = param7 + (param4 + param10);
              param8 = param8 + (param4 + param9);
              var15++;
              continue;
            }
            param7 = param7 + var19;
            var18 = var18 - var19;
            param8 = param8 + var19;
          } else {
            var19 = var13 - var16;
            if (var19 >= var17) {
              param7 = param7 + (param4 + param10);
              param8 = param8 + (param4 + param9);
              var15++;
              continue;
            }
            var17 = var17 - var19;
          }
          var19 = 0;
          if (var18 >= var17) {
            var19 = var18 - var17;
          } else {
            var17 = var18;
          }
          var20 = -var17;
          while (true) {
            if (var20 >= 0) {
              param7 = param7 + (var19 + param10);
              param8 = param8 + (var19 + param9);
              var15++;
              break;
            }
            if (param1[param7++] == 0) {
              param8++;
              var20++;
              continue;
            }
            incrementValue$1 = param8;
            param8++;
            vb.field_c[incrementValue$1] = param6;
            var20++;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var13 = 0;
        int var9 = param1 + param2 * vb.field_f;
        int var10 = vb.field_f - param3;
        int var11 = 0;
        int var12 = 0;
        if (param2 < vb.field_i) {
            var13 = vb.field_i - param2;
            param4 = param4 - var13;
            param2 = vb.field_i;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * vb.field_f;
        }
        if (param2 + param4 > vb.field_d) {
            param4 = param4 - (param2 + param4 - vb.field_d);
        }
        if (param1 < vb.field_e) {
            var13 = vb.field_e - param1;
            param3 = param3 - var13;
            param1 = vb.field_e;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (param1 + param3 > vb.field_k) {
            var13 = param1 + param3 - vb.field_k;
            param3 = param3 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (param3 <= 0 || param4 <= 0) {
            return;
        }
        bg.a(vb.field_c, this.field_K[param0], param5, var12, var9, param3, param4, var10, var11, param6);
    }

    bg(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, byte[][] param5) {
        super(param0, param1, param2, param3, param4);
        this.field_K = new byte[256][];
        this.field_K = param5;
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        int var10;
        int var11;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          var11 = var9;
          while (true) {
            if (var11 >= 0) {
              var11 = param5;
              while (true) {
                if (var11 >= 0) {
                  param4 = param4 + param7;
                  param3 = param3 + param8;
                  var10++;
                  continue L0;
                }
                if (param1[param3++] == 0) {
                  param4++;
                  var11++;
                  continue;
                }
                param0[param4++] = param2;
                var11++;
              }
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
            if (param1[param3++] == 0) {
              param4++;
              var11++;
              continue;
            }
            param0[param4++] = param2;
            var11++;
          }
        }
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        param2 = ((param2 & 16711935) * param9 & -16711936) + ((param2 & 65280) * param9 & 16711680) >> 8;
        param9 = 256 - param9;
        var10 = -param6;
        while (true) {
          if (var10 >= 0) {
            return;
          }
          var11 = -param5;
          while (true) {
            if (var11 >= 0) {
              param4 = param4 + param7;
              param3 = param3 + param8;
              var10++;
              break;
            }
            if (param1[param3++] == 0) {
              param4++;
              var11++;
              continue;
            }
            var12 = param0[param4];
            incrementValue$12 = param4;
            param4++;
            param0[incrementValue$12] = (((var12 & 16711935) * param9 & -16711936) + ((var12 & 65280) * param9 & 16711680) >> 8) + param2;
            var11++;
          }
        }
    }
}
