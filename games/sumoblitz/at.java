/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class at extends da {
    private int[] field_c;
    private qa field_e;
    private int[] field_h;
    private int[] field_f;
    private int[] field_g;
    private byte[][] field_d;

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        int var16 = 0;
        int var16Lifetime1;
        int var16Lifetime2;
        if (param5 == null) {
          this.fa(param0, param1, param2, param3, param4);
          return;
        }
        param1 = param1 + this.field_f[param0];
        param2 = param2 + this.field_g[param0];
        int var9 = this.field_h[param0];
        int var10 = this.field_c[param0];
        int var11 = this.field_e.field_k;
        int var12 = param1 + param2 * var11;
        int var13 = var11 - var9;
        int var14 = 0;
        int var15 = 0;
        if (param2 < this.field_e.field_H) {
          var16 = this.field_e.field_H - param2;
          var10 = var10 - var16;
          param2 = this.field_e.field_H;
          var15 = var15 + var16 * var9;
          var12 = var12 + var16 * var11;
        }
        if (param2 + var10 > this.field_e.field_C) {
          var10 = var10 - (param2 + var10 - this.field_e.field_C);
        }
        if (param1 < this.field_e.field_v) {
          var16Lifetime1 = this.field_e.field_v - param1;
          var9 = var9 - var16Lifetime1;
          param1 = this.field_e.field_v;
          var15 = var15 + var16Lifetime1;
          var12 = var12 + var16Lifetime1;
          var14 = var14 + var16Lifetime1;
          var13 = var13 + var16Lifetime1;
        }
        if (param1 + var9 > this.field_e.field_D) {
          var16Lifetime2 = param1 + var9 - this.field_e.field_D;
          var9 = var9 - var16Lifetime2;
          var14 = var14 + var16Lifetime2;
          var13 = var13 + var16Lifetime2;
        }
        if (var9 <= 0 ||
          var10 <= 0) {
          return;
        }
        if ((param3 & -16777216) == -16777216) {
          this.a(this.field_d[param0], this.field_e.field_o, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_h[param0], param5, param6, param7);
        } else {
          this.b(this.field_d[param0], this.field_e.field_o, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_h[param0], param5, param6, param7);
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var12 = 0;
        int var13 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var14;
        int var15;
        var10 = param2 >>> 24;
        var11 = 255 - var10;
        for (var12 = -param6; var12 < 0; var12++) {
          for (var13 = -param5; var13 < 0; var13++) {
            if (param0[param3++] == 0) {
              param4++;
            } else {
              var14 = ((param2 & 16711935) * var10 & -16711936) + ((param2 & 65280) * var10 & 16711680) >> 8;
              var15 = param1[param4];
              incrementValue$12 = param4;
              param4++;
              param1[incrementValue$12] = (((var15 & 16711935) * var11 & -16711936) + ((var15 & 65280) * var11 & 16711680) >> 8) + var14;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        int var13 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        param1 = param1 + this.field_f[param0];
        param2 = param2 + this.field_g[param0];
        int var6 = this.field_h[param0];
        int var7 = this.field_c[param0];
        int var8 = this.field_e.field_k;
        int var9 = param1 + param2 * var8;
        int var10 = var8 - var6;
        int var11 = 0;
        int var12 = 0;
        if (param2 < this.field_e.field_H) {
          var13 = this.field_e.field_H - param2;
          var7 = var7 - var13;
          param2 = this.field_e.field_H;
          var12 = var12 + var13 * var6;
          var9 = var9 + var13 * var8;
        }
        if (param2 + var7 > this.field_e.field_C) {
          var7 = var7 - (param2 + var7 - this.field_e.field_C);
        }
        if (param1 < this.field_e.field_v) {
          var13Lifetime1 = this.field_e.field_v - param1;
          var6 = var6 - var13Lifetime1;
          param1 = this.field_e.field_v;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + var6 > this.field_e.field_D) {
          var13Lifetime2 = param1 + var6 - this.field_e.field_D;
          var6 = var6 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (var6 <= 0 ||
          var7 <= 0) {
          return;
        }
        if ((param3 & -16777216) == -16777216) {
          this.b(this.field_d[param0], this.field_e.field_o, param3, var12, var9, var6, var7, var10, var11);
        } else {
          if ((param3 & -16777216) != 0) {
            this.a(this.field_d[param0], this.field_e.field_o, param3, var12, var9, var6, var7, var10, var11);
          }
        }
    }

    at(qa param0, ta param1, ri[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        int var6 = 0;
        this.field_e = param0;
        this.field_h = param3;
        this.field_c = param4;
        this.field_d = new byte[param2.length][];
        this.field_g = new int[param2.length];
        this.field_f = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
          this.field_d[var6] = param2[var6].field_e;
          this.field_g[var6] = param2[var6].field_d;
          this.field_f[var6] = param2[var6].field_c;
        }
    }

    private final void b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var11 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
          }
          for (var12Lifetime1 = param5; var12Lifetime1 < 0; var12Lifetime1++) {
            if (param0[param3++] == 0) {
              param4++;
            } else {
              param1[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int var21 = 0;
        int var26 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        dm var16_ref;
        int[] var17;
        int[] var18;
        int var19;
        int var20;
        int var22;
        int var23;
        int var24;
        int var25;
        int[] var27;
        int[] var28;
        int var25Lifetime1;
        var16 = null;
        var16_ref = (dm) (param12);
        var28 = var16_ref.field_f;
        var27 = var28;
        var17 = var27;
        var18 = var16_ref.field_g;
        var19 = param10;
        if (param14 > var19) {
          var19 = param14;
          param4 = param4 + (param14 - param10) * this.field_e.field_k;
          param3 = param3 + (param14 - param10) * param11;
        }
        if (param14 + var28.length >= param10 + param6) {
          stackIn_5_0 = param10 + param6;
        } else {
          stackIn_5_0 = param14 + var28.length;
        }
        var20 = stackIn_5_0;
        for (var21 = var19; var21 < var20; var21++) {
          boolean decompiledFrameRemainder0 = true;
          var22 = param13 + var17[var21 - param14];
          var23 = var18[var21 - param14];
          var24 = param5;
          if (param9 <= var22) {
            var25 = var22 - param9;
            if (var25 >= param5) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              param3 = param3 + var25;
              var24 = var24 - var25;
              param4 = param4 + var25;
            }
          } else {
            var25 = param9 - var22;
            if (var25 >= var23) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              var23 = var23 - var25;
            }
          }
          if (decompiledFrameRemainder0) {
            var25Lifetime1 = 0;
            if (var24 >= var23) {
              var25Lifetime1 = var24 - var23;
            } else {
              var23 = var24;
            }
            for (var26 = 0; var26 < var23; var26++) {
              if (param0[param3++] == 0) {
                param4++;
              } else {
                param1[param4++] = param2;
              }
            }
            param3 = param3 + (var25Lifetime1 + param8);
            param4 = param4 + (var25Lifetime1 + param7);
          }
        }
    }

    private final void b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int var24 = 0;
        int var29 = 0;
        int incrementValue$1 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        dm var16_ref;
        int[] var17;
        int[] var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var25;
        int var26;
        int var27;
        int var28;
        int var30;
        int var31;
        int[] var32;
        int[] var33;
        int var28Lifetime1;
        var16 = null;
        var16_ref = (dm) (param12);
        var33 = var16_ref.field_f;
        var32 = var33;
        var17 = var32;
        var18 = var16_ref.field_g;
        var19 = param9 - this.field_e.field_v;
        var20 = param10;
        if (param14 > var20) {
          var20 = param14;
          param4 = param4 + (param14 - param10) * this.field_e.field_k;
          param3 = param3 + (param14 - param10) * param11;
        }
        if (param14 + var33.length >= param10 + param6) {
          stackIn_5_0 = param10 + param6;
        } else {
          stackIn_5_0 = param14 + var33.length;
        }
        var21 = stackIn_5_0;
        var22 = param2 >>> 24;
        var23 = 255 - var22;
        for (var24 = var20; var24 < var21; var24++) {
          boolean decompiledFrameRemainder0 = true;
          var25 = var17[var24 - param14] + param13;
          var26 = var18[var24 - param14];
          var27 = param5;
          if (var19 <= var25) {
            var28 = var25 - var19;
            if (var28 >= param5) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              param3 = param3 + var28;
              var27 = var27 - var28;
              param4 = param4 + var28;
            }
          } else {
            var28 = var19 - var25;
            if (var28 >= var26) {
              param3 = param3 + (param5 + param8);
              param4 = param4 + (param5 + param7);
              decompiledFrameRemainder0 = false;
            }
            else {
              var26 = var26 - var28;
            }
          }
          if (decompiledFrameRemainder0) {
            var28Lifetime1 = 0;
            if (var27 >= var26) {
              var28Lifetime1 = var27 - var26;
            } else {
              var26 = var27;
            }
            for (var29 = -var26; var29 < 0; var29++) {
              if (param0[param3++] == 0) {
                param4++;
              } else {
                var30 = ((param2 & 16711935) * var22 & -16711936) + ((param2 & 65280) * var22 & 16711680) >> 8;
                var31 = param1[param4];
                incrementValue$1 = param4;
                param4++;
                param1[incrementValue$1] = (((var31 & 16711935) * var23 & -16711936) + ((var31 & 65280) * var23 & 16711680) >> 8) + var30;
              }
            }
            param3 = param3 + (var28Lifetime1 + param8);
            param4 = param4 + (var28Lifetime1 + param7);
          }
        }
    }
}
