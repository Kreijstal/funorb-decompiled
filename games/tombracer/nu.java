/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nu extends da {
    private byte[][] field_g;
    private sfa field_i;
    private int[] field_h;
    private int[] field_e;
    private int[] field_f;
    private int[] field_d;

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param5;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                incrementValue$11 = param3;
                param3++;
                var12 = param0[incrementValue$11] & 255;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
                  var12 = 256 - var12;
                  var14 = param1[param4];
                  incrementValue$12 = param4;
                  param4++;
                  param1[incrementValue$12] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        int var16 = 0;
        if (param5 == null) {
            this.fa(param0, param1, param2, param3, param4);
            return;
        }
        param1 = param1 + this.field_e[param0];
        param2 = param2 + this.field_f[param0];
        int var9 = this.field_d[param0];
        int var10 = this.field_h[param0];
        int var11 = this.field_i.field_K;
        int var12 = param1 + param2 * var11;
        int var13 = var11 - var9;
        int var14 = 0;
        int var15 = 0;
        if (param2 < this.field_i.field_d) {
            var16 = this.field_i.field_d - param2;
            var10 = var10 - var16;
            param2 = this.field_i.field_d;
            var15 = var15 + var16 * var9;
            var12 = var12 + var16 * var11;
        }
        if (param2 + var10 > this.field_i.field_P) {
            var10 = var10 - (param2 + var10 - this.field_i.field_P);
        }
        if (param1 < this.field_i.field_J) {
            var16 = this.field_i.field_J - param1;
            var9 = var9 - var16;
            param1 = this.field_i.field_J;
            var15 = var15 + var16;
            var12 = var12 + var16;
            var14 = var14 + var16;
            var13 = var13 + var16;
        }
        if (param1 + var9 > this.field_i.field_W) {
            var16 = param1 + var9 - this.field_i.field_W;
            var9 = var9 - var16;
            var14 = var14 + var16;
            var13 = var13 + var16;
        }
        if (var9 <= 0 || var10 <= 0) {
            return;
        }
        this.a(this.field_g[param0], this.field_i.field_r, param3, var15, var12, var9, var10, var13, var14, param1, param2, this.field_d[param0], param5, param6, param7);
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        int var13 = 0;
        param1 = param1 + this.field_e[param0];
        param2 = param2 + this.field_f[param0];
        int var6 = this.field_d[param0];
        int var7 = this.field_h[param0];
        int var8 = this.field_i.field_K;
        int var9 = param1 + param2 * var8;
        int var10 = var8 - var6;
        int var11 = 0;
        int var12 = 0;
        if (param2 < this.field_i.field_d) {
            var13 = this.field_i.field_d - param2;
            var7 = var7 - var13;
            param2 = this.field_i.field_d;
            var12 = var12 + var13 * var6;
            var9 = var9 + var13 * var8;
        }
        if (param2 + var7 > this.field_i.field_P) {
            var7 = var7 - (param2 + var7 - this.field_i.field_P);
        }
        if (param1 < this.field_i.field_J) {
            var13 = this.field_i.field_J - param1;
            var6 = var6 - var13;
            param1 = this.field_i.field_J;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (param1 + var6 > this.field_i.field_W) {
            var13 = param1 + var6 - this.field_i.field_W;
            var6 = var6 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (var6 <= 0 || var7 <= 0) {
            return;
        }
        this.a(this.field_g[param0], this.field_i.field_r, param3, var12, var9, var6, var7, var10, var11);
    }

    nu(sfa param0, qla param1, jpa[] param2, int[] param3, int[] param4) {
        super(param0, param1);
        int var6 = 0;
        jpa var7 = null;
        byte[] var14 = null;
        byte[] array$0 = null;
        byte[] var9 = null;
        int var10 = 0;
        this.field_i = param0;
        this.field_i = param0;
        this.field_d = param3;
        this.field_h = param4;
        this.field_g = new byte[param2.length][];
        this.field_f = new int[param2.length];
        this.field_e = new int[param2.length];
        for (var6 = 0; var6 < param2.length; var6++) {
            var7 = param2[var6];
            if (var7.field_h != null) {
                this.field_g[var6] = var7.field_h;
            } else {
                var14 = var7.field_f;
                array$0 = new byte[var14.length];
                this.field_g[var6] = array$0;
                var9 = array$0;
                for (var10 = 0; var10 < var14.length; var10++) {
                    var9[var10] = (byte)(var14[var10] == 0 ? 0 : -1);
                }
            }
            this.field_f[var6] = var7.field_c;
            this.field_e[var6] = var7.field_d;
        }
    }

    private final void a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_5_0 = 0;
        Object var16;
        hpa var16_ref;
        int[] var17;
        int[] var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int[] var31;
        int[] var32;
        L0: {
          var16 = null;
          var16_ref = (hpa) ((Object) param12);
          var32 = var16_ref.field_e;
          var31 = var32;
          var17 = var31;
          var18 = var16_ref.field_d;
          var19 = param9 - this.field_i.field_J;
          var20 = param10;
          if (param14 <= var20) {
            break L0;
          } else {
            var20 = param14;
            param4 = param4 + (param14 - param10) * this.field_i.field_K;
            param3 = param3 + (param14 - param10) * param11;
            break L0;
          }
        }
        L1: {
          if (param14 + var32.length >= param10 + param6) {
            stackIn_5_0 = param10 + param6;
            break L1;
          } else {
            stackIn_5_0 = param14 + var32.length;
            break L1;
          }
        }
        var21 = stackIn_5_0;
        var22 = var20;
        L2: while (true) {
          if (var22 >= var21) {
            return;
          } else {
            L3: {
              var23 = var17[var22 - param14] + param13;
              var24 = var18[var22 - param14];
              var25 = param5;
              if (var19 <= var23) {
                var26 = var23 - var19;
                if (var26 < param5) {
                  param3 = param3 + var26;
                  var25 = var25 - var26;
                  param4 = param4 + var26;
                  break L3;
                } else {
                  param3 = param3 + (param5 + param8);
                  param4 = param4 + (param5 + param7);
                  var22++;
                  continue L2;
                }
              } else {
                var26 = var19 - var23;
                if (var26 < var24) {
                  var24 = var24 - var26;
                  break L3;
                } else {
                  param3 = param3 + (param5 + param8);
                  param4 = param4 + (param5 + param7);
                  var22++;
                  continue L2;
                }
              }
            }
            L4: {
              var26 = 0;
              if (var25 >= var24) {
                var26 = var25 - var24;
                break L4;
              } else {
                var24 = var25;
                break L4;
              }
            }
            var27 = -var24;
            L5: while (true) {
              if (var27 >= 0) {
                param3 = param3 + (var26 + param8);
                param4 = param4 + (var26 + param7);
                var22++;
                continue L2;
              } else {
                incrementValue$0 = param3;
                param3++;
                var28 = param0[incrementValue$0] & 255;
                if (var28 == 0) {
                  param4++;
                  var27++;
                  continue L5;
                } else {
                  var29 = ((param2 & 16711935) * var28 & -16711936) + ((param2 & 65280) * var28 & 16711680) >> 8;
                  var28 = 256 - var28;
                  var30 = param1[param4];
                  incrementValue$1 = param4;
                  param4++;
                  param1[incrementValue$1] = (((var30 & 16711935) * var28 & -16711936) + ((var30 & 65280) * var28 & 16711680) >> 8) + var29;
                  var27++;
                  continue L5;
                }
              }
            }
          }
        }
    }
}
